package com.example.outsourcers;

import com.example.outsourcers.modelo.Cliente;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

@Path("/servicioscliente")
public interface ClienteServicio {

	@Path("/clientes")
	@GET
	List<Cliente> getClientes();
	
	@Path("/clientes/{id}")
	@GET
	Cliente getCliente(@PathParam("id") Long id);
	
	@Path("/clientes")
	@POST
	Response crearCliente(Cliente cliente);
	
	@Path("/clientes")
	@PUT
	Cliente actualizarCliente(Cliente cliente);
	
	@Path("/clientes/{id}")
	@DELETE
	Cliente eliminarCliente(@PathParam("id") Long id);
	
}
