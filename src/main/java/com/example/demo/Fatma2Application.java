package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.fiche;
import com.example.demo.repository.FicheRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.RoleEnum;


@SpringBootApplication
public class Fatma2Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx= SpringApplication.run(Fatma2Application.class, args);
	FicheRepository FicheRepository= ctx.getBean(FicheRepository.class);
    FicheRepository.save(new fiche(1234,"hjaij","fatma",23,23704263,"fhggyy"));
	FicheRepository.save(new fiche(15555,"hjaij","fatma",20,23704263,"fhggyy"));
	
	
	RoleRepository RoleRepository= ctx.getBean(RoleRepository.class);
	Role roleUser=new Role(RoleEnum.ROLE_USER);
	Role roleAdmin=new Role(RoleEnum.ROLE_ADMIN);
	 RoleRepository.save(roleUser);
	 RoleRepository.save(roleAdmin);
	 
	UserRepository UserRepository = ctx.getBean(UserRepository .class);
	User  user = new User("user","0000",true);
	user.setRoles(Arrays.asList(roleUser));
	UserRepository.save(user);
	
	User  admin = new User("admin","0000",true);
	admin.setRoles(Arrays.asList(roleAdmin,roleUser));
	UserRepository.save(admin);
	}

}
