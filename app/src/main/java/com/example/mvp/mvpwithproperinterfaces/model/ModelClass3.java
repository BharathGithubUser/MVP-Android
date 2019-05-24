package com.example.mvp.mvpwithproperinterfaces.model;


import com.example.mvp.mvpwithproperinterfaces.presenter.IPresenterClass3;

public class ModelClass3 implements IModelClass3 {
    private IPresenterClass3 iPresenterClass3;
    private String Job;

    public ModelClass3(IPresenterClass3 iPresenterClass3) {
        this.iPresenterClass3 = iPresenterClass3;
    }

    //This interface method will be called by the PresenterClass3
    @Override
    public void processJob() {
        Job = "Successfully done the Job";
        //Upon doing the Job we are informing the PresenterClass3 with the result
        iPresenterClass3.onJobDoneResult(Job);
    }
}
