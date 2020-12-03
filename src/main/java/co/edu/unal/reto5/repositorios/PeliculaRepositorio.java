/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unal.reto5.repositorios;

import co.edu.unal.reto5.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author happygallo
 */

@Repository
public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long> {
    
}
