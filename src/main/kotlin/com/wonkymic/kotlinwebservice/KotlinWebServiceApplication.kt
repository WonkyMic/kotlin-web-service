package com.wonkymic.kotlinwebservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
//import org.springframework.data.annotation.Id
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class KotlinWebServiceApplication

fun main(args: Array<String>) {
	runApplication<KotlinWebServiceApplication>(*args)
}

@RestController
class MessageResources {
	@GetMapping
	fun index(): List<Message> = listOf(
		Message("1", "Hello!"),
		Message("2", "Bonjour!"),
		Message("3", "Privet!"),
	)
}

data class Message(val id: String?, val text: String)