package com.example.designpatterns.ChainofResponsibility.ChainofResponsibility2;

/**
 * 抽象处理者，定义职责的接口，也就是处理请求的接口
 */
public abstract class Handler {

    /**
     * 持有后继的处理者对象
     */
    protected Handler successor=null;

    /**
     * 赋值方法，设置后继的处理者对象
     *
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     * @param user 申请人
     * @param fee 申请的钱数
     */
    public abstract String handleFeeRequest(String user,double fee);

}
