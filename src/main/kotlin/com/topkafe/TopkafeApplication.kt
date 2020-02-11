package com.topkafe

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TopkafeApplication

fun main(args: Array<String>) {
    runApplication<TopkafeApplication>(*args)
}
