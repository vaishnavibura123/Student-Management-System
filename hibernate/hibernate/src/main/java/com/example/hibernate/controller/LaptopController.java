package com.example.hibernate.controller;

import com.example.hibernate.model.Laptop;
import com.example.hibernate.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    @PostMapping("/laptop")
    public Laptop addLaptop(@RequestBody String laptop){
        return laptopService.addLaptop(laptop);
    }
    @GetMapping("/laptop")
    public List<Laptop> getLaptops(){
        return laptopService.getLaptops();
    }
    @GetMapping("/laptop/Id/{ID}")
    public Laptop getLaptopById(@PathVariable Integer ID){
        return laptopService.getLaptopById(ID);
    }
    @DeleteMapping("/laptop/Id/{ID}")
    public void deleteLaptop(@PathVariable Integer ID){
        laptopService.deleteLaptop(ID);
    }
    @PutMapping("/laptop/Id/{ID}")
    public void updateLaptop(@PathVariable Integer ID, @RequestBody Laptop laptop){
        laptopService.updateLaptop(ID, laptop);
    }
}
