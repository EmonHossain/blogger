package com.shareknowledge.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/caution")
public class MessageController {
	
	 @RequestMapping("/access-denied")
	    public String denied(){
	    	return "message/access-denied";
	    }
	    @RequestMapping("/not-found")
	    public String notFoundError(){
	    	return "message/404";
	    }
	    @RequestMapping("/error")
	    public String internalError(){
	    	return "message/500";
	    }

}
