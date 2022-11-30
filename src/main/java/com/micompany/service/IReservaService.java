/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.micompany.service;

import com.mycompany.entity.Reservaciones;
import java.util.List;
//Creacion de metodos adstractos
public interface IReservaService {
    //Creacion de metodo adstracto insertarRegistro
    public void insertarRegistro(Reservaciones reserva);
    //Creacion de metodo adstracto actualizarRegistro
    public void actualizarRegistro(Reservaciones reserva);
    //Creacion de metodo adstracto eliminarRegistro
    public void eliminarRegistro(Reservaciones reserva);
    //Creacion de metodo adstracto eliminarRegistro
    public List<Reservaciones> obtenerRegistro();
}
