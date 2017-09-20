package com.shareknowledge.image;

import java.io.File;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class ImageSaver {

	@Value("${image.location}")
	private String IMAGE_DIRECTORY;

	public void saveImageToFolder(MultipartFile file,String generatedName,String ext) {

		String folder = IMAGE_DIRECTORY + File.separator;
		File temp = new File(folder);
		if (!temp.exists()) {
			temp.mkdirs();
		}

		String fileNameWithExt = generatedName + "." + ext;

		try {
			File f2 = new File(folder + fileNameWithExt);
			file.transferTo(f2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
