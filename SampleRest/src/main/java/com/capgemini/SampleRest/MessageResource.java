package com.capgemini.SampleRest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.capgemini.messageservice.MessageService;
import com.capgemini.models.MessagePojo;

@Path("/messages")
@Produces(MediaType.APPLICATION_XML)

public class MessageResource {
	MessageService messageservice = new MessageService();

	@GET
	public List<MessagePojo> getMessages() {
		return messageservice.getAllMessages();
	}
	@GET
	@Path("/{messageId}")
public MessagePojo getMessage(@PathParam("messageId") long id) {
	
	return messageservice.getMessage(id);

		
	}
}
