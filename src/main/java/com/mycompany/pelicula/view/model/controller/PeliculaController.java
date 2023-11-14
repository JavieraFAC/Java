
package com.mycompany.pelicula.view.model.controller;

import java.sql.Connection;
import java.sql.SQLException;
import com.mycompany.pelicula.view.model.PeliculaDTO;
import com.mycompany.pelicula.view.model.Pelicula;



public class PeliculaController {
    
    
    public boolean agregarPeliculaController (Pelicula peliculaNueva, Connection conexion) throws SQLException{
        PeliculaDTO pelicula = new PeliculaDTO();
        pelicula.agregarPelicula(peliculaNueva, conexion);
        
        return true;
    }
    
}
