package Builder;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class builder_path {
	void builder_method() {
		RequestSpecBuilder reqBuilder=new RequestSpecBuilder();
		reqBuilder.setBaseUri("https://restful-booker.herokuapp.com");
		reqBuilder.setBasePath("/booking");
		RequestSpecification reqSpec=reqBuilder.build();
		System.out.println("================");
		Response res2=RestAssured.given(reqSpec).get();
		System.out.println(res2.asString());
		System.out.println("============");
	}

}
