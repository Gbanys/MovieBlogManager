package com.tr.contentManager.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
public class Comment {
    private int id;
    private LocalDateTime createDate; 
    private String comment;
    private User user; 
    private Content content;

}
