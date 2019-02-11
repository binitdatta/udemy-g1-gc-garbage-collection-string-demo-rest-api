package com.rollingstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rollingstone_filter")
public class Filter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="search_criteria", nullable = false)
	String searchCriteria;
	
	@Column(name="page_numberr", nullable = false)
	int pageNumber;
	
	@Column(name="rec_per_page", nullable = false)
	int recordsPerPage;
	
	String sort;
	String view;
	
	@Column(name="request_type", nullable = false)
	String requestType;
	
	@Column(name="device_type", nullable = false)
	String deviceType;
	
	@Column(name="populate_channel_avail_map", nullable = false)
	boolean populateChannelAvailMap;
	
	@Column(name="actual_search_term", nullable = false)
	String actualSearchTerm;
	
	@Column(name="include_drug", nullable = false)
	boolean includeDrug;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSearchCriteria() {
		return searchCriteria;
	}

	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getRecordsPerPage() {
		return recordsPerPage;
	}

	public void setRecordsPerPage(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public boolean isPopulateChannelAvailMap() {
		return populateChannelAvailMap;
	}

	public void setPopulateChannelAvailMap(boolean populateChannelAvailMap) {
		this.populateChannelAvailMap = populateChannelAvailMap;
	}

	public String getActualSearchTerm() {
		return actualSearchTerm;
	}

	public void setActualSearchTerm(String actualSearchTerm) {
		this.actualSearchTerm = actualSearchTerm;
	}

	public boolean isIncludeDrug() {
		return includeDrug;
	}

	public void setIncludeDrug(boolean includeDrug) {
		this.includeDrug = includeDrug;
	}

	public Filter(long id, String searchCriteria, int pageNumber, int recordsPerPage, String sort, String view,
			String requestType, String deviceType, boolean populateChannelAvailMap, String actualSearchTerm,
			boolean includeDrug) {
		super();
		this.id = id;
		this.searchCriteria = searchCriteria;
		this.pageNumber = pageNumber;
		this.recordsPerPage = recordsPerPage;
		this.sort = sort;
		this.view = view;
		this.requestType = requestType;
		this.deviceType = deviceType;
		this.populateChannelAvailMap = populateChannelAvailMap;
		this.actualSearchTerm = actualSearchTerm;
		this.includeDrug = includeDrug;
	}

	
	public Filter() {
		super();
	}

	@Override
	public String toString() {
		return "Filter [id=" + id + ", searchCriteria=" + searchCriteria + ", pageNumber=" + pageNumber
				+ ", recordsPerPage=" + recordsPerPage + ", sort=" + sort + ", view=" + view + ", requestType="
				+ requestType + ", deviceType=" + deviceType + ", populateChannelAvailMap=" + populateChannelAvailMap
				+ ", actualSearchTerm=" + actualSearchTerm + ", includeDrug=" + includeDrug + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actualSearchTerm == null) ? 0 : actualSearchTerm.hashCode());
		result = prime * result + ((deviceType == null) ? 0 : deviceType.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (includeDrug ? 1231 : 1237);
		result = prime * result + pageNumber;
		result = prime * result + (populateChannelAvailMap ? 1231 : 1237);
		result = prime * result + recordsPerPage;
		result = prime * result + ((requestType == null) ? 0 : requestType.hashCode());
		result = prime * result + ((searchCriteria == null) ? 0 : searchCriteria.hashCode());
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
		result = prime * result + ((view == null) ? 0 : view.hashCode());
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
		Filter other = (Filter) obj;
		if (actualSearchTerm == null) {
			if (other.actualSearchTerm != null)
				return false;
		} else if (!actualSearchTerm.equals(other.actualSearchTerm))
			return false;
		if (deviceType == null) {
			if (other.deviceType != null)
				return false;
		} else if (!deviceType.equals(other.deviceType))
			return false;
		if (id != other.id)
			return false;
		if (includeDrug != other.includeDrug)
			return false;
		if (pageNumber != other.pageNumber)
			return false;
		if (populateChannelAvailMap != other.populateChannelAvailMap)
			return false;
		if (recordsPerPage != other.recordsPerPage)
			return false;
		if (requestType == null) {
			if (other.requestType != null)
				return false;
		} else if (!requestType.equals(other.requestType))
			return false;
		if (searchCriteria == null) {
			if (other.searchCriteria != null)
				return false;
		} else if (!searchCriteria.equals(other.searchCriteria))
			return false;
		if (sort == null) {
			if (other.sort != null)
				return false;
		} else if (!sort.equals(other.sort))
			return false;
		if (view == null) {
			if (other.view != null)
				return false;
		} else if (!view.equals(other.view))
			return false;
		return true;
	}
	
	
	
}
