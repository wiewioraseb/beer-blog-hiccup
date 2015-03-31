package com.beerblog.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TagBlog {

	@Id
	@GeneratedValue
	private Integer id;

	private String tag;

	@ManyToMany(mappedBy="tags") // many users can have many roles
	private List<BlogEntry> entries;
	
	
	public List<BlogEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<BlogEntry> entries) {
		this.entries = entries;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
}
