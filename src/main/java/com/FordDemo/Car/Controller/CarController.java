package com.FordDemo.Car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.FordDemo.Car.Email.EMailService;
import com.FordDemo.Car.model.CAR;
import com.FordDemo.Car.model.UserEmail;
import com.FordDemo.Car.repositories.CarRepository;

@RestController
@RequestMapping("api/C1/Cars")
public class CarController
{

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private EMailService myEmailService;
	
	@Autowired
	private UserEmail userEmail;
	//private CAR car;
	
	@GetMapping
	public List<CAR> getcars()
	{
		return carRepository.findAll();
		
		}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void EnterCar(@RequestBody CAR car) {
		carRepository.save(car);
	}
	
	@GetMapping("/email")
	public String send() {

		userEmail.setEmailAddress("mahashabdemanik@gmail.com");  
		
		try {
			myEmailService.sendEmail(userEmail);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been sent to the user.";
	}
	
	@GetMapping("/{id}")
	public CAR get(@PathVariable("id")long id)
	{
		return carRepository.getOne(id);
	}
}
