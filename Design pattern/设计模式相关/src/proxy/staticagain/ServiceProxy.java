package proxy.staticagain;

import sun.rmi.log.LogHandler;

public class ServiceProxy implements Service {
    ServiceImp serviceImp;

    public void setServiceImp(ServiceImp serviceImp) {
        this.serviceImp = serviceImp;
    }

    @Override
    public void add() {
        log("add");
        serviceImp.add();
    }

    @Override
    public void remove() {
        log("remove");
        serviceImp.add();
    }

    @Override
    public void update() {
        log("update");
        serviceImp.update ();
    }

    @Override
    public void query() {
        log("query");
        serviceImp.query();
    }

    //增加一个日志功能
    private void log(String msg){
        System.out.println("[debug]日志打印:使用了"+msg+"的方法");
    }
}
