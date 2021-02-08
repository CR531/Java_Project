package com.assignment.app.model;

import java.io.Serializable;

public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Long id;	
	
	String name;
	
	String planId;
	
	String skuId;
	
	Integer quantity;

	String telephoneNumber;
	
	Status status;
	
	boolean complete;
	
	DateRange estimatedShipDateRange;
	
	DateRange newEstimatedShipDateRange;
	
	boolean userAcceptedDelay;
	
	String delayAcceptedDate;

	public Item(Long id, String name, String planId, String skuId, Integer quantity, String telephoneNumber,
			Status status, boolean complete, DateRange estimatedShipDateRange, DateRange newEstimatedShipDateRange,
			boolean userAcceptedDelay, String delayAcceptedDate) {
		super();
		this.id = id;
		this.name = name;
		this.planId = planId;
		this.skuId = skuId;
		this.quantity = quantity;
		this.telephoneNumber = telephoneNumber;
		this.status = status;
		this.complete = complete;
		this.estimatedShipDateRange = estimatedShipDateRange;
		this.newEstimatedShipDateRange = newEstimatedShipDateRange;
		this.userAcceptedDelay = userAcceptedDelay;
		this.delayAcceptedDate = delayAcceptedDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public DateRange getEstimatedShipDateRange() {
		return estimatedShipDateRange;
	}

	public void setEstimatedShipDateRange(DateRange estimatedShipDateRange) {
		this.estimatedShipDateRange = estimatedShipDateRange;
	}

	public DateRange getNewEstimatedShipDateRange() {
		return newEstimatedShipDateRange;
	}

	public void setNewEstimatedShipDateRange(DateRange newEstimatedShipDateRange) {
		this.newEstimatedShipDateRange = newEstimatedShipDateRange;
	}

	public boolean isUserAcceptedDelay() {
		return userAcceptedDelay;
	}

	public void setUserAcceptedDelay(boolean userAcceptedDelay) {
		this.userAcceptedDelay = userAcceptedDelay;
	}

	public String getDelayAcceptedDate() {
		return delayAcceptedDate;
	}

	public void setDelayAcceptedDate(String delayAcceptedDate) {
		this.delayAcceptedDate = delayAcceptedDate;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", planId=" + planId + ", skuId=" + skuId + ", quantity="
				+ quantity + ", telephoneNumber=" + telephoneNumber + ", status=" + status + ", complete=" + complete
				+ ", estimatedShipDateRange=" + estimatedShipDateRange + ", newEstimatedShipDateRange="
				+ newEstimatedShipDateRange + ", userAcceptedDelay=" + userAcceptedDelay + ", delayAcceptedDate="
				+ delayAcceptedDate + "]";
	}
	
	
}
