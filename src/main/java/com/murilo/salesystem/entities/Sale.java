package com.murilo.salesystem.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sale implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private Double systemCommission;
	private LocalDate instant;
	private List<SaleItem> items = new ArrayList<>();

	public Sale() {
		this.instant = LocalDate.now();
	}

	public Sale(long id, Double systemCommission, LocalDate instant) {
		this.id = id;
		this.systemCommission = systemCommission;
		this.instant = LocalDate.now();
	}

	public Double getTotal() {
		double sum = 0.0;
		for (SaleItem i : items) {
			sum += i.getPrice();
		}
		return sum;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getSystemCommission() {
		return systemCommission;
	}

	public void setSystemCommission(Double systemCommission) {
		this.systemCommission = systemCommission;
	}

	public LocalDate getInstant() {
		return instant;
	}

	public void setInstant(LocalDate instant) {
		this.instant = instant;
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
		Sale other = (Sale) obj;
		return id == other.id;
	}

}
