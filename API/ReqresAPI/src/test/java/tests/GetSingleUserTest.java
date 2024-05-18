package tests;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import requests.UserRequests;

public class GetSingleUserTest {

    String id = "1";

    @Test
    public void getSingleUser() {
        Response response = UserRequests.getSingleUser(id);
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(jsonPath.get("data.id").toString(),id, "id is not as expected");
        response.then().statusCode(200);
    }


}
