package com.example.controller;


import com.example.data.Quotes;
import com.example.repo.QuotesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class QuotesController {

    private final QuotesRepo quotesRepo;

    @Autowired
    public QuotesController(QuotesRepo quotesRepo) {
        this.quotesRepo = quotesRepo;
    }

    @GetMapping("quotes")
    public List<Quotes> getAllQuotes() {
        return quotesRepo.findAll();
    }

    @GetMapping("quotes/{id}")
    public Quotes getOneQuote(@PathVariable("id") Quotes quote) {
        return quote;
    }

    @PostMapping("quotes/save")
    public Quotes saveQuote(@RequestBody Quotes quote) {
        return quotesRepo.save(quote);
    }

    @ExceptionHandler(Exception.class)
    public String exceptionHandler(){
        return "error";
    }

}

