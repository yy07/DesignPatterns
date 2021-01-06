package com.example.designpatterns.bridging.bridging2;

/**
 * @Author:jinboxaing
 * @date:2021/1/6 16:41
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }

    /**
     * 示例操作，实现一定的功能
     */
    public void otherOperation() {
        impl.operationImpl();
        // 实现一定的功能，可能会使用具体实现部分的实现方法
        // 但是本方法更大的可能是使用Abstraction中定义的方法
        // 通过组合使用Abstraction中定义的方法来完成更多的功能

    }

    public static void main(String[] args) {
        RefinedAbstraction refinedAbstraction=new RefinedAbstraction(new ConcreteImplementorA());
        refinedAbstraction.otherOperation();
    }
}
