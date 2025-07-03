package com.test.SpringDataJPAProject;

import com.test.SpringDataJPAProject.Entity.User;
import com.test.SpringDataJPAProject.Repositry.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaProjectApplication {

	public static void main(String[] args) {

		ApplicationContext ac=SpringApplication.run(SpringDataJpaProjectApplication.class, args);

		UserRepo ur = ac.getBean(UserRepo.class);
/*
		User user1 = new User();
		user1.setName("Ankit Anand");
		user1.setCity("Bhagalpur");
		user1.setStutas("java developer");

		User user2 = new User();
		user2.setName("Aman gupta");
		user2.setCity("Patna");
		user2.setStutas("MERN");

		User user3 = new User();
		user3.setName("Surbhi rani");
		user3.setCity("naugachia");
		user3.setStutas("ANM");


		List<User> alluser = List.of(user1, user2, user3);
		Iterable<User> users = ur.saveAll(alluser);
		users.forEach(usersdata->{
			System.out.println(usersdata);
		});
*/


		//UPDATE DATA USING JPA
/*
		Optional<User> byId = ur.findById(3);
		User user = byId.get();
		System.out.println(user);
		user.setName("nakhipiya");
		User save = ur.save(user);
		System.out.println(save);
*/

		// GTE ALL DATA
/*
		Iterable<User> all = ur.findAll();
		all.forEach(alll->{
			System.out.println(all);
		});


 */


		// DELETE BY USER

		ur.deleteById(2);
		System.out.println("data delete");


	}

}
