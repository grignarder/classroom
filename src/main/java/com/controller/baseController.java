package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class baseController {
	@RequestMapping("/base")
	public int say() {
		System.out.println("caeifwa");
		return 1;
	}

}
