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
@Table(name = "meseros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Meseros.findAll", query = "SELECT m FROM Meseros m")
    , @NamedQuery(name = "Meseros.findByIdmeseros", query = "SELECT m FROM Meseros m WHERE m.idmeseros = :idmeseros")
    , @NamedQuery(name = "Meseros.findByNombre", query = "SELECT m FROM Meseros m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Meseros.findByApellido", query = "SELECT m FROM Meseros m WHERE m.apellido = :apellido")
    , @NamedQuery(name = "Meseros.findByTelefono", query = "SELECT m FROM Meseros m WHERE m.telefono = :telefono")})
public class Meseros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmeseros")
    private Integer idmeseros;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmeseros")
    private List<Mesas> mesasList;
    @OneToMany(mappedBy = "idmesero")
    private List<Facturas> facturasList;
    @JoinColumn(name = "idhorario", referencedColumnName = "idhorarios")
    @ManyToOne
    private Horarios idhorario;
    @JoinColumn(name = "idmesa", referencedColumnName = "idmesas")
    @ManyToOne
    private Mesas idmesa;

    public Meseros() {
    }

    public Meseros(Integer idmeseros) {
        this.idmeseros = idmeseros;
    }

    public Integer getIdmeseros() {
        return idmeseros;
    }

    public void setIdmeseros(Integer idmeseros) {
        this.idmeseros = idmeseros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public List<Mesas> getMesasList() {
        return mesasList;
    }

    public void setMesasList(List<Mesas> mesasList) {
        this.mesasList = mesasList;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    public Horarios getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(Horarios idhorario) {
        this.idhorario = idhorario;
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
        hash += (idmeseros != null ? idmeseros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Meseros)) {
            return false;
        }
        Meseros other = (Meseros) object;
        if ((this.idmeseros == null && other.idmeseros != null) || (this.idmeseros != null && !this.idmeseros.equals(other.idmeseros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoseDiaz.entities.Meseros[ idmeseros=" + idmeseros + " ]";
    }
    
}
