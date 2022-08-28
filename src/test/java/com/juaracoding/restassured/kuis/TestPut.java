package com.juaracoding.restassured.kuis;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestPut {

	@Test
	public void testPut() {
		JSONObject request = new JSONObject();
		request.put("name", "Wifi");
		request.put("category","Sayuran");
		request.put("price",1100000);
		System.out.println(request.toJSONString());
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("https://mern-backend-8881.herokuapp.com/products/62e209f7f0e24546b900e034")
		.then()
		.statusCode(200)
		.log().all();
	}
}
