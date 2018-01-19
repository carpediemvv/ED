package com.carpediem.ed.base.presenter

import com.carpediem.ed.base.presenter.view.BaseView

/**
 * Created by carpediemvv on 2018/1/19.
 */
open class BasePresenter <T:BaseView>{
    lateinit var mVeiw:T
}