package ApI_Api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class get_sample {
	@Test
	void test_get()
	{
RequestSpecification httpRequest=RestAssured.given();
httpRequest.header("x-api-key","reqres_6985ece26c494f879ad46a7af649c42e");
httpRequest.baseUri("https://reqres.in/api");
Response response=httpRequest.get("/users?page=2");
System.out.println(response.getBody().asString());
System.out.println(response.getStatusCode());
System.out.println(response.getStatusLine());
System.out.println(response.getHeader("content-type"));
int code=response.getStatusCode();
Assert.assertEquals(code,200);
		
	}
}

