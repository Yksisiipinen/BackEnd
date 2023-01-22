package k23.viikko1palautettava.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ControllerEka {
	@RequestMapping("index")
	@ResponseBody
	public String showMainPage() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String showContactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHelloToSomeone(@RequestParam(name="location", required=false, defaultValue="Moon") String paikka,
			@RequestParam(name="name") String nimi) {
		return "Welcome to the  " + paikka + " " + nimi + "!";
	}
}
