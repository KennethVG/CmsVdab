package be.vdab.cmsvdab.controller;

import be.vdab.cmsvdab.entity.Opleiding;
import be.vdab.cmsvdab.service.OpleidingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpleidingController {

    private final OpleidingService opleidingService;

    @Autowired
    public OpleidingController(OpleidingService opleidingService) {
        this.opleidingService = opleidingService;
    }

    @GetMapping("/zoeken/{naam}")
    public ResponseEntity<Opleiding> zoekOpleiding(@PathVariable String naam){
        return ResponseEntity.ok(opleidingService.findByNaam(naam));
    }

}
