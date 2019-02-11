package com.rollingstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rollingstone_summary")
public class Summary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="page_number", nullable = false)
	int pageNumber;
	
	@Column(name="total_num_pages", nullable = false)
	int totalNumPages;
	
	@Column(name="product_info_count", nullable = false)
	int productInfoCount;
	
	@Column(name="all_web_and_store_total_results", nullable = false)
	int allWebAndStoreTotalResults;
	
	@Column(name="drug_info_count", nullable = false)
	int drugInfoCount;
	
	@Column(name="in_store_total_results", nullable = false)
	int inStoreTotalResults;
	
	@Column(name="frequently_used_filter", nullable = false)
	String frequentlyUsedFilter;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getTotalNumPages() {
		return totalNumPages;
	}

	public void setTotalNumPages(int totalNumPages) {
		this.totalNumPages = totalNumPages;
	}

	public int getProductInfoCount() {
		return productInfoCount;
	}

	public void setProductInfoCount(int productInfoCount) {
		this.productInfoCount = productInfoCount;
	}

	public int getAllWebAndStoreTotalResults() {
		return allWebAndStoreTotalResults;
	}

	public void setAllWebAndStoreTotalResults(int allWebAndStoreTotalResults) {
		this.allWebAndStoreTotalResults = allWebAndStoreTotalResults;
	}

	public int getDrugInfoCount() {
		return drugInfoCount;
	}

	public void setDrugInfoCount(int drugInfoCount) {
		this.drugInfoCount = drugInfoCount;
	}

	public int getInStoreTotalResults() {
		return inStoreTotalResults;
	}

	public void setInStoreTotalResults(int inStoreTotalResults) {
		this.inStoreTotalResults = inStoreTotalResults;
	}

	public String getFrequentlyUsedFilter() {
		return frequentlyUsedFilter;
	}

	public void setFrequentlyUsedFilter(String frequentlyUsedFilter) {
		this.frequentlyUsedFilter = frequentlyUsedFilter;
	}

	@Override
	public String toString() {
		return "Summary [id=" + id + ", pageNumber=" + pageNumber + ", totalNumPages=" + totalNumPages
				+ ", productInfoCount=" + productInfoCount + ", allWebAndStoreTotalResults="
				+ allWebAndStoreTotalResults + ", drugInfoCount=" + drugInfoCount + ", inStoreTotalResults="
				+ inStoreTotalResults + ", frequentlyUsedFilter=" + frequentlyUsedFilter + "]";
	}

	public Summary(long id, int pageNumber, int totalNumPages, int productInfoCount, int allWebAndStoreTotalResults,
			int drugInfoCount, int inStoreTotalResults, String frequentlyUsedFilter) {
		super();
		this.id = id;
		this.pageNumber = pageNumber;
		this.totalNumPages = totalNumPages;
		this.productInfoCount = productInfoCount;
		this.allWebAndStoreTotalResults = allWebAndStoreTotalResults;
		this.drugInfoCount = drugInfoCount;
		this.inStoreTotalResults = inStoreTotalResults;
		this.frequentlyUsedFilter = frequentlyUsedFilter;
	}

	public Summary() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + allWebAndStoreTotalResults;
		result = prime * result + drugInfoCount;
		result = prime * result + ((frequentlyUsedFilter == null) ? 0 : frequentlyUsedFilter.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + inStoreTotalResults;
		result = prime * result + pageNumber;
		result = prime * result + productInfoCount;
		result = prime * result + totalNumPages;
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
		Summary other = (Summary) obj;
		if (allWebAndStoreTotalResults != other.allWebAndStoreTotalResults)
			return false;
		if (drugInfoCount != other.drugInfoCount)
			return false;
		if (frequentlyUsedFilter == null) {
			if (other.frequentlyUsedFilter != null)
				return false;
		} else if (!frequentlyUsedFilter.equals(other.frequentlyUsedFilter))
			return false;
		if (id != other.id)
			return false;
		if (inStoreTotalResults != other.inStoreTotalResults)
			return false;
		if (pageNumber != other.pageNumber)
			return false;
		if (productInfoCount != other.productInfoCount)
			return false;
		if (totalNumPages != other.totalNumPages)
			return false;
		return true;
	}
	
	
}
