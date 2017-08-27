package com.shareknowledge.image;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

public class ImageServiceImpl implements ImageService {
	
	@Autowired
	private AsyncImageService asyncService;
	
	@Autowired
	private ImageRepository imageRepository;

	@Autowired
    private ImageSaver imageSaver;

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
		ImageEntity image = imageRepository.findOne(imageId);
		String fullPath = image.getImageLocation()+File.separator+image.getGeneratedName();
		return asyncService.getFileFromStorage(fullPath);
	}

	@Override
	public void saveImages(List<MultipartFile> images) {
	    CompletableFuture<String>[] completableFutures = images.stream()
                .map(img -> CompletableFuture
                        .supplyAsync(()-> imageSaver.saveImageToFolder(img)))
                .collect(Collectors.toList())
                .toArray(new CompletableFuture[0]);

	    List<CompletableFuture<String>> output = new ArrayList<>();
        CompletableFuture.allOf(completableFutures).thenAccept(list -> {try {
            for (CompletableFuture<String> c: completableFutures) {
                output.add(c);
            }
        }catch (Exception e) {
            e.getMessage();
        }
        });

	}
	
	

}
