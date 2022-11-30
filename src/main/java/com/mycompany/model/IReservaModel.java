/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.mycompany.model;

import com.mycompany.entity.Reservaciones;
import java.util.List;

/*Metodos abstractos*/
public interface IReservaModel {

    public void insertarRegistro(Reservaciones reserva);

    public List<Reservaciones> obtenerRegistro();

    public void actualizarRegistro(Reservaciones reserva);

    public void eliminarRegistro(Reservaciones reserva);
}
