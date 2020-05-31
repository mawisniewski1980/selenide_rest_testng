package org.apis;

import org.dto.StudentDTOReq;
import org.dto.StudentDTORsp;
import org.enums.EndpointsUrls;
import org.interfaces.ReqRspInt;

public class StudentApi implements ReqRspInt<StudentDTOReq, StudentDTORsp> {

    private String url;
    private StudentDTOReq req = new StudentDTOReq();
    private StudentDTORsp rsp;

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
    public StudentDTOReq getReq() {
        return req;
    }

    @Override
    public StudentDTORsp getRsp() {
        return rsp;
    }

    @Override
    public Class<StudentDTOReq> getReqClass() {
        return StudentDTOReq.class;
    }

    @Override
    public Class<StudentDTORsp> getRspClass() {
        return StudentDTORsp.class;
    }

    private void setResponse(StudentDTORsp response) {
        this.rsp = response;
    }

    @Override
    public void setRsp(Object rsp) {
        this.setResponse((StudentDTORsp) rsp);
    }
}
