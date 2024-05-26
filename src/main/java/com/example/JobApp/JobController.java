package com.example.JobApp;


import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping({"/","home"})
    public String home(){
        return "home";
    }

    @RequestMapping("addJobs")
    public String addJob(){
        return "addJobs";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }

    @GetMapping("viewAllJobs")
    public String viewAllJobs(Model model){

        //send data to viewJobs page from service
        List<JobPost> jobs=service.getAllJobs();
        model.addAttribute("jobPosts",jobs);
        return "viewAllJobs";
    }
}


