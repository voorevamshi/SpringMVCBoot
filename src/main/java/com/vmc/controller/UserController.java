package com.vmc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vmc.entity.User;
import com.vmc.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/")
	public String gotoUserPage(Model model){
		System.out.println("----------Entered into gotoUserPage------------");
		commonCode(model);
		return "user";
	}
	
	@PostMapping("/addUser")
	public String addUser(@ModelAttribute("user") User user,Model model){
		System.out.println("----------Entered into addUser------------"+user);
		user=userRepository.save(user);
		model.addAttribute("userData", user);
		commonCode(model);
		return "user";
	}
	@GetMapping("/getUser")
	public String getUser(@RequestParam("userId") String userId,Model model){
		System.out.println("----------Entered into getUser------------");
		User user=userRepository.findOne(Long.parseLong(userId));
		model.addAttribute("getUserData", user);
		commonCode(model);
		return "user";
	}
	@GetMapping("/getAllUsers")
	public @ResponseBody List<User> getAllUsers(Model model){
		System.out.println("----------Entered into getAllUsers------------");
		return (List<User>) userRepository.findAll();
	}
	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("userId") String userId,Model model){
		System.out.println("----------Entered into deleteUser------------");
		userRepository.delete(Long.parseLong(userId));
		commonCode(model);
		return "user";
	}
	@GetMapping("/updateUser")
	public String updateUser(@RequestParam("userId") String userId,Model model){
		System.out.println("----------Entered into updateUser------------");
		User user=userRepository.findOne(Long.parseLong(userId));
		model.addAttribute("user",user);
		model.addAttribute("userList", userRepository.findAll());
		return "user";
	}
	public void commonCode(Model model){
		//bind Empty UserObject
		model.addAttribute("user", new User());
		//show all users
		model.addAttribute("userList", userRepository.findAll());
	}
	
	@GetMapping("/searchUsersByName")
	public @ResponseBody List<User> searchUsersByName(@RequestParam("userName") String userName,Model model){
		List<User> userList=userRepository.searchUsersByName(userName);
		return userList;
	}
}
