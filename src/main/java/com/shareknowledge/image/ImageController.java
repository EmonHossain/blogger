package com.shareknowledge.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.interceptor.MatchAlwaysTransactionAttributeSource;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;

/**
 * Created by Emon Hossain on 8/23/2017.
 */
@RestController
@RequestMapping("/image")
public class ImageController {
	
	@Autowired
	private ImageService imageService;
	
	@GetMapping("/{imgid}")
	public ResponseEntity<byte[]> getImage(@PathVariable(name="imgid",required=true)String imageName){
		return new ResponseEntity<byte[]>(imageService.getImageFromSystemFile(imageName),HttpStatus.OK);
	}
	@PostMapping("/upload")
	public ResponseEntity<String> saveImage(MultipartFile image,BindingResult result){
		if(result.hasErrors())
			return new ResponseEntity<String>("Upload failed, try again",HttpStatus.NO_CONTENT);
		return new ResponseEntity<String>(imageService.saveImage(image),HttpStatus.OK);
	}
	
}
