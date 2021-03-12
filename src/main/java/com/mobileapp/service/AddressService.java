package com.mobileapp.service;

import java.util.List;

import com.mobileapp.dto.AddressDTO;

public interface AddressService {
	
	List<AddressDTO> getAddresses(String id);

	AddressDTO getAddressByAddressId(String id);

}
