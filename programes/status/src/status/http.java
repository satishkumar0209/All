package status;

import com.jayway.restassured.response.Response;

public class http {

	public void checkHttpCode(String url){
		Response resp = given().get(url).then().extract().response();
		
		System.out.println("Returned following status code"+resp.getStatusCode());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Added new code
		
		new restassuredhttpcodes().checkHttpCode("http://designco.sia.co.in/");
		
	}
	
}