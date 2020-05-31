package org.apis;

import org.dto.StudentReq;
import org.dto.StudentRsp;
import org.enums.EndpointsUrls;
import org.interfaces.ReqRspInt;

public class StudentApi implements ReqRspInt<StudentReq, StudentRsp> {

    private String url;
    private StudentReq req = new StudentReq();
    private StudentRsp rsp;

    public StudentApi() {
        this.url = EndpointsUrls.STUDENT_API_ID.toString();
    }

    public StudentApi(String url) {
        this.url = url;
    }

    @Override
    public String getUrl() {
        return this.url;
    }

    @Override
    public StudentReq getReq() {
        return req;
    }

    @Override
    public StudentRsp getRsp() {
        return rsp;
    }

    @Override
    public Class<StudentReq> getReqClass() {
        return StudentReq.class;
    }

    @Override
    public Class<StudentRsp> getRspClass() {
        return StudentRsp.class;
    }

    private void setResponse(StudentRsp response) {
        this.rsp = response;
    }

    @Override
    public void setRsp(Object rsp) {
        this.setResponse((StudentRsp) rsp);
    }
}
