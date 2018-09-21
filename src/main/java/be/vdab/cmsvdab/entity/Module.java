package be.vdab.cmsvdab.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String naam;

    @ElementCollection
    private List<String> doelstellingen;

    @Column(nullable = false)
    private String duurtijd;
    private String voorkennis;

    @OneToMany(targetEntity = Link.class, mappedBy = "module")
    private List<Link> links;

    @Column(nullable = false)
    @ManyToMany
    private List<User> verantwoordelijkeInstructeurs;

    @Column(nullable = false)
    private boolean verplicht = true;

    @ManyToOne
    private Opleiding opleiding;

    public Long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public List<String> getDoelstellingen() {
        return doelstellingen;
    }

    public void setDoelstellingen(List<String> doelstellingen) {
        this.doelstellingen = doelstellingen;
    }

    public String getDuurtijd() {
        return duurtijd;
    }

    public void setDuurtijd(String duurtijd) {
        this.duurtijd = duurtijd;
    }

    public String getVoorkennis() {
        return voorkennis;
    }

    public void setVoorkennis(String voorkennis) {
        this.voorkennis = voorkennis;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<User> getVerantwoordelijkeInstructeurs() {
        return verantwoordelijkeInstructeurs;
    }

    public void setVerantwoordelijkeInstructeurs(List<User> verantwoordelijkeInstructeurs) {
        this.verantwoordelijkeInstructeurs = verantwoordelijkeInstructeurs;
    }

    public boolean isVerplicht() {
        return verplicht;
    }

    public void setVerplicht(boolean verplicht) {
        this.verplicht = verplicht;
    }
}
