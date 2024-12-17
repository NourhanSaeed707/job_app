package com.example.jobapp.job.repository;
import com.example.jobapp.job.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
