package com.example.demo.order;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "purchaseorder")
@Component
public class PurchaseOrder {
	
	@Id @Column(name = "OID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	
	@Column(name = "AMOUNT")
	private Integer amount;
	
	@Column(name = "ODATE")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date odate;
	
	@Column(name = "USERID")
	private Integer userid;
	
	@Column(name = "PRODUCTID")
	private Integer productid;

	public PurchaseOrder() {
	}

	public PurchaseOrder(Integer amount, Date odate, Integer userid, Integer productid) {
		this.amount = amount;
		this.odate = odate;
		this.userid = userid;
		this.productid = productid;
	}

	public PurchaseOrder(Integer oid, Integer amount, Date odate, Integer userid, Integer productid) {
		this.oid = oid;
		this.amount = amount;
		this.odate = odate;
		this.userid = userid;
		this.productid = productid;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getOdate() {
		return odate;
	}

	public void setOdate(Date odate) {
		this.odate = odate;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

}