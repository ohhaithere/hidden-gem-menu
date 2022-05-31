package com.mrazi.hiddengem.controller

import com.mrazi.hiddengem.dto.MenuDto
import com.mrazi.hiddengem.service.MenuService
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/gem")
class MenuController(val menuService: MenuService) {

    @PostMapping
    fun save(@RequestBody dto: MenuDto): MenuDto {
        return menuService.save(dto);
    }

}