package com.example.firstWebApp;

import com.example.firstWebApp.services.userServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstWebAppApplication implements Runnable{

	public static void main(String[] args) {

		SpringApplication.run(FirstWebAppApplication.class, args);
	}

	@Override
	public void run() {
		userServices u = new userServices();
		System.out.println("result ="+u.login("k@k","12345"));
	}
}