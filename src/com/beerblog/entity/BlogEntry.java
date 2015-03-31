package com.beerblog.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class BlogEntry {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;
	

	@Column(name = "entry_content")
	private String entryContent;
	
	@Column(name = "published_date") // nazwa kolumny
	private Date publishedDate;
	
	
	@ManyToMany
	@JoinTable
	private List<TagBlog> tags;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEntryContent() {
		return entryContent;
	}

	public void setEntryContent(String entryContent) {
		this.entryContent = entryContent;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public List<TagBlog> getTags() {
		return tags;
	}

	public void setTags(List<TagBlog> tags) {
		this.tags = tags;
	}

	
}
