package com.kristogodari.tutorials.database.mysql;

import com.kristogodari.tutorials.Result;
import com.kristogodari.tutorials.database.Database;
import com.kristogodari.tutorials.database.DatabaseResult;
import org.springframework.stereotype.Component;

@Component
public class Mysql implements Database {

    @Override
    public Result<DatabaseResult> compute() {

        Result.of(DatabaseResult::new);

        return null;
    }
}
