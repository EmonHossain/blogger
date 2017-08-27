package com.shareknowledge.image;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private ImageRepository imageRepository;

	@Override
	public <T> List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Object getUniqueResult(T id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> boolean save(T object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> boolean update(T object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> boolean delete(T id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public byte[] getActualImage(long imageId){
		
		return null;
	}

}
