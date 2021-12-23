package restAssured.project;

import static org.hamcrest.Matchers.is;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
@Test
public class GetTest extends TestBase1 {
	public void verfiyWithGet() {
		logger.info("Inside Get Method");
		RestAssured
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.assertThat()
			.statusCode(200)
		.and();
			//.body("[0].name.official", is("Republic of India"));
		//.log().all();
		logger.info("Response url verfied");
	}
}
