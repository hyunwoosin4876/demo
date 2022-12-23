package com.example.demo.bizlogic.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bizlogic.demo.dto.request.DemoReqDTO;
import com.example.demo.bizlogic.demo.dto.response.DemoResDTO;
import com.example.demo.bizlogic.demo.service.DemoService;

import io.swagger.annotations.ApiOperation;

@RestController
public class DemoConstroller {
	
	@Autowired
	DemoService domeService;
	
	@ApiOperation(value="test", notes="test")
	@RequestMapping(value="/demo/test", method={RequestMethod.POST})
	public DemoResDTO demo(DemoReqDTO paramDTO) throws Exception {
		return domeService.demo(paramDTO);
	}
}