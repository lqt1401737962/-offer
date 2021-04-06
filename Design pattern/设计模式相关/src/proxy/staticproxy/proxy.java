package proxy.staticproxy;

public class proxy implements Rent{
    public Host host;

    public proxy() {
    }

    public proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        shouqian();
    }

    private static void seeHouse(){
        System.out.println("中介带你去看房");
    }
    private  static void shouqian(){
        System.out.println("你该付钱给我了");
    }
}
