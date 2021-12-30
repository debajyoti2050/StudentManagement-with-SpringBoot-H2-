package a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class test {
	@GetMapping("/")
	public String call()
	{
		return "<h1>I am cheems</h1>";
	}

}
