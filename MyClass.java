package newpackage;

import org.openqa.selenium.*;
import java.io.*;
import java.util.*;
import java.lang.*;


public class MyClass {
	
	public static void main(String[] args) throws IOException {
					
		Process process = Runtime.getRuntime().exec("cmd /c start cmd.exe /k \"pause && curl -X POST -H \"Content-Type: application/json; charset=utf-8\" https://api.turning.io/v1/person/search -d \"{\\\"first_name\\\":\\\"Samwise\\\",\r\n" + 
				" \\\"last_name\\\":\\\"Gamgee\\\",\r\n" + 
				" \\\"phone_number\\\":\\\"3125551212\\\",\r\n" + 
				" \\\"email\\\":\\\"samwise@mordor.com\\\"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"}\"\r\n" + 
				"\r\n" + 
				" -H \"authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIiLCJzdWIiOiJCRFhLZnBtMnZEMFAzOWYyZjdyNWpRTTVmUWVhWG1GQnJ1eXNJSlZEMndVaUFiOE5vMUZXYVhEVDhFMkNqeWV1IiwiYXVkIjoicWU5YWhxNWlHN2RUb0dybWNWZDlVNnAyYThXWlVmbz0iLCJleHAiOjE1ODg0NjA2OTYsImlhdCI6MTU1NjkyNDY5Nn0.n5Ec4cjtWsYQyoXG5tv_gjs3vIBXZkg16z0SWRfn8LM\"\r\n" + 
				" && pause && curl -X POST -H \"Content-Type: application/json; charset=utf-8\" https://api.turning.io/v1/person/search -d \"{\\\"first_name\\\":\\\"Darth\\\",\r\n" + 
				" \\\"last_name\\\":\\\"Vader\\\",\r\n" + 
				" \\\"phone_number\\\":\\\"8475551212\\\",\r\n" + 
				" \\\"email\\\":\\\"lordvader@thedarkside.com\\\"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"}\"\r\n" + 
				"\r\n" + 
				" -H \"authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIiLCJzdWIiOiJCRFhLZnBtMnZEMFAzOWYyZjdyNWpRTTVmUWVhWG1GQnJ1eXNJSlZEMndVaUFiOE5vMUZXYVhEVDhFMkNqeWV1IiwiYXVkIjoicWU5YWhxNWlHN2RUb0dybWNWZDlVNnAyYThXWlVmbz0iLCJleHAiOjE1ODg0NjA2OTYsImlhdCI6MTU1NjkyNDY5Nn0.n5Ec4cjtWsYQyoXG5tv_gjs3vIBXZkg16z0SWRfn8LM\"\r\n" + 
				" && pause && curl -X POST -H \"Content-Type: application/json; charset=utf-8\" https://api.turning.io/v1/person/search -d \"{\\\"first_name\\\":\\\"Walter\\\",\r\n" + 
				" \\\"last_name\\\":\\\"White\\\",\r\n" + 
				" \\\"phone_number\\\":\\\"2245551212\\\",\r\n" + 
				" \\\"email\\\":\\\"heisenberg@bluestuff.com\\\"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"}\"\r\n" + 
				"\r\n" + 
				" -H \"authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIiLCJzdWIiOiJCRFhLZnBtMnZEMFAzOWYyZjdyNWpRTTVmUWVhWG1GQnJ1eXNJSlZEMndVaUFiOE5vMUZXYVhEVDhFMkNqeWV1IiwiYXVkIjoicWU5YWhxNWlHN2RUb0dybWNWZDlVNnAyYThXWlVmbz0iLCJleHAiOjE1ODg0NjA2OTYsImlhdCI6MTU1NjkyNDY5Nn0.n5Ec4cjtWsYQyoXG5tv_gjs3vIBXZkg16z0SWRfn8LM\"\r\n" + 
				" \"");
		
	
			
	}
	}

	