package com.example.venadostest.ui.statistics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StaticViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StaticViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools Static");
    }

    public LiveData<String> getText() {
        return mText;
    }
}