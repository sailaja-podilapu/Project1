package parameter_s;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class test_delete {
	@Test
	public void test01_delete() {
		JSONObject request=new JSONObject();
		request.put("name", "sailu");
		request.put("job", "Trainer");
		given().
		header("content-Type","application/json")
		.header("x-api-key","reqres_6985ece26c494f879ad46a7af649c42e")
		.body(request.toJSONString())
		.when().delete("https://reqres.in/api/users/2")
		.then().statusCode(204)
		.log().all();
	}

}
