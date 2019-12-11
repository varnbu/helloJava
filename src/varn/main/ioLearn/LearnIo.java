package varn.main.ioLearn;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class LearnIo {
    public static void main(String[] args) {
//        testFileBase();
//        createTempFileTest();
        testFileList();
    }

    /**
     * 读取文件的当前目录下所有的文件以及目录
     */
    static void testFileList() {
        File f = new File("./");
        File[] fs1 = f.listFiles();
        System.out.println(Arrays.toString(fs1));
    }

    static void testFileBase() {
        System.out.println("流的使用与学习");
        char a = '啊';

        System.out.println(File.separator);
//        File f = new File("./a.json");
        File f = new File("./README.md");
        System.out.println(f);
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());
        System.out.println(f.length());
        try {
            System.out.println(f.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String path = "./test.md";
        File fn = new File(path);
        try {
            fn.createNewFile();
            if (fn.delete()) {
                System.out.println("删除文件成功：" + fn.getCanonicalPath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void createTempFileTest() {
        String tempPath = "./temp.md";
        File tempFile = null;
        try {
            tempFile = File.createTempFile("temp", ".md");
//            tempFile.deleteOnExit();
            System.out.println(tempFile.isFile());
            System.out.println(tempFile.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}