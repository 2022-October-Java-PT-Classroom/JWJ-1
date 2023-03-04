package com.example.demo.Controllers;
import com.example.demo.Models.Address;
import com.example.demo.Repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AddressController {

    @Autowired
    private AddressRepository addressRepo;

    @GetMapping("/{id}")
    public Iterable <Address> findAllById() {
        return addressRepo.findAllById();
    }
    @PostMapping("/")
    public Address addAddress(@RequestBody Address address) {
        return addressRepo.save(address);
    }

}