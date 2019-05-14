package com.kristogodari.tutorials.filestorage.disk;

import com.kristogodari.tutorials.Result;
import com.kristogodari.tutorials.aop.annotation.LogRequest;
import com.kristogodari.tutorials.aop.annotation.LogResponse;
import com.kristogodari.tutorials.filestorage.FileStorage;
import com.kristogodari.tutorials.filestorage.FileStorageResult;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class DiskStorage implements FileStorage {

    @Override
    @LogRequest
    @LogResponse
    public Result<List<FileStorageResult>> storeFile(List<InputStream> inputStreams) {

        return Result.of(() -> new ArrayList<FileStorageResult>() {{
            add(new FileStorageResult("home"));
        }});
    }
}
