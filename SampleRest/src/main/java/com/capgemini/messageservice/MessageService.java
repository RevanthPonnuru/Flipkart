package com.capgemini.messageservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemini.messagedatabase.MessageDatabase;
import com.capgemini.models.MessagePojo;



public class MessageService {
	


	private  Map<Long,MessagePojo> messagepojo = MessageDatabase.getMessages();
	public MessageService() {
		messagepojo.put((long) 1,new MessagePojo(1, "Revanth", "I love u", "Thursday"));
		messagepojo.put((long) 2,new MessagePojo(2, "Sahithi", "Mental", "Saturday"));
	}
	
	public List<MessagePojo> getAllMessages(){
		
		return new ArrayList<MessagePojo>(messagepojo.values());
		
		
	}
	public MessagePojo getMessage(long id) {
		return messagepojo.get(id);
	}
	public MessagePojo addMessage(MessagePojo message ) {
		message.setId(messagepojo.size()+1);
		messagepojo.put(message.getId(), message);
		return message;
		
	}
	public MessagePojo updateMessage(MessagePojo message ) {
		if(message.getId() <= 0) {
			return null;
		}
		messagepojo.put(message.getId(),message);
		return message;
	}
	
	public MessagePojo removeMessage(long id) {
		return messagepojo.remove(id);
	}
}
