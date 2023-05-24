package com.example.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.regex.Pattern;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
		// Checks if the string matches with the regex
		// Should be single character a to z
		System.out.println("1"+Pattern.matches("[a-z]", "g"));

		// Check if the element is range a to z or A to Z
		System.out.println("2"+Pattern.matches("[a-zA-Z]", "Gfg"));

		// Checking all the strings using regex
		System.out.println("3"+Pattern.matches("[b-z]?", "a"));

		// Check if all the elements are in range a to z or A to Z
		System.out.println("4"+Pattern.matches("[a-zA-Z]+", "GfgTestCase"));

		// Check if elements is not in range a to z
		System.out.println("5"+Pattern.matches("[^a-z]?", "g"));

		// Check if all the elements are either g,e,k or s
		System.out.println("6"+Pattern.matches("[geks]*", "geeksgeeks"));
		// Check if all elements are numbers
		System.out.println("7"+Pattern.matches("\\d+", "1234"));

		// Check if all elements are non-numbers
		System.out.println("8"+Pattern.matches("\\D+", "1234"));

		// Check if all the elements are non-numbers
		System.out.println("9"+Pattern.matches("\\D+", "Gfg"));

		// Check if all the elements are non-spaces
		System.out.println("10"+Pattern.matches("\\S+", "gfg"));
		// Checks if the string matches with the regex
		// Should be single character a to z
		System.out.println("11"+Pattern.matches("[a-z]", "g"));

		// Check if all the elements are non-numbers
		System.out.println("12"+Pattern.matches("\\D+", "Gfg"));

		// Check if all the elements are non-spaces
		System.out.println("13"+Pattern.matches("\\S+", "gfg"));

	}
}
