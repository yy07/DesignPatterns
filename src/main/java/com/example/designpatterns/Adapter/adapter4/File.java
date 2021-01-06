package com.example.designpatterns.Adapter.adapter4;

public class File {
    //文件名
    private String fileName;
    //文件大小
    private Double fileSize;
    //构造方法中指定文件名和文件大小
    public File(String fileName, Double fileSize) {
        super();
        this.fileName = fileName;
        this.fileSize = fileSize;
    }
    public String getFileName() {
        return fileName;
    }
    public Double getFileSize() {
        return fileSize;
    }
}
