package org.bs.gestion.service;

import java.util.List;

import org.bs.gestion.dao.SubscriberDao;
import org.bs.gestion.model.Subscriber;
import org.springframework.beans.factory.annotation.Autowired;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/Subscriber")
public class SubscriberService {
	@Autowired
	private SubscriberDao  dao;
	
	
	@POST
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/add")
	public Subscriber saveUser ( Subscriber u )
	{
		return dao.save( u );
	}
	@PUT
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/update")
	public Subscriber updateUser ( Subscriber u )
	{
		return dao.save( u );
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAll")
	
	public List<Subscriber> getSbscribers()
	{
		return dao.findAll();	
	}
	@GET
	@Path("/getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Subscriber getSbscriberById(@PathParam(value = "id")long id)
	{
		return dao.findById(id).get();
	}
	@DELETE
	@Path("/delete/{id}")
	public void deleteSbscriber(@PathParam(value = "id")long id)
	{
		dao.deleteById(id);
	}
}
