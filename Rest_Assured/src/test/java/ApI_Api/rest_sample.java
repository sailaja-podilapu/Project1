package ApI_Api;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class rest_sample {
	@Test
	void test_get() {
		baseURI="https://reqres.in/api";
		given().header("x-api-key","reqres_6985ece26c494f879ad46a7af649c42e")
		.get("/users?page=2")
		.then().statusCode(200).log().all();
		
		
		
		
	}
	
}
