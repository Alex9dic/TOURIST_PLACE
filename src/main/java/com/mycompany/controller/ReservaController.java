/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
@RequestScoped
@ManagedBean(name = "reservaciones")
public class ReservaController implements Serializable{
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
    
    @PostConstruct
    public void init() {
        service = new ReservaServiceImpl();
        reserva = new Reservaciones();
        listaRegistros = service.obtenerRegistro();
    }

    public void onRowEDit(RowEditEvent event) {
        Reservaciones reserva = (Reservaciones) event.getObject();
        service.actualizarRegistro(reserva);
        FacesMessage mensaje = new FacesMessage("Registro editado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);

    }

    public void eliminarRegistro(Reservaciones reserva) {
        service.eliminarRegistro(reserva);
        FacesMessage mensaje = new FacesMessage("Registro eliminado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, mensaje);
        System.out.println("Eliminado"+reserva.getIdreserva());
    }

    public void crearRegistro() {
        service.insertarRegistro(reserva);
    }

    public List<Reservaciones> getListaRegistros() {
        return listaRegistros;
    }
   
}
