
package com.mycompany.pelicula.view.model;

import java.sql.Connection;
import java.sql.SQLException;
import com.mycompany.pelicula.view.model.controller.DataSourceSample;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class PeliculaDTO {
    
    // se pueden crear lista de peliculas . 
    
    public boolean agregarPelicula(Pelicula peliculaNueva, Connection conexion) throws SQLException{
        
        String queryStatement = "INSERT inTO PELICULA (NOMBRE,DIRECTOR,ANNO,DURACION,GENERO) VALUES(?,?,?,?,?)";
    
        System.out.println("\n Query is " + queryStatement);   
        
        PreparedStatement ps = conexion.prepareStatement(queryStatement);
        
        ps.setString(1, peliculaNueva.getNombre());
        ps.setString(2, peliculaNueva.getDirector());
        ps.setInt(3, peliculaNueva.getAnno());
        ps.setInt(4,peliculaNueva.getDuracion());
        ps.setString(5, peliculaNueva.getGenero());
        
        int result = ps.executeUpdate();
        
        System.out.println("Pelicula agregada: "+result);

        
        return true;
    }

}
