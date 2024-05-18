package requests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.Constants;

public class UserRequests {

    public static Response getSingleUser(String id)
    {
        return RestAssured.given().log().all().get(Constants.baseUrl + Constants.usersEndPoint + id);
    }

    public static Response register( String email , String password )
    {
        return RestAssured.given().log().all().contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"email\": \""+email+"\",\n" +
                        "    \"password\": \""+password+"\"\n" +
                        "}")
                .post(Constants.baseUrl + Constants.registerEndPoint);
    }

}
