/*
 Universidad de la Sierra Sur 
 Licenciatura en Informática
 Equipo: workboot
 Proyecto: Tourist Places: Mostrar la belleza de Oaxaca 
 */
package com.mycompany.model;

import com.mycompany.entity.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Alex Ram
 */
public class UsuarioModelImpl implements IUsuarioModel {

    private SessionFactory sf;
    private Session sesion;

    @Override
    public void insertarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.save(usuario);
            sesion.getTransaction().commit();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        IUsuarioModel modelo = new UsuarioModelImpl();
        Usuario user = new Usuario();
//        user.setIdusuario(2);
        user.setNombre("Daniel");
        user.setCorreo("alx23@gmail.com");
        user.setUsuario("Admin");
        user.setContrasena("12der");
        modelo.insertarRegistro(user);
        modelo.actualizarRegistro(user);
//        modelo.eliminarRegistro(user);
    }

    @Override
    public List<Usuario> obtenerRegistro() {
        List<Usuario> listaRol = null;
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            listaRol = sesion.createCriteria(Usuario.class).list();
            sesion.close();
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
        return listaRol;
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.update(usuario);
            sesion.getTransaction().commit();
            sesion.close();
            System.out.println("Actualizado");
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            sesion = sf.openSession();
            sesion.beginTransaction();
            sesion.delete(usuario);
            sesion.getTransaction().commit();
            sesion.close();
            System.out.println("Eliminado");
        } catch (HibernateException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
