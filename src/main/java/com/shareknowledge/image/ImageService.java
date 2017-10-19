package com.shareknowledge.image;

import org.springframework.web.multipart.MultipartFile;

import com.shareknowledge.base.BlogService;

/**
 * Created by Emon Hossain on 8/23/2017.
 */
public interface ImageService extends BlogService {
	public byte[] getImageFromSystemFile(String generatedName);

	public String saveImage(MultipartFile image);
}