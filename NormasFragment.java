package mx.uv.petrosafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class NormasFragment extends Fragment {

    private ListView lvNormas;
    private TextView tvInfoNorma;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_normas, container, false);

        lvNormas = view.findViewById(R.id.lvNormas);
        tvInfoNorma = view.findViewById(R.id.tvInfoNorma);

        // Llenar la lista con las mismas normas de tu reporte [cite: 220, 224]
        String[] normas = {
                "NOM-033-STPS-2015",
                "NOM-018-STPS-2015",
                "NOM-005-STPS-2015",
                "NOM-001-STPS-2015",
                "NOM-009-STPS-2015"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, normas);
        lvNormas.setAdapter(adapter);

        // Lógica de selección idéntica a tu lstNormasValueChanged de NetBeans
        lvNormas.setOnItemClickListener((parent, v, position, id) -> {
            String seleccion = normas[position];

            if (seleccion.contains("033")) {
                tvInfoNorma.setText("=== NOM-033-STPS-2015 ===\n\n"
                        + "TEMA: Condiciones de seguridad para trabajos en ESPACIOS CONFINADOS.\n\n"
                        + "PUNTOS CLAVE:\n"
                        + "- Obligatorio medir niveles de oxígeno (19.5% - 23.5%).\n"
                        + "- Contar con un vigía capacitado fuera del espacio.\n"
                        + "- Plan de rescate y equipo de protección específico.");
            } else if (seleccion.contains("018")) {
                tvInfoNorma.setText("=== NOM-018-STPS-2015 ===\n\n"
                        + "TEMA: Sistema para la identificación de peligros por SUSTANCIAS QUÍMICAS.\n\n"
                        + "PUNTOS CLAVE:\n"
                        + "- Implementación del GHS.\n"
                        + "- Pictogramas de peligro obligatorios.\n"
                        + "- Disponibilidad de Hojas de Datos de Seguridad (HDS).");
            } else if (seleccion.contains("005")) {
                tvInfoNorma.setText("=== NOM-005-STPS-1998 ===\n\n"
                        + "TEMA: Manejo, transporte y almacenamiento de sustancias peligrosas.\n\n"
                        + "PUNTOS CLAVE:\n"
                        + "- Manual de primeros auxilios específico.\n"
                        + "- Instalación de regaderas y lavaojos de emergencia.\n"
                        + "- Programa de capacitación para manejo de explosivos.");
            } else if (seleccion.contains("001")) {
                tvInfoNorma.setText("=== NOM-001-STPS-2008 ===\n\n"
                        + "TEMA: Edificios, locales, instalaciones y áreas en los centros de trabajo.\n\n"
                        + "PUNTOS CLAVE:\n"
                        + "- Conservar en condiciones seguras techos, paredes y pisos.\n"
                        + "- Las áreas deben estar limpias y con orden.\n"
                        + "- Delimitación de áreas de paso.");
            } else if (seleccion.contains("009")) {
                tvInfoNorma.setText("=== NOM-009-STPS-2011 ===\n\n"
                        + "TEMA: Condiciones de seguridad para realizar TRABAJOS EN ALTURA.\n\n"
                        + "PUNTOS CLAVE:\n"
                        + "- Uso obligatorio de arnés de cuerpo completo.\n"
                        + "- Revisión de andamios antes de cada uso.\n"
                        + "- Instalar líneas de vida.");
            }
        });

        return view;
    }
}