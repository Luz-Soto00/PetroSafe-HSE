# PetroSafe-HSE

**Sistema de monitoreo de gases H2S y gestión de EPP (Equipo de Proteción Personal) para seguridad en obras petroleras**.

## Descripción

PetroSafe-HSE es un sistema de software desarrollado en Android Studio usando el lenguaje de programación **Java** que permite:

- Monitorear en tiempo real concentraciones de gas **H2S** (sulfhídrico).
- Gestionar la entrega y caducidad de **Equipo de Protección Personal (EPP)**.
- Generar **Reportes semanales** de incidentes y riesgos.
- Validar el cumplimiento de **Normativas NOM-STPS**.
- Activar **alertas de emergencia** ante niveles críticos de gas.

---

## Objetivos

1. Garantizar la integridad física del personal en obras petroleras.
2. Automatizar el monitoreo de agentes críticos (H2S).
3. Auditar el uso correcto del Equipo de Protección Personal (EPP).
4. Cumplir con los estándares de seguridad industrial.

---

## Requisitos del sistema

| Requisito | Versión / Especificación |
| :--- | :--- |
| **Java** | 11 o superior |
| **NetBeans IDE** | 12.0 o superior (Recomendado) |
| **Android Studio** | Para el despliegue de su uso en móviles (2025.3.3 o superior)|
| **Git** | Última versión estable (2.54.0 o superior) |
| **Sistema Operativo** | Windows / Linux / macOS / Android |
| **Memoria RAM** | 4 GB mínimo |
| **Espacio en disco** | 500 MB |

---

## Instalación y ejecución 

### 1. Clonar el repositorio
Abre tu Git Bash o terminal (se puede utilizar Visual Studio Code) y ejecuta:

```bash
git clone https://github.com/Luz-Soto00/PetroSafe-HSE.git
cd PetroSafe-HSE
```

### 2. Configuración del entorno de desarrollo
1. Abre **NetBeans IDE** o **Android Studio** según el módulo a revisar.
2. Selecciona `File -> Open Project` y busca la carpeta raíz del proyecto clonado.
3. Deja que el **IDE** cargue las dependencias y configure el entorno basado en Gradle/Java.

### 3. Ejecución de la Suite de Pruebas (NetBeans)
Para validar el sistema con JUnit:
1. Haz clic derecho sobre el proyecto en NetBeans.
2. Selecciona **Test** (o presiona `Alt + F6`).
3. El sistema ejecutará las pruebas automatizadas (Secciones A, B y C) mostrando el **100% de aprobación** =)!

---

## Estructura de directorios

```text
PetroSafe-HSE/
├── app/
│   └── src/
│       └── main/
│           └── java/mx/uv/petrosafe/
│               ├── interfaz/               # Módulo 1: Vistas y UI (LoginActivity, MainActivity)
│               ├── seguridad/              # Módulo 2: Gestor de Seguridad (EppFragment, Normas)
│               ├── sensores/               # Módulo 3: Sensores y Ventana de Trabajador/es (Dashboard)
│               └── reportes/               # Módulo 4: Reportes y Alertas de Riesgos (RiesgosFragment)
├── test/                                   # Módulo 5: Suite de Pruebas Unitarias e Integración (JUnit)
│   ├── MainPrueba.java
│   ├── IntegracionSistemasTest.java
│   └── IntegracionSistemasTestTest.java
├── .gitignore                              # Archivos y dependencias ignoradas por Git
└── README.md                               # Documentación principal del proyecto
```

---

## Licencia y Autores

Proyecto de desarrollo  de software colaborativo bajo el marco académico de la **Universidad Veracruzana**  de la carrera de Ingeniería en Tecnologías Computacionales por el Ingeniero **Olmedo García Luis Fernando** siguiendo un flujo de trabajo rápido y continuo con **Github Flow**.

* **José Leonardo Vera Pérez** (`emmaleolup-sudo`)- *Módulo 1: Interfaz y Vistas*
* **Luz Adriana Soto León** (`Luz-Soto00`) - *Módulo 2 y 4: Gestor de Seguridad y Reportes y Alertas de Riesgos*
* **Fernanda Treviño Peña** (`Fernanda-28`) - *Módulo 3: Sensores y Ventana de Trabajador/es*
* **Armando Ernesto López Pattatuchi** (`ArmandoLopez18`) - *Módulo 5: Pruebas Automatizadas con JUnit*


---
```
Este proyecto es de uso educativo y privado para la gestión de seguridad industrial.
```
