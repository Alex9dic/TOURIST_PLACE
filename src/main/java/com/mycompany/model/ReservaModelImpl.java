/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.mycompany.model;

/*Librerias utilizadas*/
import com.mycompany.entity.Reservaciones;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*Implementacion de metodos abstractos*/
public class ReservaModelImpl implements IReservaModel {

    private SessionFactory sf;
    private Session sesion;

    /*Metodod insertar*/
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

    /*Metodo para obtener registros*/
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

    /*Metodo para actualizar registro*/
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

    /*Metodo para eliminación*/
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
