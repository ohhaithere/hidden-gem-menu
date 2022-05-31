package com.mrazi.hiddengem.repository

import com.mrazi.hiddengem.model.Menu
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MenuRepository: JpaRepository<Menu, UUID> {
}