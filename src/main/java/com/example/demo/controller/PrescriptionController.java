package com.example.demo.controller;

import com.example.demo.dto.PatientDto;
import com.example.demo.dto.ProblemGetDto;
import com.example.demo.service.PrescriptionService;
import com.example.demo.util.ApiPaths;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(ApiPaths.PrescriptionCtrl.CTRL)
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @GetMapping("/symptom/{prompt}")
    public ResponseEntity<String> getPrescription(@PathVariable String prompt) {
        return ResponseEntity.ok(prescriptionService.getAnswer(prompt));
    }
}
