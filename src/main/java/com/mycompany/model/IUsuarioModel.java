/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.mycompany.model;

import com.mycompany.entity.Usuario;
import java.util.List;

/*Metodo abstracto*/
public interface IUsuarioModel {

    public void insertarRegistro(Usuario usuario);

    public List<Usuario> obtenerRegistro();

    public void actualizarRegistro(Usuario usuario);

    public void eliminarRegistro(Usuario usuario);
}
