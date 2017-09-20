package com.shareknowledge.image;

import java.io.File;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.shareknowledge.util.Message;

public class ImageServiceImpl implements ImageService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

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
	public byte[] getActualImage(long imageId) {
		ImageEntity image = imageRepository.findOne(imageId);
		String fullPath = image.getImageLocation() + File.separator + image.getGeneratedName();
		return asyncService.getFileFromStorage(fullPath);
	}

	@Override
	public String saveImages(MultipartFile image) {
		String message = null;
		//save image information only to database
		CompletableFuture<String> imageDb = asyncService.saveImageInfoToDb(image.getOriginalFilename(), "");
		@SuppressWarnings("unused")
		//save image file to system storage
		CompletableFuture<Void> imageStorage = asyncService.saveImageToStorage(image);
		try {
			//return in 2 second if the task fails in time
			return imageDb.get(2000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException ie) {
			logger.debug(Message.DEBUG_CAUSE_GENERAL + ie.getCause());
			message = ie.getMessage();
		} catch (ExecutionException ee) {
			logger.debug(Message.DEBUG_CAUSE_GENERAL + ee.getCause());
			message = ee.getMessage();
		} catch (TimeoutException te) {
			logger.debug(Message.DEBUG_CAUSE_GENERAL + te.getCause());
			message = te.getMessage();
		} catch (Exception e) {
			logger.debug(Message.DEBUG_CAUSE_GENERAL + e.getCause());
			message = e.getMessage();
		}
		return message;
	}

}
