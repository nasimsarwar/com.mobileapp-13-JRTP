package com.mobileapp.serviceImp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.mobileapp.dto.UserDto;
import com.mobileapp.entities.UserEntity;
import com.mobileapp.repositories.UserRepository;

class UserServiceImpTest {
	
	@InjectMocks
	UserServiceImp userServiceImp;
	
	@Mock
	UserRepository userRepo;
	@BeforeEach
	void setup() throws Exception{
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testGetUser() {
		UserEntity userEntity = new UserEntity();
		userEntity.setId(1L);
		userEntity.setFirstName("Nasim");
		userEntity.setUserId("user1233");
		userEntity.setEncryptedPassword("jjfvzfzjdksn123");
		when(userRepo.findByEmail(anyString())).thenReturn(userEntity);
		UserDto userdto = userServiceImp.getUser("nasim@nasim.com");
	   assertNotNull(userdto);
	   assertEquals("Nasim", userdto.getFirstName());
	}

}
