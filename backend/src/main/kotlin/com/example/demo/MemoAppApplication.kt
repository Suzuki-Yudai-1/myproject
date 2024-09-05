package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MemoAppApplication

fun main(args: Array<String>) {
	runApplication<MemoAppApplication>(*args)
}
