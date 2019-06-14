package org.epsi.pronosticash;

public class Equipe {
    private Long idEquipe;
    private String nom;

    public Equipe() {
    }

    public Equipe(Long idEquipe, String nom) {
        this.idEquipe = idEquipe;
        this.nom = nom;
    }

    public Long getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
