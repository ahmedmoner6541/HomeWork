package com.alyndroid.architecturepatternstutorialshomework.db;

import com.alyndroid.architecturepatternstutorialshomework.NumberModel;

public class DataBase {
    public NumberModel getNumbers(){
        return new NumberModel(4, 2);
    }
}
