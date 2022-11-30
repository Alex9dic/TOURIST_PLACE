/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.micompany.service;

import com.mycompany.entity.Reservaciones;
import java.util.List;

public interface IReservaService {

    public void insertarRegistro(Reservaciones reserva);

    public void actualizarRegistro(Reservaciones reserva);

    public void eliminarRegistro(Reservaciones reserva);

    public List<Reservaciones> obtenerRegistro();
}
