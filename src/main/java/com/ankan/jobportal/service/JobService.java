package com.ankan.jobportal.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ankan.jobportal.repository.JobRepository;
import com.ankan.jobportal.model.Job;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    // Save a job post
    public Job createJob(Job job){
        return jobRepository.save(job);
    }

    // Get all the jobs
    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    // Get job by id
    public Job getJobById(String id){
        return jobRepository.findById(id).orElse(null);
    }

    // Delete a job
    public void deleteJobById(String id){
        jobRepository.deleteById(id);
    }
}
