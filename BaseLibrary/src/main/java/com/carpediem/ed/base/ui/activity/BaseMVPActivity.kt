package com.carpediem.ed.base.ui.activity

import com.carpediem.ed.base.presenter.BasePresenter
import com.carpediem.ed.base.presenter.view.BaseView

/**
 * Created by carpediemvv on 2018/1/19.
 */
open class BaseMVPActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }
    lateinit var mPresenter:T
}