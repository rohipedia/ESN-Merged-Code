package com.emt.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emt.model.User;
import com.emt.repository.UserRepository;
import com.emt.common.ESNConstants;
import com.emt.exception.UserAldreadyExistsException;
import com.emt.exception.UserNotFoundException;

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
		log.info("Creating user" + user.getUserName());
		Optional<User> existingUser = userRepository.findByUserNameIgnoreCase(user.getUserName());
		if (!existingUser.isPresent()) {
			user.setDateCreated(new Date());
			return userRepository.save(user);
		} else {
			log.info(user.getUserName()+" username aldready exists.");
			throw new UserAldreadyExistsException(user.getUserName()+" username aldready exists. Kindly register with different username.");
		}
	}

	public User validateUser(String userName, String password) {
		Optional<User> userObj = userRepository.findByUserNameAndPassword(userName, password);
		if (userObj.isPresent()) {
			User user = userObj.get();
			user.setLastLogin(new Date());
			log.info("Fetching User having UserName"+userName);
			return userRepository.save(user);
		} else {
			log.info("Failed to fetch user having username"+userName);
			return null;
		}
	}

	public void resetPassword(@Valid User user) {
		/*
		 * { "isResetRequested": null, "approveResetRequest": null, }
		 */
	}

	public List<User> fetchEsnUsers(User user) {
		if (user != null) {
			Optional<User> userObj = userRepository.findById(user.getUserId());
			if(userObj.isPresent()) {
				return userRepository.findAll();
			}
		}
		return null;
	}

	public User manageEsnUsers(User updatedUserDetails) {
		if (updatedUserDetails != null) {
			Optional<User> userObj = userRepository.findById(updatedUserDetails.getUserId());
			if(userObj.isPresent()) {
				return userRepository.save(updatedUserDetails);
			}
		}
		return null;
	}
}
