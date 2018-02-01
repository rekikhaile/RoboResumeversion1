package com.riri.roboresume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoboResumeController {

@Autowired
    RoboResumeRepository roboResumeRepository;

@RequestMapping("/")
    public String listResume
}