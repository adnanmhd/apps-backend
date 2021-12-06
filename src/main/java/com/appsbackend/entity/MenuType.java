package com.appsbackend.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "menu_type")
@Data
public class MenuType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="menu_type_cd")
	private String menuTypeCode;
	
	@Column(name = "menu_type_name")
	private String menuTypeName;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Timestamp createdDate;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	@Column(name = "updated_date")
	private Timestamp updatedDate; 
}
