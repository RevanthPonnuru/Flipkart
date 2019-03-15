package com.capgemini.messagedatabase;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.models.MessagePojo;
import com.capgemini.models.MessageProfile;

public class MessageDatabase {

	private static Map<Long,MessagePojo> messagepojo = new HashMap<>();
	private static Map<Long,MessageProfile> messageprofile = new HashMap<>();
	public static Map<Long,MessagePojo> getMessages(){
		return messagepojo;
	}
	private static Map<Long,MessageProfile> getProfiles(){
		return messageprofile;
	}
}
