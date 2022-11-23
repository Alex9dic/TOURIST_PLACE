/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.micompany.service;

import com.mycompany.entity.Reservaciones;
import java.util.List;

/**
 *
 * @author labso11
 */
public interface IReservaService {
    public void insertarRegistro(Reservaciones reserva);
    public void actualizarRegistro(Reservaciones reserva);
    public void eliminarRegistro(Reservaciones reserva);
    public List<Reservaciones> obtenerRegistro();
}
