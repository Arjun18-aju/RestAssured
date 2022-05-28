package restassuredlearning;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import restfiles.PayLoad;




public class JiraApi {
	String commid="";
	String id;
	SessionFilter session=new SessionFilter();
	@BeforeMethod
	public void base() {
		
		baseURI="http://localhost:8080";
	}
	@Test
	public void PostReqs() throws IOException {
		
		given().header("Content-Type","application/json").filter(session).body(PayLoad.jiraCred())
		.when().post("/rest/auth/1/session").then().log().all()
		.assertThat().statusCode(200);
	}
	@Test(enabled = true)
	public void PostReqscomm() throws IOException {
		
 String try1=given().header("Content-Type","application/json")
		.filter(session).pathParam("key", "AR-2").body(PayLoad.commentJson())
		.when().post("/rest/api/2/issue/{key}/comment").then().log().all()
		.assertThat().statusCode(201).extract().response().asString();
 
	JsonPath path=new JsonPath(try1);
	 commid=path.getString("id");
	System.out.println(id);
 
 
 
	}
	
	@Test
	public void attachment() {
	//	File file=new File("Bugattach.txt");
	String res=	given().filter(session).pathParam("key", "AR-2")
		.header("X-Atlassian-Token", "no-check")
		.header("Content-Type","multipart/form-data")
		.multiPart("file",new File("Bugattach.txt"))
		.when().post("/rest/api/2/issue/{key}/attachments").then().log().all()
		.assertThat().statusCode(200).extract().response().asString();
	
	JsonPath path=new JsonPath(res);
	 id=path.getString("id[0]");
	System.out.println(id);
		
	}
	
	///rest/api/2/attachment/{id}
	@Test(enabled = false)
	public void removeAttach() {
		
		given().filter(session)
		.when().delete("/rest/api/2/attachment/"+id+"").then().log().all()
		.assertThat().statusCode(204);
	}
	@Test(enabled = false)
	public void deleteComm() {
		///rest/api/2/issue/{issueIdOrKey}/comment/{id}
		given().filter(session).pathParam("key", "AR-2")
		.when()
		.delete("/rest/api/2/issue/{key}/comment/"+commid+"").then().log().all()
		.assertThat().statusCode(204);
	}
	
	
	
	
	
	
	
	
	
	
	

}
