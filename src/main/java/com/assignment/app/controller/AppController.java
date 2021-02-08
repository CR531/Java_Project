package com.assignment.app.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.app.model.response.OrderDetail;
import com.assignment.app.model.response.OrderSummary;
import com.assignment.app.service.OrderService;

@RestController
public class AppController {

	HashMap<String, Long> custIdToOrderId = new HashMap<>();

	@Autowired
	OrderService orderService;

	@PostConstruct
	public void init() {
		custIdToOrderId.put("user01", 1L);
	}

	@GetMapping("customer/{custId}/order/summary")
	public List<OrderSummary> getCustomerSummary(@PathVariable(value = "custId") String custId)
			throws ClientProtocolException, IOException {

		return orderService.getOrderSummary(custId);

	}

	@GetMapping("order/{orderId}/summary")
	public OrderSummary getOrderSummary(@PathVariable(value = "orderId") Long orderId)
			throws ClientProtocolException, IOException {

		return orderService.getOrderSummary(orderId);

	}

	@GetMapping("/order/{orderId}/detail")
	public OrderDetail getDetail(@PathVariable(value = "orderId") Long orderId)
			throws ClientProtocolException, IOException {

		return orderService.getOrderDetails(orderId);

	}

}
