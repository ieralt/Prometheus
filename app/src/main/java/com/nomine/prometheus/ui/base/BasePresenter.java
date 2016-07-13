package com.nomine.prometheus.ui.base;

import android.content.Context;

import rx.Subscription;

/**
 * 基础Presenter
 * Created by E Nomine on 2016/3/28.
 */
public abstract class BasePresenter<T extends IBaseView> {
    protected Subscription subscription;
    protected Context context;
    protected T iView;

    public BasePresenter(Context context, T iView) {
        this.context = context;
        this.iView = iView;
    }

    public void init(){
        iView.initView();
    }

    public abstract void release();

}
