package com.kristogodari.tutorials;

import com.kristogodari.tutorials.filestorage.FileStorage;
import com.kristogodari.tutorials.filestorage.FileStorageResult;
import com.kristogodari.tutorials.filestorage.disk.DiskStorage;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        List<InputStream> inputStreams = new ArrayList<InputStream>() {{
            add(inputStream);
        }};

        FileStorage fileStorage = new DiskStorage();

        Result<List<FileStorageResult>> result = fileStorage.storeFile(inputStreams);

        if(result.isSuccess()){
            result.getOperationResult().forEach( item ->{
                System.out.println(item.getPath());
            });
        }

    }
}
