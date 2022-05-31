package com.mrazi.hiddengem.service

import com.mrazi.hiddengem.dto.MenuDto
import com.mrazi.hiddengem.mapper.MenuMapper
import com.mrazi.hiddengem.repository.MenuRepository
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.*

@Component
class MenuService(private var menuRepository: MenuRepository,
                  private var mapper: MenuMapper) {

    fun save (dto: MenuDto): MenuDto {
        val gem = mapper.toModel(dto)
        gem.id = UUID.randomUUID()
        gem.added = LocalDateTime.now()
        menuRepository.save(gem)
        return mapper.toDto(gem)
    }

    fun update (dto: MenuDto): MenuDto {
        val gem = mapper.toModel(dto)
        menuRepository.save(gem)
        return mapper.toDto(gem)
    }

    fun get(id: UUID): MenuDto {
        return mapper.toDto(menuRepository.getById(id));
    }

    fun get(): List<MenuDto> {
        return mapper.toDtos(menuRepository.findAll());
    }

}