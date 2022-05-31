package com.mrazi.hiddengem.mapper

import com.mrazi.hiddengem.dto.MenuDto
import com.mrazi.hiddengem.model.Menu
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface MenuMapper {

    fun toDto(user: Menu): MenuDto
    @InheritInverseConfiguration
    fun toModel(user: MenuDto): Menu

    fun toDtos(menus: List<Menu>): List<MenuDto> {
        return menus.map { t -> toDto(t) }
    }

}