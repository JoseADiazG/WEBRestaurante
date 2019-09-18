/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoseDiaz.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "platos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platos.findAll", query = "SELECT p FROM Platos p")
    , @NamedQuery(name = "Platos.findByIdplatos", query = "SELECT p FROM Platos p WHERE p.idplatos = :idplatos")
    , @NamedQuery(name = "Platos.findByPlato", query = "SELECT p FROM Platos p WHERE p.plato = :plato")
    , @NamedQuery(name = "Platos.findByAperitivo", query = "SELECT p FROM Platos p WHERE p.aperitivo = :aperitivo")
    , @NamedQuery(name = "Platos.findByPostre", query = "SELECT p FROM Platos p WHERE p.postre = :postre")
    , @NamedQuery(name = "Platos.findByBebida", query = "SELECT p FROM Platos p WHERE p.bebida = :bebida")
    , @NamedQuery(name = "Platos.findByPrecio", query = "SELECT p FROM Platos p WHERE p.precio = :precio")})
public class Platos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idplatos")
    private Integer idplatos;
    @Size(max = 45)
    @Column(name = "plato")
    private String plato;
    @Size(max = 45)
    @Column(name = "aperitivo")
    private String aperitivo;
    @Size(max = 45)
    @Column(name = "postre")
    private String postre;
    @Size(max = 45)
    @Column(name = "bebida")
    private String bebida;
    @Size(max = 45)
    @Column(name = "precio")
    private String precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idplatos")
    private List<Cocineros> cocinerosList;
    @OneToMany(mappedBy = "idplatos")
    private List<Detallefactura> detallefacturaList;
    @OneToMany(mappedBy = "idplatos")
    private List<Facturas> facturasList;

    public Platos() {
    }

    public Platos(Integer idplatos) {
        this.idplatos = idplatos;
    }

    public Integer getIdplatos() {
        return idplatos;
    }

    public void setIdplatos(Integer idplatos) {
        this.idplatos = idplatos;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getAperitivo() {
        return aperitivo;
    }

    public void setAperitivo(String aperitivo) {
        this.aperitivo = aperitivo;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @XmlTransient
    public List<Cocineros> getCocinerosList() {
        return cocinerosList;
    }

    public void setCocinerosList(List<Cocineros> cocinerosList) {
        this.cocinerosList = cocinerosList;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idplatos != null ? idplatos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platos)) {
            return false;
        }
        Platos other = (Platos) object;
        if ((this.idplatos == null && other.idplatos != null) || (this.idplatos != null && !this.idplatos.equals(other.idplatos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoseDiaz.entities.Platos[ idplatos=" + idplatos + " ]";
    }
    
}
