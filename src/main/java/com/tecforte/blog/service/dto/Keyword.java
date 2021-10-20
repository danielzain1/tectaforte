package com.tecforte.blog.service.dto;

import com.tecforte.blog.config.Constants;

import com.tecforte.blog.domain.Authority;
import com.tecforte.blog.domain.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.*;
import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * A DTO representing a user, with his authorities.
 */
public class Keyword {

    
    private String keyword;

    private String emotion;

    private String blog;

    public Keyword() {
        // Empty constructor needed for Jackson.
    }

   

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public String getblog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

   
}
