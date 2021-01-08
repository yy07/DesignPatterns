package com.example.designpatterns.State.State1;

/**
 * 抽象状态(State)角色，用来封装与环境（Context）对象的一个特定的状态所对应的行为
 */
public interface State {

    /**
     * 状态对应的处理
     *
     * @param sampleParameter 示例参数
     */
    public void handle(String sampleParameter);
}
