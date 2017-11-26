import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class ss {
	
	public void checkHttpCode(String url){
		Response resp = given().get(url).then().extract().response();
		
		System.out.println("Returned following status code"+resp.getStatusCode());
	}
	
	public static void main(String[] args) {
		
		
		new ss().checkHttpCode("http://designco.sia.co.in/");
		
	}
	
}
