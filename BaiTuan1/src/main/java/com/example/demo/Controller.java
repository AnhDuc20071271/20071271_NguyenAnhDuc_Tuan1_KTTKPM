package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/Tuan1")
public class Controller {
	@GetMapping(name="/Tuan1")
	public String Api() {
		return "id : 001,Mssv: 20071271,FullName : Nguyen Anh Duc ,dia chi : Ho Chi Minh,Quequan : Binh Dinh}]";
	}
}
