/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.micompany.service;

import com.mycompany.entity.Usuario;
import com.mycompany.model.IUsuarioModel;
import com.mycompany.model.UsuarioModelImpl;
import java.util.List;

public class UsuarioServiceImpl implements IUsuarioService{
    //INstancia al modelo
    private IUsuarioModel model = new UsuarioModelImpl();
    @Override
    public void insertarRegistro(Usuario usuario) {
        model.insertarRegistro(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistro() {
    return model.obtenerRegistro();
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
       model.actualizarRegistro(usuario);
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        model.eliminarRegistro(usuario);
    }
}
