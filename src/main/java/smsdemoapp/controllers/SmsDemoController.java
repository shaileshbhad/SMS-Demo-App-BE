package smsdemoapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import smsdemoapp.DTO.SmsDemoDTO;
import smsdemoapp.services.SmsDemoService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SmsDemoController {
	
	@Autowired
	private SmsDemoService smsDemoservice;
	  @RequestMapping(value ="/getDetails", method= RequestMethod.GET)
	   public List<SmsDemoDTO> getDetails(){
		  System.out.println("Controller caalled.........");
		  return smsDemoservice.getDetails();
		  
	  }

}
