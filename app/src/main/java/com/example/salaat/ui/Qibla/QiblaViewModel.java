package com.example.salaat.ui.Qibla;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QiblaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QiblaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}