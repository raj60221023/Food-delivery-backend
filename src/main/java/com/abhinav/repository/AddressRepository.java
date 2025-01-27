package com.abhinav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhinav.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
