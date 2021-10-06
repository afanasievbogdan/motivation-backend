package com.example.repo;


import com.example.data.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepo extends JpaRepository<Quotes, String> {
}
