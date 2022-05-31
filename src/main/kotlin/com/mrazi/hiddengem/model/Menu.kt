package com.mrazi.hiddengem.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "gem", schema = "public")
class Menu(
    @Id
    var id: UUID? = null,
    val gemId: UUID,
    val name: String,
    val category: String,
    val price: String,
    val size: String,
    var added: LocalDateTime? = null
)