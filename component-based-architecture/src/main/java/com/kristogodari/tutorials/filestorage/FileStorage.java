package com.kristogodari.tutorials.filestorage;

import com.kristogodari.tutorials.Result;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public interface FileStorage {

    Result<List<FileStorageResult>> storeFile(List<InputStream> inputStreams);
}
