package com.example.mvp.mvpwithoutinterface.presenter;

import android.widget.TextView;

import com.example.mvp.mvpwithoutinterface.model.ModelClass;
import com.example.mvp.mvpwithoutinterface.view.MainActivity;

public class PresenterClass {
    TextView textView;
    private ModelClass modelClass;
    private String job;
    private MainActivity mainActivity;
    public PresenterClass(TextView textView){
       this.textView = textView;
    }
    public void doSomeJob() {
        modelClass = new ModelClass();
        callModelClassForDoingTheJob();
        mainActivity = new MainActivity();
        mainActivity.onTaskDone(textView,job);
    }

    private void callModelClassForDoingTheJob(){
       job = modelClass.performTheJob();
    }

}
