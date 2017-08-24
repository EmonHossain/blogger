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
	public String IMAGE_DIRECTORY;

	public String saveImageToFolder(MultipartFile file) {

		String imageName = UUID.randomUUID().toString();
		String fileExtention = FilenameUtils.getExtension(file.getOriginalFilename());

		String folder = IMAGE_DIRECTORY + File.separator;
		File temp = new File(folder);
		if (!temp.exists()) {
			temp.mkdirs();
		}

		String modifiedDbUrl = File.separator + "images" + File.separator + imageName;
		String fileNameWithExt = imageName + "." + fileExtention;

		try {
			File f2 = new File(folder + fileNameWithExt);
			file.transferTo(f2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		return modifiedDbUrl;

	}

}
