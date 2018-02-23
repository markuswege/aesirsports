package de.aesirsports.valhalla

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController{

    @GetMapping("/")
    fun testController(): String{
        return "hallo"
    }

}