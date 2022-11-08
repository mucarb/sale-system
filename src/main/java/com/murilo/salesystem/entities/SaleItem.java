package com.murilo.salesystem.entities;

import java.io.Serializable;
import java.util.Objects;

import com.murilo.salesystem.entities.pk.SaleItemPK;

public class SaleItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private SaleItemPK id = new SaleItemPK();
	private Integer quantity;
	private Double price;

	public SaleItem() {
	}

	public SaleItem(Sale sale, Product product, Integer quantity, Double price) {
		this.id.setSale(sale);
		this.id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
	public Double getSubtotal() {
		return quantity * price;
	}

	public SaleItemPK getId() {
		return id;
	}

	public void setId(SaleItemPK id) {
		this.id = id;
	}

	public Sale getSale() {
		return id.getSale();
	}

	public void setSale(Sale sale) {
		this.id.setSale(sale);
		;
	}

	public Product getProduct() {
		return id.getProduct();
	}

	public void setProduct(Product product) {
		this.id.setProduct(product);
		;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaleItem other = (SaleItem) obj;
		return Objects.equals(id, other.id);
	}

}
