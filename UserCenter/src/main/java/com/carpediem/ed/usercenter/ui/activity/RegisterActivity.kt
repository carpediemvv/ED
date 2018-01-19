package com.carpediem.ed.usercenter.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.carpediem.ed.base.ui.activity.BaseMVPActivity
import com.carpediem.ed.usercenter.R
import com.carpediem.ed.usercenter.presenter.RegisterPresenter
import com.carpediem.ed.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class RegisterActivity : BaseMVPActivity<RegisterPresenter>(),RegisterView {
    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mPresenter=RegisterPresenter()
        mPresenter.mVeiw=this
        mRegisterBtn.setOnClickListener {
                mPresenter.register("","","")
        }
    }
}
