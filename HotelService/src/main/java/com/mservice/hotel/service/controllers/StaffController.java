package com.mservice.hotel.service.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staffs")
public class StaffController {

    @GetMapping
    public ResponseEntity<List<String>> getStaff(){
        List<String> staffList = List.of("Raju", "Ritu", "Amit");
        return new ResponseEntity<>(staffList, HttpStatus.OK);
    }
}
