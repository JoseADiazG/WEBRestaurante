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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f")
    , @NamedQuery(name = "Facturas.findByIdfacturas", query = "SELECT f FROM Facturas f WHERE f.idfacturas = :idfacturas")
    , @NamedQuery(name = "Facturas.findByTotalapagar", query = "SELECT f FROM Facturas f WHERE f.totalapagar = :totalapagar")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfacturas")
    private Integer idfacturas;
    @Size(max = 45)
    @Column(name = "totalapagar")
    private String totalapagar;
    @OneToMany(mappedBy = "idfactura")
    private List<Detallefactura> detallefacturaList;
    @JoinColumn(name = "idcliente", referencedColumnName = "idclientes")
    @ManyToOne
    private Clientes idcliente;
    @JoinColumn(name = "idmesero", referencedColumnName = "idmeseros")
    @ManyToOne
    private Meseros idmesero;
    @JoinColumn(name = "idpago", referencedColumnName = "idpago")
    @ManyToOne
    private Pago idpago;
    @JoinColumn(name = "idplatos", referencedColumnName = "idplatos")
    @ManyToOne
    private Platos idplatos;

    public Facturas() {
    }

    public Facturas(Integer idfacturas) {
        this.idfacturas = idfacturas;
    }

    public Integer getIdfacturas() {
        return idfacturas;
    }

    public void setIdfacturas(Integer idfacturas) {
        this.idfacturas = idfacturas;
    }

    public String getTotalapagar() {
        return totalapagar;
    }

    public void setTotalapagar(String totalapagar) {
        this.totalapagar = totalapagar;
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    public Clientes getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
    }

    public Meseros getIdmesero() {
        return idmesero;
    }

    public void setIdmesero(Meseros idmesero) {
        this.idmesero = idmesero;
    }

    public Pago getIdpago() {
        return idpago;
    }

    public void setIdpago(Pago idpago) {
        this.idpago = idpago;
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
        hash += (idfacturas != null ? idfacturas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.idfacturas == null && other.idfacturas != null) || (this.idfacturas != null && !this.idfacturas.equals(other.idfacturas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoseDiaz.entities.Facturas[ idfacturas=" + idfacturas + " ]";
    }
    
}
