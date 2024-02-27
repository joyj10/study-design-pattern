package behavioral.iterator.filesystem;

import java.io.File;

public interface DirectoryIterator {
    boolean hasNext();
    File next();
}
