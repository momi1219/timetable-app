package com.example.timetableapp.controller;

import com.example.timetableapp.model.ClassInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute("classInfo", new ClassInfo());

        return "index";
    }

    @PostMapping("/add")
    public String addClass(@ModelAttribute ClassInfo classInfo,
                           Model model) {

        model.addAttribute("message",
                "登録完了: " + classInfo.getClassName());

        return "result";
    }
}