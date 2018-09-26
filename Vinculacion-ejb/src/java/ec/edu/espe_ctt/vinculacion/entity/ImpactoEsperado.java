/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe_ctt.vinculacion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * @author Jhonny
 */
@Entity
@Table(name = "SZDTAVIMPACTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImpactoEsperado.findAll", query = "SELECT i FROM ImpactoEsperado i")})
public class ImpactoEsperado implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SZTVAIMPACTO_CODE")
    private Integer id;
    @Size(max = 3000)
    @Column(name = "SZTVAIMPACTO_DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "SZTVPROYEC_CODE", referencedColumnName = "SZTVPROYEC_CODE")
    @ManyToOne(fetch = FetchType.LAZY)
    private Proyecto proyecto;
    @JoinColumn(name = "SZTVAIMPACTOTIPO_CODE", referencedColumnName = "SZTVAIMPACTOTIPO_CODE")
    @ManyToOne(fetch = FetchType.LAZY)
    private ImpactoEsperadoTipo impactoEsperadoTipo;

    public ImpactoEsperado() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public ImpactoEsperadoTipo getImpactoEsperadoTipo() {
        return impactoEsperadoTipo;
    }

    public void setImpactoEsperadoTipo(ImpactoEsperadoTipo impactoEsperadoTipo) {
        this.impactoEsperadoTipo = impactoEsperadoTipo;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImpactoEsperado)) {
            return false;
        }
        ImpactoEsperado other = (ImpactoEsperado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe_ctt.vinculacion.entity.ImpactoEsperado[ sztvaimpactoCode=" + id + " ]";
    }
    
}
