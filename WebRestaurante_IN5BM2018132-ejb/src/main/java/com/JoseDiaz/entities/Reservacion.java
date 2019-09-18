/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoseDiaz.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "reservacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservacion.findAll", query = "SELECT r FROM Reservacion r")
    , @NamedQuery(name = "Reservacion.findByIdreservacion", query = "SELECT r FROM Reservacion r WHERE r.idreservacion = :idreservacion")
    , @NamedQuery(name = "Reservacion.findByHorareservacion", query = "SELECT r FROM Reservacion r WHERE r.horareservacion = :horareservacion")
    , @NamedQuery(name = "Reservacion.findByPersonas", query = "SELECT r FROM Reservacion r WHERE r.personas = :personas")})
public class Reservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idreservacion")
    private Integer idreservacion;
    @Column(name = "horareservacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horareservacion;
    @Size(max = 45)
    @Column(name = "personas")
    private String personas;
    @JoinColumn(name = "idclientes", referencedColumnName = "idclientes")
    @ManyToOne
    private Clientes idclientes;
    @JoinColumn(name = "idmesa", referencedColumnName = "idmesas")
    @ManyToOne
    private Mesas idmesa;

    public Reservacion() {
    }

    public Reservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Integer getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Date getHorareservacion() {
        return horareservacion;
    }

    public void setHorareservacion(Date horareservacion) {
        this.horareservacion = horareservacion;
    }

    public String getPersonas() {
        return personas;
    }

    public void setPersonas(String personas) {
        this.personas = personas;
    }

    public Clientes getIdclientes() {
        return idclientes;
    }

    public void setIdclientes(Clientes idclientes) {
        this.idclientes = idclientes;
    }

    public Mesas getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Mesas idmesa) {
        this.idmesa = idmesa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservacion != null ? idreservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservacion)) {
            return false;
        }
        Reservacion other = (Reservacion) object;
        if ((this.idreservacion == null && other.idreservacion != null) || (this.idreservacion != null && !this.idreservacion.equals(other.idreservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoseDiaz.entities.Reservacion[ idreservacion=" + idreservacion + " ]";
    }
    
}
