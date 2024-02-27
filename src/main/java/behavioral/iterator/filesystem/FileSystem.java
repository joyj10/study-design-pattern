package behavioral.iterator.filesystem;

import java.io.File;
import java.util.Iterator;

public class FileSystem implements Iterable<File> {
    private File root;

    public FileSystem(String path) {
        this.root = new File(path);
    }

    @Override
    public Iterator<File> iterator() {
        return new FileSystemIteratorImpl();
    }

    // 파일 시스템을 순회하는 Iterator 구현 클래스
    private class FileSystemIteratorImpl implements Iterator<File> {
        private Iterator<File> fileIterator;
        private Iterator<File> directoryIterator;

        public FileSystemIteratorImpl() {
            this.fileIterator = listFiles();
            this.directoryIterator = listDirectories();
        }

        private Iterator<File> listFiles() {
            return new FileIteratorImpl(root.listFiles());
        }

        private Iterator<File> listDirectories() {
            return new DirectoryIteratorImpl(root.listFiles(File::isDirectory));
        }

        @Override
        public boolean hasNext() {
            return fileIterator.hasNext() || directoryIterator.hasNext();
        }

        @Override
        public File next() {
            if (fileIterator.hasNext()) {
                return fileIterator.next();
            } else {
                return directoryIterator.next();
            }
        }
    }
}
