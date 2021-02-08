# App Service

This service is offering below 3 API -

1. http://localhost:8000/customer/{cust_id}/order/summary

	i.e http://localhost:8000/customer/cust01/order/summary

This above API Provide Order Summary based on customer Id.

2. http://localhost:8000/order/{order_id}/summary

	i.e http://localhost:8000/order/1/summary

This above API Provide Order Summary based on order Id.

3. http://localhost:8000/order/{order_id}/detail

	i.e http://localhost:8000/order/1/detail

This API Provide Order Details based on order Id.


 

## Getting Started

This application is developed using Spring Boot, Wiremock , Maven

## Requirements

Java - 1.8.x

Maven - 3.x.x



**1. Build and run the app using maven**

```bash
mvn clean install
java -jar target/app-1.0.jar```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

* The app will start running at <http://localhost:8000>.
* Wiremock Port :8080
