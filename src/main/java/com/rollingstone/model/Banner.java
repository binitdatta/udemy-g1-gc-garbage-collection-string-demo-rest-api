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
@Table(name = "rollingstone_banner")
public class Banner {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	String imageUrl;
	String rel;
	String href;
	String imageAltText;
	String displayName;
	String bannerCAContent;
	
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
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getImageAltText() {
		return imageAltText;
	}
	public void setImageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getBannerCAContent() {
		return bannerCAContent;
	}
	public void setBannerCAContent(String bannerCAContent) {
		this.bannerCAContent = bannerCAContent;
	}
	public Banner(long id, String imageUrl, String rel, String href, String imageAltText, String displayName,
			String bannerCAContent, ProductInfo product) {
		super();
		this.id = id;
		this.imageUrl = imageUrl;
		this.rel = rel;
		this.href = href;
		this.imageAltText = imageAltText;
		this.displayName = displayName;
		this.bannerCAContent = bannerCAContent;
		this.product = product;
	}
	public Banner(long id, String imageUrl, String rel, String href, String imageAltText, String displayName,
			String bannerCAContent) {
		super();
		this.id = id;
		this.imageUrl = imageUrl;
		this.rel = rel;
		this.href = href;
		this.imageAltText = imageAltText;
		this.displayName = displayName;
		this.bannerCAContent = bannerCAContent;
	}
	public Banner() {
		super();
	}
	@Override
	public String toString() {
		return "Banner [id=" + id + ", imageUrl=" + imageUrl + ", rel=" + rel + ", href=" + href + ", imageAltText="
				+ imageAltText + ", displayName=" + displayName + ", bannerCAContent=" + bannerCAContent + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bannerCAContent == null) ? 0 : bannerCAContent.hashCode());
		result = prime * result + ((displayName == null) ? 0 : displayName.hashCode());
		result = prime * result + ((href == null) ? 0 : href.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((imageAltText == null) ? 0 : imageAltText.hashCode());
		result = prime * result + ((imageUrl == null) ? 0 : imageUrl.hashCode());
		result = prime * result + ((rel == null) ? 0 : rel.hashCode());
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
		Banner other = (Banner) obj;
		if (bannerCAContent == null) {
			if (other.bannerCAContent != null)
				return false;
		} else if (!bannerCAContent.equals(other.bannerCAContent))
			return false;
		if (displayName == null) {
			if (other.displayName != null)
				return false;
		} else if (!displayName.equals(other.displayName))
			return false;
		if (href == null) {
			if (other.href != null)
				return false;
		} else if (!href.equals(other.href))
			return false;
		if (id != other.id)
			return false;
		if (imageAltText == null) {
			if (other.imageAltText != null)
				return false;
		} else if (!imageAltText.equals(other.imageAltText))
			return false;
		if (imageUrl == null) {
			if (other.imageUrl != null)
				return false;
		} else if (!imageUrl.equals(other.imageUrl))
			return false;
		if (rel == null) {
			if (other.rel != null)
				return false;
		} else if (!rel.equals(other.rel))
			return false;
		return true;
	}
	
	
	
}
