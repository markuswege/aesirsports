package de.aesirsports.valhalla

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ValhallaApplication

fun main(args: Array<String>) {
    runApplication<ValhallaApplication>(*args)
}
