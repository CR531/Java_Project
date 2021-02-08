package com.assignment.app.model.response;

import java.io.Serializable;
import java.util.List;

import com.assignment.app.model.Item;
import com.assignment.app.model.Status;

public class OrderSummary implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private Long orderId;

	private String customerId;

	private List<Item> items;

	private Status status;

	private boolean complete;

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

}
