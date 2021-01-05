package com.example.designpatterns.Proxy.cglibproxy;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
    private Calendar calendar;

    /**
     * 创建动态代理类对象
     *
     * @param clazz
     *            需要创建子类代理的父类的类型
     *
     * @return
     */
    public Object getProxyInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        // 设置要创建的动态代理类的父类
        enhancer.setSuperclass(clazz);
        // 设置回调的对象，此句会导致调用动态代理类对象的方法会被指派到CglibProxy对象的intercept()方法
        enhancer.setCallback(this);
        // 通过字节码技术动态创建动态代理类实例
        return enhancer.create();
    }

    @Override
    // 回调方法
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before(method);
        // 通过动态子类代理实例调用父类的方法
        Object result = proxy.invokeSuper(obj, args);
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
        System.out
                .println("北京时间：" + year + "年" + month + "月" + date + "日" + time + ",执行方法\"" + method.getName() + "\"");
    }

    public void after(Object object) {
        System.out.println("执行结果:" + object);
    }
}
