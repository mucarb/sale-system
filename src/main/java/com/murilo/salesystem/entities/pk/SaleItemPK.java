package com.murilo.salesystem.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.murilo.salesystem.entities.Product;
import com.murilo.salesystem.entities.Sale;

public class SaleItemPK implements Serializable {

	private static final long serialVersionUID = 1L;
	private Sale sale;
	private Product product;
	
	public SaleItemPK() {
	}

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		return Objects.hash(product, sale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SaleItemPK other = (SaleItemPK) obj;
		return Objects.equals(product, other.product) && Objects.equals(sale, other.sale);
	}	

}
