package com.example.hibernate.service;

import com.example.hibernate.model.Laptop;
import com.example.hibernate.model.Student;
import com.example.hibernate.repository.LaptopRepo;
import com.example.hibernate.repository.StudentRepo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaptopService {
    @Autowired
    private LaptopRepo laptopRepo;
    @Autowired
    private StudentRepo studentRepo;
    public Laptop addLaptop(String laptop) {
        JSONObject jsonObject=new JSONObject(laptop);
        Student student = null;
        int ID = jsonObject.getInt("student");

        if(studentRepo.findById(ID).isPresent()) {
            student = studentRepo.findById(ID).get();
        } else {
            return null;
        }

        Laptop laptop2=new Laptop();
        laptop2.setBrand(jsonObject.getString("brand"));
        laptop2.setName(jsonObject.getString("name"));
        laptop2.setPrice(jsonObject.getString("price"));
        laptop2.setStudent(student);

        Laptop laptop3=laptopRepo.save(laptop2);
        return laptop3;


    }

    public List<Laptop> getLaptops() {
       return laptopRepo.findAll();
    }

    public Laptop getLaptopById(Integer ID) {
       return laptopRepo.findById(ID).get();
    }

    public void deleteLaptop(Integer ID) {
        laptopRepo.deleteById(ID);

    }

    public void updateLaptop(Integer ID, Laptop laptop) {
        Laptop laptop1=laptopRepo.findById(ID).get();
        laptop1.setName(laptop.getName());
        laptop1.setBrand(laptop.getBrand());
        laptop1.setPrice(laptop.getPrice());

        laptopRepo.save(laptop1);
    }
}
