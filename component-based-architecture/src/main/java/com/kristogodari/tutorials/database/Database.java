package com.kristogodari.tutorials.database;


import com.kristogodari.tutorials.Result;

public interface Database {

     Result<DatabaseResult> compute();
}
