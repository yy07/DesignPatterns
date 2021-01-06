package com.example.designpatterns.Adapter.adapter4;

import java.util.List;

public interface USBDevice {

    //返回USB存储设备的总容量
    public Double getUSBVolume();
    //返回USB存储设备的剩余可用空间
    public Double getUSBVacantVolume();
    //列出USB存储设备中的文件信息
    public void listUSBFiles();
    //添加文件到USB存储设备
    public void addToUSB(File file);
    //从USB存储设备删除单个文件
    public void deleteFromUSB(String fileName);
    //从USB存储设备批量删除文件
    public void deleteFromUSB(List<String> fileNames);

}
