package com.murilo.salesystem.services;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murilo.salesystem.UserRepository;
import com.murilo.salesystem.entities.Client;
import com.murilo.salesystem.entities.Company;
import com.murilo.salesystem.entities.User;

@Service
public class DBService {

	@Autowired
	private UserRepository userRepository;
	
	public void instantiateTest() {
		User u1 = new User(null, "Murilo Ribeiro", "admin", "102030");
		User u2 = new Company(null, "Padaria Ótima Ltda", "empresa1", "102030", "42864359000157", 0.15, 0.0);
		User u3 = new Company(null, "Varejo & Mais", "empresa2", "102030", "45138191000190", 0.15, 0.0);
		User u4 = new Client(null, "Murilo Ribeiro", "cliente1", "102030", "22306262055", LocalDate.parse("1997-04-19"));
		User u5 = new Client(null, "Ana Julia", "cliente2", "102030", "18169880068", LocalDate.parse("2007-06-11"));
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));
	}
	
}
