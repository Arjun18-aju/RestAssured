package restassuredlearning;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


import org.testng.annotations.Test;

import io.restassured.response.Response;
import restfiles.PayLoad;
public class PostDemo1 {


	
	@Test
	public void postReq() {
		baseURI="https://rahulshettyacademy.com";
		

		given().log().all().queryParam("Key", "qaclick123").header("Content-Type","application/json")
				.body(PayLoad.Post())
				.when().post("/maps/api/place/add/json")
				.then().log().all().assertThat().statusCode(200)
				.and()
				.header("Server", "Apache/2.4.41 (Ubuntu)")
				.and()
				.body("status", equalTo("OK"));

	//	JsonPath path=new JsonPath(res);
	//	place=path.getString("place_id");
		//String expaddress="29, side layout, cohen 09";
	//	System.out.println(place);
	}
@Test
	public void Get() {

			Response res=given().log().all()
				.queryParam("Key", "qaclick123")
				.queryParam("place_id", "246fd15163d1106a4f262e5619994ee6")
				.when()
				.post("https://rahulshettyacademy.com/maps/api/place/get/json")
				.then().log().all()
		        .body("address", empty())
				.assertThat().statusCode(200).and()
				.extract().response();
			String report=res.asString();
System.out.println(report);

		
}
		 
	
	
}
