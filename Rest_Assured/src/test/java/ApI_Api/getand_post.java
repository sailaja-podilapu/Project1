package ApI_Api;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class getand_post {
	@Test(enabled=false)
	void test_01() {
		baseURI="https://reqres.in/api";
				given().header("x-api-key","reqres_6985ece26c494f879ad46a7af649c42e")
						.get("/users?page=2")
						.then().statusCode(200)
						.body("data[4].first_name",equalTo("George"))
						.body("data.first_name",hasItems("George","Rachel"));
						
	}

}
