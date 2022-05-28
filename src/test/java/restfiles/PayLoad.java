package restfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PayLoad {

	
	public static String Post() {
		
					return "{\r\n"
							+ "  \"location\": {\r\n"
							+ "    \"lat\": -38.383494,\r\n"
							+ "    \"lng\": 33.427362\r\n"
							+ "  },\r\n"
							+ "  \"accuracy\": 50,\r\n"
							+ "  \"name\": \"Frontline house\",\r\n"
							+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
							+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
							+ "  \"types\": [\r\n"
							+ "    \"shoe park\",\r\n"
							+ "    \"shop\"\r\n"
							+ "  ],\r\n"
							+ "  \"website\": \"http://google.com\",\r\n"
							+ "  \"language\": \"French-IN\"\r\n"
							+ "}\r\n"
							+ "";
	}
	
	public static String dummyApi() throws IOException {
		
		String paths="E:\\Eclipse\\RestAssured\\RestAssuredJava\\Payload.json";
		String pay=	new String(Files.readAllBytes(Paths.get(paths)));
		return pay;
	}
	
	public static String jiraCred() throws IOException {
		
		String paths="E:\\Eclipse\\RestAssured\\RestAssuredJava\\Cred.json";
		String cred=new String(Files.readAllBytes(Paths.get(paths)));
		return cred;
	}
	
public static String commentJson() throws IOException {
		
		String paths="Addcomment.json";
		String comm=new String(Files.readAllBytes(Paths.get(paths)));
		return comm;
	}
}
