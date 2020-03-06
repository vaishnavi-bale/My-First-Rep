package com.cts.project.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VaishRestController {

	@GetMapping("/vaish")
	public String msg() {
		return "Hello Everyone";
	}
}
