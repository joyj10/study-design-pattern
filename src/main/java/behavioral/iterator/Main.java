package behavioral.iterator;

import behavioral.iterator.filesystem.FileSystem;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem("src/main/java/behavioral/iterator");

        // 파일 시스템을 순회하면서 파일과 디렉토리 출력
        for (File file : fileSystem) {
            System.out.println("# " + file.getAbsolutePath());
        }
    }
}
