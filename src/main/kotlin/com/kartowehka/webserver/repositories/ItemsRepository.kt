package com.kartowehka.webserver.repositories

import com.kartowehka.webserver.models.Heroes
import com.kartowehka.webserver.models.Items
import org.springframework.data.jpa.repository.JpaRepository

interface ItemsRepository: JpaRepository<Items?, Long?>