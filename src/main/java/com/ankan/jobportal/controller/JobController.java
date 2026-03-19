package com.ankan.jobportal.controller;

import com.ankan.jobportal.service.JobService;
import com.ankan.jobportal.model.Job;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs") // This will by default set the base url to /jobs/
@CrossOrigin("*")
public class JobController {

    @Autowired
    private JobService jobService;

    @PostMapping
    public Job CreateJob(@Valid @RequestBody Job job){
        return jobService.createJob(job);
    }

    @GetMapping
    public List<Job> GetAllJobs(){
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Job GetJobById(@PathVariable String id){
        return jobService.getJobById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteJobById(@PathVariable String id){
        jobService.deleteJobById(id);
    }
}
