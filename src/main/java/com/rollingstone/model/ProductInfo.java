package com.rollingstone.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rollingstone_product_info")
public class ProductInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	String storeInv;
	String fulfillerType;
	String webExclusive;
	String wic;
	String prodId;
	String skuId;
	String imageUrl;
	String upc;
	String productURL;
    int reviewCount;
    String productSize;
    String newItem;
    int autoReorder;
    double unitPrice;
    String unitPriceSize;
    String loyaltyEligible;
    String reviewURL;
    String inactiveIngredients;
    String pln;
    String beautyCategoryName;
    String retailUnitQty;
    String clearance;
    String quicklookURL;
    String productDisplayName;
    String productDisplayType;
    String reviewHoverMessage;
    
    @OneToOne
	@JoinColumn(name="filter_id")
	private Filter filter;
    
    @OneToOne
  	@JoinColumn(name="summary_id")
  	private Summary summary;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
  	//@JsonIgnore
  	private Set<Banner> banners = new HashSet<Banner>();
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	//@JsonIgnore
	private Set<ProductSku> productSkus = new HashSet<ProductSku>();
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
   	//@JsonIgnore
   	private Set<Tier2Refinement> tier2Refinements = new HashSet<Tier2Refinement>();

	public String getStoreInv() {
		return storeInv;
	}

	public void setStoreInv(String storeInv) {
		this.storeInv = storeInv;
	}

	public String getFulfillerType() {
		return fulfillerType;
	}

	public void setFulfillerType(String fulfillerType) {
		this.fulfillerType = fulfillerType;
	}

	public String getWebExclusive() {
		return webExclusive;
	}

	public void setWebExclusive(String webExclusive) {
		this.webExclusive = webExclusive;
	}

	public String getWic() {
		return wic;
	}

	public void setWic(String wic) {
		this.wic = wic;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getProductURL() {
		return productURL;
	}

	public void setProductURL(String productURL) {
		this.productURL = productURL;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getNewItem() {
		return newItem;
	}

	public void setNewItem(String newItem) {
		this.newItem = newItem;
	}

	public int getAutoReorder() {
		return autoReorder;
	}

	public void setAutoReorder(int autoReorder) {
		this.autoReorder = autoReorder;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnitPriceSize() {
		return unitPriceSize;
	}

	public void setUnitPriceSize(String unitPriceSize) {
		this.unitPriceSize = unitPriceSize;
	}

	public String getLoyaltyEligible() {
		return loyaltyEligible;
	}

	public void setLoyaltyEligible(String loyaltyEligible) {
		this.loyaltyEligible = loyaltyEligible;
	}

	public String getReviewURL() {
		return reviewURL;
	}

	public void setReviewURL(String reviewURL) {
		this.reviewURL = reviewURL;
	}

	public String getInactiveIngredients() {
		return inactiveIngredients;
	}

	public void setInactiveIngredients(String inactiveIngredients) {
		this.inactiveIngredients = inactiveIngredients;
	}

	public String getPln() {
		return pln;
	}

	public void setPln(String pln) {
		this.pln = pln;
	}

	public String getBeautyCategoryName() {
		return beautyCategoryName;
	}

	public void setBeautyCategoryName(String beautyCategoryName) {
		this.beautyCategoryName = beautyCategoryName;
	}

	public String getRetailUnitQty() {
		return retailUnitQty;
	}

	public void setRetailUnitQty(String retailUnitQty) {
		this.retailUnitQty = retailUnitQty;
	}

	public String getClearance() {
		return clearance;
	}

	public void setClearance(String clearance) {
		this.clearance = clearance;
	}

	public String getQuicklookURL() {
		return quicklookURL;
	}

	public void setQuicklookURL(String quicklookURL) {
		this.quicklookURL = quicklookURL;
	}

	public String getProductDisplayName() {
		return productDisplayName;
	}

	public void setProductDisplayName(String productDisplayName) {
		this.productDisplayName = productDisplayName;
	}

	public String getProductDisplayType() {
		return productDisplayType;
	}

	public void setProductDisplayType(String productDisplayType) {
		this.productDisplayType = productDisplayType;
	}

	public String getReviewHoverMessage() {
		return reviewHoverMessage;
	}

	public void setReviewHoverMessage(String reviewHoverMessage) {
		this.reviewHoverMessage = reviewHoverMessage;
	}

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public Set<Banner> getBanners() {
		return banners;
	}

	public void setBanners(Set<Banner> banners) {
		this.banners = banners;
	}

	public Set<ProductSku> getProductSkus() {
		return productSkus;
	}

	public void setProductSkus(Set<ProductSku> productSkus) {
		this.productSkus = productSkus;
	}

	public Set<Tier2Refinement> getTier2Refinements() {
		return tier2Refinements;
	}

	public void setTier2Refinements(Set<Tier2Refinement> tier2Refinements) {
		this.tier2Refinements = tier2Refinements;
	}

	public ProductInfo(String storeInv, String fulfillerType, String webExclusive, String wic, String prodId,
			String skuId, String imageUrl, String upc, String productURL, int reviewCount, String productSize,
			String newItem, int autoReorder, double unitPrice, String unitPriceSize, String loyaltyEligible,
			String reviewURL, String inactiveIngredients, String pln, String beautyCategoryName, String retailUnitQty,
			String clearance, String quicklookURL, String productDisplayName, String productDisplayType,
			String reviewHoverMessage, Filter filter, Summary summary, Set<Banner> banners, Set<ProductSku> productSkus,
			Set<Tier2Refinement> tier2Refinements) {
		super();
		this.storeInv = storeInv;
		this.fulfillerType = fulfillerType;
		this.webExclusive = webExclusive;
		this.wic = wic;
		this.prodId = prodId;
		this.skuId = skuId;
		this.imageUrl = imageUrl;
		this.upc = upc;
		this.productURL = productURL;
		this.reviewCount = reviewCount;
		this.productSize = productSize;
		this.newItem = newItem;
		this.autoReorder = autoReorder;
		this.unitPrice = unitPrice;
		this.unitPriceSize = unitPriceSize;
		this.loyaltyEligible = loyaltyEligible;
		this.reviewURL = reviewURL;
		this.inactiveIngredients = inactiveIngredients;
		this.pln = pln;
		this.beautyCategoryName = beautyCategoryName;
		this.retailUnitQty = retailUnitQty;
		this.clearance = clearance;
		this.quicklookURL = quicklookURL;
		this.productDisplayName = productDisplayName;
		this.productDisplayType = productDisplayType;
		this.reviewHoverMessage = reviewHoverMessage;
		this.filter = filter;
		this.summary = summary;
		this.banners = banners;
		this.productSkus = productSkus;
		this.tier2Refinements = tier2Refinements;
	}

	public ProductInfo() {
		super();
	}

	@Override
	public String toString() {
		return "ProductInfo [storeInv=" + storeInv + ", fulfillerType=" + fulfillerType + ", webExclusive="
				+ webExclusive + ", wic=" + wic + ", prodId=" + prodId + ", skuId=" + skuId + ", imageUrl=" + imageUrl
				+ ", upc=" + upc + ", productURL=" + productURL + ", reviewCount=" + reviewCount + ", productSize="
				+ productSize + ", newItem=" + newItem + ", autoReorder=" + autoReorder + ", unitPrice=" + unitPrice
				+ ", unitPriceSize=" + unitPriceSize + ", loyaltyEligible=" + loyaltyEligible + ", reviewURL="
				+ reviewURL + ", inactiveIngredients=" + inactiveIngredients + ", pln=" + pln + ", beautyCategoryName="
				+ beautyCategoryName + ", retailUnitQty=" + retailUnitQty + ", clearance=" + clearance
				+ ", quicklookURL=" + quicklookURL + ", productDisplayName=" + productDisplayName
				+ ", productDisplayType=" + productDisplayType + ", reviewHoverMessage=" + reviewHoverMessage
				+ ", filter=" + filter + ", summary=" + summary + ", banners=" + banners + ", productSkus="
				+ productSkus + ", tier2Refinements=" + tier2Refinements + "]";
	}
    
    
    
}
