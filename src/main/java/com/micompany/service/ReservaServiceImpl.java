/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.micompany.service;

import com.mycompany.entity.Reservaciones;
import com.mycompany.model.IReservaModel;
import com.mycompany.model.ReservaModelImpl;
import java.util.List;


public class ReservaServiceImpl implements IReservaService{
    private IReservaModel model = new ReservaModelImpl();
    @Override
    public void insertarRegistro(Reservaciones reserva) {
         model.insertarRegistro(reserva);
    }

    @Override
    public void actualizarRegistro(Reservaciones reserva) {
        model.actualizarRegistro(reserva);
    }

    @Override
    public void eliminarRegistro(Reservaciones reserva) {
        model.eliminarRegistro(reserva);
    }

    @Override
    public List<Reservaciones> obtenerRegistro() {
       return model.obtenerRegistro(); 
    }
    
}
