package com.carpediem.ed.base.rx

import rx.Subscriber

/**
 * Created by carpediemvv on 2018/1/19.
 */
open class BaseSubscriber<T> : Subscriber<T>() {
    override fun onNext(t: T) {

    }

    override fun onError(e: Throwable?) {
    }

    override fun onCompleted() {
    }
}