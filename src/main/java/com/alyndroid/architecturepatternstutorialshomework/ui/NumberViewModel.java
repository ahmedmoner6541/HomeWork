package com.alyndroid.architecturepatternstutorialshomework.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.alyndroid.architecturepatternstutorialshomework.NumberModel;
import com.alyndroid.architecturepatternstutorialshomework.db.DataBase;

public class NumberViewModel extends ViewModel {

    public MutableLiveData<String> mutableLiveData= new MutableLiveData<>();
    public void getNumer(){
        Integer numbers_mul = getPlusResultFremdatabase();//////String
        mutableLiveData.setValue(numbers_mul+"");
    }
    public int getPlusResultFremdatabase() {
        DataBase dataBase = new DataBase();
        NumberModel numbers = dataBase.getNumbers();
        int firstNum = numbers.getFirstNum();
        int secondNum = numbers.getSecondNum();
        int resultPlus = firstNum* secondNum;
        return resultPlus;
    }
}
