package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entitites.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;
	
	
	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getsellerName() {
		return sellerName;
	}

	public void setsellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
}
