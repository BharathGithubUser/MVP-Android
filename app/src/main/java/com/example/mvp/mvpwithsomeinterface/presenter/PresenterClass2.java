package com.example.mvp.mvpwithsomeinterface.presenter;

import com.example.mvp.mvpwithsomeinterface.model.ModelClass2;
import com.example.mvp.mvpwithsomeinterface.view.IMain2ActivityView;
import com.example.mvp.mvpwithsomeinterface.view.Main2Activity;

public class PresenterClass2 {
    private ModelClass2 modelClass;
    private IMain2ActivityView iMain2ActivityView;
    private String job;

    public PresenterClass2(IMain2ActivityView iMain2ActivityView) {
        this.iMain2ActivityView = iMain2ActivityView;
    }

    public void doSomeJob2() {
        modelClass = new ModelClass2();
//        iMain2ActivityView = new Main2Activity();
        callModelClassForDoingTheJob2();
    }

    private void callModelClassForDoingTheJob2() {
        job = modelClass.performTheJob2();
        iMain2ActivityView.onTaskCompleted(job);
    }
}
