package com.example.fragments.ui.sonidos;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

//import com.example.app_040922_nd.R;
//import com.example.app_040922_nd.databinding.FragmentSonidosBinding;
import com.example.fragments.R;
import com.example.fragments.databinding.FragmentSonidosBinding;

public class SonidosFragment extends Fragment {

    private FragmentSonidosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SonidosViewModel sonidosViewModel =
                new ViewModelProvider(this).get(SonidosViewModel.class);

        binding = FragmentSonidosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final ImageButton sonido1 = binding.ibSonido1;
        final ImageButton sonido2 = binding.ibSonido2;
        final ImageButton sonido3 = binding.ibSonido3;
        final ImageButton sonido4 = binding.ibSonido4;
        final ImageButton sonido5 = binding.ibSonido5;
        final ImageButton sonido6 = binding.ibSonido6;
        final ImageButton sonido7 = binding.ibSonido7;
        final ImageButton sonido8 = binding.ibSonido8;
        final ImageButton sonido9 = binding.ibSonido9;
        final ImageButton sonido10= binding.ibSonido10;

        sonido1.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.owww);
            mp.start(); }
        });

        sonido2.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.drama);
            mp.start();
        }});

        sonido3.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.tambores);
            mp.start();
        }});
        sonido4.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.pato);
            mp.start();
        }});
        sonido5.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.run);
            mp.start();
        }});
        sonido6.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.asombrado);
            mp.start();
        }});
        sonido7.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.siu);
            mp.start();
        }});
        sonido8.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.tss);
            mp.start();
        }});
        sonido9.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.careles);
            mp.start();
        }});
        sonido10.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
            final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.iluminati);
            mp.start();
        }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}