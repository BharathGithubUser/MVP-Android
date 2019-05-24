package com.example.mvp.mvpwithsomeinterface.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mvp.R;
import com.example.mvp.mvpwithsomeinterface.presenter.PresenterClass2;

public class Main2Activity extends AppCompatActivity implements IMain2ActivityView {
    private PresenterClass2 presenterClass2;
    TextView textView;
    IMain2ActivityView iMain2ActivityView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView2);
        //The above textView will be alive only if we pass the interface reference as this
        presenterClass2 = new PresenterClass2(this);
        presenterClass2.doSomeJob2();
        //This Callback is not Called
        iMain2ActivityView = new IMain2ActivityView() {
            @Override
            public void onTaskCompleted(String jobStatus) {
                textView.setText(jobStatus);
            }
        };
    }

    @Override
    public void onTaskCompleted(String jobStatus) {
        //Here the textView doesn't becomes null as we have passed this as reference to Presenter2 Class
        textView.setText(jobStatus);
    }
}
