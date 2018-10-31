package cn.edu.sicnu.cs.yuxin.exp9.title1.src.filesPro;

import java.io.File;
import java.io.IOException;

public class FileProcess {
    private String name;

    FileProcess() {
        this.name = "";
    }

    FileProcess(String name) {
        this.name = name;
    }

    public boolean createFile(String fileName) {
        boolean newFileFlag = false;
        File file;
        try {
            file = new File("./" + fileName);
            // 指定文件不存在则创建新文件
            newFileFlag = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFileFlag;
    }

    public boolean deleteFile(String fileName) {
        boolean deleteFileFlag = false;
        File file = new File("./" + fileName);
        deleteFileFlag = file.delete();
        return deleteFileFlag;
    }
}
