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
//Implementacion de la interfas IUsuarioService
public class UsuarioServiceImpl implements IUsuarioService{
    //Instancia al modelo
    private IUsuarioModel model = new UsuarioModelImpl();
    @Override
    //Implemetacion de metodo abstrapto insertarRegistro
    public void insertarRegistro(Usuario usuario) {
        model.insertarRegistro(usuario);
    }
    //Implemetacion de metodo abstrapto obtenerRegistro
    @Override
    public List<Usuario> obtenerRegistro() {
    return model.obtenerRegistro();
    }
    //Implemetacion de metodo abstrapto actualizarRegistro
    @Override
    public void actualizarRegistro(Usuario usuario) {
       model.actualizarRegistro(usuario);
    }
    //Implemetacion de metodo abstrapto insertarRegistro
    @Override
    public void eliminarRegistro(Usuario usuario) {
        model.eliminarRegistro(usuario);
    }
}
