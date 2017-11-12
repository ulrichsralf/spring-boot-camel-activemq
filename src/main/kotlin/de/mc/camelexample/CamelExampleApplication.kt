package de.mc.camelexample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class CamelExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(CamelExampleApplication::class.java, *args)
}
