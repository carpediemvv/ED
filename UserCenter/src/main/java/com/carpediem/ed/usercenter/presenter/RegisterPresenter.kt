package com.carpediem.ed.usercenter.presenter

import com.carpediem.ed.base.ext.execute
import com.carpediem.ed.base.presenter.BasePresenter
import com.carpediem.ed.base.rx.BaseSubscriber
import com.carpediem.ed.usercenter.presenter.view.RegisterView
import com.carpediem.ed.usercenter.service.impl.UserServiceImpl

/**
 * Created by carpediemvv on 2018/1/19.
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String, pwd: String) {
        val userServiceImpl = UserServiceImpl()
        userServiceImpl.register(mobile, verifyCode, pwd)
                .execute(object :BaseSubscriber<Boolean>(){
                    override fun onNext(t: Boolean) {
                        mVeiw.onRegisterResult(t)
                    }
                })


    }
}