package com.example.designpatterns.Observer.Observer2;

public class Client{
    public static void main(String[] args) {
        Stock stock=new Stock(Stock.StockState.FALL,14.7D,13.2D);
        stock.addObserver(new Investor());
        stock.setPrice(13.7);
        stock.setPrice(12.6);
        stock.setPrice(14.0);
    }
}
