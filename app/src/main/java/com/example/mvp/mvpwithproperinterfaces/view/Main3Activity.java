package com.example.mvp.mvpwithproperinterfaces.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mvp.R;
import com.example.mvp.mvpwithproperinterfaces.presenter.IPresenterClass3;
import com.example.mvp.mvpwithproperinterfaces.presenter.PresenterClass3;

public class Main3Activity extends AppCompatActivity implements IMain3ActivityView {
    IPresenterClass3 iPresenterClass3;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView3 = findViewById(R.id.textView3);
        //Initializing the interface with the PresenterClass which implements the required methods
        //Here we are passing 'this' currentClass reference.
        //So that presenter can inform Main3Activity onTaskDone through this reference
        iPresenterClass3 = new PresenterClass3(this);
        //calling the PresenterClass3 interface method
        iPresenterClass3.doSomeJob();
    }

    //Presenter will Call this Method
    @Override
    public void onTaskDone3(String job) {
        textView3.setText(job);
    }
}
