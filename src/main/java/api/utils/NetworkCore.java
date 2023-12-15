package api.utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

//нужен для того, чтобы создать реализацию самого запроса (GET, POST)
public class NetworkCore {

    protected Response response;
    protected RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
    protected JSONObject responseBody;

    /*это метод, для отправки запроса, получения ответа и проверки статус кода
      передаем в него methd(метод HTTP) и код */
    public void sendRequestAndGetResponse(Method methd, int code){
        response = given().spec(requestSpecBuilder.build()).log().uri().log().parameters()
                .when().request(methd);
        response.then().assertThat().statusCode(code);
        try {
            responseBody = new JSONObject(response.getBody().asString());
        } catch (Exception e){
            Assert.fail("Can't get response body");
        }
    }
}
