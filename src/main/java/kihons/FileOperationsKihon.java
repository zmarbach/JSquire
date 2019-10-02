package kihons;

import framework.bases.FileOperationsKihonBase;
import framework.exceptions.NotImplementedYetException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperationsKihon extends FileOperationsKihonBase {
    @Override
    public String getContentsOfThisFile(Path pathOfFile) throws IOException {
        return Files.readString(pathOfFile);
    }

    @Override
    public void writeContentsToThisFile(Path pathOfFile, String contents) throws IOException {
        Files.write(pathOfFile, contents.getBytes());
    }
}
