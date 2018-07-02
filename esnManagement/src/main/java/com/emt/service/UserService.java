package com.emt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emt.model.User;
import com.emt.repository.UserRepository;
import com.emt.common.ESNConstants;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author tejas.anil.rane
 *
 */
@Service
@Slf4j
public class UserService {

	@Autowired
	UserRepository userRepository;

	/**
	 * 
	 * @retu
	 */
	public List<User> getUsers() {
		log.info("Fetching all users from the userRepository on" +ESNConstants.DATE_TIME);
		return userRepository.findAll();
	}

	public User getUser(Long id) {
		Optional<User> selectedUser = userRepository.findById(id);
		if (selectedUser.isPresent()) {
			log.info("Fetching User having ID"+id);
			return selectedUser.get();
			
		}
		log.info("User with id"+id+"not found");
		return null;
	}

	public Long deleteUser(Long id) {
		Optional<User> currentUser = userRepository.findById(id);
		if (currentUser.isPresent()) {
			log.info("Deleting User having ID"+id);
			userRepository.delete(currentUser.get());
			return id;
		}
		log.info("Failed to delete user having ID"+id);
		return null;
	}

	public User updateUser(Long id, User updatedUserDetails) {
		Optional<User> currentUser = userRepository.findById(id);
		if (currentUser.isPresent()) {
			log.info("Updating user details for the user having id" +id);
			currentUser.get().setUserName(updatedUserDetails.getUserName());
			currentUser.get().setUserEmail(updatedUserDetails.getUserEmail());
			currentUser.get().setPassword(updatedUserDetails.getPassword());
			currentUser.get().setIsAdmin(updatedUserDetails.getIsAdmin());
			currentUser.get().setIsActive(updatedUserDetails.getIsActive());
			currentUser.get().setIsResetRequested(updatedUserDetails.getIsResetRequested());
			currentUser.get().setApproveResetRequest(updatedUserDetails.getApproveResetRequest());
			return userRepository.save(currentUser.get());
		}
		log.info("Failed to update user having ID"+id);
		return null;
	}

	public User createUser(User user) {
		log.info("Creating user" +user);
		return userRepository.save(user);
	}

	public User validateUser(String userName, String password) {
		Optional<User> user = userRepository.findByUserNameAndPassword(userName, password);
		if (user.isPresent()) {
			log.info("Fetching User having UserName"+userName);
			return user.get();
		}
		log.info("Failed to fetch user having username"+userName);
		return null;
	}
}
