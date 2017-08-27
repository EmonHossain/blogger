package com.shareknowledge.image;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.shareknowledge.base.BlogService;

/**
 * Created by Emon Hossain on 8/23/2017.
 */
public interface ImageService extends BlogService {
	public byte[] getActualImage(long imageId);
	public List<ImageEntity> saveImages(List<MultipartFile> images);
}