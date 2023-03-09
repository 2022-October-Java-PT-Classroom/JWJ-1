package com.example.demo.Repositories;


import com.example.demo.Models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

    Iterable<Address> findAllById();
}
