package Api;
import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Api_Operations {

    // @Test
    public void get_Status(){
        Response response=get("https://reqres.in/api/users?page=2");
        int statusCode= response.getStatusCode();
        System.out.println("Status code :" +statusCode);
        String responseBody=response.getBody().toString();
        System.out.println("response body :" +responseBody);
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        Assert.assertEquals(statusCode,"200");
    }

   // @Test
    public void test_001_BDD(){
        given().
                when().get("https://reqres.in/api/users?page=2").
                then().
                statusCode(200).
                body("data.id",equalTo(7)).
                assertThat().statusCode(200).
                and().
                body("data[0].first_name",equalTo("Michael")).and().
                body("data.email",hasItem("michael.lawson@reqres.in")).and().
                body("data.first_name",hasItems("George" ,"Rachel"));
    }

    @Test
    public void post_call(){
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("name","Rajendra");
        map.put("job","SDM");
        JSONObject JSON=new JSONObject(map);
        System.out.println("JSON  "+JSON);

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                when().body(JSON.toJSONString()).
                body(JSON).
                when().
                post("https://reqres.in/api/users").
                then().statusCode(201).
                and().
                log().all().toString();
    }

  //  @Test
    public void put_call(){
        JSONObject JSON=new JSONObject();
        JSON.put("name","Maninder");
        JSON.put("job","Advocate");
        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                when().body(JSON.toJSONString()).
                when().
                body(JSON.toJSONString()).
                put("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().body();
    }

    @Test
    public void patch_call(){
        JSONObject JSON=new JSONObject();
        JSON.put("name","Sumit");

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).accept(ContentType.JSON).
                when().body(JSON.toJSONString()).
                when().
                patch("https://reqres.in/api/users/2").
                then().
                statusCode(200).
                log().body()
                .assertThat().statusCode(200);
    }

}
