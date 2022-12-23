package com.example.demo.bizlogic.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.bizlogic.demo.dto.request.DemoReqDTO;
import com.example.demo.bizlogic.demo.dto.response.DemoResDTO;

@Service
public interface DemoService {
	public DemoResDTO demo(DemoReqDTO paramDTO) throws Exception;
}
