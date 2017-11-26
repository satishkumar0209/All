package des;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;

public class respon {

		
		
		public void checkHttpResponseCode(String url) {
	        Response response = given().get(url).then().extract().response();
	               
	                        
	 
	        System.out.println(response.getStatusCode());
	    }
	 
	    public static void main(String args[]) {
	        new HttpResponseCode().checkHttpResponseCode("http://www.google.com");
	        
	        
	    }
	}             