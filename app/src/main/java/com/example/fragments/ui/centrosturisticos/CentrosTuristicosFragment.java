package com.example.fragments.ui.centrosturisticos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.fragments.ui.centrosturisticos.CentrosTuristicosFragment;
import com.example.fragments.databinding.FragmentCentrosturisticosBinding;

public class CentrosTuristicosFragment extends Fragment {

    private FragmentCentrosturisticosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        CentrosTuristicosViewModel centrosTuristicosViewModel =
                new ViewModelProvider(this).get(CentrosTuristicosViewModel.class);

        binding = FragmentCentrosturisticosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}