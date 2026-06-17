package mx.uv.petrosafe;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView; // REVISA QUE ESTA LÍNEA ESTÉ PRESENTE
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class OperadorDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operador_dashboard);

        // 1. Recibir los datos del Intent (Login)
        String nombreRecibido = getIntent().getStringExtra("USER_NAME");
        String puestoRecibido = getIntent().getStringExtra("USER_JOB");

        // 2. Vincular con los IDs del XML
        TextView tvNombre = findViewById(R.id.tvNombrePerfil);
        TextView tvPuesto = findViewById(R.id.tvPuestoPerfil);

        // 3. Asignar valores
        if (nombreRecibido != null) {
            tvNombre.setText(nombreRecibido);
        }

        if (puestoRecibido != null) {
            tvPuesto.setText("Puesto: " + puestoRecibido);
        }

        // Configuración del menú
        BottomNavigationView nav = findViewById(R.id.worker_nav);
        nav.setOnNavigationItemSelectedListener(item -> {
            Fragment f = null;
            int id = item.getItemId();

            if (id == R.id.nav_perfil) {
                Fragment current = getSupportFragmentManager().findFragmentById(R.id.container_worker);
                if (current != null) {
                    getSupportFragmentManager().beginTransaction().remove(current).commit();
                }
                return true;
            }

            if (id == R.id.nav_normas) f = new NormasFragment();
            else if (id == R.id.nav_epp) f = new EppFragment();
            else if (id == R.id.nav_riesgos) f = new RiesgosFragment();
            else if (id == R.id.nav_emergencias) f = new EmergenciasFragment();

            if (f != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container_worker, f).commit();
            }
            return true;
        });
    }

    public void salirLogin(View v) {
        finish();
    }
}