package com.example.demo.Controllers;
import com.example.demo.Models.Address;
import com.example.demo.Repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepo;

    @GetMapping("/{id}")
    public Iterable<Address> findAllById() {
        return addressRepo.findAllById();
    }

    @PostMapping("/")
    public Address addAddress(@RequestBody Address address) {
        return addressRepo.save(address);
    }

    @PutMapping("/{id}")
    public Address updateAddress(@PathVariable("id") Long id, @RequestBody Address address) {
        Optional<Address> addressOptional = addressRepo.findById(id);
            return addressRepo.save(address);
    }
}
