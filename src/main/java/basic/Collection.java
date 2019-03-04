package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


/**
 * map接口下的常见实现类的了解
 * 迭代器的了解
 * 各种遍历方法的效率比较
 */
public class Collection {

    public static void main(String[] args) {
        Map<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("1","chen");
        hashMap.put("2","yan");
        hashMap.put("3",null);
        /*方式1*/
//        Iterator iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext()){
//            String key = (String) iterator.next();
//            System.out.println(key+"="+hashMap.get(key));
//        }

        /*方式2*/
        Set set = hashMap.entrySet();
        Iterator valueIt = set.iterator();
        while (valueIt.hasNext()){
            Map.Entry entry = (Map.Entry) valueIt.next();
            if (entry.getKey().equals("3")){
                /*不能直接使用hashMap.remove()方法 ，否则会抛出异常，要用迭代器的remove方法*/
                valueIt.remove();
            }
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println(hashMap.size());


    }
}
