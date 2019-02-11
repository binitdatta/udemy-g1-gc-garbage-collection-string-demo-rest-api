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
@Table(name = "rollingstone_product_sku")
public class ProductSku {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	String name;
	int quantity;
	
	String wic;
	String dimId;
	String color;
	String skuSequenceNumber;
	String swatchImageUrl;
	String skuId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	@JsonIgnore
	ProductInfo product;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getWic() {
		return wic;
	}

	public void setWic(String wic) {
		this.wic = wic;
	}

	public String getDimId() {
		return dimId;
	}

	public void setDimId(String dimId) {
		this.dimId = dimId;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSkuSequenceNumber() {
		return skuSequenceNumber;
	}

	public void setSkuSequenceNumber(String skuSequenceNumber) {
		this.skuSequenceNumber = skuSequenceNumber;
	}

	public String getSwatchImageUrl() {
		return swatchImageUrl;
	}

	public void setSwatchImageUrl(String swatchImageUrl) {
		this.swatchImageUrl = swatchImageUrl;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public ProductInfo getProduct() {
		return product;
	}

	public void setProduct(ProductInfo product) {
		this.product = product;
	}

	public ProductSku(long id, String name, int quantity, String wic, String dimId, String color,
			String skuSequenceNumber, String swatchImageUrl, String skuId, ProductInfo product) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.wic = wic;
		this.dimId = dimId;
		this.color = color;
		this.skuSequenceNumber = skuSequenceNumber;
		this.swatchImageUrl = swatchImageUrl;
		this.skuId = skuId;
		this.product = product;
	}

	public ProductSku() {
		super();
	}

	@Override
	public String toString() {
		return "ProductSku [id=" + id + ", name=" + name + ", quantity=" + quantity + ", wic=" + wic + ", dimId="
				+ dimId + ", color=" + color + ", skuSequenceNumber=" + skuSequenceNumber + ", swatchImageUrl="
				+ swatchImageUrl + ", skuId=" + skuId + ", product=" + product + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((dimId == null) ? 0 : dimId.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((skuId == null) ? 0 : skuId.hashCode());
		result = prime * result + ((skuSequenceNumber == null) ? 0 : skuSequenceNumber.hashCode());
		result = prime * result + ((swatchImageUrl == null) ? 0 : swatchImageUrl.hashCode());
		result = prime * result + ((wic == null) ? 0 : wic.hashCode());
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
		ProductSku other = (ProductSku) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (dimId == null) {
			if (other.dimId != null)
				return false;
		} else if (!dimId.equals(other.dimId))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (quantity != other.quantity)
			return false;
		if (skuId == null) {
			if (other.skuId != null)
				return false;
		} else if (!skuId.equals(other.skuId))
			return false;
		if (skuSequenceNumber == null) {
			if (other.skuSequenceNumber != null)
				return false;
		} else if (!skuSequenceNumber.equals(other.skuSequenceNumber))
			return false;
		if (swatchImageUrl == null) {
			if (other.swatchImageUrl != null)
				return false;
		} else if (!swatchImageUrl.equals(other.swatchImageUrl))
			return false;
		if (wic == null) {
			if (other.wic != null)
				return false;
		} else if (!wic.equals(other.wic))
			return false;
		return true;
	}
	
	
}
