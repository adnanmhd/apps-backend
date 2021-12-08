package com.appsbackend.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "menu")
@Data
public class Menu {
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name = "id")
	private String id;
	
	@Column(name = "menu_code")
	private String menuCode;
	
	@Column(name = "menu_name")
	private String menuName;
	
	@Column(name = "price")
	private String price;
	
	@ManyToOne
	@JoinColumn(name = "menu_type_cd", referencedColumnName = "menu_type_cd")
	private MenuType menuType;
	
	@Column(name = "image_path")
	private String imagePath;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Timestamp createdDate;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	@Column(name = "updated_date")
	private Timestamp updatedDate;
}
