package Authori_zation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base_uri {
	@Test(enabled=true)
	public void two() {
		RestAssured.baseURI="https://api.github.com";
		RestAssured.basePath="/users/podilapu-sailaja/repos";
		
		RequestSpecification RequestSpec=RestAssured.given();
		RequestSpec.header("Authorization","Bearer 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");
		
		Response response=RequestSpec.get();
		JsonPath jsonpath=response.jsonPath();
		
		String reposname=jsonpath.getString("name");
		System.out.println(reposname);
		
		Assert.assertEquals(response.statusCode(),404);
		
		
	}

}
