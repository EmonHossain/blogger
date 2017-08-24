package com.shareknowledge.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> getAll() {
		return (List<T>) userRepository.findAll();
	}

	

	@Override
	public <T> void save(T object) {
		userRepository.save((UserEntity) object);
	}

	@Override
	public <T> void update(T object) {
		// userRepository.
	}

	@Override
	public <T> void delete(T id) {
		userRepository.delete((Integer) id);
	}



	@Override
	public <T> Object getUniqueResult(T id) {
		return userRepository.findOne((Integer) id);
	}

}
