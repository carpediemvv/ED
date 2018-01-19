package com.carpediem.ed.usercenter.service

import rx.Observable

/**
 * Created by carpediemvv on 2018/1/19.
 */
interface UserService {
    fun register (mobile:String,verifyCode:String,pwd:String):Observable<Boolean>
}