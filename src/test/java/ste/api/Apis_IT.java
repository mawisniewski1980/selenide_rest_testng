package ste.api;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import io.restassured.response.Response;
import ste.BaseApiTest;
import ste.api.apis.StudentApi;
import ste.api.config.RestSrv;
import org.testng.annotations.Test;
import ste.api.endpoints.EndpointsUrls;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Apis_IT extends BaseApiTest {

    @Test(testName = "testApi1", groups = {"API"})
    public void testApi1() {
        Response rsp = RestSrv.getResp(EndpointsUrls.GOOGLE_SEARCH.getUrl());
        //rsp.prettyPrint();
        assertThat(200).isEqualTo(rsp.statusCode());
    }

    @Test(testName = "testApi2", groups = {"API"})
    public void testApi2() {
        Response rsp = RestSrv.getResp("http://localhost:8080/");
        rsp.prettyPrint();
        assertThat(200).isEqualTo(rsp.statusCode());
        assertThat("Welcome! This is a demo application.").isEqualTo(rsp.getBody().jsonPath().get("msg"));
    }

    @Test(testName = "testApi3", groups = {"API"})
    public void testApi3() {
        Map map = ImmutableMap.of("programme", "Computer Science", "limit", 1);
        Response rsp = RestSrv.getResp(EndpointsUrls.STUDENT_API_LIST.toString(), map);
        assertThat(200).isEqualTo(rsp.statusCode());
        assertThat(rsp).isNotNull();
    }

    @Test(testName = "testApi4", groups = {"API"})
    public void testApi4() {
        Map map = ImmutableMap.of("id", 1);
        StudentApi studentApi = new StudentApi();

        RestSrv.getResp(studentApi, map);
        assertThat(ImmutableList.of("Accounting", "Statistics")).isEqualTo(studentApi.getRsp().getCourses());
    }

}
