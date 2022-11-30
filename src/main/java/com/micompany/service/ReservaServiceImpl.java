/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.micompany.service;

import com.mycompany.entity.Reservaciones;
import com.mycompany.model.IReservaModel;
import com.mycompany.model.ReservaModelImpl;
import java.util.List;

//Implementacion de la interfas IReservaService
public class ReservaServiceImpl implements IReservaService {
    //Instancia al modelo
    private IReservaModel model = new ReservaModelImpl();
    //Implemetacion de metodo abstrapto insertarRegistro
    @Override
    public void insertarRegistro(Reservaciones reserva) {
        model.insertarRegistro(reserva);
    }
    //Implemetacion de metodo abstrapto actualizarRegistro
    @Override
    public void actualizarRegistro(Reservaciones reserva) {
        model.actualizarRegistro(reserva);
    }
    //Implemetacion de metodo abstrapto eliminarRegistro
    @Override
    public void eliminarRegistro(Reservaciones reserva) {
        model.eliminarRegistro(reserva);
    }
    //Implemetacion de metodo abstrapto obtenerRegistro
    @Override
    public List<Reservaciones> obtenerRegistro() {
        return model.obtenerRegistro();
    }

}
