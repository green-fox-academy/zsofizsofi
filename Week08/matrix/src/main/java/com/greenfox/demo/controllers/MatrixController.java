package com.greenfox.demo.controllers;

import com.greenfox.demo.models.Matrix;
import com.greenfox.demo.services.MatrixService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MatrixController {
    private final MatrixService matrixService;

    public MatrixController(MatrixService matrixService) {
        this.matrixService = matrixService;
    }

    @GetMapping("/matrix")
    public String index() {
        return "index";
    }


    @PostMapping("/matrix")
    public String showForm(Matrix matrix) {
        matrixService.isIncreasing(matrix);

        return "redirect:/";
    }

}
