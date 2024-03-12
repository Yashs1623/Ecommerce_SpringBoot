package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
