/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.mycompany.controller;

import com.micompany.service.IReservaService;
import com.micompany.service.ReservaServiceImpl;
import com.mycompany.entity.Reservaciones;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author labso11
 */
//Clase Implementadora
@RequestScoped
@ManagedBean(name = "reservaciones")
public class ReservaController implements Serializable {

    private IReservaService service;
    public Reservaciones reserva;
    private List<Reservaciones> listaRegistros;

    public Reservaciones getReserva() {
        return reserva;
    }

    public void setReserva(Reservaciones reserva) {
        this.reserva = reserva;
    }

    public Reservaciones getRol() {
        return reserva;
    }

    public void setRol(Reservaciones reserva) {
        this.reserva = reserva;
    }

    //Método para inicializar
    @PostConstruct
    public void init() {
        service = new ReservaServiceImpl();
        reserva = new Reservaciones();
        listaRegistros = service.obtenerRegistro();
    }
    //Método para actualizar

    public void onRowEDit(RowEditEvent event) {
        Reservaciones reserva = (Reservaciones) event.getObject();
        service.actualizarRegistro(reserva);
        FacesMessage mensaje = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);

    }

    //Método para eliminar
    public void eliminarRegistro(Reservaciones reserva) {
        service.eliminarRegistro(reserva);
        FacesMessage mensaje = new FacesMessage("Registro eliminado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
        System.out.println("Eliminado" + reserva.getIdreserva());
    }

    //Método para crear
    public void crearRegistro() {
        service.insertarRegistro(reserva);
    }

    //Método para listar
    public List<Reservaciones> getListaRegistros() {
        return listaRegistros;
    }

}
