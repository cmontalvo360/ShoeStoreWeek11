package com.example.Getapi2.service;

import com.example.Getapi2.model.WShoes1;
import com.example.Getapi2.repo.WomensShoesRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class WShoeRepImpl1  {


    @Autowired
    WomensShoesRep w;


    public List<WShoes1> getWomensShoes(){
        return w.findAll();
    }
    public WShoes1 findShoeById(int k)
    {
        return w.getById(k);
    }

}
