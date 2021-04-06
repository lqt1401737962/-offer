package proxy.staticproxy;

public class TestProxy {
    public static void main(String[] args) {
        proxy proxy = new proxy(new Host());
        proxy.rent();
    }
}
