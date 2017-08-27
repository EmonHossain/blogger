package com.shareknowledge.image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.shareknowledge.util.Message;

@Component
public class AsyncImageService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Async
	public CompletableFuture<byte[]> pullImageFromSystemFolder(String filePath){
		logger.debug("Thread of Image service is called with file path : "+filePath);
		File file;
		FileInputStream fileInputStream;
		byte[] b = null;
		try{
			file = new File(filePath);
			if(file.exists()){
				logger.debug("File name : "+file.getName());
				b = new byte[(int)file.length()];
				fileInputStream = new FileInputStream(file);
				fileInputStream.read(b);
				fileInputStream.close();
				logger.debug("Input stream is close");
			}
				
		}catch (Exception ex) {
			logger.debug(Message.DEBUG_MESSAGE_GENERAL+ex.getMessage());
			logger.debug(Message.DEBUG_CAUSE_GENERAL+ex.getCause());
			ex.printStackTrace();
		}
		return CompletableFuture.completedFuture(b);
	}
}
