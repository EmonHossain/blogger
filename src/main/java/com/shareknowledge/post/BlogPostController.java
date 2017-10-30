package com.shareknowledge.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class BlogPostController {
    @GetMapping("/list")
    public String list() {
        return "Hello World!";
    }

    @GetMapping("/create")
    public String create() {
        return "Hello World!";
    }

    @PostMapping("/save")
    public String save() {
        return "Hello World!";
    }
}
