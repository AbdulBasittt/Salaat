package com.example.salaat.ui.calendar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ShareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}