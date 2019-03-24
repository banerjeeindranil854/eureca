package com.javainuse.external;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.javainuse.controllers.ConsumerControllerClient;

@RestController
public class TestController {
	@Autowired
	ConsumerControllerClient consumerControllerClient;
	@RequestMapping(value = "/1", method = RequestMethod.GET)
	public String firstPage() throws RestClientException, IOException {

		return consumerControllerClient.getEmployee();
	}

}