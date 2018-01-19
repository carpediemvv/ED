package com.carpediem.ed.usercenter.service.impl

import com.carpediem.ed.usercenter.service.UserService
import rx.Observable

/**
 * Created by carpediemvv on 2018/1/19.
 */
class UserServiceImpl:UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }
}