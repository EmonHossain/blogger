package com.shareknowledge.image;

import java.util.concurrent.CompletableFuture;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.shareknowledge.base.BlogService;

/**
 * Created by Emon Hossain on 8/23/2017.
 */
public interface ImageService extends BlogService {
	public byte[] getActualImage(long imageId);
	public String saveImages(MultipartFile image);
}