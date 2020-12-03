/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.reto5.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author happygallo
 */

@Entity
@Table(name = "pelicula")
public class Pelicula {
    
    @Id
    @GeneratedValue
    @Column(name="id_pelicula")
    private Long peliId;
    
    @Column(name="titulo")
    private String peliTitulo;
    
    //Revisar el tipo de dato para anno
    @Column(name="anno")
    private String peliAnno;
    
    @Column(name="director")
    private String peliDirector;

    public Long getPeliId() {
        return peliId;
    }

    public void setPeliId(Long peliId) {
        this.peliId = peliId;
    }

    public String getPeliTitulo() {
        return peliTitulo;
    }

    public void setPeliTitulo(String peliTitulo) {
        this.peliTitulo = peliTitulo;
    }

    public String getPeliAnno() {
        return peliAnno;
    }

    public void setPeliAnno(String peliAnno) {
        this.peliAnno = peliAnno;
    }

    public String getPeliDirector() {
        return peliDirector;
    }

    public void setPeliDirector(String peliDirector) {
        this.peliDirector = peliDirector;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "peliId=" + peliId + ", peliTitulo=" + peliTitulo + ", peliAnno=" + peliAnno + ", peliDirector=" + peliDirector + '}';
    }
    
}
