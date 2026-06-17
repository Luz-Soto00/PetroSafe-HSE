package mx.uv.petrosafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaración de las variables para los componentes de la interfaz
    private EditText etUsuario, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculación de las variables con los IDs del XML
        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);
    }

    // Método para el botón de Supervisor
    public void accesoSupervisor(View view) {
        if (validarCampos()) {
            Intent i = new Intent(this, SupervisorDashboard.class);
            startActivity(i);
        }
    }

    // Método para el botón de Trabajador con lógica de puestos
    public void accesoTrabajador(View view) {
        if (validarCampos()) {
            String usuarioInput = etUsuario.getText().toString().trim();
            String usuarioComparar = usuarioInput.toLowerCase();

            Intent i = new Intent(this, OperadorDashboard.class);
            i.putExtra("USER_NAME", usuarioInput);

            // Lógica para el equipo de PetroSafe
            if (usuarioComparar.equals("veraperez")) {
                i.putExtra("USER_JOB", "Arquitecto de Software / Programador");
            } else if (usuarioComparar.equals("sotoleon")) {
                i.putExtra("USER_JOB", "Diseñador / Responsable");
            } else if (usuarioComparar.equals("lopeztuchi")) {
                i.putExtra("USER_JOB", "Ingeniero de Requisitos y Pruebas");
            } else if (usuarioComparar.equals("treviñopeña")) {
                i.putExtra("USER_JOB", "Administrador del Proyecto");
            } else {
                i.putExtra("USER_JOB", "Personal Operativo");
            }

            startActivity(i);
        }
    }

    // Función para validar que los campos no estén vacíos
    private boolean validarCampos() {
        String u = etUsuario.getText().toString();
        String p = etPassword.getText().toString();

        if (u.isEmpty() || p.isEmpty()) {
            Toast.makeText(this, "Por favor, ingrese usuario y contraseña", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}