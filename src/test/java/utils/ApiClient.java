package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class ApiClient {

    /**
     * Executes a POST request to a given endpoint with a payload.
     * Useful for setting up pre-configuration data.
     */
    public static Response post(String baseUrl, String endpoint, Object body, Map<String, String> headers) {
        RequestSpecification request = RestAssured.given()
                .baseUri(baseUrl)
                .contentType("application/json");

        if (headers != null) {
            request.headers(headers);
        }

        if (body != null) {
            request.body(body);
        }

        return request.post(endpoint);
    }

    /**
     * Executes a GET request to a given endpoint.
     */
    public static Response get(String baseUrl, String endpoint, Map<String, String> headers) {
        RequestSpecification request = RestAssured.given()
                .baseUri(baseUrl);

        if (headers != null) {
            request.headers(headers);
        }

        return request.get(endpoint);
    }
}
