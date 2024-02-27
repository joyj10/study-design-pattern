package behavioral.iterator.filesystem;

import java.io.File;
import java.util.Iterator;

public class DirectoryIteratorImpl implements Iterator<File> {
    private File[] directories;
    private int index;

    public DirectoryIteratorImpl(File[] directories) {
        this.directories = directories;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < directories.length;
    }

    @Override
    public File next() {
        return directories[index++];
    }
}
