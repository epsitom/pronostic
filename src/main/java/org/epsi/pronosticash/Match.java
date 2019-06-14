package org.epsi.pronosticash;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;


public class Match {

    private Long id_match;
    private Long score_premiere_equipe;
    private Long score_deuxieme_equipe;
    private Long date_debut;
    private Long date_fin;
    private String premiereEquipe;
    private String deuxiemeEquipe;
    private String tournoi;
    private Long terrain;
    private Long arbitre;
    private Long createdBy;
    private Long niveau;
    private Long temps;

    public Match() {
    }

    public Match(Long id_match, Long score_premiere_equipe, Long score_deuxieme_equipe, Long date_debut, Long date_fin, String premiereEquipe, String deuxiemeEquipe, String tournoi, Long terrain, Long arbitre, Long createdBy, Long niveau, Long temps) {
        this.id_match = id_match;
        this.score_premiere_equipe = score_premiere_equipe;
        this.score_deuxieme_equipe = score_deuxieme_equipe;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.premiereEquipe = premiereEquipe;
        this.deuxiemeEquipe = deuxiemeEquipe;
        this.tournoi = tournoi;
        this.terrain = terrain;
        this.arbitre = arbitre;
        this.createdBy = createdBy;
        this.niveau = niveau;
        this.temps = temps;
    }

    public Long getTerrain() {
        return terrain;
    }

    public void setTerrain(Long terrain) {
        this.terrain = terrain;
    }

    public Long getId_match() {
        return id_match;
    }

    public void setId_match(Long id_match) {
        this.id_match = id_match;
    }

    public Long getScore_premiere_equipe() {
        return score_premiere_equipe;
    }

    public void setScore_premiere_equipe(Long score_premiere_equipe) {
        this.score_premiere_equipe = score_premiere_equipe;
    }

    public Long getScore_deuxieme_equipe() {
        return score_deuxieme_equipe;
    }

    public void setScore_deuxieme_equipe(Long score_deuxieme_equipe) {
        this.score_deuxieme_equipe = score_deuxieme_equipe;
    }

    public Long getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Long date_debut) {
        this.date_debut = date_debut;
    }

    public Long getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Long date_fin) {
        this.date_fin = date_fin;
    }

    public String getPremiereEquipe() {
        return premiereEquipe;
    }

    public void setPremiereEquipe(String premiereEquipe) {
        this.premiereEquipe = premiereEquipe;
    }

    public String getDeuxiemeEquipe() {
        return deuxiemeEquipe;
    }

    public void setDeuxiemeEquipe(String deuxiemeEquipe) {
        this.deuxiemeEquipe = deuxiemeEquipe;
    }

    public String getTournoi() {
        return tournoi;
    }

    public void setTournoi(String tournoi) {
        this.tournoi = tournoi;
    }

    public Long getArbitre() {
        return arbitre;
    }

    public void setArbitre(Long arbitre) {
        this.arbitre = arbitre;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getNiveau() {
        return niveau;
    }

    public void setNiveau(Long niveau) {
        this.niveau = niveau;
    }

    public Long getTemps() {
        return temps;
    }

    public void setTemps(Long temps) {
        this.temps = temps;
    }
}