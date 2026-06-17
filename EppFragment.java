package mx.uv.petrosafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

public class EppFragment extends Fragment {

    private CheckBox chkCasco, chkGuantes, chkBotas, chkLentes;
    private Button btnVerificar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_epp, container, false);

        chkCasco = view.findViewById(R.id.chkCasco);
        chkGuantes = view.findViewById(R.id.chkGuantes);
        chkBotas = view.findViewById(R.id.chkBotas);
        chkLentes = view.findViewById(R.id.chkLentes);
        btnVerificar = view.findViewById(R.id.btnVerificarEPP);

        btnVerificar.setOnClickListener(v -> {
            String faltante = "";

            // Validación idéntica a tu código original
            if (!chkCasco.isChecked()) faltante += "- Casco de seguridad\n";
            if (!chkGuantes.isChecked()) faltante += "- Guantes de protección\n";
            if (!chkBotas.isChecked()) faltante += "- Botas dieléctricas\n";
            if (!chkLentes.isChecked()) faltante += "- Lentes de seguridad\n";

            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

            if (faltante.isEmpty()) {
                builder.setTitle("Validación HSE")
                        .setMessage("¡Equipo Completo!\nPuede proceder a su área de trabajo.")
                        .setPositiveButton("OK", null)
                        .show();
            } else {
                builder.setTitle("Alerta de Seguridad")
                        .setMessage("ATENCIÓN: Le falta el siguiente equipo:\n" + faltante)
                        .setPositiveButton("OK", null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        });

        return view;
    }
}