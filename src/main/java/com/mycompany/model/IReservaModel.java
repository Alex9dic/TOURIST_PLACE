/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.model;

import com.mycompany.entity.Reservaciones;
import java.util.List;

/**
 *
 * @author labso11
 */
public interface IReservaModel {
    public void insertarRegistro(Reservaciones reserva);
    public List<Reservaciones> obtenerRegistro();
    public void actualizarRegistro(Reservaciones reserva);
    public void eliminarRegistro(Reservaciones reserva);
}
