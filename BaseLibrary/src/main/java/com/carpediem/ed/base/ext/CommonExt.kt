package com.carpediem.ed.base.ext

import com.carpediem.ed.base.rx.BaseSubscriber
import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by carpediemvv on 2018/1/19.
 */
fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>){
    this.observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe(subscriber)
}