/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe_innovativa.controller;

import ec.edu.espe_ctt.vinculacion.entity.Proyecto;
import ec.edu.espe_ctt.vinculacion.session.ProyectoFacade;
import ec.edu.espe_ctt_investigacion.entity.SeaParametros;
import ec.edu.espe_ctt_investigacion.entity.SeaParametrosDet;
import ec.edu.espe_ctt_investigacion.session.SeaParametrosDetFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;



/**
 *
 * @author Jhonny
 */
@ManagedBean
@ViewScoped
public class EstadoProyectoController implements Serializable {

    
    @EJB
    private ProyectoFacade proyectoFacade;
    @EJB
    private SeaParametrosDetFacade parametrosDetFacade;
    
    
  
    private List<Proyecto> proyectoList;
    private Proyecto proyectoSelec;
    
    /** Creates a new instance of ControlarProyectoController */
    public EstadoProyectoController() {
      
    }

    public Proyecto getProyectoSelec() {
        return proyectoSelec;
    }

    public void setProyectoSelec(Proyecto proyectoSelec) {
        this.proyectoSelec = proyectoSelec;
    }

   
    
    

    public List<Proyecto> getProyectoList() {
        return proyectoList;
    }

    public void setProyectoList(List<Proyecto> proyectoList) {
        this.proyectoList = proyectoList;
    }
    
    
    
    
    @PostConstruct
    public void init(){
        proyectoList = proyectoFacade.findAll();
      
    }
    
    
    public void onCellEdit(CellEditEvent event){
       
        FacesContext context = FacesContext.getCurrentInstance();
            Proyecto proy = context.getApplication().evaluateExpressionGet(
                    context, "#{d}", Proyecto.class);

        proyectoFacade.edit(proy);
        
        
    }
    
    public List<SeaParametrosDet> getEstadoList() {
        return parametrosDetFacade.findByCodigoParametroActivos(SeaParametros.PARAM_ESTADO_PROYECTO_VINCULACION);
     
    }
    
}
