package com.revision.javaSB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Message {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Message(String msg) {
		this.msg = msg;
	}
	
	

}

@RestController
public class JavaSBController {

	@Autowired
	JavaSBService js;

	@RequestMapping("/All")
	Message message() {
		return new Message("Summa Potu paathen");
	}

}
