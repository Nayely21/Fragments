package com.example.fragments.ui.sonidos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SonidosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SonidosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is sonidos fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}