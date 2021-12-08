package com.appsbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsbackend.entity.Menu;
import com.appsbackend.service.MenuService;

@RestController
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@RequestMapping("/")
	public String index() {
		
		return "Hello";
	}
	
	@PostMapping("/save")
	Menu newMenu(@RequestBody Menu newMenu) {
		menuService.saveMenu(newMenu);
		return newMenu;
	}

}
