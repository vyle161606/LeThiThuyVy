package com.example._LeThiThuyVy.controller;

import com.example._LeThiThuyVy.entity.NHANVIEN;
import com.example._LeThiThuyVy.service.NHANVIENService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NHANVIENController {
    @Autowired
    private NHANVIENService nhanvienservice;

    @GetMapping
    public String showAllNHANVIEN(Model model) {
        List<NHANVIEN> nhavien = nhanvienservice.getAllNHANVIENs();
        model.addAttribute("nhanvien", nhavien);
        return "nhanvien/list";
    }


}
