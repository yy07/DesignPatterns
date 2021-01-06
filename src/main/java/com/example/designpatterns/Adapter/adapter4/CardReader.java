package com.example.designpatterns.Adapter.adapter4;

import java.util.List;

/**
 * 该类名为 CardReader (读卡器),它通过调用SD卡类中的方法实现了在 USBDevice 中声明的接口方法，代码如下。
 */
public class CardReader implements USBDevice{

    private SDCard sdCard;

    public CardReader(SDCard sdCard) {
        super();
        this.sdCard = sdCard;
    }

    @Override
    public Double getUSBVolume() {
        return this.sdCard.getVolume();
    }

    @Override
    public Double getUSBVacantVolume() {
        return this.sdCard.getVacantVolume();
    }

    @Override
    public void listUSBFiles() {
        this.sdCard.listFiles();
    }


    @Override
    public void addToUSB(File file) {
        this.sdCard.addFile(file);
    }

    @Override
    public void deleteFromUSB(String fileName) {
        this.sdCard.deleteFile(fileName);
    }

    @Override
    public void deleteFromUSB(List<String> fileNames) {
        if(null!=fileNames && fileNames.size()>0){
            for(String fileName:fileNames){
                this.sdCard.deleteFile(fileName);
            }
        }
    }
}
