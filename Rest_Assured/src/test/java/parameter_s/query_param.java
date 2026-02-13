package parameter_s;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

public class query_param {
	@Test
	void test_01() {
		given().header("x-api-key","reqres_6985ece26c494f879ad46a7af649c42e")
		.queryParam("resource","users")
		.get("https://reqres.in api/{resource}?page=2")
		.then().statusCode(200)
		    .body("data[4].first_name",equalTo("sailu"))
		    .body("data.first_name",hasItems("sailu,sailaja"))
		.log().all();
		
	}

}


