package com.ust.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.server.repository.AppleRepository;

@Service
public class AppleService {

	@Autowired
	AppleRepository repository;
}
