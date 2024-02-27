package behavioral.iterator.filesystem;

import java.io.File;

public interface FileIterator {
    boolean hasNext();
    File next();
}
