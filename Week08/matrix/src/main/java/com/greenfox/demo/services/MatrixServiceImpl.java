package com.greenfox.demo.services;

import com.greenfox.demo.models.Matrix;
import com.greenfox.demo.repository.MatrixRepo;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MatrixServiceImpl implements MatrixService {
    private final MatrixRepo matrixRepo;

    public MatrixServiceImpl(MatrixRepo matrixRepo) {
        this.matrixRepo = matrixRepo;
    }



    @Override
    public boolean isIncreasing(Matrix matrix) {
        char szar [];
        String [] fos = matrix.getContent().split("\r\n");
        for (int i=0; i<fos.length; i++) {
            char a [] = fos[i].split("");
            szar = append(szar, "");

        }



        if () {
            return true;
        }


    }
}

