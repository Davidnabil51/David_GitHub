package tests;

import com.beust.ah.A;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.UserRequests;

public class RegisterTest {

    String email = "eve.holt@reqres.in";
    String password = "pistol";
    @Test
    public void successfulRegisterTest(){
    Response response = UserRequests.register(email,password);
    response.prettyPrint();
    Assert.assertEquals(String.valueOf(response.getStatusCode()),"200","WRONG!");
    Assert.assertEquals(response.jsonPath().get("id").toString(),"4","id does not match");
    Assert.assertEquals(response.jsonPath().get("token").toString(),"QpwL5tke4Pnpja7X4","token does not match");

    }

    @Test
    public void unSeccessfulRegisterTest(){
        Response response =UserRequests.register(email,"");
        response.prettyPrint();
        Assert.assertEquals(String.valueOf(response.getStatusCode()),"400","WRONG!");
        Assert.assertEquals(response.jsonPath().get("error"),"Missing password","message is not correct");
    }

}
