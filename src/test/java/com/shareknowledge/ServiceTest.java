package com.shareknowledge;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.shareknowledge.image.AsyncImageService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { AsyncImageService.class })
public class ServiceTest {


}
