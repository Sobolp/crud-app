package com.example.sobolp.dbdemo.crudapp.controller;

import com.example.sobolp.dbdemo.crudapp.dao.SalesDAO;
import com.example.sobolp.dbdemo.crudapp.model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private SalesDAO dao;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Sale> listSale = dao.list();
        model.addAttribute("listSale", listSale);
        return "index";
    }
}