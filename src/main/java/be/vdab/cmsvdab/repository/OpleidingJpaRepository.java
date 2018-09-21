package be.vdab.cmsvdab.repository;

import be.vdab.cmsvdab.entity.Opleiding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpleidingJpaRepository extends JpaRepository<Opleiding, Long> {

    Opleiding findByNaam(String naam);


}
