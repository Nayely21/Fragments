package com.example.fragments.ui.abriraplicaciones;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AbrirAplicacionesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AbrirAplicacionesViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}