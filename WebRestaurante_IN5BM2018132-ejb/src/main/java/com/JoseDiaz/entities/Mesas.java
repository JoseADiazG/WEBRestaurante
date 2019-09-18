/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoseDiaz.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "mesas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesas.findAll", query = "SELECT m FROM Mesas m")
    , @NamedQuery(name = "Mesas.findByIdmesas", query = "SELECT m FROM Mesas m WHERE m.idmesas = :idmesas")})
public class Mesas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmesas")
    private Integer idmesas;
    @OneToMany(mappedBy = "idmesa")
    private List<Area> areaList;
    @OneToMany(mappedBy = "idmesa")
    private List<Reservacion> reservacionList;
    @JoinColumn(name = "idarea", referencedColumnName = "idarea")
    @ManyToOne(optional = false)
    private Area idarea;
    @JoinColumn(name = "idmeseros", referencedColumnName = "idmeseros")
    @ManyToOne(optional = false)
    private Meseros idmeseros;
    @OneToMany(mappedBy = "idmesa")
    private List<Meseros> meserosList;

    public Mesas() {
    }

    public Mesas(Integer idmesas) {
        this.idmesas = idmesas;
    }

    public Integer getIdmesas() {
        return idmesas;
    }

    public void setIdmesas(Integer idmesas) {
        this.idmesas = idmesas;
    }

    @XmlTransient
    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
    }

    @XmlTransient
    public List<Reservacion> getReservacionList() {
        return reservacionList;
    }

    public void setReservacionList(List<Reservacion> reservacionList) {
        this.reservacionList = reservacionList;
    }

    public Area getIdarea() {
        return idarea;
    }

    public void setIdarea(Area idarea) {
        this.idarea = idarea;
    }

    public Meseros getIdmeseros() {
        return idmeseros;
    }

    public void setIdmeseros(Meseros idmeseros) {
        this.idmeseros = idmeseros;
    }

    @XmlTransient
    public List<Meseros> getMeserosList() {
        return meserosList;
    }

    public void setMeserosList(List<Meseros> meserosList) {
        this.meserosList = meserosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesas != null ? idmesas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesas)) {
            return false;
        }
        Mesas other = (Mesas) object;
        if ((this.idmesas == null && other.idmesas != null) || (this.idmesas != null && !this.idmesas.equals(other.idmesas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoseDiaz.entities.Mesas[ idmesas=" + idmesas + " ]";
    }
    
}
