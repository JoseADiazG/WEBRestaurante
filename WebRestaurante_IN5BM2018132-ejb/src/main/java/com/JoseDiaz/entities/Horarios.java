/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JoseDiaz.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "horarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horarios.findAll", query = "SELECT h FROM Horarios h")
    , @NamedQuery(name = "Horarios.findByIdhorarios", query = "SELECT h FROM Horarios h WHERE h.idhorarios = :idhorarios")
    , @NamedQuery(name = "Horarios.findByHora", query = "SELECT h FROM Horarios h WHERE h.hora = :hora")})
public class Horarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idhorarios")
    private Integer idhorarios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhorario")
    private List<Cocineros> cocinerosList;
    @OneToMany(mappedBy = "idhorario")
    private List<Meseros> meserosList;

    public Horarios() {
    }

    public Horarios(Integer idhorarios) {
        this.idhorarios = idhorarios;
    }

    public Horarios(Integer idhorarios, Date hora) {
        this.idhorarios = idhorarios;
        this.hora = hora;
    }

    public Integer getIdhorarios() {
        return idhorarios;
    }

    public void setIdhorarios(Integer idhorarios) {
        this.idhorarios = idhorarios;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    @XmlTransient
    public List<Cocineros> getCocinerosList() {
        return cocinerosList;
    }

    public void setCocinerosList(List<Cocineros> cocinerosList) {
        this.cocinerosList = cocinerosList;
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
        hash += (idhorarios != null ? idhorarios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Horarios)) {
            return false;
        }
        Horarios other = (Horarios) object;
        if ((this.idhorarios == null && other.idhorarios != null) || (this.idhorarios != null && !this.idhorarios.equals(other.idhorarios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.JoseDiaz.entities.Horarios[ idhorarios=" + idhorarios + " ]";
    }
    
}
