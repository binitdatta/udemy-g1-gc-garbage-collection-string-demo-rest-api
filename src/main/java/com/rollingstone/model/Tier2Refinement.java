package com.rollingstone.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rollingstone_tier2refinements")
public class Tier2Refinement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	int count;
	String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	@JsonIgnore
	ProductInfo product;
	
	
	public ProductInfo getProduct() {
		return product;
	}
	public void setProduct(ProductInfo product) {
		this.product = product;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Tier2Refinement(long id, int count, String name) {
		super();
		this.id = id;
		this.count = count;
		this.name = name;
	}
	public Tier2Refinement(long id, int count, String name, ProductInfo product) {
		super();
		this.id = id;
		this.count = count;
		this.name = name;
		this.product = product;
	}
	public Tier2Refinement() {
		super();
	}
	@Override
	public String toString() {
		return "Tier2Refinement [id=" + id + ", count=" + count + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tier2Refinement other = (Tier2Refinement) obj;
		if (count != other.count)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
