package proxy.staticagain;

public class Test {
    public static void main(String[] args) {
        ServiceImp userService = new ServiceImp();
        userService.add();

        ServiceProxy serviceProxy = new ServiceProxy();
        serviceProxy.setServiceImp(userService);
        serviceProxy.add();
        serviceProxy.remove();
    }
}
