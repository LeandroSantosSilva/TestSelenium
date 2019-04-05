import static org.junit.Assert.*;
import org.junit.Test;
import static com.jayway.restassured.RestAssured.given;

public class MainTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	 public void makeSureThatGoogleIsUp() {
		 given().when().get("http://www.google.com").then().statusCode(200);
	 }

}
