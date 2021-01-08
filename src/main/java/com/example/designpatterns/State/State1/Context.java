package com.example.designpatterns.State.State1;

/**
 * 环境(Context)角色
 */
public class Context {

    // 持有一个State类型的对象实例
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String sampleParameter) {
        // 处理操作，会转调State来处理
        state.handle(sampleParameter);
    }
}
