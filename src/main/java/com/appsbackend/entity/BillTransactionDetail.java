package com.appsbackend.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "bill_transaction_dtl")
@Data

public class BillTransactionDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name  = "id")
	private String id;
	
	@ManyToOne
	@JoinColumn(name = "bill_code", referencedColumnName = "bill_code")
	private BillTransaction billCode;
	
	@Column(name = "menu_name")
	private String menuName;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@Column(name = "qty")
	private Integer quantity;
	
	@Column(name = "total")
	private BigDecimal total;
	
}
