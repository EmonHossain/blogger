package com.shareknowledge.image;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private AsyncImageService asyncService;
	
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

	@Override
	public List<ImageEntity> saveImages(List<MultipartFile> images) {
		List<ImageEntity> imageEntities = new ArrayList<ImageEntity>();
		//CompletableFuture<ImageEntity> cfi[] = new CompletableFuture<ImageEntity>[10];
		int index=0;
		for(MultipartFile image : images){
			
		}
		return null;
	}
	
	

}
