package com.dtd.keyboardnotifier

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KeyboardNotifierApplication

fun main(args: Array<String>) {
    runApplication<KeyboardNotifierApplication>(*args)
}
