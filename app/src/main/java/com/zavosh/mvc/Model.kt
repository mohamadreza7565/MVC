package com.zavosh.mvc

import java.util.*
import kotlin.collections.ArrayList

class Model : Observable() {

    val list : MutableList<Int> = ArrayList()

    init {
        list.add(0)
        list.add(0)
        list.add(0)
    }

    @Throws(IndexOutOfBoundsException::class)
    fun getValueAtIndex(the_index: Int): Int {
        return list[the_index]
    }

    @Throws(IndexOutOfBoundsException::class)
    fun setValueAtIndex(the_index: Int) {
        list[the_index] = list[the_index] + 1
        setChanged()
        notifyObservers()
    }

}