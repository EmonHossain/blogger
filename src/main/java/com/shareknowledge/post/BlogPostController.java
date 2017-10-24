package com.shareknowledge.post;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogPostController {
    @RequestMapping("post/posts")
    String list() {
        return "Hello World!";
    }

    @RequestMapping("post/create")
    String create() {
        return "Hello World!";
    }

    @RequestMapping("post/save")
    String save() {
        return "Hello World!";
    }
}
