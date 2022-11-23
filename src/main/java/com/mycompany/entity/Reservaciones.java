/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author labso11
 */
@Entity
@Table(name = "reservaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservaciones.findAll", query = "SELECT r FROM Reservaciones r"),
    @NamedQuery(name = "Reservaciones.findByIdreserva", query = "SELECT r FROM Reservaciones r WHERE r.idreserva = :idreserva"),
    @NamedQuery(name = "Reservaciones.findByNombre", query = "SELECT r FROM Reservaciones r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "Reservaciones.findByCorreo", query = "SELECT r FROM Reservaciones r WHERE r.correo = :correo"),
    @NamedQuery(name = "Reservaciones.findByTelefono", query = "SELECT r FROM Reservaciones r WHERE r.telefono = :telefono"),
    @NamedQuery(name = "Reservaciones.findByLugar", query = "SELECT r FROM Reservaciones r WHERE r.lugar = :lugar"),
    @NamedQuery(name = "Reservaciones.findByCantpersonas", query = "SELECT r FROM Reservaciones r WHERE r.cantpersonas = :cantpersonas"),
    @NamedQuery(name = "Reservaciones.findByAnticipo", query = "SELECT r FROM Reservaciones r WHERE r.anticipo = :anticipo")})
public class Reservaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreserva")
    private Integer idreserva;
    @Size(max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 30)
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private Integer telefono;
    @Size(max = 30)
    @Column(name = "lugar")
    private String lugar;
    @Column(name = "cantpersonas")
    private Integer cantpersonas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "anticipo")
    private Double anticipo;

    public Reservaciones() {
    }

    public Reservaciones(Integer idreserva) {
        this.idreserva = idreserva;
    }

    public Integer getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(Integer idreserva) {
        this.idreserva = idreserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getCantpersonas() {
        return cantpersonas;
    }

    public void setCantpersonas(Integer cantpersonas) {
        this.cantpersonas = cantpersonas;
    }

    public Double getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(Double anticipo) {
        this.anticipo = anticipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreserva != null ? idreserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservaciones)) {
            return false;
        }
        Reservaciones other = (Reservaciones) object;
        if ((this.idreserva == null && other.idreserva != null) || (this.idreserva != null && !this.idreserva.equals(other.idreserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.entity.Reservaciones[ idreserva=" + idreserva + " ]";
    }
    
}
