package com.greenfox.demo.controllers;

import com.greenfox.demo.models.Matrix;
import com.greenfox.demo.services.MatrixService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MatrixController {
    private final MatrixService matrixService;

    public MatrixController(MatrixService matrixService) {
        this.matrixService = matrixService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @PostMapping("/matrix")
    public String showForm(Matrix matrix) {
        if (matrix = null) {
            return;
        }
        if(matrixService.isIncreasing(matrix)) {
        }
        };

        return "redirect:/";
    }

    @GetMapping("/matrices")
    @ResponseBody
    public String (@RequestBody ()) {

        return;
    }

}
