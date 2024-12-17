package com.example.jobapp.job.service;
import com.example.jobapp.job.model.Job;
import java.util.List;

public interface JobService {
    List<Job> findAll();
    void create(Job job);
    Job getJobById(Long id);
    boolean deleteJobById(Long id);
    boolean update(Long id, Job updatedJob);
}
