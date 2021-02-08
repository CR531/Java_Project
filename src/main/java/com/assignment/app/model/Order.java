package com.assignment.app.model;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private Long orderId;
	
	private String customerId;
	
	private List<Item> items;
	
	private Status status;
	
	private boolean complete;

	private Address shipingAddress;
	
	private List<Shipment> shipments;
	
	public Order() {
		
	}

	public Order(Long id, Long orderId, String customerId, List<Item> items, Status status, boolean complete,
			Address shipingAddress, List<Shipment> shipments) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.customerId = customerId;
		this.items = items;
		this.status = status;
		this.complete = complete;
		this.shipingAddress = shipingAddress;
		this.shipments = shipments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
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

	public Address getShipingAddress() {
		return shipingAddress;
	}

	public void setShipingAddress(Address shipingAddress) {
		this.shipingAddress = shipingAddress;
	}

	public List<Shipment> getShipments() {
		return shipments;
	}

	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", customerId=" + customerId + ", items=" + items
				+ ", status=" + status + ", complete=" + complete + ", shipingAddress=" + shipingAddress
				+ ", shipments=" + shipments + "]";
	}
	
	
}
