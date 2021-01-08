package com.example.designpatterns.ChainofResponsibility.ChainofResponsibility1;

/**
 * 抽象处理者，定义职责的接口，也就是处理请求的接口
 */
public abstract class Handler {

    /**
     * 持有后继的处理者对象
     */
    protected Handler successor;

    /**
     * 赋值方法，设置后继的处理者对象
     *
     * @param successor
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 示意处理请求的方法，虽然这个示意方法是没有传入参数的 但实际是可以传入参数的，根据具体需要来选择是否传递参数
     */
    public abstract void handleRequest();

}
