package com.ankan.jobportal.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.ankan.jobportal.model.Job;

public interface JobRepository extends MongoRepository<Job, String> {
}
