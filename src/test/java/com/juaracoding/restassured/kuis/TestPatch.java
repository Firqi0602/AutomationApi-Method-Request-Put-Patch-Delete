package com.juaracoding.restassured.kuis;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPatch {
	
	@Test
	public void testPatch() {
		JSONObject request = new JSONObject();
		request.put("name", "Sam");
		request.put("category","Elektronik");
		System.out.println(request.toJSONString());
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("https://mern-backend-8881.herokuapp.com/products/6309a820011f13c27c328ab1")
		.then()
		.statusCode(400)
		.log().all();
	}
}
