package io.patamon.eventbus.core

import java.lang.reflect.Method

/**
 * Desc: A @[Subscribe] method class
 *
 * Mail: chk19940609@gmail.com
 * Created by IceMimosa
 * Date: 2018/10/27
 */
data class Subscriber(
        private val target: Any,
        private val method: Method
) {

    fun invoke(vararg args: Any) {
        this.method.invoke(this.target, *args)
    }

}