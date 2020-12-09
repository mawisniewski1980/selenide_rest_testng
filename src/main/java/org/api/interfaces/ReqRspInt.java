package org.api.interfaces;

public interface ReqRspInt<Req, Rsp> {

    String getUrl();

    Req getReq();

    Rsp getRsp();

    Class<Req> getReqClass();

    Class<Rsp> getRspClass();

    void setRsp(Object rsp);

}
