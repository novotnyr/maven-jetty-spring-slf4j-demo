package sk.upjs.ics.novotnyr.mjss;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoggingController {
	private final Logger logger = LoggerFactory.getLogger(LoggingController.class);
	
	@RequestMapping("/log")
	@ResponseBody 
	public String onLog() {
		logger.debug("Accessing onLog()");
		return "OK";
	}
}
