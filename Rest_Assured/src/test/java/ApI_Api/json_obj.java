package ApI_Api;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class json_obj {
	@Test
	public void test_Put() {
		JSONObject request=new JSONObject();
		request.put("name", "sailu1");
		request.put("Job", "trainer1");
		given().header("Content-Type","application/json").
		header("x-api-key","reqres_6985ece26c494f879ad46a7af649c42e").
		body(request.toJSONString()).
		when().put("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
		
	}

}
