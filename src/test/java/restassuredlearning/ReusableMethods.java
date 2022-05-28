package restassuredlearning;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {

	
	public static JsonPath jsonPath(String resp) {
		
		JsonPath js=new JsonPath(resp);
				return js;
	}
}
