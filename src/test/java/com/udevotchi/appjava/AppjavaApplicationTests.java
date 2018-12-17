package com.udevotchi.appjava;

import com.udevotchi.appjava.model.User;
import com.udevotchi.appjava.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppjavaApplicationTests {

	@Autowired
	private UserRepository userrepository;


	@Test
	public void testConnexionBdd() {
		//Given

		//When
		long nbUser = userrepository.count();

		//Then
		Assert.assertTrue((nbUser > 0));
	}

	public void testUtilisateur(){
		
	}
}

