package com.beerblog.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beerblog.entity.Blog;
import com.beerblog.entity.Entry;
import com.beerblog.entity.Role;
import com.beerblog.entity.User;
import com.beerblog.repository.BlogRepository;
import com.beerblog.repository.EntryRepository;
import com.beerblog.repository.RoleRepository;
import com.beerblog.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BlogRepository blogRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EntryRepository entryRepository;
	
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
		
		Blog beerBlog = new Blog();
		beerBlog.setName("Blog about beer!");
		beerBlog.setUrl("www.URL-OF-MY-BLOG.com");
		beerBlog.setUser(userAdmin);
		blogRepository.save(beerBlog);
		
		Entry entry1 = new Entry();
		entry1.setBlog(beerBlog);
		entry1.setTitle("First entry its official now");
		entry1.setLink("www.link-to-bier.com");
		entry1.setPublishedDate(new Date());
		entry1.setEntryContent("First news about beer is here. Don`t drink and <br> drive");
		entryRepository.save(entry1);
		
		/*
		Item item1 = new Item();
		item1.setBlog(beerBlog);
		item1.setTitle("first blog about bier");
		item1.setLink("www.link-to-bier.com");
		item1.setPublishedDate(new Date());
		itemRepository.save(item1);
		
		Item item2 = new Item();
		item2.setBlog(beerBlog);
		item2.setTitle("second blog about bier");
		item2.setLink("www.link-second-to-bier.com");
		item2.setPublishedDate(new Date());		
		itemRepository.save(item2);
		*/
		
	}
	
}
