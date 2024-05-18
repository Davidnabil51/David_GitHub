package utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {

    public static String baseUrl = "https://reqres.in/api";
    public static String usersEndPoint = "/users/";
    public static String registerEndPoint = "/register";

    public static Map<String,String> generalHeaders ()
    {
        Map<String,String> headers = new HashMap<>();
        headers.put("Authorization","QpwL5tke4Pnpja7X4");
        return headers;
    }




}
