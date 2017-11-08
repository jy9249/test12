package java19;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import com.google.common.math.Quantiles;

public class jv19_01_ArrayList {
    
    public static void main(String[] args) {
        int pos = 0;
        String value = "";
        
        List<String> list = null;
        list = new ArrayList<String>(); // 여기서부터 메모리 할당
        list = new LinkedList<>();
        list = new Vector<>();
        list = new Stack<>();
        // 추가삽입삭제가 되는 배열이다.
        list.add("milk"); // 0번방
        list.add("BREAD"); // 1번방
        list.add("BUTTER"); // 2번방
        System.out.println("c:추가" + list);
        
        list.add(1, "APPLE");
        System.out.println("c:추가" + list);
        
        value = list.get(3);
        System.out.println("value 값 : " + value);
        
        list.set(2, "GRAPH");
        System.out.println("2번방 추가" + list);
        
        list.remove(2);
        System.out.println("BUTTER 삭제" + list);
        
        for (int i = 0; i <= list.size() - 1; i = i + 1) {
            System.out.print(list.get(i) + " , ");
        }
        System.out.println();
        
        for (String string : list) {
            System.out.print(string + ",");
        }
        System.out.println();
        
        pos = list.indexOf("APPLE");
        System.out.println("index : " + pos); // 방번호
        
        // 검색2. APPLE이 몇개 있나요
        int count = 0;
        for (int i = 0; i <= list.size() - 1; i = i + 1) {
            if (list.get(i).equals("APPLE")) {
                count++;
            }
        }
        System.out.println("s:apple이 몇개 있나요ㅕ ? " + count);
        
        
        String[] Array= (String[]) list.toArray();
        
        for(int i = 0 ; i<Array.length-1; i++ ){
            System.out.print(Array[i]+" , ");
        }
        System.out.println();
        
        
        
        
        for(String val : Array) { 
            System.out.println(val + ", ");
        }
        System.out.println(); 
     
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
    }
    
}
