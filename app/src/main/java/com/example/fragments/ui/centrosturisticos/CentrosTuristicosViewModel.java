package com.example.fragments.ui.centrosturisticos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CentrosTuristicosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CentrosTuristicosViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}