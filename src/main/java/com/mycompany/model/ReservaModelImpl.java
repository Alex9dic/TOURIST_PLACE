/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import com.mycompany.entity.Reservaciones;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author labso11
 */
public class ReservaModelImpl implements IReservaModel{
    
    private SessionFactory sf;
    private Session sesion;
    

    @Override
    public void insertarRegistro(Reservaciones reserva) {
      try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.save(reserva);
            sesion.getTransaction().commit();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    @Override
    public List<Reservaciones> obtenerRegistro() {
         List<Reservaciones> listaRol = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            listaRol = sesion.createCriteria(Reservaciones.class).list();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
        return listaRol;
    }

    @Override
    public void actualizarRegistro(Reservaciones reserva) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.update(reserva);
            sesion.getTransaction().commit();
            sesion.close();
            System.out.println("Actualizado");
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Reservaciones reserva) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.delete(reserva);
            sesion.getTransaction().commit();
            sesion.close();
            System.out.println("Eliminado");
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
    
}
