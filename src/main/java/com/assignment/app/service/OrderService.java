package com.assignment.app.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assignment.app.model.Item;
import com.assignment.app.model.SKU;
import com.assignment.app.model.response.OrderDetail;
import com.assignment.app.model.response.OrderSummary;
import com.assignment.app.util.WireMockUtil;

@Service
public class OrderService {

	@Value("${order.service.url}")
	private String url;

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	CatalogService catalogService;

	@Autowired
	WireMockUtil wireMockUtil;

	public OrderSummary getOrderSummary(Long orderId) {

		return buildOrderSummary(orderId);

	}

	public List<OrderSummary> getOrderSummary(String customerId) {

		List<OrderSummary> response = new ArrayList<>();

		List<Long> orders = wireMockUtil.getCustIdToOrderId().get(customerId);

		if (!CollectionUtils.isEmpty(orders)) {

			for (Long id : orders) {
				response.add(buildOrderSummary(id));
			}
		}

		return response;

	}

	public OrderDetail getOrderDetails(Long orderId) {

		String orderUrl = url + orderId;
		OrderDetail orderDetail = restTemplate.getForObject(orderUrl, OrderDetail.class);

		for (Item item : orderDetail.getItems()) {

			SKU sku = catalogService.getSKU(item.getSkuId());
			orderDetail.getSkus().add(sku);
		}

		return orderDetail;

	}

	private OrderSummary buildOrderSummary(Long id) {

		String orderUrl = url + id;
		OrderSummary orderSummary = restTemplate.getForObject(orderUrl, OrderSummary.class);
		return orderSummary;
	}

}
