package com.tricol.controller;

import com.tricol.entity.fournisseur;
import com.tricol.service.fournisseurService;
import jdk.jfr.Unsigned;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class fournisseurController {
    private fournisseurService fournisseurService;

    public fournisseurController(fournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }


    @PostMapping
    public String createFournisseur(@RequestParam fournisseur fournisseur) {
        fournisseurService.save(fournisseur);
        return "Fournisseur ajouté avec succès" + fournisseur;
    }

    @GetMapping
    public List<fournisseur> getAllFournisseur() {
        return fournisseurService.findAll();
    }

    @GetMapping
    public Optional<fournisseur> getFournisseurById(@PathVariable int id) {
        return  fournisseurService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteFournisseurById(@PathVariable int id) {
        Optional<fournisseur> fournisseur = fournisseurService.findById(id);
        if(fournisseur.isPresent()) {
            fournisseurService.delete(fournisseur.get());
            return "Fournisseur supprimé avec succès";
        } else {
            return "Fournisseur non trouvé";
        }
    }

    @PutMapping("/{id}")
    public String updateFournisseur(@PathVariable int id, @RequestBody fournisseur fournisseur) {
        Optional<fournisseur> existingOpt = fournisseurService.findById(id);
        if(existingOpt.isPresent()) {
            fournisseur existing = existingOpt.get();
            existing.setIce(fournisseur.getIce());
            existing.setSociete(fournisseur.getSociete());
            existing.setAdresse(fournisseur.getAdresse());
            existing.setTelephone(fournisseur.getTelephone());
            existing.setEmail(fournisseur.getEmail());
            existing.setVille(fournisseur.getVille());

            fournisseurService.save(existing);
            return "Fournisseur mis à jour avec succès";
        } else {
            return "Fournisseur non trouvé";
        }
    }



}
