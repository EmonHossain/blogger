package com.shareknowledge.image;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Emon Hossain on 8/23/2017.
 */
@Profile(value = "dev")
@Service
public class ImageServiceImpl implements ImageService {

	@Override
	public <T> List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getOne(T id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void save(T object) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void update(T object) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void delete(T id) {
		// TODO Auto-generated method stub

	}

}
