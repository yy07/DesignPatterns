package com.example.designpatterns.Adapter.adapter4;

import java.util.ArrayList;

public class Computer {

    private USBDevice usbDevice;

    private USBDevice getUsbDevice() {
        return usbDevice;
    }

    private void setUsbDevice(USBDevice usbDevice) {
        this.usbDevice = usbDevice;
    }

    public static void main(String[] args) {

        // 新建一个大小为1024M的SD卡
        SDCard sdCard = new SDCard(1024D);

        // 在SD卡中存入两个文件
        sdCard.addFile(new File("Java从入门到放弃.pdf", 10D));
        sdCard.addFile(new File("不良人之灵主.avi", 68D));

        // 拷入重复文件测试
        sdCard.addFile(new File("不良人之灵主.avi", 68D));

        // 列出SD卡中文件信息
        sdCard.listFiles();

        // 接下来将SD卡插入到读卡器
        CardReader cardReader = new CardReader(sdCard);
        Computer computer = new Computer();

        // 再将读卡器插入电脑
        computer.setUsbDevice(cardReader);
        computer.getUsbDevice().addToUSB(new File("唐伯虎点秋香.rmvb", 600D));
        computer.getUsbDevice().addToUSB(new File("C++基础算法.txt", 0.01D));
        computer.getUsbDevice().addToUSB(new File("冰河世纪4.rmvb", 888D));
        computer.getUsbDevice().listUSBFiles();
        computer.getUsbDevice().deleteFromUSB("Java从入门到放弃.pdf");
        computer.getUsbDevice().listUSBFiles();
        computer.getUsbDevice().deleteFromUSB(new ArrayList<String>() {
            {
                add("Java从入门到放弃.pdf");
                add("不良人之灵主.avi");
            }
        });
        computer.getUsbDevice().listUSBFiles();
    }
}
