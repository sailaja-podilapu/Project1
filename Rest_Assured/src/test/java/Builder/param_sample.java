package Builder;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;


public class param_sample {
	@Test
	void query_method() {
		baseURI="https://reqres.in/api";
		given().header("x-api-key","reqres_a2ff53d9acf7dbe00637f2f52e711")
		.pathParam("resource","users")
		.queryParam("page",2).get("/{resource}?page=2")
		.then().statusCode(200)
		.body("data[4].first_name",equalTo("George"))
		.body("data.first_name",hasItems("george","Rachel"));
			
	}

}
