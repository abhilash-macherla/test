package com.ashokit.blog.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="COMMENT_TBL")
public class Comment {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentid;
   
   private String name;
   
   private String email;
   
   @Lob
   private String content;
   
   @CreationTimestamp
   private LocalDate created_on;
   

   @ManyToOne
	@JoinColumn(name = "postid")
	private Post post;
   
   
   
	
	
}
