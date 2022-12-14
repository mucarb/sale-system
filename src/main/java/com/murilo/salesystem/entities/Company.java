package com.murilo.salesystem.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.murilo.salesystem.entities.enums.UserType;

@Entity
public class Company extends User {

	private static final long serialVersionUID = 1L;
	@Column(unique = true)
	private String cnpj;
	private Double tax;
	private Double balance;
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<>();

	public Company() {
	}

	public Company(Long id, String name, String username, String password, String cnpj, Double tax, Double balance) {
		super(id, name, username, password, UserType.COMPANY);
		this.cnpj = cnpj;
		this.tax = tax;
		this.balance = balance;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
