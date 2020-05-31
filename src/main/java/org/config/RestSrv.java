package org.config;

import io.restassured.response.Response;
import org.interfaces.ReqRspInt;

import java.util.Map;

import static io.restassured.RestAssured.given;

public final class RestSrv {

    public static Response getResp(final String url) {
        return given()
                .when()
                .get(url);
    }

    public static Response getResp(final String url, final String queryParams) {
        return given()
                .queryParam(queryParams)
                .when()
                .get(url);
    }

    public static Response getResp(final String url, final Map queryParams) {
        return given()
                .queryParams(queryParams)
                .when()
                .get(url);
    }

    public static void getResp(ReqRspInt reqRspIn, Map params) {

        Object rsp = given()
                .pathParams(params)
                .get(reqRspIn.getUrl())
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .as(reqRspIn.getRspClass());

        reqRspIn.setRsp(rsp);
    }

    public void postResp(ReqRspInt reqRspI) {

        Object response = given()
                .body(reqRspI.getReq())
                .post(reqRspI.getUrl())
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .as(reqRspI.getRspClass());

        reqRspI.setRsp(response);
    }
}
