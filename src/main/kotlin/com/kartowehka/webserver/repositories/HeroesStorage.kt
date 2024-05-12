package com.kartowehka.webserver.repositories

import com.kartowehka.webserver.models.Heroes
import org.springframework.data.jpa.repository.JpaRepository

interface HeroesStorage: JpaRepository<Heroes?,Long?>
