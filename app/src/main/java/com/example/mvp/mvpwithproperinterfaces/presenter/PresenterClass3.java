package com.example.mvp.mvpwithproperinterfaces.presenter;

import com.example.mvp.mvpwithproperinterfaces.model.IModelClass3;
import com.example.mvp.mvpwithproperinterfaces.model.ModelClass3;
import com.example.mvp.mvpwithproperinterfaces.view.IMain3ActivityView;

public class PresenterClass3 implements IPresenterClass3{
    private IModelClass3 iModelClass3;
    private IMain3ActivityView iMain3ActivityView;

    //Constructor for initializing the interfaces
    public PresenterClass3(IMain3ActivityView iMain3ActivityView) {
        this.iMain3ActivityView = iMain3ActivityView;
        //Initializing the interface with the PresenterClass which implements the required methods
        //Here we are passing 'this' currentClass reference.
        //So that ModelClass3 can inform PresenterClass3 onJobDoneResult through this reference
        iModelClass3 = new ModelClass3(this);
    }

    //Main3Activity Class will call this Method through interface reference of this class
    @Override
    public void doSomeJob(){
        //calling the Model Class interface method which is implemented by ModelClass3.
        //So it's more or less same as calling the other class method through that class object.
        iModelClass3.processJob();
    }

    //Model Class will call this Method with the status of the Job
    @Override
    public void onJobDoneResult(String job) {
        //Upon receiving job status we are calling the Interface method of Main3Activity
        iMain3ActivityView.onTaskDone3(job);
    }
}
