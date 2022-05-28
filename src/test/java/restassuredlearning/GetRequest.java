package restassuredlearning;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetRequest {

	@Test
	public void getRequest() {
		
       baseURI="https://reqres.in/api/users";
       
       given()
       .when()
           .get(baseURI)
       .then()
           .statusCode(200)
       .assertThat()
       .body("support.text", equalTo("To keep ReqRes free, contributions towards server costs are appreciated!"));
		
	}
	
}
