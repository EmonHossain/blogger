package com.shareknowledge.image;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.CompletableFuture;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.shareknowledge.util.Generator;
import com.shareknowledge.util.Message;

@Component
public class AsyncImageService {

	@Value("${image.location}")
	private String IMAGE_DIRECTORY;

	@Autowired
	private ImageRepository imageRepository;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Async
	public CompletableFuture<byte[]> pullImageFromSystemFolder(String filePath) {
		return CompletableFuture.completedFuture(getFileFromStorage(filePath));
	}

	public byte[] getFileFromStorage(String filePath) {
		logger.debug("Thread of Image service is called with file path : " + filePath);
		File file;
		FileInputStream fileInputStream;
		byte[] b = null;
		try {
			file = new File(filePath);
			if (file.exists()) {
				logger.debug("File name : " + file.getName());
				b = new byte[(int) file.length()];
				fileInputStream = new FileInputStream(file);
				fileInputStream.read(b);
				fileInputStream.close();
				logger.debug("Input stream is close");
			}

		} catch (Exception ex) {
			logger.debug(Message.DEBUG_MESSAGE_GENERAL + ex.getMessage());
			logger.debug(Message.DEBUG_CAUSE_GENERAL + ex.getCause());
			ex.printStackTrace();
		}
		return b;
	}

	@Async
	public CompletableFuture<String> saveImageInfoToDb(String imageName, String generatedName,String ext) {
		String imageLocation = IMAGE_DIRECTORY + File.separator + generatedName;
		imageRepository.save(new ImageEntity(generatedName, imageName, ext, imageLocation));
		return CompletableFuture.completedFuture("images"+File.separator+generatedName);
	}

	@Async
	public CompletableFuture<Void> saveImageFileToStorage(MultipartFile image,String generatedName,String ext) {

		return null;
	}
}
