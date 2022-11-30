/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.mycompany.controller;

import com.micompany.service.IUsuarioService;
import com.micompany.service.UsuarioServiceImpl;
import com.mycompany.entity.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

//Clase Implementadora
@RequestScoped
@ManagedBean(name = "usuario")
public class UsuarioController implements Serializable {

    private IUsuarioService service;
    public Usuario usuario;
    private List<Usuario> listaRegistros;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getRol() {
        return usuario;
    }

    public void setRol(Usuario usuario) {
        this.usuario = usuario;
    }

    @PostConstruct
    public void init() {
        service = new UsuarioServiceImpl();
        usuario = new Usuario();
        listaRegistros = service.obtenerRegistro();
    }

    //Método para actualizar
    public void onRowEDit(RowEditEvent event) {
        Usuario usuario = (Usuario) event.getObject();
        service.actualizarRegistro(usuario);
        FacesMessage mensaje = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);

    }

    //Método para eliminar
    public void eliminarRegistro(Usuario usuario) {
        service.eliminarRegistro(usuario);
        FacesMessage mensaje = new FacesMessage("Registro eliminado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
        System.out.println("Eliminado" + usuario.getIdusuario());
    }

    //Método para crear
    public void crearRegistro() {
        service.insertarRegistro(usuario);
    }

    //Método para listar
    public List<Usuario> getListaRegistros() {
        return listaRegistros;
    }
}
