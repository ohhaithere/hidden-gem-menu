package com.mrazi.hiddengem.dto

import java.time.LocalDateTime
import java.util.*

data class MenuDto(
    var id: UUID? = null,
    val gemId: UUID,
    val name: String,
    val category: String,
    val price: String,
    val size: String,
    var added: LocalDateTime? = null
)
