package com.example.designpatterns.Observer.Observer2;

import java.util.Observable;
public class Stock extends Observable{
    //为股票的状态创建一个枚举类：RISE 涨,FALL 跌
    public enum StockState{
        RISE,FALL
    }
    //股票涨跌状态
    private StockState state;
    //股票的价格
    private double price;
    //股票的历史最低价格
    private double LowestPrice;
    //股票无参的构造方法
    public Stock(){
    }
    //股票的带参数构造方法
    public Stock(StockState state, double price, double lowestPrice) {
        super();
        this.state = state;
        this.price = price;
        LowestPrice = lowestPrice;
    }
    public StockState getState() {
        return state;
    }
    private void setState(StockState state) {
        this.state = state;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price<this.price){
            setState(StockState.FALL);
        }
        else{
            setState(StockState.RISE);
        }
        if(price<this.LowestPrice){
            setLowestPrice(price);
        }
        this.price = price;
        //更新股票状态标记为已改变
        setChanged();
        //通知观察者
        notifyObservers();
    }
    public double getLowestPrice() {
        return LowestPrice;
    }
    private void setLowestPrice(double lowestPrice) {
        LowestPrice = lowestPrice;
    }
}
