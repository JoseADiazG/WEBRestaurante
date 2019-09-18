/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoseDiaz.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "detallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefactura.findAll", query = "SELECT d FROM Detallefactura d")
    , @NamedQuery(name = "Detallefactura.findByIddetallefactura", query = "SELECT d FROM Detallefactura d WHERE d.iddetallefactura = :iddetallefactura")
    , @NamedQuery(name = "Detallefactura.findByTotalpago", query = "SELECT d FROM Detallefactura d WHERE d.totalpago = :totalpago")
    , @NamedQuery(name = "Detallefactura.findByTotalventa", query = "SELECT d FROM Detallefactura d WHERE d.totalventa = :totalventa")})
public class Detallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddetallefactura")
    private Integer iddetallefactura;
    @Size(max = 45)
    @Column(name = "totalpago")
    private String totalpago;
    @Size(max = 45)
    @Column(name = "totalventa")
    private String totalventa;
    @JoinColumn(name = "idcocineros", referencedColumnName = "idcocineros")
    @ManyToOne
    private Cocineros idcocineros;
    @JoinColumn(name = "idfactura", referencedColumnName = "idfacturas")
    @ManyToOne
    private Facturas idfactura;
    @JoinColumn(name = "idplatos", referencedColumnName = "idplatos")
    @ManyToOne
    private Platos idplatos;

    public Detallefactura() {
    }

    public Detallefactura(Integer iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
    }

    public Integer getIddetallefactura() {
        return iddetallefactura;
    }

    public void setIddetallefactura(Integer iddetallefactura) {
        this.iddetallefactura = iddetallefactura;
    }

    public String getTotalpago() {
        return totalpago;
    }

    public void setTotalpago(String totalpago) {
        this.totalpago = totalpago;
    }

    public String getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(String totalventa) {
        this.totalventa = totalventa;
    }

    public Cocineros getIdcocineros() {
        return idcocineros;
    }

    public void setIdcocineros(Cocineros idcocineros) {
        this.idcocineros = idcocineros;
    }

    public Facturas getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Facturas idfactura) {
        this.idfactura = idfactura;
    }

    public Platos getIdplatos() {
        return idplatos;
    }

    public void setIdplatos(Platos idplatos) {
        this.idplatos = idplatos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetallefactura != null ? iddetallefactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.iddetallefactura == null && other.iddetallefactura != null) || (this.iddetallefactura != null && !this.iddetallefactura.equals(other.iddetallefactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoseDiaz.entities.Detallefactura[ iddetallefactura=" + iddetallefactura + " ]";
    }
    
}
