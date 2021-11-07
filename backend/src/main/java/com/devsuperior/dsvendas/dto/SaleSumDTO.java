package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entitites.Seller;

public class SaleSumDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String sellername;
	private Double sum;
	
	
	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellername = seller.getName();
		this.sum = sum;
	}

	public String getSalername() {
		return sellername;
	}

	public void setSalername(String salername) {
		this.sellername = salername;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
}
