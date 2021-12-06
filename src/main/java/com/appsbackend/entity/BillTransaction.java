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
@Table(name = "bill_transaction")
@Data
public class BillTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private String id;
	
	@Column(name = "bill_code")
	private String billCode;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "is_dine_in")
	private String isDineIn;
	
	@Column(name = "table_no")
	private String tableNo;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "payment_option")
	private String paymentOption;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "created_date")
	private Timestamp createdDate;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	@Column(name = "updated_date")
	private Timestamp updatedDate;
	
}
