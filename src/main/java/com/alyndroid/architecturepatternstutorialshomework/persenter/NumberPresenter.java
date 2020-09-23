package com.alyndroid.architecturepatternstutorialshomework.persenter;

import com.alyndroid.architecturepatternstutorialshomework.MainActivity;
import com.alyndroid.architecturepatternstutorialshomework.NumberModel;
import com.alyndroid.architecturepatternstutorialshomework.NumberView;
import com.alyndroid.architecturepatternstutorialshomework.db.DataBase;

public class NumberPresenter {
    NumberView view;

    public NumberPresenter(MainActivity view) {
        this.view = view;
    }

    public int getPlusResultFremdatabase() {
        DataBase dataBase = new DataBase();
        NumberModel numbers = dataBase.getNumbers();
        int firstNum = numbers.getFirstNum();
        int secondNum = numbers.getSecondNum();
        int resultPlus = firstNum / secondNum;
        return resultPlus;
      }
      public void getsum(){
        view.OnGetDivNumber(getPlusResultFremdatabase());
      }
}
