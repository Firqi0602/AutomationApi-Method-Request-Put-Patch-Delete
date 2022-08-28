package com.juaracoding.restassured.kuis;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestDelete {

	@Test
	public void testDelete() {
			when()
			.delete("https://mern-backend-8881.herokuapp.com/products/6309a820011f13c27c328ab1")
			.then()
			.statusCode(204)
			.log().all();
		}
		
		}
