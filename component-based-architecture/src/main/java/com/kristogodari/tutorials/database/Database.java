package com.kristogodari.tutorials.database;


import com.kristogodari.tutorials.Result;
import org.springframework.stereotype.Service;

@Service
public interface Database {

     Result<DatabaseResult> compute();
}
