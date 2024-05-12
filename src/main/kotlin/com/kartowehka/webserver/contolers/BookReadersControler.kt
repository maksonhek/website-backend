package com.kartowehka.webserver.contolers

import com.kartowehka.webserver.models.BooksReader
import com.kartowehka.webserver.repositories.BookReadersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.print.Book

@RestController
class BookReadersControler @Autowired constructor(
    private val repository: BookReadersRepository
) {
    @GetMapping("/readers")
    fun getAllReaders():List<BooksReader?>{
        return repository.findAll()
    }

    @PostMapping("/readers/add")
    fun addNewReader() {
        val newReader = BooksReader(name ="Lexa", phone = "1488")
        repository.save(newReader)
    }
}