package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class FoxService {
    List<Fox> foxList=  new ArrayList<>();
    Fox fox1 = new Fox("Piros");

}
