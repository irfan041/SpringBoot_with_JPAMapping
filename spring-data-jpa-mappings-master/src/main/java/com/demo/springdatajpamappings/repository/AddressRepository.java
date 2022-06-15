package com.demo.springdatajpamappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springdatajpamappings.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
