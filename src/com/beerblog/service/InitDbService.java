package com.beerblog.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beerblog.entity.BlogEntry;
import com.beerblog.entity.Role;
import com.beerblog.entity.TagBlog;
import com.beerblog.entity.User;
import com.beerblog.repository.EntryRepository;
import com.beerblog.repository.RoleRepository;
import com.beerblog.repository.TagRepository;
import com.beerblog.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EntryRepository entryRepository;
	
	@Autowired
	private TagRepository tagRepository;
	
	@PostConstruct // called after the spring context creation. automatically during deployment 
	public void init(){
		
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("admin");
		userAdmin.setEmail("admin@mail.com");
		userAdmin.setRegistrationDate(new Date());
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleAdmin);
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
		
		TagBlog tag1 = new TagBlog();
		tag1.setTag("swag");
		tagRepository.save(tag1);
		
		TagBlog tag2 = new TagBlog();
		tag2.setTag("funny");
		tagRepository.save(tag2);
		
		TagBlog tag3 = new TagBlog();
		tag3.setTag("tag3");
		tagRepository.save(tag3);
		
		BlogEntry entry1 = new BlogEntry();
		entry1.setTitle("First entry title");
		entry1.setPublishedDate(new Date());
		entry1.setEntryContent("First news about beer. Don`t drink and drive");
		List<TagBlog> tags = new ArrayList<TagBlog>();
		tags.add(tag1);
		tags.add(tag2);
		entry1.setTags(tags);
		entryRepository.save(entry1);
		
		BlogEntry entry2 = new BlogEntry();
		entry2.setTitle("Two title");
		entry2.setPublishedDate(new Date());
		entry2.setEntryContent("Two 2 entry content ");
		List<TagBlog> tags2 = new ArrayList<TagBlog>();
		tags2.add(tag1);
		tags2.add(tag2);
		tags2.add(tag3);
		entry2.setTags(tags2);
		entryRepository.save(entry2);
		
	}
	
}
