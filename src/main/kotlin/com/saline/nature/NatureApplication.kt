package com.saline.nature

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NatureApplication

fun main(args: Array<String>) {
	runApplication<NatureApplication>(*args)
}
