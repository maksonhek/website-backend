package com.kartowehka.webserver.models

import jakarta.persistence.*

@Entity
@Table(name = "heroes")
data class Heroes constructor(
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var image: String? = null,
    var agility: String? = null,
    var strength: String? =null,
    var intelligence: String? = null,
    var skill1: String? = null,
    var skill2: String? = null,
    var skill3: String? = null,

)
