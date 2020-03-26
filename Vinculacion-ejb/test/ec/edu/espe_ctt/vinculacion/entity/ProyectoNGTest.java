/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe_ctt.vinculacion.entity;

import ec.edu.espe_ctt.saturno.entity.Stvcamp;
import ec.edu.espe_ctt.saturno.entity.Stvmajr;
import ec.edu.espe_ctt.saturno.entity.Stvsubj;
import ec.edu.espe_ctt.seguridades.entity.SegUsuario;
import ec.edu.espe_ctt_investigacion.entity.SeaLineainves;
import ec.edu.espe_ctt_investigacion.entity.SeaParametrosDet;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author rmllumiquinga
 */
public class ProyectoNGTest {
    
    public ProyectoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getPrograma method, of class Proyecto.
     */
    @Test
    public void testGetPrograma() {
        System.out.println("getPrograma");
        Proyecto instance = new Proyecto();
        Programa expResult = null;
        Programa result = instance.getPrograma();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrograma method, of class Proyecto.
     */
    @Test
    public void testSetPrograma() {
        System.out.println("setPrograma");
        Programa programa = null;
        Proyecto instance = new Proyecto();
        instance.setPrograma(programa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Proyecto.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Proyecto.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Proyecto instance = new Proyecto();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Proyecto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Proyecto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Proyecto instance = new Proyecto();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInicio method, of class Proyecto.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaInicio();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInicio method, of class Proyecto.
     */
    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = null;
        Proyecto instance = new Proyecto();
        instance.setFechaInicio(fechaInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFinalizacion method, of class Proyecto.
     */
    @Test
    public void testGetFechaFinalizacion() {
        System.out.println("getFechaFinalizacion");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaFinalizacion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFinalizacion method, of class Proyecto.
     */
    @Test
    public void testSetFechaFinalizacion() {
        System.out.println("setFechaFinalizacion");
        Date fechaFinalizacion = null;
        Proyecto instance = new Proyecto();
        instance.setFechaFinalizacion(fechaFinalizacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuracion method, of class Proyecto.
     */
    @Test
    public void testGetDuracion() {
        System.out.println("getDuracion");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getDuracion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuracionNum method, of class Proyecto.
     */
    @Test
    public void testGetDuracionNum() {
        System.out.println("getDuracionNum");
        Proyecto instance = new Proyecto();
        int[] expResult = null;
        int[] result = instance.getDuracionNum();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getViabilidadTecnica method, of class Proyecto.
     */
    @Test
    public void testGetViabilidadTecnica() {
        System.out.println("getViabilidadTecnica");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getViabilidadTecnica();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setViabilidadTecnica method, of class Proyecto.
     */
    @Test
    public void testSetViabilidadTecnica() {
        System.out.println("setViabilidadTecnica");
        String viabilidadTecnica = "";
        Proyecto instance = new Proyecto();
        instance.setViabilidadTecnica(viabilidadTecnica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerderiaPais method, of class Proyecto.
     */
    @Test
    public void testGetPerderiaPais() {
        System.out.println("getPerderiaPais");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPerderiaPais();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerderiaPais method, of class Proyecto.
     */
    @Test
    public void testSetPerderiaPais() {
        System.out.println("setPerderiaPais");
        String perderiaPais = "";
        Proyecto instance = new Proyecto();
        instance.setPerderiaPais(perderiaPais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultadosEsperados method, of class Proyecto.
     */
    @Test
    public void testGetResultadosEsperados() {
        System.out.println("getResultadosEsperados");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getResultadosEsperados();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResultadosEsperados method, of class Proyecto.
     */
    @Test
    public void testSetResultadosEsperados() {
        System.out.println("setResultadosEsperados");
        String resultadosEsperados = "";
        Proyecto instance = new Proyecto();
        instance.setResultadosEsperados(resultadosEsperados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImpactoAmbiental method, of class Proyecto.
     */
    @Test
    public void testGetImpactoAmbiental() {
        System.out.println("getImpactoAmbiental");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getImpactoAmbiental();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImpactoAmbiental method, of class Proyecto.
     */
    @Test
    public void testSetImpactoAmbiental() {
        System.out.println("setImpactoAmbiental");
        String impactoAmbiental = "";
        Proyecto instance = new Proyecto();
        instance.setImpactoAmbiental(impactoAmbiental);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSostenibilidadSocial method, of class Proyecto.
     */
    @Test
    public void testGetSostenibilidadSocial() {
        System.out.println("getSostenibilidadSocial");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getSostenibilidadSocial();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSostenibilidadSocial method, of class Proyecto.
     */
    @Test
    public void testSetSostenibilidadSocial() {
        System.out.println("setSostenibilidadSocial");
        String sostenibilidadSocial = "";
        Proyecto instance = new Proyecto();
        instance.setSostenibilidadSocial(sostenibilidadSocial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineaBase method, of class Proyecto.
     */
    @Test
    public void testGetLineaBase() {
        System.out.println("getLineaBase");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getLineaBase();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaBase method, of class Proyecto.
     */
    @Test
    public void testSetLineaBase() {
        System.out.println("setLineaBase");
        String lineaBase = "";
        Proyecto instance = new Proyecto();
        instance.setLineaBase(lineaBase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFactoresCriticos method, of class Proyecto.
     */
    @Test
    public void testGetFactoresCriticos() {
        System.out.println("getFactoresCriticos");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getFactoresCriticos();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFactoresCriticos method, of class Proyecto.
     */
    @Test
    public void testSetFactoresCriticos() {
        System.out.println("setFactoresCriticos");
        String factoresCriticos = "";
        Proyecto instance = new Proyecto();
        instance.setFactoresCriticos(factoresCriticos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRestricciones method, of class Proyecto.
     */
    @Test
    public void testGetRestricciones() {
        System.out.println("getRestricciones");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getRestricciones();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRestricciones method, of class Proyecto.
     */
    @Test
    public void testSetRestricciones() {
        System.out.println("setRestricciones");
        String restricciones = "";
        Proyecto instance = new Proyecto();
        instance.setRestricciones(restricciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBienes method, of class Proyecto.
     */
    @Test
    public void testGetBienes() {
        System.out.println("getBienes");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getBienes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBienes method, of class Proyecto.
     */
    @Test
    public void testSetBienes() {
        System.out.println("setBienes");
        String bienes = "";
        Proyecto instance = new Proyecto();
        instance.setBienes(bienes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServicios method, of class Proyecto.
     */
    @Test
    public void testGetServicios() {
        System.out.println("getServicios");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getServicios();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServicios method, of class Proyecto.
     */
    @Test
    public void testSetServicios() {
        System.out.println("setServicios");
        String servicios = "";
        Proyecto instance = new Proyecto();
        instance.setServicios(servicios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBienesServicios method, of class Proyecto.
     */
    @Test
    public void testGetBienesServicios() {
        System.out.println("getBienesServicios");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getBienesServicios();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBienesServicios method, of class Proyecto.
     */
    @Test
    public void testSetBienesServicios() {
        System.out.println("setBienesServicios");
        String bienesServicios = "";
        Proyecto instance = new Proyecto();
        instance.setBienesServicios(bienesServicios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResponsableList method, of class Proyecto.
     */
    @Test
    public void testGetResponsableList() {
        System.out.println("getResponsableList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getResponsableList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResponsableList method, of class Proyecto.
     */
    @Test
    public void testSetResponsableList() {
        System.out.println("setResponsableList");
        List<ResponsableProyecto> responsableList = null;
        Proyecto instance = new Proyecto();
        instance.setResponsableList(responsableList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroBeneficiariosDirectosHombres method, of class Proyecto.
     */
    @Test
    public void testGetNroBeneficiariosDirectosHombres() {
        System.out.println("getNroBeneficiariosDirectosHombres");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getNroBeneficiariosDirectosHombres();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNroBeneficiariosDirectosHombres method, of class Proyecto.
     */
    @Test
    public void testSetNroBeneficiariosDirectosHombres() {
        System.out.println("setNroBeneficiariosDirectosHombres");
        Integer nroBeneficiariosDirectosHombres = null;
        Proyecto instance = new Proyecto();
        instance.setNroBeneficiariosDirectosHombres(nroBeneficiariosDirectosHombres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroBeneficiariosDirectosMujeres method, of class Proyecto.
     */
    @Test
    public void testGetNroBeneficiariosDirectosMujeres() {
        System.out.println("getNroBeneficiariosDirectosMujeres");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getNroBeneficiariosDirectosMujeres();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNroBeneficiariosDirectosMujeres method, of class Proyecto.
     */
    @Test
    public void testSetNroBeneficiariosDirectosMujeres() {
        System.out.println("setNroBeneficiariosDirectosMujeres");
        Integer nroBeneficiariosDirectosMujeres = null;
        Proyecto instance = new Proyecto();
        instance.setNroBeneficiariosDirectosMujeres(nroBeneficiariosDirectosMujeres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroBeneficiariosDirectosDiscapac method, of class Proyecto.
     */
    @Test
    public void testGetNroBeneficiariosDirectosDiscapac() {
        System.out.println("getNroBeneficiariosDirectosDiscapac");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getNroBeneficiariosDirectosDiscapac();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNroBeneficiariosDirectosDiscapac method, of class Proyecto.
     */
    @Test
    public void testSetNroBeneficiariosDirectosDiscapac() {
        System.out.println("setNroBeneficiariosDirectosDiscapac");
        Integer nroBeneficiariosDirectosDiscapac = null;
        Proyecto instance = new Proyecto();
        instance.setNroBeneficiariosDirectosDiscapac(nroBeneficiariosDirectosDiscapac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivoEstrategicoList method, of class Proyecto.
     */
    @Test
    public void testGetObjetivoEstrategicoList() {
        System.out.println("getObjetivoEstrategicoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getObjetivoEstrategicoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlanMilenioList method, of class Proyecto.
     */
    @Test
    public void testGetPlanMilenioList() {
        System.out.println("getPlanMilenioList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getPlanMilenioList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlanUnescoList method, of class Proyecto.
     */
    @Test
    public void testGetPlanUnescoList() {
        System.out.println("getPlanUnescoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getPlanUnescoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPlanEspeList method, of class Proyecto.
     */
    @Test
    public void testGetPlanEspeList() {
        System.out.println("getPlanEspeList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getPlanEspeList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerspectivaListNivelDos method, of class Proyecto.
     */
    @Test
    public void testGetPerspectivaListNivelDos() {
        System.out.println("getPerspectivaListNivelDos");
        Integer tipoObjetivo = null;
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getPerspectivaListNivelDos(tipoObjetivo);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerspectivaList method, of class Proyecto.
     */
    @Test
    public void testGetPerspectivaList() {
        System.out.println("getPerspectivaList");
        Integer tipoObjetivo = null;
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getPerspectivaList(tipoObjetivo);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetivoEstrategicoList method, of class Proyecto.
     */
    @Test
    public void testSetObjetivoEstrategicoList() {
        System.out.println("setObjetivoEstrategicoList");
        List<IndicadorEstrategiaProyecto> objetivoEstrategicoList = null;
        Proyecto instance = new Proyecto();
        instance.setObjetivoEstrategicoList(objetivoEstrategicoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDirectos method, of class Proyecto.
     */
    @Test
    public void testGetTotalDirectos() {
        System.out.println("getTotalDirectos");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalDirectos();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBeneficiariosPlanificado method, of class Proyecto.
     */
    @Test
    public void testGetTotalBeneficiariosPlanificado() {
        System.out.println("getTotalBeneficiariosPlanificado");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalBeneficiariosPlanificado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDirectosEjecutados method, of class Proyecto.
     */
    @Test
    public void testGetTotalDirectosEjecutados() {
        System.out.println("getTotalDirectosEjecutados");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalDirectosEjecutados();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDirectosStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalDirectosStr() {
        System.out.println("getTotalDirectosStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalDirectosStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcentajeDirectosEjecutadosStr method, of class Proyecto.
     */
    @Test
    public void testGetPorcentajeDirectosEjecutadosStr() {
        System.out.println("getPorcentajeDirectosEjecutadosStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPorcentajeDirectosEjecutadosStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcentajePresupuestoEjecutadoUniversidadGastoPermanenteStr method, of class Proyecto.
     */
    @Test
    public void testGetPorcentajePresupuestoEjecutadoUniversidadGastoPermanenteStr() {
        System.out.println("getPorcentajePresupuestoEjecutadoUniversidadGastoPermanenteStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPorcentajePresupuestoEjecutadoUniversidadGastoPermanenteStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcentajePresupuestoEjecutadoUniversidadGastoNoPermanenteStr method, of class Proyecto.
     */
    @Test
    public void testGetPorcentajePresupuestoEjecutadoUniversidadGastoNoPermanenteStr() {
        System.out.println("getPorcentajePresupuestoEjecutadoUniversidadGastoNoPermanenteStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPorcentajePresupuestoEjecutadoUniversidadGastoNoPermanenteStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcentajePresupuestoEjecutadoEntidadAuspicianteStr method, of class Proyecto.
     */
    @Test
    public void testGetPorcentajePresupuestoEjecutadoEntidadAuspicianteStr() {
        System.out.println("getPorcentajePresupuestoEjecutadoEntidadAuspicianteStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPorcentajePresupuestoEjecutadoEntidadAuspicianteStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPorcentajePresupuestoEjecutadoComunidadBeneficiariaStr method, of class Proyecto.
     */
    @Test
    public void testGetPorcentajePresupuestoEjecutadoComunidadBeneficiariaStr() {
        System.out.println("getPorcentajePresupuestoEjecutadoComunidadBeneficiariaStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPorcentajePresupuestoEjecutadoComunidadBeneficiariaStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDirectosEjecutadosStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalDirectosEjecutadosStr() {
        System.out.println("getTotalDirectosEjecutadosStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalDirectosEjecutadosStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivoBVivirProyectoList method, of class Proyecto.
     */
    @Test
    public void testGetObjetivoBVivirProyectoList() {
        System.out.println("getObjetivoBVivirProyectoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getObjetivoBVivirProyectoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetivoBVivirProyectoList method, of class Proyecto.
     */
    @Test
    public void testSetObjetivoBVivirProyectoList() {
        System.out.println("setObjetivoBVivirProyectoList");
        List<ObjetivoBVivirPrograma> objetivoBVivirProyectoList = null;
        Proyecto instance = new Proyecto();
        instance.setObjetivoBVivirProyectoList(objetivoBVivirProyectoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addObjetivoBVivir method, of class Proyecto.
     */
    @Test
    public void testAddObjetivoBVivir() {
        System.out.println("addObjetivoBVivir");
        ObjetivoBVivirPrograma objetivoBVivirProyecto = null;
        Proyecto instance = new Proyecto();
        instance.addObjetivoBVivir(objetivoBVivirProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeObjetivoBVivir method, of class Proyecto.
     */
    @Test
    public void testRemoveObjetivoBVivir() {
        System.out.println("removeObjetivoBVivir");
        ObjetivoBVivirPrograma objetivoBVivirProyecto = null;
        Proyecto instance = new Proyecto();
        instance.removeObjetivoBVivir(objetivoBVivirProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setearObjetivoBVivirProyectoPadreList method, of class Proyecto.
     */
    @Test
    public void testSetearObjetivoBVivirProyectoPadreList() {
        System.out.println("setearObjetivoBVivirProyectoPadreList");
        Proyecto instance = new Proyecto();
        instance.setearObjetivoBVivirProyectoPadreList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addObjetivoEstrategico method, of class Proyecto.
     */
    @Test
    public void testAddObjetivoEstrategico() {
        System.out.println("addObjetivoEstrategico");
        IndicadorEstrategiaProyecto objetivoEstrategico = null;
        Proyecto instance = new Proyecto();
        instance.addObjetivoEstrategico(objetivoEstrategico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeObjetivoEstrategico method, of class Proyecto.
     */
    @Test
    public void testRemoveObjetivoEstrategico() {
        System.out.println("removeObjetivoEstrategico");
        IndicadorEstrategiaProyecto objetivoEstrategico = null;
        Proyecto instance = new Proyecto();
        instance.removeObjetivoEstrategico(objetivoEstrategico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivosProvCanParr method, of class Proyecto.
     */
    @Test
    public void testGetObjetivosProvCanParr() {
        System.out.println("getObjetivosProvCanParr");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getObjetivosProvCanParr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetivosProvCanParr method, of class Proyecto.
     */
    @Test
    public void testSetObjetivosProvCanParr() {
        System.out.println("setObjetivosProvCanParr");
        List<LocalizacionPrograma> objetivosProvCanParr = null;
        Proyecto instance = new Proyecto();
        instance.setObjetivosProvCanParr(objetivosProvCanParr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivosProvCanParrOrdenado method, of class Proyecto.
     */
    @Test
    public void testGetObjetivosProvCanParrOrdenado() {
        System.out.println("getObjetivosProvCanParrOrdenado");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getObjetivosProvCanParrOrdenado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivoProyectoList method, of class Proyecto.
     */
    @Test
    public void testGetObjetivoProyectoList() {
        System.out.println("getObjetivoProyectoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getObjetivoProyectoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetivoProyectoList method, of class Proyecto.
     */
    @Test
    public void testSetObjetivoProyectoList() {
        System.out.println("setObjetivoProyectoList");
        List<ObjetivoPrograma> objetivoProyectoList = null;
        Proyecto instance = new Proyecto();
        instance.setObjetivoProyectoList(objetivoProyectoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivoProyectoPadreList method, of class Proyecto.
     */
    @Test
    public void testGetObjetivoProyectoPadreList() {
        System.out.println("getObjetivoProyectoPadreList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getObjetivoProyectoPadreList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComponentes method, of class Proyecto.
     */
    @Test
    public void testGetComponentes() {
        System.out.println("getComponentes");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getComponentes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActividades method, of class Proyecto.
     */
    @Test
    public void testGetActividades() {
        System.out.println("getActividades");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getActividades();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addObjetivoProyecto method, of class Proyecto.
     */
    @Test
    public void testAddObjetivoProyecto() {
        System.out.println("addObjetivoProyecto");
        ObjetivoPrograma obj = null;
        Proyecto instance = new Proyecto();
        instance.addObjetivoProyecto(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivoBVivirProyectoPadreList method, of class Proyecto.
     */
    @Test
    public void testGetObjetivoBVivirProyectoPadreList() {
        System.out.println("getObjetivoBVivirProyectoPadreList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getObjetivoBVivirProyectoPadreList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObjetivoBVivirProyectoPadreList method, of class Proyecto.
     */
    @Test
    public void testSetObjetivoBVivirProyectoPadreList() {
        System.out.println("setObjetivoBVivirProyectoPadreList");
        List<ObjetivoBVivirPrograma> objetivoBVivirProyectoPadreList = null;
        Proyecto instance = new Proyecto();
        instance.setObjetivoBVivirProyectoPadreList(objetivoBVivirProyectoPadreList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoExpandidoObjetivoBVivir method, of class Proyecto.
     */
    @Test
    public void testSetEstadoExpandidoObjetivoBVivir() {
        System.out.println("setEstadoExpandidoObjetivoBVivir");
        Map<BigDecimal, Boolean> estadoExpandidoObjetivoBVivir = null;
        Proyecto instance = new Proyecto();
        instance.setEstadoExpandidoObjetivoBVivir(estadoExpandidoObjetivoBVivir);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoExpandidoObjetivoBVivir method, of class Proyecto.
     */
    @Test
    public void testGetEstadoExpandidoObjetivoBVivir() {
        System.out.println("getEstadoExpandidoObjetivoBVivir");
        Proyecto instance = new Proyecto();
        Map expResult = null;
        Map result = instance.getEstadoExpandidoObjetivoBVivir();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetEstadoExpandidoObjetivo method, of class Proyecto.
     */
    @Test
    public void testResetEstadoExpandidoObjetivo() {
        System.out.println("resetEstadoExpandidoObjetivo");
        Proyecto instance = new Proyecto();
        instance.resetEstadoExpandidoObjetivo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoExpandidoObjetivo method, of class Proyecto.
     */
    @Test
    public void testGetEstadoExpandidoObjetivo() {
        System.out.println("getEstadoExpandidoObjetivo");
        Proyecto instance = new Proyecto();
        Map expResult = null;
        Map result = instance.getEstadoExpandidoObjetivo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoExpandidoObjetivo method, of class Proyecto.
     */
    @Test
    public void testSetEstadoExpandidoObjetivo() {
        System.out.println("setEstadoExpandidoObjetivo");
        Map<BigDecimal, Boolean> estadoExpandidoObjetivo = null;
        Proyecto instance = new Proyecto();
        instance.setEstadoExpandidoObjetivo(estadoExpandidoObjetivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHitoProyectoList method, of class Proyecto.
     */
    @Test
    public void testGetHitoProyectoList() {
        System.out.println("getHitoProyectoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getHitoProyectoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHitoProyectoList method, of class Proyecto.
     */
    @Test
    public void testSetHitoProyectoList() {
        System.out.println("setHitoProyectoList");
        List<HitoProyecto> hitoProyectoList = null;
        Proyecto instance = new Proyecto();
        instance.setHitoProyectoList(hitoProyectoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHitoProyecto method, of class Proyecto.
     */
    @Test
    public void testAddHitoProyecto() {
        System.out.println("addHitoProyecto");
        HitoProyecto hito = null;
        Proyecto instance = new Proyecto();
        instance.addHitoProyecto(hito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeHitoProyecto method, of class Proyecto.
     */
    @Test
    public void testRemoveHitoProyecto() {
        System.out.println("removeHitoProyecto");
        HitoProyecto hitoProyecto = null;
        Proyecto instance = new Proyecto();
        instance.removeHitoProyecto(hitoProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPresupuestoProyectoList method, of class Proyecto.
     */
    @Test
    public void testGetPresupuestoProyectoList() {
        System.out.println("getPresupuestoProyectoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getPresupuestoProyectoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPresupuestoProyectoList method, of class Proyecto.
     */
    @Test
    public void testSetPresupuestoProyectoList() {
        System.out.println("setPresupuestoProyectoList");
        List<PresupuestoProyecto> presupuestoProyectoList = null;
        Proyecto instance = new Proyecto();
        instance.setPresupuestoProyectoList(presupuestoProyectoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPresupuesto method, of class Proyecto.
     */
    @Test
    public void testAddPresupuesto() {
        System.out.println("addPresupuesto");
        PresupuestoProyecto presupuestoProyecto = null;
        Proyecto instance = new Proyecto();
        instance.addPresupuesto(presupuestoProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePresupuesto method, of class Proyecto.
     */
    @Test
    public void testRemovePresupuesto() {
        System.out.println("removePresupuesto");
        PresupuestoProyecto presupuestoProyecto = null;
        Proyecto instance = new Proyecto();
        instance.removePresupuesto(presupuestoProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoStr() {
        System.out.println("getTotalPresupuestoStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuesto method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuesto() {
        System.out.println("getTotalPresupuesto");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuesto();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoStr() {
        System.out.println("getTotalPresupuestoEjecutadoStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoEjecutadoStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutado method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutado() {
        System.out.println("getTotalPresupuestoEjecutado");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoEjecutado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoPoblacionList method, of class Proyecto.
     */
    @Test
    public void testGetTipoPoblacionList() {
        System.out.println("getTipoPoblacionList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getTipoPoblacionList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoPoblacionList method, of class Proyecto.
     */
    @Test
    public void testSetTipoPoblacionList() {
        System.out.println("setTipoPoblacionList");
        List<TipoPoblacionProyecto> tipoPoblacionList = null;
        Proyecto instance = new Proyecto();
        instance.setTipoPoblacionList(tipoPoblacionList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTipoPoblacion method, of class Proyecto.
     */
    @Test
    public void testAddTipoPoblacion() {
        System.out.println("addTipoPoblacion");
        TipoPoblacionProyecto tipoPoblacionProyecto = null;
        Proyecto instance = new Proyecto();
        instance.addTipoPoblacion(tipoPoblacionProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParroquiasCobertura method, of class Proyecto.
     */
    @Test
    public void testGetParroquiasCobertura() {
        System.out.println("getParroquiasCobertura");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getParroquiasCobertura();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Proyecto.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Proyecto.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Proyecto instance = new Proyecto();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartamento method, of class Proyecto.
     */
    @Test
    public void testGetDepartamento() {
        System.out.println("getDepartamento");
        Proyecto instance = new Proyecto();
        Stvsubj expResult = null;
        Stvsubj result = instance.getDepartamento();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartamento method, of class Proyecto.
     */
    @Test
    public void testSetDepartamento() {
        System.out.println("setDepartamento");
        Stvsubj departamento = null;
        Proyecto instance = new Proyecto();
        instance.setDepartamento(departamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Proyecto.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Proyecto.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Proyecto instance = new Proyecto();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generarCodigo method, of class Proyecto.
     */
    @Test
    public void testGenerarCodigo() {
        System.out.println("generarCodigo");
        Integer secuencial = null;
        Proyecto instance = new Proyecto();
        instance.generarCodigo(secuencial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConvocatoria method, of class Proyecto.
     */
    @Test
    public void testGetConvocatoria() {
        System.out.println("getConvocatoria");
        Proyecto instance = new Proyecto();
        Convocatoria expResult = null;
        Convocatoria result = instance.getConvocatoria();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConvocatoria method, of class Proyecto.
     */
    @Test
    public void testSetConvocatoria() {
        System.out.println("setConvocatoria");
        Convocatoria convocatoria = null;
        Proyecto instance = new Proyecto();
        instance.setConvocatoria(convocatoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreDocAprobacionConcejoDep method, of class Proyecto.
     */
    @Test
    public void testGetNombreDocAprobacionConcejoDep() {
        System.out.println("getNombreDocAprobacionConcejoDep");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getNombreDocAprobacionConcejoDep();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreDocAprobacionConcejoDep method, of class Proyecto.
     */
    @Test
    public void testSetNombreDocAprobacionConcejoDep() {
        System.out.println("setNombreDocAprobacionConcejoDep");
        String nombreDocAprobacionConcejoDep = "";
        Proyecto instance = new Proyecto();
        instance.setNombreDocAprobacionConcejoDep(nombreDocAprobacionConcejoDep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrlDocAprobacionConcejoDep method, of class Proyecto.
     */
    @Test
    public void testGetUrlDocAprobacionConcejoDep() {
        System.out.println("getUrlDocAprobacionConcejoDep");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getUrlDocAprobacionConcejoDep();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUrlDocAprobacionConcejoDep method, of class Proyecto.
     */
    @Test
    public void testSetUrlDocAprobacionConcejoDep() {
        System.out.println("setUrlDocAprobacionConcejoDep");
        String urlDocAprobacionConcejoDep = "";
        Proyecto instance = new Proyecto();
        instance.setUrlDocAprobacionConcejoDep(urlDocAprobacionConcejoDep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrlFinalDocAprobacionConcejoDep method, of class Proyecto.
     */
    @Test
    public void testGetUrlFinalDocAprobacionConcejoDep() {
        System.out.println("getUrlFinalDocAprobacionConcejoDep");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getUrlFinalDocAprobacionConcejoDep();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirector method, of class Proyecto.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Proyecto instance = new Proyecto();
        ResponsableProyecto expResult = null;
        ResponsableProyecto result = instance.getDirector();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluadorFinal method, of class Proyecto.
     */
    @Test
    public void testGetEvaluadorFinal() {
        System.out.println("getEvaluadorFinal");
        Proyecto instance = new Proyecto();
        ResponsableProyecto expResult = null;
        ResponsableProyecto result = instance.getEvaluadorFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParticipanteDocenteList method, of class Proyecto.
     */
    @Test
    public void testGetParticipanteDocenteList() {
        System.out.println("getParticipanteDocenteList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getParticipanteDocenteList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParticipanteDocenteTodosList method, of class Proyecto.
     */
    @Test
    public void testGetParticipanteDocenteTodosList() {
        System.out.println("getParticipanteDocenteTodosList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getParticipanteDocenteTodosList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComisionList method, of class Proyecto.
     */
    @Test
    public void testGetComisionList() {
        System.out.println("getComisionList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getComisionList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParticipanteEstudianteList method, of class Proyecto.
     */
    @Test
    public void testGetParticipanteEstudianteList() {
        System.out.println("getParticipanteEstudianteList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getParticipanteEstudianteList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addResponsable method, of class Proyecto.
     */
    @Test
    public void testAddResponsable() {
        System.out.println("addResponsable");
        ResponsableProyecto responsable = null;
        Proyecto instance = new Proyecto();
        instance.addResponsable(responsable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalificacionList method, of class Proyecto.
     */
    @Test
    public void testGetCalificacionList() {
        System.out.println("getCalificacionList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getCalificacionList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalificacionUltimaList method, of class Proyecto.
     */
    @Test
    public void testGetCalificacionUltimaList() {
        System.out.println("getCalificacionUltimaList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getCalificacionUltimaList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalificacionList method, of class Proyecto.
     */
    @Test
    public void testSetCalificacionList() {
        System.out.println("setCalificacionList");
        List<CalificacionProyecto> calificacionList = null;
        Proyecto instance = new Proyecto();
        instance.setCalificacionList(calificacionList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCalificacion method, of class Proyecto.
     */
    @Test
    public void testAddCalificacion() {
        System.out.println("addCalificacion");
        CalificacionProyecto calificacionProyecto = null;
        Proyecto instance = new Proyecto();
        instance.addCalificacion(calificacionProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCalificacion method, of class Proyecto.
     */
    @Test
    public void testRemoveCalificacion() {
        System.out.println("removeCalificacion");
        CalificacionProyecto calificacionProyecto = null;
        Proyecto instance = new Proyecto();
        instance.removeCalificacion(calificacionProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalificacionActualXUsuario method, of class Proyecto.
     */
    @Test
    public void testGetCalificacionActualXUsuario() {
        System.out.println("getCalificacionActualXUsuario");
        Proyecto instance = new Proyecto();
        CalificacionProyecto expResult = null;
        CalificacionProyecto result = instance.getCalificacionActualXUsuario();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuarioActual method, of class Proyecto.
     */
    @Test
    public void testGetUsuarioActual() {
        System.out.println("getUsuarioActual");
        Proyecto instance = new Proyecto();
        SegUsuario expResult = null;
        SegUsuario result = instance.getUsuarioActual();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuarioActual method, of class Proyecto.
     */
    @Test
    public void testSetUsuarioActual() {
        System.out.println("setUsuarioActual");
        SegUsuario usuarioActual = null;
        Proyecto instance = new Proyecto();
        instance.setUsuarioActual(usuarioActual);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCalificacionPorUsuarioList method, of class Proyecto.
     */
    @Test
    public void testGetCalificacionPorUsuarioList() {
        System.out.println("getCalificacionPorUsuarioList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getCalificacionPorUsuarioList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComisionCalificacion method, of class Proyecto.
     */
    @Test
    public void testGetComisionCalificacion() {
        System.out.println("getComisionCalificacion");
        Proyecto instance = new Proyecto();
        ComisionCalificacion expResult = null;
        ComisionCalificacion result = instance.getComisionCalificacion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComisionCalificacion method, of class Proyecto.
     */
    @Test
    public void testSetComisionCalificacion() {
        System.out.println("setComisionCalificacion");
        ComisionCalificacion comisionCalificacion = null;
        Proyecto instance = new Proyecto();
        instance.setComisionCalificacion(comisionCalificacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsolidacionCalificacioList method, of class Proyecto.
     */
    @Test
    public void testGetConsolidacionCalificacioList() {
        System.out.println("getConsolidacionCalificacioList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getConsolidacionCalificacioList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConsolidacionCalificacioList method, of class Proyecto.
     */
    @Test
    public void testSetConsolidacionCalificacioList() {
        System.out.println("setConsolidacionCalificacioList");
        List<ConsolidacionCalificacionProyecto> consolidacionCalificacioList = null;
        Proyecto instance = new Proyecto();
        instance.setConsolidacionCalificacioList(consolidacionCalificacioList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConsolidacionCalificacionUltimaList method, of class Proyecto.
     */
    @Test
    public void testGetConsolidacionCalificacionUltimaList() {
        System.out.println("getConsolidacionCalificacionUltimaList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getConsolidacionCalificacionUltimaList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConfiguracionParametrosEvaluacion method, of class Proyecto.
     */
    @Test
    public void testGetConfiguracionParametrosEvaluacion() {
        System.out.println("getConfiguracionParametrosEvaluacion");
        Proyecto instance = new Proyecto();
        ConfiguracionParametrosEvaluacion expResult = null;
        ConfiguracionParametrosEvaluacion result = instance.getConfiguracionParametrosEvaluacion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConfiguracionParametrosEvaluacion method, of class Proyecto.
     */
    @Test
    public void testSetConfiguracionParametrosEvaluacion() {
        System.out.println("setConfiguracionParametrosEvaluacion");
        ConfiguracionParametrosEvaluacion configuracionParametrosEvaluacion = null;
        Proyecto instance = new Proyecto();
        instance.setConfiguracionParametrosEvaluacion(configuracionParametrosEvaluacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartamentoProyectoList method, of class Proyecto.
     */
    @Test
    public void testGetDepartamentoProyectoList() {
        System.out.println("getDepartamentoProyectoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getDepartamentoProyectoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartamentoProyectoDistinctDepList method, of class Proyecto.
     */
    @Test
    public void testGetDepartamentoProyectoDistinctDepList() {
        System.out.println("getDepartamentoProyectoDistinctDepList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getDepartamentoProyectoDistinctDepList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartamentoProyectoDistinctCampusList method, of class Proyecto.
     */
    @Test
    public void testGetDepartamentoProyectoDistinctCampusList() {
        System.out.println("getDepartamentoProyectoDistinctCampusList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getDepartamentoProyectoDistinctCampusList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalizacionDistinctProvinciaList method, of class Proyecto.
     */
    @Test
    public void testGetLocalizacionDistinctProvinciaList() {
        System.out.println("getLocalizacionDistinctProvinciaList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getLocalizacionDistinctProvinciaList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalizacionDistinctCantonList method, of class Proyecto.
     */
    @Test
    public void testGetLocalizacionDistinctCantonList() {
        System.out.println("getLocalizacionDistinctCantonList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getLocalizacionDistinctCantonList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalizacionDistinctParroquiaList method, of class Proyecto.
     */
    @Test
    public void testGetLocalizacionDistinctParroquiaList() {
        System.out.println("getLocalizacionDistinctParroquiaList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getLocalizacionDistinctParroquiaList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartamentoProyectoList method, of class Proyecto.
     */
    @Test
    public void testSetDepartamentoProyectoList() {
        System.out.println("setDepartamentoProyectoList");
        List<DepartamentoProyecto> departamentoProyectoList = null;
        Proyecto instance = new Proyecto();
        instance.setDepartamentoProyectoList(departamentoProyectoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDocentesParticipantesStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalDocentesParticipantesStr() {
        System.out.println("getTotalDocentesParticipantesStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalDocentesParticipantesStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDocentesParticipantes method, of class Proyecto.
     */
    @Test
    public void testGetTotalDocentesParticipantes() {
        System.out.println("getTotalDocentesParticipantes");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalDocentesParticipantes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testGetFechaAprobacionConsejoAcademico() {
        System.out.println("getFechaAprobacionConsejoAcademico");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaAprobacionConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testSetFechaAprobacionConsejoAcademico() {
        System.out.println("setFechaAprobacionConsejoAcademico");
        Date fechaAprobacionConsejoAcademico = null;
        Proyecto instance = new Proyecto();
        instance.setFechaAprobacionConsejoAcademico(fechaAprobacionConsejoAcademico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPdfActaAprobacionConsejoAcademicoNombre method, of class Proyecto.
     */
    @Test
    public void testGetPdfActaAprobacionConsejoAcademicoNombre() {
        System.out.println("getPdfActaAprobacionConsejoAcademicoNombre");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPdfActaAprobacionConsejoAcademicoNombre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPdfActaAprobacionConsejoAcademicoNombre method, of class Proyecto.
     */
    @Test
    public void testSetPdfActaAprobacionConsejoAcademicoNombre() {
        System.out.println("setPdfActaAprobacionConsejoAcademicoNombre");
        String pdfActaAprobacionConsejoAcademicoNombre = "";
        Proyecto instance = new Proyecto();
        instance.setPdfActaAprobacionConsejoAcademicoNombre(pdfActaAprobacionConsejoAcademicoNombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPdfActaAprobacionConsejoAcademicoUrl method, of class Proyecto.
     */
    @Test
    public void testGetPdfActaAprobacionConsejoAcademicoUrl() {
        System.out.println("getPdfActaAprobacionConsejoAcademicoUrl");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPdfActaAprobacionConsejoAcademicoUrl();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPdfActaAprobacionConsejoAcademicoUrl method, of class Proyecto.
     */
    @Test
    public void testSetPdfActaAprobacionConsejoAcademicoUrl() {
        System.out.println("setPdfActaAprobacionConsejoAcademicoUrl");
        String pdfActaAprobacionConsejoAcademicoUrl = "";
        Proyecto instance = new Proyecto();
        instance.setPdfActaAprobacionConsejoAcademicoUrl(pdfActaAprobacionConsejoAcademicoUrl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacionAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testGetObservacionAprobacionConsejoAcademico() {
        System.out.println("getObservacionAprobacionConsejoAcademico");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getObservacionAprobacionConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacionAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testSetObservacionAprobacionConsejoAcademico() {
        System.out.println("setObservacionAprobacionConsejoAcademico");
        String observacionAprobacionConsejoAcademico = "";
        Proyecto instance = new Proyecto();
        instance.setObservacionAprobacionConsejoAcademico(observacionAprobacionConsejoAcademico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrlFinalPdfAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testGetUrlFinalPdfAprobacionConsejoAcademico() {
        System.out.println("getUrlFinalPdfAprobacionConsejoAcademico");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getUrlFinalPdfAprobacionConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrlFinalPdfMemorandoNotificacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testGetUrlFinalPdfMemorandoNotificacionConsejoAcademico() {
        System.out.println("getUrlFinalPdfMemorandoNotificacionConsejoAcademico");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getUrlFinalPdfMemorandoNotificacionConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumns method, of class Proyecto.
     */
    @Test
    public void testSetColumns() {
        System.out.println("setColumns");
        Map<Integer, ValoracionParametroEvaluacion> columns = null;
        Proyecto instance = new Proyecto();
        instance.setColumns(columns);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumns method, of class Proyecto.
     */
    @Test
    public void testGetColumns() {
        System.out.println("getColumns");
        Proyecto instance = new Proyecto();
        Map expResult = null;
        Map result = instance.getColumns();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjetivoGeneral method, of class Proyecto.
     */
    @Test
    public void testGetObjetivoGeneral() {
        System.out.println("getObjetivoGeneral");
        Proyecto instance = new Proyecto();
        ObjetivoPrograma expResult = null;
        ObjetivoPrograma result = instance.getObjetivoGeneral();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetallePresupuestoUniversidad method, of class Proyecto.
     */
    @Test
    public void testSetDetallePresupuestoUniversidad() {
        System.out.println("setDetallePresupuestoUniversidad");
        List<PresupuestoProyecto> detallePresupuestoUniversidad = null;
        Proyecto instance = new Proyecto();
        instance.setDetallePresupuestoUniversidad(detallePresupuestoUniversidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetallePresupuestoUniversidad method, of class Proyecto.
     */
    @Test
    public void testGetDetallePresupuestoUniversidad() {
        System.out.println("getDetallePresupuestoUniversidad");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getDetallePresupuestoUniversidad();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetallePresupuestoUniversidadGastoPermanente method, of class Proyecto.
     */
    @Test
    public void testGetDetallePresupuestoUniversidadGastoPermanente() {
        System.out.println("getDetallePresupuestoUniversidadGastoPermanente");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getDetallePresupuestoUniversidadGastoPermanente();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetallePresupuestoUniversidadGastoPermanente method, of class Proyecto.
     */
    @Test
    public void testSetDetallePresupuestoUniversidadGastoPermanente() {
        System.out.println("setDetallePresupuestoUniversidadGastoPermanente");
        List<PresupuestoProyecto> detallePresupuestoUniversidadGastoPermanente = null;
        Proyecto instance = new Proyecto();
        instance.setDetallePresupuestoUniversidadGastoPermanente(detallePresupuestoUniversidadGastoPermanente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetallePresupuestoUniversidadGastoNoPermanente method, of class Proyecto.
     */
    @Test
    public void testGetDetallePresupuestoUniversidadGastoNoPermanente() {
        System.out.println("getDetallePresupuestoUniversidadGastoNoPermanente");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getDetallePresupuestoUniversidadGastoNoPermanente();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetallePresupuestoUniversidadGastoNoPermanente method, of class Proyecto.
     */
    @Test
    public void testSetDetallePresupuestoUniversidadGastoNoPermanente() {
        System.out.println("setDetallePresupuestoUniversidadGastoNoPermanente");
        List<PresupuestoProyecto> detallePresupuestoUniversidadGastoNoPermanente = null;
        Proyecto instance = new Proyecto();
        instance.setDetallePresupuestoUniversidadGastoNoPermanente(detallePresupuestoUniversidadGastoNoPermanente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetallePresupuestoEntidadAuspiciante method, of class Proyecto.
     */
    @Test
    public void testSetDetallePresupuestoEntidadAuspiciante() {
        System.out.println("setDetallePresupuestoEntidadAuspiciante");
        List<PresupuestoProyecto> detallePresupuestoEntidadAuspiciante = null;
        Proyecto instance = new Proyecto();
        instance.setDetallePresupuestoEntidadAuspiciante(detallePresupuestoEntidadAuspiciante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetallePresupuestoEntidadAuspiciante method, of class Proyecto.
     */
    @Test
    public void testGetDetallePresupuestoEntidadAuspiciante() {
        System.out.println("getDetallePresupuestoEntidadAuspiciante");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getDetallePresupuestoEntidadAuspiciante();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetallePresupuestoComunidadBeneficiaria method, of class Proyecto.
     */
    @Test
    public void testSetDetallePresupuestoComunidadBeneficiaria() {
        System.out.println("setDetallePresupuestoComunidadBeneficiaria");
        List<PresupuestoProyecto> detallePresupuestoComunidadBeneficiaria = null;
        Proyecto instance = new Proyecto();
        instance.setDetallePresupuestoComunidadBeneficiaria(detallePresupuestoComunidadBeneficiaria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetallePresupuestoComunidadBeneficiaria method, of class Proyecto.
     */
    @Test
    public void testGetDetallePresupuestoComunidadBeneficiaria() {
        System.out.println("getDetallePresupuestoComunidadBeneficiaria");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getDetallePresupuestoComunidadBeneficiaria();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoUniversidadStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoUniversidadStr() {
        System.out.println("getTotalPresupuestoUniversidadStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoUniversidadStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoUniversidad method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoUniversidad() {
        System.out.println("getTotalPresupuestoUniversidad");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoUniversidad();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoUniversidadGastoPermanenteStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoUniversidadGastoPermanenteStr() {
        System.out.println("getTotalPresupuestoUniversidadGastoPermanenteStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoUniversidadGastoPermanenteStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoUniversidadGastoPermanente method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoUniversidadGastoPermanente() {
        System.out.println("getTotalPresupuestoUniversidadGastoPermanente");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoUniversidadGastoPermanente();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoUniversidadGastoNoPermanenteStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoUniversidadGastoNoPermanenteStr() {
        System.out.println("getTotalPresupuestoUniversidadGastoNoPermanenteStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoUniversidadGastoNoPermanenteStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoUniversidadGastoNoPermanente method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoUniversidadGastoNoPermanente() {
        System.out.println("getTotalPresupuestoUniversidadGastoNoPermanente");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoUniversidadGastoNoPermanente();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEntidadAuspicianteStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEntidadAuspicianteStr() {
        System.out.println("getTotalPresupuestoEntidadAuspicianteStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoEntidadAuspicianteStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEntidadAuspiciante method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEntidadAuspiciante() {
        System.out.println("getTotalPresupuestoEntidadAuspiciante");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoEntidadAuspiciante();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoComunidadBeneficiariaStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoComunidadBeneficiariaStr() {
        System.out.println("getTotalPresupuestoComunidadBeneficiariaStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoComunidadBeneficiariaStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoComunidadBeneficiaria method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoComunidadBeneficiaria() {
        System.out.println("getTotalPresupuestoComunidadBeneficiaria");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoComunidadBeneficiaria();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoUniversidadStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoUniversidadStr() {
        System.out.println("getTotalPresupuestoEjecutadoUniversidadStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoEjecutadoUniversidadStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoUniversidadGastoPermanenteStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoUniversidadGastoPermanenteStr() {
        System.out.println("getTotalPresupuestoEjecutadoUniversidadGastoPermanenteStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoEjecutadoUniversidadGastoPermanenteStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoUniversidadGastoPermanente method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoUniversidadGastoPermanente() {
        System.out.println("getTotalPresupuestoEjecutadoUniversidadGastoPermanente");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoEjecutadoUniversidadGastoPermanente();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoUniversidadGastoNoPermanenteStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoUniversidadGastoNoPermanenteStr() {
        System.out.println("getTotalPresupuestoEjecutadoUniversidadGastoNoPermanenteStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoEjecutadoUniversidadGastoNoPermanenteStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoUniversidadGastoNoPermanente method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoUniversidadGastoNoPermanente() {
        System.out.println("getTotalPresupuestoEjecutadoUniversidadGastoNoPermanente");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoEjecutadoUniversidadGastoNoPermanente();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoEntidadAuspicianteStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoEntidadAuspicianteStr() {
        System.out.println("getTotalPresupuestoEjecutadoEntidadAuspicianteStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoEjecutadoEntidadAuspicianteStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoEntidadAuspiciante method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoEntidadAuspiciante() {
        System.out.println("getTotalPresupuestoEjecutadoEntidadAuspiciante");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoEjecutadoEntidadAuspiciante();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoComunidadBeneficiariaStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoComunidadBeneficiariaStr() {
        System.out.println("getTotalPresupuestoEjecutadoComunidadBeneficiariaStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalPresupuestoEjecutadoComunidadBeneficiariaStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPresupuestoEjecutadoComunidadBeneficiaria method, of class Proyecto.
     */
    @Test
    public void testGetTotalPresupuestoEjecutadoComunidadBeneficiaria() {
        System.out.println("getTotalPresupuestoEjecutadoComunidadBeneficiaria");
        Proyecto instance = new Proyecto();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotalPresupuestoEjecutadoComunidadBeneficiaria();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of inicializarListadoPresupuestos method, of class Proyecto.
     */
    @Test
    public void testInicializarListadoPresupuestos() {
        System.out.println("inicializarListadoPresupuestos");
        Proyecto instance = new Proyecto();
        instance.inicializarListadoPresupuestos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajeCorreo method, of class Proyecto.
     */
    @Test
    public void testGetMensajeCorreo() {
        System.out.println("getMensajeCorreo");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMensajeCorreo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensajeCorreo method, of class Proyecto.
     */
    @Test
    public void testSetMensajeCorreo() {
        System.out.println("setMensajeCorreo");
        String mensajeCorreo = "";
        Proyecto instance = new Proyecto();
        instance.setMensajeCorreo(mensajeCorreo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAsuntoCorreo method, of class Proyecto.
     */
    @Test
    public void testGetAsuntoCorreo() {
        System.out.println("getAsuntoCorreo");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getAsuntoCorreo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsuntoCorreo method, of class Proyecto.
     */
    @Test
    public void testSetAsuntoCorreo() {
        System.out.println("setAsuntoCorreo");
        String asuntoCorreo = "";
        Proyecto instance = new Proyecto();
        instance.setAsuntoCorreo(asuntoCorreo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccionCorreo method, of class Proyecto.
     */
    @Test
    public void testGetDireccionCorreo() {
        System.out.println("getDireccionCorreo");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getDireccionCorreo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccionCorreo method, of class Proyecto.
     */
    @Test
    public void testSetDireccionCorreo() {
        System.out.println("setDireccionCorreo");
        String direccionCorreo = "";
        Proyecto instance = new Proyecto();
        instance.setDireccionCorreo(direccionCorreo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarreraProyectoList method, of class Proyecto.
     */
    @Test
    public void testGetCarreraProyectoList() {
        System.out.println("getCarreraProyectoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getCarreraProyectoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarreraProyectoList method, of class Proyecto.
     */
    @Test
    public void testSetCarreraProyectoList() {
        System.out.println("setCarreraProyectoList");
        List<CarreraProyecto> carreraProyectoList = null;
        Proyecto instance = new Proyecto();
        instance.setCarreraProyectoList(carreraProyectoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndicadorEstrategia method, of class Proyecto.
     */
    @Test
    public void testGetIndicadorEstrategia() {
        System.out.println("getIndicadorEstrategia");
        Integer idObjetivoEstrategico = null;
        Proyecto instance = new Proyecto();
        IndicadorEstrategiaProyecto expResult = null;
        IndicadorEstrategiaProyecto result = instance.getIndicadorEstrategia(idObjetivoEstrategico);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluacionFinalList method, of class Proyecto.
     */
    @Test
    public void testGetEvaluacionFinalList() {
        System.out.println("getEvaluacionFinalList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getEvaluacionFinalList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvaluacionFinalList method, of class Proyecto.
     */
    @Test
    public void testSetEvaluacionFinalList() {
        System.out.println("setEvaluacionFinalList");
        List<EvaluacionFinalProyecto> evaluacionFinalList = null;
        Proyecto instance = new Proyecto();
        instance.setEvaluacionFinalList(evaluacionFinalList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testGetEvaluacionFinal() {
        System.out.println("getEvaluacionFinal");
        Proyecto instance = new Proyecto();
        EvaluacionFinalProyecto expResult = null;
        EvaluacionFinalProyecto result = instance.getEvaluacionFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAreaIntervencion2 method, of class Proyecto.
     */
    @Test
    public void testGetAreaIntervencion2() {
        System.out.println("getAreaIntervencion2");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getAreaIntervencion2();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAreaIntervencion2 method, of class Proyecto.
     */
    @Test
    public void testSetAreaIntervencion2() {
        System.out.println("setAreaIntervencion2");
        String areaIntervencion2 = "";
        Proyecto instance = new Proyecto();
        instance.setAreaIntervencion2(areaIntervencion2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiagnosticoProblema2 method, of class Proyecto.
     */
    @Test
    public void testGetDiagnosticoProblema2() {
        System.out.println("getDiagnosticoProblema2");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getDiagnosticoProblema2();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiagnosticoProblema2 method, of class Proyecto.
     */
    @Test
    public void testSetDiagnosticoProblema2() {
        System.out.println("setDiagnosticoProblema2");
        String diagnosticoProblema2 = "";
        Proyecto instance = new Proyecto();
        instance.setDiagnosticoProblema2(diagnosticoProblema2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPdfMemorandoAprobacionConsejoAcademicoNombre method, of class Proyecto.
     */
    @Test
    public void testGetPdfMemorandoAprobacionConsejoAcademicoNombre() {
        System.out.println("getPdfMemorandoAprobacionConsejoAcademicoNombre");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPdfMemorandoAprobacionConsejoAcademicoNombre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPdfMemorandoAprobacionConsejoAcademicoNombre method, of class Proyecto.
     */
    @Test
    public void testSetPdfMemorandoAprobacionConsejoAcademicoNombre() {
        System.out.println("setPdfMemorandoAprobacionConsejoAcademicoNombre");
        String pdfMemorandoAprobacionConsejoAcademicoNombre = "";
        Proyecto instance = new Proyecto();
        instance.setPdfMemorandoAprobacionConsejoAcademicoNombre(pdfMemorandoAprobacionConsejoAcademicoNombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPdfMemorandoAprobacionConsejoAcademicoUrl method, of class Proyecto.
     */
    @Test
    public void testGetPdfMemorandoAprobacionConsejoAcademicoUrl() {
        System.out.println("getPdfMemorandoAprobacionConsejoAcademicoUrl");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getPdfMemorandoAprobacionConsejoAcademicoUrl();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPdfMemorandoAprobacionConsejoAcademicoUrl method, of class Proyecto.
     */
    @Test
    public void testSetPdfMemorandoAprobacionConsejoAcademicoUrl() {
        System.out.println("setPdfMemorandoAprobacionConsejoAcademicoUrl");
        String pdfMemorandoAprobacionConsejoAcademicoUrl = "";
        Proyecto instance = new Proyecto();
        instance.setPdfMemorandoAprobacionConsejoAcademicoUrl(pdfMemorandoAprobacionConsejoAcademicoUrl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdjuntarActaAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testGetAdjuntarActaAprobacionConsejoAcademico() {
        System.out.println("getAdjuntarActaAprobacionConsejoAcademico");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getAdjuntarActaAprobacionConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdjuntarActaAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testSetAdjuntarActaAprobacionConsejoAcademico() {
        System.out.println("setAdjuntarActaAprobacionConsejoAcademico");
        String adjuntarActaAprobacionConsejoAcademico = "";
        Proyecto instance = new Proyecto();
        instance.setAdjuntarActaAprobacionConsejoAcademico(adjuntarActaAprobacionConsejoAcademico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdjuntarMemorandoNotificacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testGetAdjuntarMemorandoNotificacionConsejoAcademico() {
        System.out.println("getAdjuntarMemorandoNotificacionConsejoAcademico");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getAdjuntarMemorandoNotificacionConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdjuntarMemorandoNotificacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testSetAdjuntarMemorandoNotificacionConsejoAcademico() {
        System.out.println("setAdjuntarMemorandoNotificacionConsejoAcademico");
        String adjuntarMemorandoNotificacionConsejoAcademico = "";
        Proyecto instance = new Proyecto();
        instance.setAdjuntarMemorandoNotificacionConsejoAcademico(adjuntarMemorandoNotificacionConsejoAcademico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addObjetivosProvCanParr method, of class Proyecto.
     */
    @Test
    public void testAddObjetivosProvCanParr() {
        System.out.println("addObjetivosProvCanParr");
        LocalizacionPrograma svinZonaDetalle = null;
        Proyecto instance = new Proyecto();
        instance.addObjetivosProvCanParr(svinZonaDetalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineaInvestigacionProyectoList method, of class Proyecto.
     */
    @Test
    public void testGetLineaInvestigacionProyectoList() {
        System.out.println("getLineaInvestigacionProyectoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getLineaInvestigacionProyectoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaInvestigacionProyectoList method, of class Proyecto.
     */
    @Test
    public void testSetLineaInvestigacionProyectoList() {
        System.out.println("setLineaInvestigacionProyectoList");
        List<LineaInvestigacionProyecto> lineaInvestigacionProyectoList = null;
        Proyecto instance = new Proyecto();
        instance.setLineaInvestigacionProyectoList(lineaInvestigacionProyectoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setearLineaInvestigacionList method, of class Proyecto.
     */
    @Test
    public void testSetearLineaInvestigacionList() {
        System.out.println("setearLineaInvestigacionList");
        Proyecto instance = new Proyecto();
        instance.setearLineaInvestigacionList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLineaInvestigacionList method, of class Proyecto.
     */
    @Test
    public void testGetLineaInvestigacionList() {
        System.out.println("getLineaInvestigacionList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getLineaInvestigacionList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLineaInvestigacionList method, of class Proyecto.
     */
    @Test
    public void testSetLineaInvestigacionList() {
        System.out.println("setLineaInvestigacionList");
        List<SeaLineainves> lineaInvestigacionList = null;
        Proyecto instance = new Proyecto();
        instance.setLineaInvestigacionList(lineaInvestigacionList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of asignarEvaluadorFinal method, of class Proyecto.
     */
    @Test
    public void testAsignarEvaluadorFinal() {
        System.out.println("asignarEvaluadorFinal");
        SegUsuario usuario = null;
        Proyecto instance = new Proyecto();
        instance.asignarEvaluadorFinal(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroBeneficiariosDirectosNinios method, of class Proyecto.
     */
    @Test
    public void testGetNroBeneficiariosDirectosNinios() {
        System.out.println("getNroBeneficiariosDirectosNinios");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getNroBeneficiariosDirectosNinios();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNroBeneficiariosDirectosNinios method, of class Proyecto.
     */
    @Test
    public void testSetNroBeneficiariosDirectosNinios() {
        System.out.println("setNroBeneficiariosDirectosNinios");
        Integer nroBeneficiariosDirectosNinios = null;
        Proyecto instance = new Proyecto();
        instance.setNroBeneficiariosDirectosNinios(nroBeneficiariosDirectosNinios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnexoProyectoList method, of class Proyecto.
     */
    @Test
    public void testGetAnexoProyectoList() {
        System.out.println("getAnexoProyectoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getAnexoProyectoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnexoProyectoList method, of class Proyecto.
     */
    @Test
    public void testSetAnexoProyectoList() {
        System.out.println("setAnexoProyectoList");
        List<AnexoProyecto> anexoProyectoList = null;
        Proyecto instance = new Proyecto();
        instance.setAnexoProyectoList(anexoProyectoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompromisoParticipacionList method, of class Proyecto.
     */
    @Test
    public void testGetCompromisoParticipacionList() {
        System.out.println("getCompromisoParticipacionList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getCompromisoParticipacionList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCompromisoParticipacionList method, of class Proyecto.
     */
    @Test
    public void testSetCompromisoParticipacionList() {
        System.out.println("setCompromisoParticipacionList");
        List<CompromisoParticipacionProyecto> compromisoParticipacionList = null;
        Proyecto instance = new Proyecto();
        instance.setCompromisoParticipacionList(compromisoParticipacionList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBeneficiariosDirectosEjecutadosHombres method, of class Proyecto.
     */
    @Test
    public void testGetTotalBeneficiariosDirectosEjecutadosHombres() {
        System.out.println("getTotalBeneficiariosDirectosEjecutadosHombres");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalBeneficiariosDirectosEjecutadosHombres();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBeneficiariosDirectosEjecutadosMujeres method, of class Proyecto.
     */
    @Test
    public void testGetTotalBeneficiariosDirectosEjecutadosMujeres() {
        System.out.println("getTotalBeneficiariosDirectosEjecutadosMujeres");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalBeneficiariosDirectosEjecutadosMujeres();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBeneficiariosDirectosEjecutadosNinios method, of class Proyecto.
     */
    @Test
    public void testGetTotalBeneficiariosDirectosEjecutadosNinios() {
        System.out.println("getTotalBeneficiariosDirectosEjecutadosNinios");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalBeneficiariosDirectosEjecutadosNinios();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBeneficiariosDirectosEjecutadosDiscapacidad method, of class Proyecto.
     */
    @Test
    public void testGetTotalBeneficiariosDirectosEjecutadosDiscapacidad() {
        System.out.println("getTotalBeneficiariosDirectosEjecutadosDiscapacidad");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalBeneficiariosDirectosEjecutadosDiscapacidad();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBeneficiariosDirectosEjecutados method, of class Proyecto.
     */
    @Test
    public void testGetTotalBeneficiariosDirectosEjecutados() {
        System.out.println("getTotalBeneficiariosDirectosEjecutados");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalBeneficiariosDirectosEjecutados();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBeneficiariosIndirectosEjecutados method, of class Proyecto.
     */
    @Test
    public void testGetTotalBeneficiariosIndirectosEjecutados() {
        System.out.println("getTotalBeneficiariosIndirectosEjecutados");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalBeneficiariosIndirectosEjecutados();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBeneficiariosEjecutados method, of class Proyecto.
     */
    @Test
    public void testGetTotalBeneficiariosEjecutados() {
        System.out.println("getTotalBeneficiariosEjecutados");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalBeneficiariosEjecutados();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumericoBeneficiarioList method, of class Proyecto.
     */
    @Test
    public void testGetNumericoBeneficiarioList() {
        System.out.println("getNumericoBeneficiarioList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getNumericoBeneficiarioList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExisteParticipacionComunidad method, of class Proyecto.
     */
    @Test
    public void testGetExisteParticipacionComunidad() {
        System.out.println("getExisteParticipacionComunidad");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.getExisteParticipacionComunidad();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalEstudiantesParticipantesStr method, of class Proyecto.
     */
    @Test
    public void testGetTotalEstudiantesParticipantesStr() {
        System.out.println("getTotalEstudiantesParticipantesStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTotalEstudiantesParticipantesStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalEstudiantesParticipantes method, of class Proyecto.
     */
    @Test
    public void testGetTotalEstudiantesParticipantes() {
        System.out.println("getTotalEstudiantesParticipantes");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalEstudiantesParticipantes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCierreProductos method, of class Proyecto.
     */
    @Test
    public void testGetCierreProductos() {
        System.out.println("getCierreProductos");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCierreProductos();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCierreProductos method, of class Proyecto.
     */
    @Test
    public void testSetCierreProductos() {
        System.out.println("setCierreProductos");
        String cierreProductos = "";
        Proyecto instance = new Proyecto();
        instance.setCierreProductos(cierreProductos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCierreBienes method, of class Proyecto.
     */
    @Test
    public void testGetCierreBienes() {
        System.out.println("getCierreBienes");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCierreBienes();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCierreBienes method, of class Proyecto.
     */
    @Test
    public void testSetCierreBienes() {
        System.out.println("setCierreBienes");
        String cierreBienes = "";
        Proyecto instance = new Proyecto();
        instance.setCierreBienes(cierreBienes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCierreResultados method, of class Proyecto.
     */
    @Test
    public void testGetCierreResultados() {
        System.out.println("getCierreResultados");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCierreResultados();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCierreResultados method, of class Proyecto.
     */
    @Test
    public void testSetCierreResultados() {
        System.out.println("setCierreResultados");
        String cierreResultados = "";
        Proyecto instance = new Proyecto();
        instance.setCierreResultados(cierreResultados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCierreOtrasAplicaciones method, of class Proyecto.
     */
    @Test
    public void testGetCierreOtrasAplicaciones() {
        System.out.println("getCierreOtrasAplicaciones");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCierreOtrasAplicaciones();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCierreOtrasAplicaciones method, of class Proyecto.
     */
    @Test
    public void testSetCierreOtrasAplicaciones() {
        System.out.println("setCierreOtrasAplicaciones");
        String cierreOtrasAplicaciones = "";
        Proyecto instance = new Proyecto();
        instance.setCierreOtrasAplicaciones(cierreOtrasAplicaciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCierreImpactoFuturo method, of class Proyecto.
     */
    @Test
    public void testGetCierreImpactoFuturo() {
        System.out.println("getCierreImpactoFuturo");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCierreImpactoFuturo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCierreImpactoFuturo method, of class Proyecto.
     */
    @Test
    public void testSetCierreImpactoFuturo() {
        System.out.println("setCierreImpactoFuturo");
        String cierreImpactoFuturo = "";
        Proyecto instance = new Proyecto();
        instance.setCierreImpactoFuturo(cierreImpactoFuturo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCierreRestricciones method, of class Proyecto.
     */
    @Test
    public void testGetCierreRestricciones() {
        System.out.println("getCierreRestricciones");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCierreRestricciones();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCierreRestricciones method, of class Proyecto.
     */
    @Test
    public void testSetCierreRestricciones() {
        System.out.println("setCierreRestricciones");
        String cierreRestricciones = "";
        Proyecto instance = new Proyecto();
        instance.setCierreRestricciones(cierreRestricciones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCierreComentarios method, of class Proyecto.
     */
    @Test
    public void testGetCierreComentarios() {
        System.out.println("getCierreComentarios");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCierreComentarios();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCierreComentarios method, of class Proyecto.
     */
    @Test
    public void testSetCierreComentarios() {
        System.out.println("setCierreComentarios");
        String cierreComentarios = "";
        Proyecto instance = new Proyecto();
        instance.setCierreComentarios(cierreComentarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajePermitirCalificacionComisionVinculacion method, of class Proyecto.
     */
    @Test
    public void testGetMensajePermitirCalificacionComisionVinculacion() {
        System.out.println("getMensajePermitirCalificacionComisionVinculacion");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMensajePermitirCalificacionComisionVinculacion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajePermitirConsolidacionCalificacion method, of class Proyecto.
     */
    @Test
    public void testGetMensajePermitirConsolidacionCalificacion() {
        System.out.println("getMensajePermitirConsolidacionCalificacion");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMensajePermitirConsolidacionCalificacion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajePermitirAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetMensajePermitirAprobacionVicerrectorado() {
        System.out.println("getMensajePermitirAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMensajePermitirAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajePermitirAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testGetMensajePermitirAprobacionConsejoAcademico() {
        System.out.println("getMensajePermitirAprobacionConsejoAcademico");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMensajePermitirAprobacionConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajePermitirEjecucion method, of class Proyecto.
     */
    @Test
    public void testGetMensajePermitirEjecucion() {
        System.out.println("getMensajePermitirEjecucion");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMensajePermitirEjecucion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajePermitirCierre method, of class Proyecto.
     */
    @Test
    public void testGetMensajePermitirCierre() {
        System.out.println("getMensajePermitirCierre");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMensajePermitirCierre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajePermitirEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testGetMensajePermitirEvaluacionFinal() {
        System.out.println("getMensajePermitirEvaluacionFinal");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMensajePermitirEvaluacionFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensajePermitirFinalizarEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testGetMensajePermitirFinalizarEvaluacionFinal() {
        System.out.println("getMensajePermitirFinalizarEvaluacionFinal");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMensajePermitirFinalizarEvaluacionFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoStr method, of class Proyecto.
     */
    @Test
    public void testGetEstadoStr() {
        System.out.println("getEstadoStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getEstadoStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConfiguracionParametrosEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testGetConfiguracionParametrosEvaluacionFinal() {
        System.out.println("getConfiguracionParametrosEvaluacionFinal");
        Proyecto instance = new Proyecto();
        ConfiguracionParametrosEvaluacion expResult = null;
        ConfiguracionParametrosEvaluacion result = instance.getConfiguracionParametrosEvaluacionFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConfiguracionParametrosEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testSetConfiguracionParametrosEvaluacionFinal() {
        System.out.println("setConfiguracionParametrosEvaluacionFinal");
        ConfiguracionParametrosEvaluacion configuracionParametrosEvaluacionFinal = null;
        Proyecto instance = new Proyecto();
        instance.setConfiguracionParametrosEvaluacionFinal(configuracionParametrosEvaluacionFinal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetFechaAprobacionVicerrectorado() {
        System.out.println("getFechaAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testSetFechaAprobacionVicerrectorado() {
        System.out.println("setFechaAprobacionVicerrectorado");
        Date fechaAprobacionVicerrectorado = null;
        Proyecto instance = new Proyecto();
        instance.setFechaAprobacionVicerrectorado(fechaAprobacionVicerrectorado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacionAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetObservacionAprobacionVicerrectorado() {
        System.out.println("getObservacionAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getObservacionAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacionAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testSetObservacionAprobacionVicerrectorado() {
        System.out.println("setObservacionAprobacionVicerrectorado");
        String observacionAprobacionVicerrectorado = "";
        Proyecto instance = new Proyecto();
        instance.setObservacionAprobacionVicerrectorado(observacionAprobacionVicerrectorado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnexoDiagnosticoProblemaList method, of class Proyecto.
     */
    @Test
    public void testGetAnexoDiagnosticoProblemaList() {
        System.out.println("getAnexoDiagnosticoProblemaList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getAnexoDiagnosticoProblemaList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnexoDiagnosticoProblemaList method, of class Proyecto.
     */
    @Test
    public void testSetAnexoDiagnosticoProblemaList() {
        System.out.println("setAnexoDiagnosticoProblemaList");
        List<AnexoProyecto> anexoDiagnosticoProblemaList = null;
        Proyecto instance = new Proyecto();
        instance.setAnexoDiagnosticoProblemaList(anexoDiagnosticoProblemaList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnexoDocumentoProyectoList method, of class Proyecto.
     */
    @Test
    public void testGetAnexoDocumentoProyectoList() {
        System.out.println("getAnexoDocumentoProyectoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getAnexoDocumentoProyectoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnexoDocumentoProyectoList method, of class Proyecto.
     */
    @Test
    public void testSetAnexoDocumentoProyectoList() {
        System.out.println("setAnexoDocumentoProyectoList");
        List<AnexoProyecto> anexoDocumentoProyectoList = null;
        Proyecto instance = new Proyecto();
        instance.setAnexoDocumentoProyectoList(anexoDocumentoProyectoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of initAnexos method, of class Proyecto.
     */
    @Test
    public void testInitAnexos() {
        System.out.println("initAnexos");
        Proyecto instance = new Proyecto();
        instance.initAnexos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeAnexo method, of class Proyecto.
     */
    @Test
    public void testExisteAnexo() {
        System.out.println("existeAnexo");
        AnexoProyecto anexo = null;
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.existeAnexo(anexo);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoActivo method, of class Proyecto.
     */
    @Test
    public void testGetEstadoActivo() {
        System.out.println("getEstadoActivo");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getEstadoActivo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoActivo method, of class Proyecto.
     */
    @Test
    public void testSetEstadoActivo() {
        System.out.println("setEstadoActivo");
        String estadoActivo = "";
        Proyecto instance = new Proyecto();
        instance.setEstadoActivo(estadoActivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testAddEvaluacionFinal() {
        System.out.println("addEvaluacionFinal");
        EvaluacionFinalProyecto evaluacionFinalProyecto = null;
        Proyecto instance = new Proyecto();
        instance.addEvaluacionFinal(evaluacionFinalProyecto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaCierre method, of class Proyecto.
     */
    @Test
    public void testGetFechaCierre() {
        System.out.println("getFechaCierre");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaCierre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaCierre method, of class Proyecto.
     */
    @Test
    public void testSetFechaCierre() {
        System.out.println("setFechaCierre");
        Date fechaCierre = null;
        Proyecto instance = new Proyecto();
        instance.setFechaCierre(fechaCierre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testGetFechaEvaluacionFinal() {
        System.out.println("getFechaEvaluacionFinal");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaEvaluacionFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testSetFechaEvaluacionFinal() {
        System.out.println("setFechaEvaluacionFinal");
        Date fechaEvaluacionFinal = null;
        Proyecto instance = new Proyecto();
        instance.setFechaEvaluacionFinal(fechaEvaluacionFinal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaRecordatorioAvance method, of class Proyecto.
     */
    @Test
    public void testGetFechaRecordatorioAvance() {
        System.out.println("getFechaRecordatorioAvance");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaRecordatorioAvance();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaRecordatorioAvance method, of class Proyecto.
     */
    @Test
    public void testSetFechaRecordatorioAvance() {
        System.out.println("setFechaRecordatorioAvance");
        Date fechaRecordatorioAvance = null;
        Proyecto instance = new Proyecto();
        instance.setFechaRecordatorioAvance(fechaRecordatorioAvance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMailDirector method, of class Proyecto.
     */
    @Test
    public void testGetMailDirector() {
        System.out.println("getMailDirector");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getMailDirector();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreDirector method, of class Proyecto.
     */
    @Test
    public void testGetNombreDirector() {
        System.out.println("getNombreDirector");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getNombreDirector();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroBeneficiariosIndirectos method, of class Proyecto.
     */
    @Test
    public void testGetNroBeneficiariosIndirectos() {
        System.out.println("getNroBeneficiariosIndirectos");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getNroBeneficiariosIndirectos();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNroBeneficiariosIndirectos method, of class Proyecto.
     */
    @Test
    public void testSetNroBeneficiariosIndirectos() {
        System.out.println("setNroBeneficiariosIndirectos");
        Integer nroBeneficiariosIndirectos = null;
        Proyecto instance = new Proyecto();
        instance.setNroBeneficiariosIndirectos(nroBeneficiariosIndirectos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDocentesEjecutado method, of class Proyecto.
     */
    @Test
    public void testGetTotalDocentesEjecutado() {
        System.out.println("getTotalDocentesEjecutado");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalDocentesEjecutado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalEstudiantesEjecutado method, of class Proyecto.
     */
    @Test
    public void testGetTotalEstudiantesEjecutado() {
        System.out.println("getTotalEstudiantesEjecutado");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getTotalEstudiantesEjecutado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCampus method, of class Proyecto.
     */
    @Test
    public void testGetCampus() {
        System.out.println("getCampus");
        Proyecto instance = new Proyecto();
        Stvcamp expResult = null;
        Stvcamp result = instance.getCampus();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCampus method, of class Proyecto.
     */
    @Test
    public void testSetCampus() {
        System.out.println("setCampus");
        Stvcamp campus = null;
        Proyecto instance = new Proyecto();
        instance.setCampus(campus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroTotalCertificadosEstudiante method, of class Proyecto.
     */
    @Test
    public void testGetNroTotalCertificadosEstudiante() {
        System.out.println("getNroTotalCertificadosEstudiante");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getNroTotalCertificadosEstudiante();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroTotalCertificadosDocente method, of class Proyecto.
     */
    @Test
    public void testGetNroTotalCertificadosDocente() {
        System.out.println("getNroTotalCertificadosDocente");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getNroTotalCertificadosDocente();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelected method, of class Proyecto.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        Proyecto instance = new Proyecto();
        Boolean expResult = null;
        Boolean result = instance.getSelected();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class Proyecto.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        Boolean selected = null;
        Proyecto instance = new Proyecto();
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Proyecto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoberturaStr method, of class Proyecto.
     */
    @Test
    public void testGetCoberturaStr() {
        System.out.println("getCoberturaStr");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCoberturaStr();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeEvaluacionPertinencia method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeEvaluacionPertinencia() {
        System.out.println("getPuntajeEvaluacionPertinencia");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeEvaluacionPertinencia();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeEvaluacionEficacia method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeEvaluacionEficacia() {
        System.out.println("getPuntajeEvaluacionEficacia");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeEvaluacionEficacia();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeEvaluacionEficiencia method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeEvaluacionEficiencia() {
        System.out.println("getPuntajeEvaluacionEficiencia");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeEvaluacionEficiencia();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeEvaluacionSostenibilidad method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeEvaluacionSostenibilidad() {
        System.out.println("getPuntajeEvaluacionSostenibilidad");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeEvaluacionSostenibilidad();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeEvaluacionPertinenciaMaximo method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeEvaluacionPertinenciaMaximo() {
        System.out.println("getPuntajeEvaluacionPertinenciaMaximo");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeEvaluacionPertinenciaMaximo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeEvaluacionEficaciaMaximo method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeEvaluacionEficaciaMaximo() {
        System.out.println("getPuntajeEvaluacionEficaciaMaximo");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeEvaluacionEficaciaMaximo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeEvaluacionEficienciaMaximo method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeEvaluacionEficienciaMaximo() {
        System.out.println("getPuntajeEvaluacionEficienciaMaximo");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeEvaluacionEficienciaMaximo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeEvaluacionSostenibilidadMaximo method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeEvaluacionSostenibilidadMaximo() {
        System.out.println("getPuntajeEvaluacionSostenibilidadMaximo");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeEvaluacionSostenibilidadMaximo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeEvaluacionMaximo method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeEvaluacionMaximo() {
        System.out.println("getPuntajeEvaluacionMaximo");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeEvaluacionMaximo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntajeTotalEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testGetPuntajeTotalEvaluacionFinal() {
        System.out.println("getPuntajeTotalEvaluacionFinal");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getPuntajeTotalEvaluacionFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTipoPoblacionBeneficiariaUrbanoMarginal method, of class Proyecto.
     */
    @Test
    public void testIsTipoPoblacionBeneficiariaUrbanoMarginal() {
        System.out.println("isTipoPoblacionBeneficiariaUrbanoMarginal");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isTipoPoblacionBeneficiariaUrbanoMarginal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTipoPoblacionBeneficiariaRural method, of class Proyecto.
     */
    @Test
    public void testIsTipoPoblacionBeneficiariaRural() {
        System.out.println("isTipoPoblacionBeneficiariaRural");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isTipoPoblacionBeneficiariaRural();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTipoPoblacionGrupoAtencionPrioritaria method, of class Proyecto.
     */
    @Test
    public void testIsTipoPoblacionGrupoAtencionPrioritaria() {
        System.out.println("isTipoPoblacionGrupoAtencionPrioritaria");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isTipoPoblacionGrupoAtencionPrioritaria();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarTipoPoblacionBeneficiariaRural method, of class Proyecto.
     */
    @Test
    public void testVerificarTipoPoblacionBeneficiariaRural() {
        System.out.println("verificarTipoPoblacionBeneficiariaRural");
        Long tipo = null;
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.verificarTipoPoblacionBeneficiariaRural(tipo);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarCronogramaIngresado method, of class Proyecto.
     */
    @Test
    public void testVerificarCronogramaIngresado() {
        System.out.println("verificarCronogramaIngresado");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.verificarCronogramaIngresado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarrera method, of class Proyecto.
     */
    @Test
    public void testGetCarrera() {
        System.out.println("getCarrera");
        Proyecto instance = new Proyecto();
        Stvmajr expResult = null;
        Stvmajr result = instance.getCarrera();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarrera method, of class Proyecto.
     */
    @Test
    public void testSetCarrera() {
        System.out.println("setCarrera");
        Stvmajr carrera = null;
        Proyecto instance = new Proyecto();
        instance.setCarrera(carrera);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCalificacionFinalizada method, of class Proyecto.
     */
    @Test
    public void testIsCalificacionFinalizada() {
        System.out.println("isCalificacionFinalizada");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isCalificacionFinalizada();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCalificacionFinalizada method, of class Proyecto.
     */
    @Test
    public void testSetCalificacionFinalizada() {
        System.out.println("setCalificacionFinalizada");
        boolean calificacionFinalizada = false;
        Proyecto instance = new Proyecto();
        instance.setCalificacionFinalizada(calificacionFinalizada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAsignadoComision method, of class Proyecto.
     */
    @Test
    public void testIsAsignadoComision() {
        System.out.println("isAsignadoComision");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isAsignadoComision();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsignadoComision method, of class Proyecto.
     */
    @Test
    public void testSetAsignadoComision() {
        System.out.println("setAsignadoComision");
        boolean asignadoComision = false;
        Proyecto instance = new Proyecto();
        instance.setAsignadoComision(asignadoComision);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setearEstadoDirector method, of class Proyecto.
     */
    @Test
    public void testSetearEstadoDirector() {
        System.out.println("setearEstadoDirector");
        Proyecto instance = new Proyecto();
        instance.setearEstadoDirector();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActaCompromisoDirectorProyectoNombre method, of class Proyecto.
     */
    @Test
    public void testGetActaCompromisoDirectorProyectoNombre() {
        System.out.println("getActaCompromisoDirectorProyectoNombre");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getActaCompromisoDirectorProyectoNombre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActaCompromisoDirectorProyectoNombre method, of class Proyecto.
     */
    @Test
    public void testSetActaCompromisoDirectorProyectoNombre() {
        System.out.println("setActaCompromisoDirectorProyectoNombre");
        String actaCompromisoDirectorProyectoNombre = "";
        Proyecto instance = new Proyecto();
        instance.setActaCompromisoDirectorProyectoNombre(actaCompromisoDirectorProyectoNombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActaCompromisoDirectorProyectoUrl method, of class Proyecto.
     */
    @Test
    public void testGetActaCompromisoDirectorProyectoUrl() {
        System.out.println("getActaCompromisoDirectorProyectoUrl");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getActaCompromisoDirectorProyectoUrl();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActaCompromisoDirectorProyectoUrl method, of class Proyecto.
     */
    @Test
    public void testSetActaCompromisoDirectorProyectoUrl() {
        System.out.println("setActaCompromisoDirectorProyectoUrl");
        String actaCompromisoDirectorProyectoUrl = "";
        Proyecto instance = new Proyecto();
        instance.setActaCompromisoDirectorProyectoUrl(actaCompromisoDirectorProyectoUrl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActaCompromisoCarrerasNombre method, of class Proyecto.
     */
    @Test
    public void testGetActaCompromisoCarrerasNombre() {
        System.out.println("getActaCompromisoCarrerasNombre");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getActaCompromisoCarrerasNombre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActaCompromisoCarrerasNombre method, of class Proyecto.
     */
    @Test
    public void testSetActaCompromisoCarrerasNombre() {
        System.out.println("setActaCompromisoCarrerasNombre");
        String actaCompromisoCarrerasNombre = "";
        Proyecto instance = new Proyecto();
        instance.setActaCompromisoCarrerasNombre(actaCompromisoCarrerasNombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActaCompromisoCarrerasUrl method, of class Proyecto.
     */
    @Test
    public void testGetActaCompromisoCarrerasUrl() {
        System.out.println("getActaCompromisoCarrerasUrl");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getActaCompromisoCarrerasUrl();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActaCompromisoCarrerasUrl method, of class Proyecto.
     */
    @Test
    public void testSetActaCompromisoCarrerasUrl() {
        System.out.println("setActaCompromisoCarrerasUrl");
        String actaCompromisoCarrerasUrl = "";
        Proyecto instance = new Proyecto();
        instance.setActaCompromisoCarrerasUrl(actaCompromisoCarrerasUrl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActaCompromisoDirectorProyectoUrlFinal method, of class Proyecto.
     */
    @Test
    public void testGetActaCompromisoDirectorProyectoUrlFinal() {
        System.out.println("getActaCompromisoDirectorProyectoUrlFinal");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getActaCompromisoDirectorProyectoUrlFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActaCompromisoCarrerasUrlFinal method, of class Proyecto.
     */
    @Test
    public void testGetActaCompromisoCarrerasUrlFinal() {
        System.out.println("getActaCompromisoCarrerasUrlFinal");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getActaCompromisoCarrerasUrlFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFinalizacionPerfil method, of class Proyecto.
     */
    @Test
    public void testGetFechaFinalizacionPerfil() {
        System.out.println("getFechaFinalizacionPerfil");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaFinalizacionPerfil();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFinalizacionPerfil method, of class Proyecto.
     */
    @Test
    public void testSetFechaFinalizacionPerfil() {
        System.out.println("setFechaFinalizacionPerfil");
        Date fechaFinalizacionPerfil = null;
        Proyecto instance = new Proyecto();
        instance.setFechaFinalizacionPerfil(fechaFinalizacionPerfil);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroActaAprobacionConsejoDep method, of class Proyecto.
     */
    @Test
    public void testGetNroActaAprobacionConsejoDep() {
        System.out.println("getNroActaAprobacionConsejoDep");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getNroActaAprobacionConsejoDep();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNroActaAprobacionConsejoDep method, of class Proyecto.
     */
    @Test
    public void testSetNroActaAprobacionConsejoDep() {
        System.out.println("setNroActaAprobacionConsejoDep");
        String nroActaAprobacionConsejoDep = "";
        Proyecto instance = new Proyecto();
        instance.setNroActaAprobacionConsejoDep(nroActaAprobacionConsejoDep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaActaAprobacionConsejoDep method, of class Proyecto.
     */
    @Test
    public void testGetFechaActaAprobacionConsejoDep() {
        System.out.println("getFechaActaAprobacionConsejoDep");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaActaAprobacionConsejoDep();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaActaAprobacionConsejoDep method, of class Proyecto.
     */
    @Test
    public void testSetFechaActaAprobacionConsejoDep() {
        System.out.println("setFechaActaAprobacionConsejoDep");
        Date fechaActaAprobacionConsejoDep = null;
        Proyecto instance = new Proyecto();
        instance.setFechaActaAprobacionConsejoDep(fechaActaAprobacionConsejoDep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreDocAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetNombreDocAprobacionVicerrectorado() {
        System.out.println("getNombreDocAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getNombreDocAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreDocAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testSetNombreDocAprobacionVicerrectorado() {
        System.out.println("setNombreDocAprobacionVicerrectorado");
        String nombreDocAprobacionVicerrectorado = "";
        Proyecto instance = new Proyecto();
        instance.setNombreDocAprobacionVicerrectorado(nombreDocAprobacionVicerrectorado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrlDocAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetUrlDocAprobacionVicerrectorado() {
        System.out.println("getUrlDocAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getUrlDocAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUrlDocAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testSetUrlDocAprobacionVicerrectorado() {
        System.out.println("setUrlDocAprobacionVicerrectorado");
        String urlDocAprobacionVicerrectorado = "";
        Proyecto instance = new Proyecto();
        instance.setUrlDocAprobacionVicerrectorado(urlDocAprobacionVicerrectorado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroActaAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetNroActaAprobacionVicerrectorado() {
        System.out.println("getNroActaAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getNroActaAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNroActaAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testSetNroActaAprobacionVicerrectorado() {
        System.out.println("setNroActaAprobacionVicerrectorado");
        String nroActaAprobacionVicerrectorado = "";
        Proyecto instance = new Proyecto();
        instance.setNroActaAprobacionVicerrectorado(nroActaAprobacionVicerrectorado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaActaAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetFechaActaAprobacionVicerrectorado() {
        System.out.println("getFechaActaAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaActaAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaActaAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testSetFechaActaAprobacionVicerrectorado() {
        System.out.println("setFechaActaAprobacionVicerrectorado");
        Date fechaActaAprobacionVicerrectorado = null;
        Proyecto instance = new Proyecto();
        instance.setFechaActaAprobacionVicerrectorado(fechaActaAprobacionVicerrectorado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUrlFinalDocAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetUrlFinalDocAprobacionVicerrectorado() {
        System.out.println("getUrlFinalDocAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getUrlFinalDocAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNroActaAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testGetNroActaAprobacionConsejoAcademico() {
        System.out.println("getNroActaAprobacionConsejoAcademico");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getNroActaAprobacionConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNroActaAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testSetNroActaAprobacionConsejoAcademico() {
        System.out.println("setNroActaAprobacionConsejoAcademico");
        String nroActaAprobacionConsejoAcademico = "";
        Proyecto instance = new Proyecto();
        instance.setNroActaAprobacionConsejoAcademico(nroActaAprobacionConsejoAcademico);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCartaCompromisoComunidadUrl method, of class Proyecto.
     */
    @Test
    public void testGetCartaCompromisoComunidadUrl() {
        System.out.println("getCartaCompromisoComunidadUrl");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCartaCompromisoComunidadUrl();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCartaCompromisoComunidadUrl method, of class Proyecto.
     */
    @Test
    public void testSetCartaCompromisoComunidadUrl() {
        System.out.println("setCartaCompromisoComunidadUrl");
        String cartaCompromisoComunidadUrl = "";
        Proyecto instance = new Proyecto();
        instance.setCartaCompromisoComunidadUrl(cartaCompromisoComunidadUrl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCartaCompromisoComunidadNombre method, of class Proyecto.
     */
    @Test
    public void testGetCartaCompromisoComunidadNombre() {
        System.out.println("getCartaCompromisoComunidadNombre");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCartaCompromisoComunidadNombre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCartaCompromisoComunidadNombre method, of class Proyecto.
     */
    @Test
    public void testSetCartaCompromisoComunidadNombre() {
        System.out.println("setCartaCompromisoComunidadNombre");
        String cartaCompromisoComunidadNombre = "";
        Proyecto instance = new Proyecto();
        instance.setCartaCompromisoComunidadNombre(cartaCompromisoComunidadNombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCartaCompromisoComunidadUrlFinal method, of class Proyecto.
     */
    @Test
    public void testGetCartaCompromisoComunidadUrlFinal() {
        System.out.println("getCartaCompromisoComunidadUrlFinal");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getCartaCompromisoComunidadUrlFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFinalizacioEjecucion method, of class Proyecto.
     */
    @Test
    public void testGetFechaFinalizacioEjecucion() {
        System.out.println("getFechaFinalizacioEjecucion");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaFinalizacioEjecucion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFinalizacioEjecucion method, of class Proyecto.
     */
    @Test
    public void testSetFechaFinalizacioEjecucion() {
        System.out.println("setFechaFinalizacioEjecucion");
        Date fechaFinalizacioEjecucion = null;
        Proyecto instance = new Proyecto();
        instance.setFechaFinalizacioEjecucion(fechaFinalizacioEjecucion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaMaximaCorreccion method, of class Proyecto.
     */
    @Test
    public void testGetFechaMaximaCorreccion() {
        System.out.println("getFechaMaximaCorreccion");
        Proyecto instance = new Proyecto();
        Date expResult = null;
        Date result = instance.getFechaMaximaCorreccion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaMaximaCorreccion method, of class Proyecto.
     */
    @Test
    public void testSetFechaMaximaCorreccion() {
        System.out.println("setFechaMaximaCorreccion");
        Date fechaMaximaCorreccion = null;
        Proyecto instance = new Proyecto();
        instance.setFechaMaximaCorreccion(fechaMaximaCorreccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecuencial method, of class Proyecto.
     */
    @Test
    public void testGetSecuencial() {
        System.out.println("getSecuencial");
        Proyecto instance = new Proyecto();
        Integer expResult = null;
        Integer result = instance.getSecuencial();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecuencial method, of class Proyecto.
     */
    @Test
    public void testSetSecuencial() {
        System.out.println("setSecuencial");
        Integer secuencial = null;
        Proyecto instance = new Proyecto();
        instance.setSecuencial(secuencial);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testVerificarEvaluacionFinal() {
        System.out.println("verificarEvaluacionFinal");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.verificarEvaluacionFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Proyecto.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Proyecto instance = new Proyecto();
        SeaParametrosDet expResult = null;
        SeaParametrosDet result = instance.getEstado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Proyecto.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        SeaParametrosDet estado = null;
        Proyecto instance = new Proyecto();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoIngresoPerfil method, of class Proyecto.
     */
    @Test
    public void testIsEstadoIngresoPerfil() {
        System.out.println("isEstadoIngresoPerfil");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoIngresoPerfil();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoEnviadoRevision method, of class Proyecto.
     */
    @Test
    public void testIsEstadoEnviadoRevision() {
        System.out.println("isEstadoEnviadoRevision");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoEnviadoRevision();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoEnCalificacionComision method, of class Proyecto.
     */
    @Test
    public void testIsEstadoEnCalificacionComision() {
        System.out.println("isEstadoEnCalificacionComision");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoEnCalificacionComision();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoEnConsolidacionCalificacionComision method, of class Proyecto.
     */
    @Test
    public void testIsEstadoEnConsolidacionCalificacionComision() {
        System.out.println("isEstadoEnConsolidacionCalificacionComision");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoEnConsolidacionCalificacionComision();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoNoAprobadoComision method, of class Proyecto.
     */
    @Test
    public void testIsEstadoNoAprobadoComision() {
        System.out.println("isEstadoNoAprobadoComision");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoNoAprobadoComision();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testIsEstadoAprobacionVicerrectorado() {
        System.out.println("isEstadoAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoNoAprobadoVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testIsEstadoNoAprobadoVicerrectorado() {
        System.out.println("isEstadoNoAprobadoVicerrectorado");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoNoAprobadoVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoAprobacionConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testIsEstadoAprobacionConsejoAcademico() {
        System.out.println("isEstadoAprobacionConsejoAcademico");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoAprobacionConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoNoAprobadoConsejoAcademico method, of class Proyecto.
     */
    @Test
    public void testIsEstadoNoAprobadoConsejoAcademico() {
        System.out.println("isEstadoNoAprobadoConsejoAcademico");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoNoAprobadoConsejoAcademico();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoEjecucion method, of class Proyecto.
     */
    @Test
    public void testIsEstadoEjecucion() {
        System.out.println("isEstadoEjecucion");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoEjecucion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoCierre method, of class Proyecto.
     */
    @Test
    public void testIsEstadoCierre() {
        System.out.println("isEstadoCierre");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoCierre();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoEvaluacionFinal method, of class Proyecto.
     */
    @Test
    public void testIsEstadoEvaluacionFinal() {
        System.out.println("isEstadoEvaluacionFinal");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoEvaluacionFinal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEstadoFinalizado method, of class Proyecto.
     */
    @Test
    public void testIsEstadoFinalizado() {
        System.out.println("isEstadoFinalizado");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isEstadoFinalizado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCobertura2 method, of class Proyecto.
     */
    @Test
    public void testGetCobertura2() {
        System.out.println("getCobertura2");
        Proyecto instance = new Proyecto();
        SeaParametrosDet expResult = null;
        SeaParametrosDet result = instance.getCobertura2();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCobertura2 method, of class Proyecto.
     */
    @Test
    public void testSetCobertura2() {
        System.out.println("setCobertura2");
        SeaParametrosDet cobertura2 = null;
        Proyecto instance = new Proyecto();
        instance.setCobertura2(cobertura2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCoberturaNacional method, of class Proyecto.
     */
    @Test
    public void testIsCoberturaNacional() {
        System.out.println("isCoberturaNacional");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isCoberturaNacional();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCoberturaProvincial method, of class Proyecto.
     */
    @Test
    public void testIsCoberturaProvincial() {
        System.out.println("isCoberturaProvincial");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isCoberturaProvincial();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCoberturaCantonal method, of class Proyecto.
     */
    @Test
    public void testIsCoberturaCantonal() {
        System.out.println("isCoberturaCantonal");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isCoberturaCantonal();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCoberturaParroquial method, of class Proyecto.
     */
    @Test
    public void testIsCoberturaParroquial() {
        System.out.println("isCoberturaParroquial");
        Proyecto instance = new Proyecto();
        boolean expResult = false;
        boolean result = instance.isCoberturaParroquial();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActaAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetActaAprobacionVicerrectorado() {
        System.out.println("getActaAprobacionVicerrectorado");
        Proyecto instance = new Proyecto();
        ActaAprobacionVicerrectorado expResult = null;
        ActaAprobacionVicerrectorado result = instance.getActaAprobacionVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActaAprobacionVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testSetActaAprobacionVicerrectorado() {
        System.out.println("setActaAprobacionVicerrectorado");
        ActaAprobacionVicerrectorado actaAprobacionVicerrectorado = null;
        Proyecto instance = new Proyecto();
        instance.setActaAprobacionVicerrectorado(actaAprobacionVicerrectorado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAprobadoVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetAprobadoVicerrectorado() {
        System.out.println("getAprobadoVicerrectorado");
        Proyecto instance = new Proyecto();
        Long expResult = null;
        Long result = instance.getAprobadoVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAprobadoVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testSetAprobadoVicerrectorado() {
        System.out.println("setAprobadoVicerrectorado");
        Long aprobadoVicerrectorado = null;
        Proyecto instance = new Proyecto();
        instance.setAprobadoVicerrectorado(aprobadoVicerrectorado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstadoAprobVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testGetEstadoAprobVicerrectorado() {
        System.out.println("getEstadoAprobVicerrectorado");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getEstadoAprobVicerrectorado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstadoAprobVicerrectorado method, of class Proyecto.
     */
    @Test
    public void testSetEstadoAprobVicerrectorado() {
        System.out.println("setEstadoAprobVicerrectorado");
        String estadoAprobVicerrectorado = "";
        Proyecto instance = new Proyecto();
        instance.setEstadoAprobVicerrectorado(estadoAprobVicerrectorado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEfectoEsperado method, of class Proyecto.
     */
    @Test
    public void testGetEfectoEsperado() {
        System.out.println("getEfectoEsperado");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getEfectoEsperado();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEfectoEsperado method, of class Proyecto.
     */
    @Test
    public void testSetEfectoEsperado() {
        System.out.println("setEfectoEsperado");
        String efectoEsperado = "";
        Proyecto instance = new Proyecto();
        instance.setEfectoEsperado(efectoEsperado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImpactoEsperadoList method, of class Proyecto.
     */
    @Test
    public void testGetImpactoEsperadoList() {
        System.out.println("getImpactoEsperadoList");
        Proyecto instance = new Proyecto();
        List expResult = null;
        List result = instance.getImpactoEsperadoList();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImpactoEsperadoList method, of class Proyecto.
     */
    @Test
    public void testSetImpactoEsperadoList() {
        System.out.println("setImpactoEsperadoList");
        List<ImpactoEsperado> impactoEsperadoList = null;
        Proyecto instance = new Proyecto();
        instance.setImpactoEsperadoList(impactoEsperadoList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
