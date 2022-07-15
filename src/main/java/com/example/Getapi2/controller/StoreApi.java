package com.example.Getapi2.controller;

import com.example.Getapi2.model.*;
import com.example.Getapi2.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StoreApi {




        @Autowired
        public CustRepImpl a;
        @Autowired
        public JuncPurchRepImpl b;
        @Autowired
        public MShoeRepImpl c;
        @Autowired
        public PurchRepImpl d;
        @Autowired
        public WShoeRepImpl1 e;




        @GetMapping("/")
        public String hello()
        {
            return new String("Hello Users");
        }

        @PostMapping("/cust1")
        public String addcust(@RequestBody Customers1 t)
        {
            a.addCust(t);
            return "Added customer";
        }
        @PostMapping("/cust2/{f}")
        public Customers1 getcustbyid(@PathVariable int f)
        {
            return a.getCustById(f);
        }
        @PostMapping("/jpurc")
        public String  insertjpurch(@RequestBody JunctPurchTable j)
        {
            b.insertjunctpurch(j);
            return "Record Added";

        }

        @GetMapping("/shoes1")
        public List<MShoes1> getallshoes(){
            return c.getallshoes();
        }

        @PostMapping("/shoes2/{k}")
        public MShoes1 findshoebyid(@PathVariable int k)
        {
            return c.findshoebyid(k);
        }
        @PostMapping("/insertorder1")
        public String insertord( @RequestBody Purchase f)
        {
            d.insertwpurch(f);

            return "Saved";

        }
        @GetMapping("/wshoes")
        public List<WShoes1> getallwshoes(){
            return e.getWomensShoes();
        }
        @PostMapping("/wshoes/{k}")
        public WShoes1 findwshoebyid(int k)
        {
            return e.findShoeById(k);
        }




}
