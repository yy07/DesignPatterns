package com.example.designpatterns.Observer.Observer2;

import java.util.Observable;
import java.util.Observer;
public class Investor implements Observer {
    public void update(Observable o, Object arg) {
        Stock stock=(Stock)o;
        if(stock.getPrice()==stock.getLowestPrice())
        {
            System.out.println("股票已经跌到历史最低了，我得赶紧抄底...");
        }
        else{
            if(stock.getState().equals(Stock.StockState.RISE)){
                System.out.println("股票在涨，目前价格："+stock.getPrice());
            }
            else{
                System.out.println("股票在跌，目前价格："+stock.getPrice());
            }
        }
    }
}
