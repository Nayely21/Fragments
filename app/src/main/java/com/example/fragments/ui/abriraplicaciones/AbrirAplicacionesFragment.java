package com.example.fragments.ui.abriraplicaciones;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.fragments.databinding.FragmentAbriraplicacionesBinding;
import com.example.fragments.ui.abriraplicaciones.AbrirAplicacionesViewModel;

public class AbrirAplicacionesFragment extends Fragment {

    private FragmentAbriraplicacionesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AbrirAplicacionesViewModel abriraplicacionesViewModel =
                new ViewModelProvider(this).get(AbrirAplicacionesViewModel.class);

        binding = FragmentAbriraplicacionesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageButton galeria = binding.galeria;
        final ImageButton calendario = binding.calendario;
        final ImageButton mensajes = binding.mensajes;
        final ImageButton alarma = binding.alarma;

        galeria.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent galeria = getActivity().getPackageManager().getLaunchIntentForPackage("com.sec.android.gallery3d"); startActivity(galeria); }});
        calendario.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent calendario = getActivity().getPackageManager().getLaunchIntentForPackage("com.samsung.android.calendar"); startActivity(calendario); }});
        mensajes.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent mensajes = getActivity().getPackageManager().getLaunchIntentForPackage("com.samsung.android.messaging"); startActivity(mensajes); }});
        alarma.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) { Intent alarma = getActivity().getPackageManager().getLaunchIntentForPackage("com.sec.android.app.clockpackage"); startActivity(alarma); }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}