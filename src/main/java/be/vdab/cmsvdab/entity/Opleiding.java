package be.vdab.cmsvdab.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Opleiding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String naam;

    @Column(columnDefinition = "TEXT")
    private String algemeneInfo;

    private String traject;

    @ManyToMany
    private List<User> users;

    @OneToMany(targetEntity = Module.class, mappedBy = "opleiding")
    private List<Module> modules;

    public Opleiding() {
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

    public String getAlgemeneInfo() {
        return algemeneInfo;
    }

    public void setAlgemeneInfo(String algemeneInfo) {
        this.algemeneInfo = algemeneInfo;
    }

    public String getTraject() {
        return traject;
    }

    public void setTraject(String traject) {
        this.traject = traject;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
