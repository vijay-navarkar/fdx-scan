package com.fdx.rtct.scan.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fdx.rtct.scan.model.DashboardModel;

@RestController
@RequestMapping("/dev")
public class ScanDevController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(path = "/method1" , method = RequestMethod.GET   )
	public DashboardModel method2(){
		System.out.println("ScanDevController");
		return new DashboardModel(1,2,3,"vijay");
		
	}
	
	@RequestMapping(path = "/cnt" , method = RequestMethod.GET   )
	public List<String> cnt(){
		System.out.println("cnrry list");
		String url = "http://STATICMODULE/country/countries";
		//List<String> list = (List<String>) restTemplate.getForObject(url, Object.class);
		ResponseEntity<String[]> response = restTemplate.getForEntity(url, String[].class);
		String[] str= response.getBody();
		List<String> list = Arrays.asList(str);
		return list;
		}

}
