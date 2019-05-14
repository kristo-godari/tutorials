package com.kristogodari.tutorials.resoruce;

import com.kristogodari.tutorials.Result;
import com.kristogodari.tutorials.calculation.Calculation;
import com.kristogodari.tutorials.database.Database;
import com.kristogodari.tutorials.filestorage.FileStorage;
import com.kristogodari.tutorials.filestorage.FileStorageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RestResource {

    private Calculation calculation;

    private Database database;

    private FileStorage fileStorage;

    @Autowired
    public RestResource(Calculation calculation, Database database, FileStorage fileStorage) {
        this.calculation = calculation;
        this.database = database;
        this.fileStorage = fileStorage;
    }

    @RequestMapping("/greeting")
    public List<FileStorageResult> greeting(@RequestParam(value="name", defaultValue="World") String name) {

        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        List<InputStream> inputStreams = new ArrayList<InputStream>() {{
            add(inputStream);
        }};


        Result<List<FileStorageResult>> result = fileStorage.storeFile(inputStreams);

        return result.getOperationResult();
    }
}
