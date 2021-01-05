package com.example.designpatterns.Proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataBaseLogHandler implements InvocationHandler {
    private Object object;
    private Calendar calendar;

    public DataBaseLogHandler(Object object) {
        super();
        this.object = object;
    }

    // invoke()方法用于处理对代理类实例的方法调用并返回相应的结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        // 继续转发请求给内部真实主题角色
        Object result = method.invoke(object, args);
        after(result);
        if (method.getName().equalsIgnoreCase("logout")) {
            System.out.println("**********************************");
            System.out.println("");
        }
        return result;
    }

    public void before(Method method) {
        calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + "时" + minute + "分" + second + "秒";
        System.out.println("北京时间：" + year + "年" + month + "月" + date + "日" + time + ",执行方法\"" + method.getName() + "\"");
    }

    public void after(Object object) {
        System.out.println("执行结果:" + object);
    }
}
