package com.example.mvp.mvpwithoutinterface.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mvp.R;
import com.example.mvp.mvpwithoutinterface.presenter.PresenterClass;

public class MainActivity extends AppCompatActivity {
    PresenterClass presenterClass;
    TextView textView;
    String jobStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        presenterClass = new PresenterClass(textView);
        presenterClass.doSomeJob();
    }
    public void onTaskDone(TextView textView,String jobStatus){
        textView.setText(jobStatus);
    }
}
