## 🛠️ Guía de Instalación y Despliegue

Sigue estos pasos para configurar el entorno de desarrollo, compilar el proyecto e instalar la aplicación móvil **PetroSafe-HSE**.

---

### Paso 1: Requisitos Previos e Instalación de Herramientas
Antes de comenzar, asegúrate de tener instaladas las siguientes herramientas en tu computadora:

1. **Java Development Kit (JDK):** Versión 11 o superior.
2. **Android Studio:** Última versión estable (Ladybug o superior).
3. **Git:** Para la gestión del repositorio.

---

### Paso 2: Clonar el Repositorio y Abrir el Proyecto
Abre tu terminal o **Git Bash** y clona el proyecto en tu máquina local:
18. ```bash
19. git clone https://github.com/Luz-Soto00/PetroSafe-HSE.git
20. cd PetroSafe-HSE
21. ```
22. 2. Inicia **Android Studio**.
23. 3. En la pantalla de bienvenida, haz clic en **Open** (o ve a `File -> Open`).
4. Selecciona la carpeta **`app`** o la raíz del proyecto `PetroSafe-HSE` y haz clic en **OK**.
5. Espera a que **Gradle** termine de descargar las dependencias y sincronizar el proyecto (esto puede tomar un par de minutos en la primera carga).

---

### Paso 3: Configurar el Dispositivo de Pruebas
Tienes dos opciones para ejecutar y probar la aplicación:

#### Opción A: Usar el Emulador Virtual (AVD)
1. En Android Studio, abre el **Device Manager** (icono de celular en la barra superior derecha).
2. Haz clic en **Create Device**, selecciona un teléfono (ej. *Pixel 7*) y haz clic en *Next*.
3. Descarga una imagen de sistema recomendada (ej. *API 33 o superior*) y finaliza la creación.
4. Inicia el emulador dándole al botón de *Play*.

#### Opción B: Usar un Teléfono Físico (Recomendado para pruebas de sensores)
1. En tu teléfono Android, ve a `Ajustes -> Acerca del teléfono` y presiona 7 veces consecutivas **Número de compilación** para activar las *Opciones de desarrollador*.
2. Entra a *Opciones de desarrollador* y activa la **Depuración por USB**.
3. Conecta el teléfono a la computadora mediante un cable de datos. Al aparecer la ventana emergente en el celular, selecciona *Permitir depuración por USB*.

---

### Paso 4: Compilación y Ejecución
1. En la barra superior de Android Studio, verifica que tu dispositivo (físico o emulador) aparezca seleccionado en el menú desplegable.
2. Haz clic en el botón verde de **Run** (o presiona `Shift + F10`).
3. Android Studio compilará el proyecto y generará el archivo ejecutable. En un momento, la aplicación se abrirá automáticamente en la pantalla de *Login* de PetroSafe.

---

### 📦 Método Alternativo: Instalación Directa mediante APK
Si solo deseas probar la aplicación en un dispositivo físico sin necesidad de abrir el código fuente, el repositorio incluye el archivo ejecutable listo para usar:

1. Localiza el archivo **`PetroSafe.apk`** en la raíz del repositorio de GitHub.
2. Descárgalo directamente a la memoria de tu teléfono celular.
3. Abre el administrador de archivos de tu teléfono y ejecuta el archivo `.apk`.
4. Si el sistema lo solicita, autoriza la instalación desde *Fuentes desconocidas*.
5. ¡Listo! El icono de **PetroSafe-HSE** aparecerá en tu menú de aplicaciones.
