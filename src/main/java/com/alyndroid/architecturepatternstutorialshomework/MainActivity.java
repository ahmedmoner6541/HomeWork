package com.alyndroid.architecturepatternstutorialshomework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alyndroid.architecturepatternstutorialshomework.db.DataBase;
import com.alyndroid.architecturepatternstutorialshomework.ui.NumberViewModel;
import com.alyndroid.architecturepatternstutorialshomework.persenter.NumberPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, NumberView {

public NumberViewModel numberViewModel;
    NumberPresenter presenter;
    @BindView(R.id.plus_button)
    Button plusButton;
    @BindView(R.id.mul_button)
    Button mulButton;
    @BindView(R.id.div_button)
    Button divButton;
    @BindView(R.id.mul_result_textView)
    TextView mulResultTextView;
    @BindView(R.id.plus_result_textView)
    TextView plusResultTextView;
    @BindView(R.id.div_result_textView)
    TextView divResultTextView;
    @BindView(R.id.textView4)
    TextView textView4;
    @BindView(R.id.textView5)
    TextView textView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mulResultTextView.setVisibility(View.GONE);
        divResultTextView.setVisibility(View.GONE);
        plusResultTextView.setVisibility(View.GONE);

        plusButton.setOnClickListener(this);
        divButton.setOnClickListener(this);
        mulButton.setOnClickListener(this);

        presenter = new NumberPresenter(this);
        ////////////////            MVVM      //////////////////////////////////////
        numberViewModel = ViewModelProviders.of(this).get(NumberViewModel.class);
        numberViewModel.mutableLiveData.observe(this, new Observer<String  >() {
            @Override
            public void onChanged(String milt_result) {
                mulResultTextView.setText(milt_result);
            }
        });
    }
    ////////////////            MVC      //////////////////////////////////////
    public void getPlusResult() {
        DataBase dataBase = new DataBase();
        NumberModel numbers = dataBase.getNumbers();
        int firstNum = numbers.getFirstNum();
        int secondNum = numbers.getSecondNum();
        int resultPlus = firstNum + secondNum;
        plusResultTextView.setText(String.valueOf(resultPlus));
    }
    ////////////////           MVP     //////////////////////////////////////
    @Override
    public void OnGetDivNumber(int result_Div) {
        divResultTextView.setText(String.valueOf(result_Div));

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.plus_button:
                getPlusResult();
                plusResultTextView.setVisibility(View.VISIBLE);
                mulResultTextView.setVisibility(View.INVISIBLE);
                divResultTextView.setVisibility(View.INVISIBLE);
                break;
            case R.id.div_button:
                presenter.getsum();
                divResultTextView.setVisibility(View.VISIBLE);
                mulResultTextView.setVisibility(View.INVISIBLE);
                plusResultTextView.setVisibility(View.INVISIBLE);

                break;
            case R.id.mul_button:
                numberViewModel.getNumer();
                mulResultTextView.setVisibility(View.VISIBLE);
                divResultTextView.setVisibility(View.INVISIBLE);
                plusResultTextView.setVisibility(View.INVISIBLE);
                break;


        }
    }


}

