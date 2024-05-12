package com.kartowehka.webserver.repositories

import com.kartowehka.webserver.models.BooksReader
import org.springframework.data.jpa.repository.JpaRepository

interface BookReadersRepository: JpaRepository<BooksReader?, Long?>