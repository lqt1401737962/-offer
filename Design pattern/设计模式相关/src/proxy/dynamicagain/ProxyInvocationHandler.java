package proxy.dynamicagain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //需要代理的接口
    private Object obj;

    public void setObj(Object obj) {
        this.obj = obj;
    }

    //活得代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object res = method.invoke(obj,args);
        return res;
    }

    public void log(String msg){
        System.out.println("[Debug]使用日志:"+msg+"的方法");
    }
}
