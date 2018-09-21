package be.vdab.cmsvdab.entity;

import javax.persistence.*;

@Entity
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String naam;

    @Column(nullable = false)
    private boolean cursist = false;

    @ManyToOne
    private Module module;

    public Link() {
    }

    public Long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public boolean isCursist() {
        return cursist;
    }

    public void setCursist(boolean cursist) {
        this.cursist = cursist;
    }
}
