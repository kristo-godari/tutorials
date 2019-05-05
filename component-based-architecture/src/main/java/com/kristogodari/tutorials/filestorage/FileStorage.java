package com.kristogodari.tutorials.filestorage;

import com.kristogodari.tutorials.Result;

import java.io.InputStream;
import java.util.List;

public interface FileStorage {

    Result<List<FileStorageResult>> storeFile(List<InputStream> inputStreams);
}
