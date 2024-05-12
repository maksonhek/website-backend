package com.kartowehka.webserver.contolers

import com.kartowehka.webserver.models.Heroes
import com.kartowehka.webserver.models.Items
import com.kartowehka.webserver.repositories.HeroesStorage
import com.kartowehka.webserver.repositories.ItemsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Dota2Controller @Autowired constructor (
    private val heroesStorage: HeroesStorage,
    private val itemsRepository: ItemsRepository
) {
    @GetMapping("/heroes")
    fun getAllDotaHeroes(): MutableList<Heroes?> {
        return heroesStorage.findAll()
    }
    @GetMapping("/items")
    fun getAllDotaItems(): MutableList<Items?> {
        return itemsRepository.findAll()
    }
}