package a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class test {
	@GetMapping("/")
	public String call()
	{
		return "<h1>This is a Test Page. paste '/swagger-ui.html' to go to swagger log.</h1>";
	}

}
