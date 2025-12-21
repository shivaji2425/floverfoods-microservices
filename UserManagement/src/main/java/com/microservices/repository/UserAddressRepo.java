package com.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.entity.UserAddress;

@Repository
public interface UserAddressRepo extends JpaRepository<UserAddress, Long> {

}
