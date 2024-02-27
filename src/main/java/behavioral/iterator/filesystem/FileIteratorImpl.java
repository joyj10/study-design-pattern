package behavioral.iterator.filesystem;

import java.io.File;
import java.util.Iterator;

public class FileIteratorImpl implements Iterator<File> {
    private File[] files;
    private int index;

    public FileIteratorImpl(File[] files) {
        this.files = files;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < files.length;
    }

    @Override
    public File next() {
        return files[index++];
    }
}
