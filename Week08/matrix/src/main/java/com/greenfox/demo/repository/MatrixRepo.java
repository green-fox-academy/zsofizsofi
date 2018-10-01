package com.greenfox.demo.repository;

import com.greenfox.demo.models.Matrix;
import org.springframework.data.repository.CrudRepository;

public interface MatrixRepo extends CrudRepository<Matrix, Long>{
    public boolean isIncrease (Matrix matrix);
}

