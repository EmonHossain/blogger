package com.shareknowledge;

import static org.assertj.core.api.Assertions.assertThat;

import com.shareknowledge.user.UserDao;
import org.hibernate.Session;
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
import com.shareknowledge.user.UserService;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { BlogApplication.class })
@EnableJpaRepositories(basePackages={"com.shareknowledge.base","com.shareknowledge.user"})
@PropertySource("test.properties")
@EnableTransactionManagement
public class UserTest {

	@Autowired
	UserDao repo;

	@Test
	public void saveUser(){
		UserEntity userEntity = new UserEntity("emon","Emon","Hossain","emon",new UserDetails("SE","N/A","No one"));
		repo.saveEntity(UserEntity.class.getName(),userEntity);
		int id = userEntity.getUserId();
		assertThat(repo.findAll(UserEntity.class).size()).isEqualTo(1);
		
		UserEntity userEntity2 = (UserEntity) repo.findById(UserEntity.class,id);
		userEntity2.setFirstName("update");
		
		repo.updateEntity(UserEntity.class.getName(),userEntity2);
		assertThat(((UserEntity) repo.findById(UserEntity.class,id)).getFirstName()).isEqualTo("update");
	}
	
	
	
}
