package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericClass <T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericClass<String> oobj = new GenericClass<>();
        oobj.setT("Java");
        System.out.println(oobj.getT());
        GenericClass<Integer> obj = new GenericClass<>();
        obj.setT(231);
        System.out.println(obj.getT());
        List<String> list = new ArrayList<>();
        //if you dont specify any type it uses object
        GenericClass g = new GenericClass();
        g.setT("Otgo");
        System.out.println(g.getT());

        Map<String, Boolean> map = new HashMap<>();
        map.put("1", true);
        map.put("2", false);
    }
}
