package restAssured.project;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostTest extends TestBase1 {
	public static HashMap<String, String> map =new HashMap<String ,String>();
	@BeforeMethod
	public void createWithPost() {
		map.put("name","morpheus");
		map.put("job", "leader");
		logger.info("PayLoad Ready");
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath="/api/users";
		logger.info("BaseURL Specified");
	}
	@Test
	public void createResourcePost() {
		logger.info("Inside POST Method");
		 RestAssured
			.given()	
				.contentType("application/json")
				.body(map)
			.when()
				.post()
			.then()	
				.assertThat()
				.statusCode(201);
		 logger.info("Response Code Verified");
	}
}
