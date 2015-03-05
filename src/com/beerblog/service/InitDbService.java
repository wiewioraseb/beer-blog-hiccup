package com.beerblog.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beerblog.entity.Blog;
import com.beerblog.entity.Item;
import com.beerblog.entity.Role;
import com.beerblog.entity.User;
import com.beerblog.repository.BlogRepository;
import com.beerblog.repository.ItemRepository;
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
	private ItemRepository itemRepository;
	
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
		
		
	}
	
}
