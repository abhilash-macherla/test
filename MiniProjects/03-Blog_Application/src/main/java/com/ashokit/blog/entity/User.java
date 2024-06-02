package com.ashokit.blog.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="USER_TBL")
public class User{
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	
	private String email;
	
	private String firstname;
	
	private String lastname;
	
	private String password;
	
	
	@OneToMany(cascade = CascadeType.REMOVE)
	@JoinColumn(name="postid")
	private List<Post> post;
	
	
	
	
	
	
}
