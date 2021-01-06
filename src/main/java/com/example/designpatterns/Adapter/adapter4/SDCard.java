package com.example.designpatterns.Adapter.adapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SDCard {

    // SD卡的存储空间总大小
    private Double volume;

    // SD卡的可用存储空间大小
    private Double vacantVolume;

    // 将SD卡中存储的文件保存到一个Map里面
    private Map<String, File> fileMap = new HashMap<String, File>();

    public SDCard(Double volume) {
        super();
        this.volume = volume;
        this.vacantVolume = volume;
    }

    public Double getVacantVolume() {
        return vacantVolume;
    }

    public void setVacantVolume(Double vacantVolume) {
        this.vacantVolume = vacantVolume;
    }

    public Double getVolume() {
        return volume;
    }

    public Map<String, File> getFileMap() {
        return fileMap;
    }

    public void addFile(File file) {
        File tempFile = this.fileMap.get(file.getFileName());
        if (null != tempFile) {
            System.out.println("文件《" + file.getFileName() + "》已存在，添加失败...");
        } else {
            if (this.vacantVolume > file.getFileSize()) {

                this.fileMap.put(file.getFileName(), file);
                this.vacantVolume = this.vacantVolume - file.getFileSize();
                System.out.println("添加文件《" + file.getFileName() + "》成功...");
            } else {
                System.out.println("剩余存储空间不足，文件《" + file.getFileName()
                        + "》添加失败...");
            }
        }
    }

    public void deleteFile(String fileName) {
        File tempFile = this.fileMap.get(fileName);
        if (null == tempFile) {
            System.out.println("文件《" + fileName + "》不存在，删除失败...");
        } else {
            this.fileMap.remove(fileName);
            this.vacantVolume = this.vacantVolume + tempFile.getFileSize();
            System.out.println("删除文件《" + fileName + "》成功...");
        }
    }

    public void listFiles() {
        if (fileMap.size() > 0) {
            System.out.println();
            System.out
                    .println("*********************文件列表*********************");
            int i = 1;
            for (Entry<String, File> entry : fileMap.entrySet()) {
                System.out.println(i + ". 文件名：《"
                        + entry.getValue().getFileName() + "》，文件大小："
                        + entry.getValue().getFileSize() + "兆。");
                i++;
            }
            System.out.println();
        }
    }
}