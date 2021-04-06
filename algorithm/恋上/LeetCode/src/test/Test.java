package test;

import com.sun.xml.internal.ws.api.model.CheckedException;

import java.util.*;

/**
 * description
 *
 * @author qiton 2021/03/25 16:16
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat("苹果干");
        animal.see();
        animal.run();
        PersonMethod.staticMe();
        Class<Throwable> throwableClass = Throwable.class;

    }
}
