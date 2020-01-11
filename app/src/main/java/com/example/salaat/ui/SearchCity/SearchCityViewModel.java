package com.example.salaat.ui.SearchCity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SearchCityViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SearchCityViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}