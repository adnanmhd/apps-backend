package com.appsbackend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsbackend.entity.Menu;
import com.appsbackend.entity.MenuType;
import com.appsbackend.repository.MenuRepository;
import com.appsbackend.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuRepository menuRepo;
	
	@Override
	public List<Menu> listAllMenu() {
		return menuRepo.findAll();
	}

	@Override
	public List<MenuType> listAllMenuType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveMenu(Menu menu) {
		menuRepo.save(menu);
	}

	@Override
	public void saveMenuType(MenuType menuType) {
		// TODO Auto-generated method stub

	}

}
