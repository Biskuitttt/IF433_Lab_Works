#!/usr/bin/env kotlin

package oop_110898_peterjuanpurnama.week10

class Box<T>(private var item: T) {

    fun getItem(): T {
        return item
    }

    fun setItem(newItem: T) {
        item = newItem
    }
}