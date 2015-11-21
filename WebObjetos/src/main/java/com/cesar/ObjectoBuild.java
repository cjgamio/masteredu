package com.cesar;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.cesar.entity.ObjetoResultado;

@Path("/callobj")
public class ObjectoBuild implements Objeto {

	@Override
	public Response getObj(int arg1, int arg2) {
		Response.ResponseBuilder rb;
		ObjetoResultado or = new ObjetoResultado();
		or.setOperacion(arg1+arg2);
		rb = Response.status(Response.Status.OK).entity(or);
		return rb.build();
	}

}
