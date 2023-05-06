package com.ashokit.blog.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="POST_TBL")
public class Post {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer postid;
	
	private String title;
	
	private String discription;
	
	@Lob
	private String content;
	
	@CreationTimestamp
	private LocalDate created_on;
	
	@UpdateTimestamp
	private LocalDate update_on;

	
	@ManyToOne
	@JoinColumn(name = "userid")
	private User user;
	
	@OneToMany(cascade = CascadeType.REMOVE)
	private List<Comment> comment;
	
	
	
	
}
