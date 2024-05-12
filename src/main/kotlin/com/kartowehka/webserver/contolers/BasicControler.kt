package com.kartowehka.webserver.contolers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicControler {
    @GetMapping("/")
    fun basicGetRequest():String{
        return "мы вам перезвоним"
    }


}