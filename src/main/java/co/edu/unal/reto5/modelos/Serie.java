/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.reto5.modelos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sagov8
 */
@Entity
@Table(name = "serie")
public class Serie implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id_serie")
    private Long id;

    @Column(name = "titulo")
    private Long tituloSerie;

    @Column(name = "num_episodios")
    private Integer numeroEpisodios;

    @Column(name = "num_temporadas")
    private Integer numeroTemporadas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(Long tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public Integer getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(Integer numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public Integer getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(Integer numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String toString() {
        return "Serie{" + "id=" + id + ", tituloSerie=" + tituloSerie + ", numeroEpisodios=" + numeroEpisodios + ", numeroTemporadas=" + numeroTemporadas + '}';
    }
}
