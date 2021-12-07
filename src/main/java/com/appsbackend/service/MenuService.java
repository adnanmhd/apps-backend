package com.appsbackend.service;

import java.util.List;

import com.appsbackend.entity.Menu;
import com.appsbackend.entity.MenuType;

public interface MenuService {
	
	List<Menu> listAllMenu();
	
	List<MenuType> listAllMenuType();
	
	void saveMenu(Menu menu);
	
	void saveMenuType(MenuType menuType);
	
}
