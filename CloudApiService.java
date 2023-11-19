package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CloudVender;

@RestController
@RequestMapping("/cloudvender")
public class CloudApiService {
	
	CloudVender cloudVender;
	
	@GetMapping("{venderId}")
	public CloudVender getCloudVenderDetails(String venderId) {
		return cloudVender;
//				new CloudVender("c1","vender 1","Address One","123456");
	}
	
	@PostMapping
	public String createCloudVenderDetails(@RequestBody CloudVender cloudVender) {
		this.cloudVender = cloudVender;
		return "cloud Vender created successfully";
	}
	
	@PutMapping
	public String updateCloudVenderDetails(@RequestBody CloudVender cloudVender) {
		this.cloudVender = cloudVender;
		return "cloud Vender updated successfully";
	}
	
	@DeleteMapping("{venderId}")
	public String deleteCloudVenderDetails(String venderId) {
		this.cloudVender = null;
		return "cloud Vender deleted successfully";
	}
}
