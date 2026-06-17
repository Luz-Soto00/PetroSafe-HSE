/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.hse.pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Armandito
 */

public class IntegracionSistemasTestTest {
    private IntegracionSistemasTest instance;
    public IntegracionSistemasTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new IntegracionSistemasTest();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class IntegracionSistemasTest.
     */
    @Test
    public void testMain() {
        System.out.println("\n============================ MAIN ===================================");
        String[] args = {};
        IntegracionSistemasTest.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    //--------------------------------------------------------------------------------------------
    // SECCIÓN B: PRUEBAS DE INTEGRACIÓN (Conexión de Módulos)
    //--------------------------------------------------------------------------------------------
@Test
public void testEscenarioRiesgoExtremo() {
    System.out.println("Escenario: Fuga detectada -> Notificacion API");
    
    // 1. Simular entrada de datos (Capa Datos)
    float lecturaPeligrosa = 95.0f; 
    
    // 2. Procesar en Negocio
    boolean alertaActivada = instance.verificarYNotificar(lecturaPeligrosa);
    
    // 3. Validar que el flujo completo resultó en una alerta
    assertTrue("El sistema debio activar la alerta para 95.0", alertaActivada);
}
//--------------------------------------------------------------------------------------
// SECCIÓN C: PRUEBAS DE SISTEMA (Escenarios de Usuario)
//--------------------------------------------------------------------------------------
@Test
public void testSistemaBajoCondicionExtrema() {
    System.out.println("\n--- PRUEBA DE SISTEMA: Escenario de Fuga Masiva ---");
    // Simulamos que el sensor manda el valor máximo posible
    float lecturaMaxima = 100.0f;
    
    // El sistema completo debe procesar esto sin romperse
    boolean resultado = instance.verificarYNotificar(lecturaMaxima);
    
    assertTrue("El sistema completo fallo al procesar una lectura maxima", resultado);
}
@Test
public void testSistemaEnOperacionNormal() {
    System.out.println("\n--- PRUEBA DE SISTEMA: Operacion Segura ---");
    // Valor por debajo del umbral de riesgo (70.0)
    float lecturaSegura = 45.5f;
    
    boolean resultado = instance.verificarYNotificar(lecturaSegura);
    
    assertFalse("El sistema activo una alerta erronea en condiciones seguras", resultado);
}
    /**
     * Test of verificarConexionConSensores method, of class IntegracionSistemasTest.
     */
//--------------------------------------------------------------
// SECCIÓN A: PRUEBAS TÉCNICAS (Lógica)
//--------------------------------------------------------------
    @Test
    public void testVerificarConexionConSensores() {
        System.out.println("Verificar Conexion Con Sensores");
        instance.verificarConexionConSensores();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verificarFlujoCompletoHaciaAPI method, of class IntegracionSistemasTest.
     */
    @Test
    public void testVerificarFlujoCompletoHaciaAPI() {
        System.out.println("Verificar Flujo Completo Hacia API");
        instance.verificarFlujoCompletoHaciaAPI();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
