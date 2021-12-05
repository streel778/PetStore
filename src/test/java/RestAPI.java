import io.restassured.http.ContentType;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static io.restassured.RestAssured.given;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RestAPI {

    @Test    @Order(1)
    public void getInventory() {
        given()
                .baseUri("http://petstore.swagger.io/v2")
                .basePath("/store/inventory")
                .when().get()
                .then().log().all().statusCode(200);
    }

    @Test
    @Order(2)
    public void placeOrder() {

        String jsonBody = "{\n" +
                "  \"id\": 1344,\n" +
                "  \"petId\": 10,\n" +
                "  \"quantity\": 2,\n" +
                "  \"shipDate\": \"2021-12-04T22:00\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";

        given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when().post("https://petstore.swagger.io/v2/store/order")
                .then().log().all().statusCode(200);

    };

    @Test
    @Order(3)
    public void getOrder() {

        given()
                .baseUri("http://petstore.swagger.io/v2")
                .basePath("/store/order")
                .when().get("/1344")
                .then().log().all().statusCode(200);

    };

    @Test
    @Order(4)
    public void deleteOrder() {
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/store/order")
                .when().delete("/1344")
                .then().log().all().statusCode(200);
    }

}

