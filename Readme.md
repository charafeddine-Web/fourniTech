# fourniTech - Système de Gestion des Fournisseurs

## 📋 Description du Projet

fourniTech est une application de gestion des fournisseurs développée pour une entreprise spécialisée dans la conception et la fabrication de vêtements professionnels. Cette première phase du projet pose les fondations d'un système complet de gestion des approvisionnements.

L'application permet de gérer l'ensemble du cycle de vie des fournisseurs : création, modification, suppression et consultation avec des fonctionnalités de tri et de recherche avancées.

## 🎯 Objectifs

- Créer une base solide pour le système de gestion des approvisionnements
- Implémenter une architecture extensible pour les futures fonctionnalités (produits, commandes, stocks)
- Démontrer la maîtrise des concepts fondamentaux de Spring Framework

## 🚀 Fonctionnalités

### Gestion des Fournisseurs

## 🛠️ Technologies Utilisées

### Backend
- **Java 17+**
- **Spring Core** (IoC, DI, Bean Management)
- **Spring MVC** (Architecture REST)
- **Spring Data JPA** (Persistance)
- **H2/MySQL** (Base de données)
- **Maven** (Gestion des dépendances)

### Outils
- **Git** (Contrôle de version)
- **Postman** (Tests API)
- **IntelliJ IDEA / Eclipse** (IDE)

## 📐 Architecture

L'application suit une architecture en couches pour garantir la séparation des responsabilités :

```
┌─────────────────────────────────────┐
│         Controller Layer            │
│   (API REST - Endpoints HTTP)       │
└─────────────────────────────────────┘
                 ↓
┌─────────────────────────────────────┐
│          Service Layer              │
│    (Logique métier)                 │
└─────────────────────────────────────┘
                 ↓
┌─────────────────────────────────────┐
│        Repository Layer             │
│   (Accès aux données - JPA)         │
└─────────────────────────────────────┘
                 ↓
┌─────────────────────────────────────┐
│          Database                   │
└─────────────────────────────────────┘
```

### Structure du Projet

```
src/
├── main/
│   ├── java/
│   │   └── com/tricol/supply/
│   │       ├── config/           # Configuration Spring
│   │       │   ├── AppConfig.java          # Java Config
│   │       │   └── ApplicationConfig.xml   # XML Config
│   │       ├── controller/       # Controllers REST
│   │       │   └── FournisseurController.java
│   │       ├── service/          # Services métier
│   │       │   ├── FournisseurService.java
│   │       │   └── FournisseurServiceImpl.java
│   │       ├── repository/       # Repositories JPA
│   │       │   └── FournisseurRepository.java
│   │       ├── model/            # Entités JPA
│   │       │   └── Fournisseur.java
│   │       └── TricolApplication.java
│   └── resources/
│       ├── application.properties
│       └── applicationContext.xml
└── test/
    └── java/
        └── com/tricol/supply/
            └── ...
```

## 🔧 Configuration Spring

Le projet implémente  configuration Spring** :

### . Configuration XML
```xml
<!-- applicationContext.xml -->
<beans>
    <bean id="fournisseurService" class="com.tricol.supply.service.FournisseurServiceImpl"/>
</beans>
```



## 📡 API REST

### Base URL
```
http://localhost:8080/fourniTech_V2/*
```

### Endpoints

| Méthode | Endpoint | Description |
|---------|----------|-------------|
| `GET` | `/fournisseurs` | Récupérer tous les fournisseurs |
| `GET` | `/fournisseurs/{id}` | Récupérer un fournisseur par ID |
| `POST` | `/fournisseurs` | Créer un nouveau fournisseur |
| `PUT` | `/fournisseurs/{id}` | Modifier un fournisseur existant |
| `DELETE` | `/fournisseurs/{id}` | Supprimer un fournisseur |

### Exemples de Requêtes

#### Créer un Fournisseur
```http
POST /api/v1/fournisseurs
Content-Type: application/json

{
  "societe": "TechTextile SA",
  "adresse": "123 Rue des Industries",
  "contact": "Mohammed Alami",
  "email": "contact@techtextile.ma",
  "telephone": "+212 5 22 34 56 78",
  "ville": "Casablanca",
  "ice": "001234567890123"
}
```

#### Récupérer Tous les Fournisseurs
```http
GET /api/v1/fournisseurs
```

#### Mettre à Jour un Fournisseur
```http
PUT /api/v1/fournisseurs/1
Content-Type: application/json

{
  "societe": "TechTextile SA - Updated",
  "telephone": "+212 5 22 34 56 79"
}
```


## 🚦 Installation et Démarrage

### Prérequis
- Java JDK 17 ou supérieur
- Maven 3.6+
- MySQL/PostgreSQL (optionnel, H2 inclus pour le développement)

### Étapes d'Installation

1. **Cloner le repository**
```bash
git clone https://github.com/charafeddine-Web/fourniTech
cd fourniTech
```

2. **Configurer la base de données**
```properties
# src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/tricol_db
spring.datasource.username=root
spring.datasource.password=votre_mot_de_passe
```

3. **Compiler le projet**
```bash
mvn clean install
```

=

L'application sera accessible sur `http://localhost:8080`


### Collection Postman
Importez le fichier `Tricol_API_Collection.json` dans Postman pour tester tous les endpoints.

## 📊 Concepts Spring Implémentés

### Conteneur IoC et Injection de Dépendances
- ✅ ApplicationContext
- ✅ BeanFactory
- ✅ Constructor Injection
- ✅ Setter Injection
- ✅ Field Injection

### Scopes des Beans
- ✅ Singleton (défaut)
- ✅ Prototype
- ✅ Request
- ✅ Session

### Spring Data JPA
- ✅ Requêtes générées automatiquement (findAll, findById, save, delete)
- ✅ Query Methods personnalisées (findBySociete, findByVille, findByEmailContaining)
- ✅ @Query pour requêtes JPQL complexes



## 🔜 Évolutions Futures

- [ ] Gestion des produits
- [ ] Gestion des commandes
- [ ] Gestion des stocks
- [ ] Tableau de bord analytique
- [ ] Authentification et autorisation
- [ ] Export des données (PDF, Excel)
- [ ] Notifications par email

## 👥 Auteur

**Votre Nom**
- Email: charafeddinetbibzat@gmail.com
- GitHub: charafeddine-web
## 📅 Planning

- **Date de lancement** : 20/10/2025
- **Date de livraison** : 24/10/2025


---
