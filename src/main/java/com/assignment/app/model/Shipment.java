package com.assignment.app.model;

import java.io.Serializable;
import java.util.List;

public class Shipment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private List<Long> items;
	
	private String carrier;
	
	private String trackingNumber;
	
	private String trackingUrl;
	
	private String estimatedDeliveryDate;
	
	private String shipDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public List<Long> getItems() {
		return items;
	}

	public void setItems(List<Long> items) {
		this.items = items;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getTrackingUrl() {
		return trackingUrl;
	}

	public void setTrackingUrl(String trackingUrl) {
		this.trackingUrl = trackingUrl;
	}

	public String getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public String getShipDate() {
		return shipDate;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public Shipment(Long id, List<Long> items, String carrier, String trackingNumber, String trackingUrl,
			String estimatedDeliveryDate, String shipDate) {
		super();
		this.id = id;
		this.items = items;
		this.carrier = carrier;
		this.trackingNumber = trackingNumber;
		this.trackingUrl = trackingUrl;
		this.estimatedDeliveryDate = estimatedDeliveryDate;
		this.shipDate = shipDate;
	}

	@Override
	public String toString() {
		return "Shipment [id=" + id + ", items=" + items + ", carrier=" + carrier + ", trackingNumber=" + trackingNumber
				+ ", trackingUrl=" + trackingUrl + ", estimatedDeliveryDate=" + estimatedDeliveryDate + ", shipDate="
				+ shipDate + "]";
	}
	
	
}
