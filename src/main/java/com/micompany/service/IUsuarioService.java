/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.micompany.service;

import com.mycompany.entity.Usuario;
import java.util.List;
//Creacion de metodos adstractos
public interface IUsuarioService {
    //Creacion de metodo adstracto insertarRegistro
    public void insertarRegistro(Usuario usuario);
    //Creacion de metodo adstracto actualizarRegistro
    public void actualizarRegistro(Usuario usuario);
    //Creacion de metodo adstracto eliminarRegistro
    public void eliminarRegistro(Usuario usuario);
    //Creacion de metodo adstracto obtenerRegistro
    public List<Usuario> obtenerRegistro();

}
