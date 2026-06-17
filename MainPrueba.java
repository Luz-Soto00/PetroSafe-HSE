package com.hse.pruebas;

import com.hse.negocio.GestorSeguridad;
import com.hse.datos.AdaptadorSensores;

public class MainPrueba {
    public static void main(String[] args) {
        // Configuramos el sistema con un límite de 10 ppm
        GestorSeguridad sistema = new GestorSeguridad(10.0f);
        AdaptadorSensores sensor = new AdaptadorSensores();
        
        System.out.println("Iniciando Monitoreo de Obra...");
        
        // Simulamos 5 lecturas seguidas
        for (int i = 1; i <= 5; i++) {
            float dato = sensor.leerLecturaActual();
            System.out.println("\nLectura #" + i + ": " + dato + " ppm");
            
            int resultado = sistema.evaluarRiesgo(dato);
            
            switch(resultado) {
                case 2: System.out.println("ESTADO: [!] PELIGRO - API NOTIFICADA"); break;
                case 1: System.out.println("ESTADO: [?] PRECAUCION"); break;
                default: System.out.println("ESTADO: [✓] SEGURO"); break;
            }
        }
    }
}