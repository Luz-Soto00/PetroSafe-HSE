package mx.uv.petrosafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class RiesgosFragment extends Fragment {

    private Spinner spinnerZonas;
    private TextView tvDetalleRiesgos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_riesgos, container, false);

        spinnerZonas = view.findViewById(R.id.spinnerZonas);
        tvDetalleRiesgos = view.findViewById(R.id.tvDetalleRiesgos);

        // Opciones del Spinner (Idénticas a tu ComboBox)
        String[] opciones = {
                "Seleccione Zona...",
                "Plataforma de Perforación",
                "Área de Almacenamiento",
                "Taller de Mantenimiento"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_dropdown_item, opciones);
        spinnerZonas.setAdapter(adapter);

        // Lógica de selección idéntica a cmbZonasActionPerformed
        spinnerZonas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String zona = opciones[position];

                switch (zona) {
                    case "Plataforma de Perforación":
                        tvDetalleRiesgos.setText("RIESGOS DETECTADOS EN PLATAFORMA:\n\n"
                                + "• 1. Explosión por presencia de gas grisú o sulfhídrico.\n"
                                + "• 2. Caídas a diferente nivel (Trabajo en altura).\n"
                                + "• 3. Atrapamiento por maquinaria rotativa (Malacates).");
                        break;

                    case "Área de Almacenamiento":
                        tvDetalleRiesgos.setText("RIESGOS DETECTADOS EN ALMACÉN:\n\n"
                                + "• 1. Incendio por sustancias inflamables.\n"
                                + "• 2. Derrame de químicos peligrosos.\n"
                                + "• 3. Golpes por caída de objetos estibados.");
                        break;

                    case "Taller de Mantenimiento":
                        tvDetalleRiesgos.setText("RIESGOS DETECTADOS EN TALLER:\n\n"
                                + "• 1. Proyección de partículas (Esmerilado).\n"
                                + "• 2. Choque eléctrico por cables dañados.\n"
                                + "• 3. Ruido excesivo (Hipoacusia).");
                        break;

                    default:
                        tvDetalleRiesgos.setText("Seleccione una zona de trabajo para desplegar el mapa de riesgos.");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        return view;
    }
}