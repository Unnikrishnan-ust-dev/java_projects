package com.ust.server.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.server.repository.ChocolateRepository;

@Service
public class ChocolateService {

	@Autowired
	ChocolateRepository repository;
}
