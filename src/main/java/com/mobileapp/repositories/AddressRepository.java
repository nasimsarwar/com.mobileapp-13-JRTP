package com.mobileapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileapp.dto.AddressDTO;
import com.mobileapp.entities.AddressEntity;
import com.mobileapp.entities.UserEntity;

@Repository
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

    List<AddressEntity> findAllByUserDetails(UserEntity userEntity);

     AddressEntity findByAddressId(String id);

}
