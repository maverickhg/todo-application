package com.codestates.todoapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class toDoController {
	@GetMapping
	public static void main(String[] args) {
		System.out.println("To-do Application !");
	}
}
