package be.vdab.cmsvdab.service.impl;

import be.vdab.cmsvdab.entity.Opleiding;
import be.vdab.cmsvdab.repository.OpleidingJpaRepository;
import be.vdab.cmsvdab.service.OpleidingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpleidingServiceImpl implements OpleidingService {

    private final OpleidingJpaRepository opleidingJpaRepository;

    @Autowired
    public OpleidingServiceImpl(OpleidingJpaRepository opleidingJpaRepository) {
        this.opleidingJpaRepository = opleidingJpaRepository;
    }

    @Override
    public Opleiding findByNaam(String naam) {
        return opleidingJpaRepository.findByNaam(naam);
    }
}
