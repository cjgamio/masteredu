package edu.cibertec.jaad.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@HandlerChain(file="/handler-chain.xml")
public interface TimeService {

    @WebMethod
    public String getTimeAsString();

    @WebMethod
    public long getTimeAsElapsed();
}
