package designPattern.creationalDesignPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String,Student> mp = new HashMap<>();
    void register(String key,Student st){
        mp.put(key,st);
    }
    public Student get(String key){
        if(mp.containsKey(key)){
            return mp.get(key);
        }
        return null;
    }
}
