package com.kartowehka.webserver.models

import jakarta.persistence.*

@Entity
@Table(name = "items")
data class Items constructor(
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var image: String? = null,
    var active_ability: String? = null,
    var pasive_ability: String? = null,

)