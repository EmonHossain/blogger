package com.shareknowledge;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.shareknowledge.user.UserDetails;
import com.shareknowledge.user.UserEntity;
import com.shareknowledge.user.UserRepository;
import com.shareknowledge.user.UserService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { BlogApplication.class })
@EnableJpaRepositories(basePackages="com.shareknowledge.user")
@PropertySource("test.properties")
@EnableTransactionManagement
public class UserTest {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository repo;
	
	@Before
	public void deleteAllRow(){
		repo.deleteAll();
	}
	
	private int id=0;
	
	@Test
	public void saveUser(){
		UserEntity userEntity = new UserEntity("emon","Emon","Hossain","emon",new UserDetails("SE","N/A","No one"));
		userService.save(userEntity);
		id = userEntity.getUserId();
		assertThat(userService.getAll().size()).isEqualTo(1);
		
		UserEntity userEntity2 = (UserEntity) userService.getUniqueResult(id);
		userEntity2.setFirstName("update");
		
		repo.save(userEntity2);
		assertThat(repo.findOne(id).getFirstName()).isEqualTo("update");
	}
	
	
	
}
