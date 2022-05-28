package restassuredlearning;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

import org.apache.http.params.CoreConnectionPNames;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;

public class PostRequest {
	
	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void post() {
		
		map.put("first_name", Utils.FirstName());
		map.put("last_name", Utils.job());
		
		baseURI="https://reqres.in/api/users/2";
		
		
	}
	
	@Test
	public void Validation() {
		RestAssuredConfig config=  RestAssured.config.httpClient(HttpClientConfig.httpClientConfig()
		.setParam("http.connection.timeout",1));
		
		String auth="hfjfhfjfhhhf";
		Response res=
		given().auth().oauth2(auth).config(config)
		.contentType("application/json")
		.body(map)
		.when()
		.put()
		.then()
		.statusCode(200)
		.log().all().extract().response();
		
		String response=res.asString();
		Assert.assertEquals(response.contains("hello updated"), true);
		
	}

}
