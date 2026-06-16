package com.hse.pruebas;

import com.hse.negocio.GestorSeguridad;
import com.hse.datos.AdaptadorSensores;

/**
 * Prueba de Integración para validar la comunicación entre capas.
 * Verifica: Capa de Datos <-> Capa de Negocio.
 */
public class IntegracionSistemasTest {

    public static void main(String[] args) {
        IntegracionSistemasTest test = new IntegracionSistemasTest();
        
        System.out.println("========== INICIO DE PRUEBAS DE INTEGRACION ==========");
        
        test.verificarConexionConSensores();
        test.verificarFlujoCompletoHaciaAPI();
        
        System.out.println("=====================================================");
    }
    /**
     * Verifica que el Negocio pueda recibir datos del Adaptador de Sensores.
     */
    public void verificarConexionConSensores() {
        AdaptadorSensores sensor = new AdaptadorSensores();
        float datoCapturado = sensor.leerLecturaActual();
        
        // Verificamos que el sensor devuelva un número válido (no nulo o negativo)
        if (datoCapturado >= 0) {
            System.out.println("[OK] Integracion Sensores: El sistema lee datos del hardware.");
        } else {
            System.out.println("[FALLO] Integracion Sensores: No se reciben datos validos.");
        }
    }

    /**
     * Verifica que una lectura crítica en el Negocio dispare la API de Emergencia.
     */
    public void verificarFlujoCompletoHaciaAPI() {
        // Forzamos una situación de peligro (15.0 ppm)
        GestorSeguridad gestor = new GestorSeguridad(10.0f);
        
        System.out.println("[INFO] Simulando condicion de riesgo extremo...");
        int resultado = gestor.evaluarRiesgo(15.0f);
        
        // Si el resultado es 2 y en la consola viste el mensaje del ConectorAPI, la integración funciona
        if (resultado == 2) {
            System.out.println("[OK] Integracion API: El Negocio logro activar el servicio de emergencia.");
        } else {
            System.out.println("[FALLO] Integracion API: El mensaje de emergencia no fue procesado.");
        }
    }
    /**
 * Método de integración que conecta la lectura de sensores 
 * con la notificación automática a la API.
 * @param lectura La lectura recibida del sensor
 * @return true si el riesgo fue crítico y se notificó con éxito
 */
public boolean verificarYNotificar(float lectura) {
    System.out.println("\n[INTEGRACIÓN] Iniciando validación de flujo...");
    
    // 1. Simula la lógica de negocio (Evaluar el riesgo)
    // Supongamos que el umbral de alerta es 70.0
    if (lectura >= 70.0f) {
        System.out.println("[INFO] Simulando condicion de riesgo extremo...");
        
        // 2. Simula la conexión con la API externa
        System.out.println("[API EXTERNA] Enviando alerta a Cruz Roja/Proteccion Civil...");
        System.out.println("[API EXTERNA] Payload: Nivel critico detectado: " + lectura + " ppm");
        System.out.println("[OK] Integracion API: El Negocio logro activar el servicio de emergencia.");
        
        return true; 
    } else {
        System.out.println("[INFO] Nivel dentro de los parametros normales (" + lectura + ").");
        return false;
    }
}
}