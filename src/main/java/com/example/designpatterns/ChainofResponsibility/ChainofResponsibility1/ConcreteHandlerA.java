package com.example.designpatterns.ChainofResponsibility.ChainofResponsibility1;

public class ConcreteHandlerA extends Handler {

    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest() {
        // 根据某些条件来判断是否属于自己处理的职责范围,下面這句話只是个示意
        boolean someCondition = false;

        if (someCondition) {
            // 如果属于自己处理的职责范围，就在这里处理请求
            // 具体的处理代码
        } else {
            // 如果不属于自己处理的职责范围，那就判断是否还有后继的职责对象
            // 如果有，就转发请求给后继的职责对象
            // 如果没有，什么都不做，自然结束
            if (null != this.successor) {
                System.out.println("转交ConcreteHandlerB");
                this.successor.handleRequest();
            }
        }
    }

}
