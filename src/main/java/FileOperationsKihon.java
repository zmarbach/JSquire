import framework.FileOperationsKihonBase;

import java.io.IOException;
import java.nio.file.Path;

public class FileOperationsKihon extends FileOperationsKihonBase {
    @Override
    public String getContentsOfThisFile(Path pathOfFile) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void writeContentsToThisFile(Path pathOfFile, String contents) throws IOException {
        throw new UnsupportedOperationException();
    }
}
