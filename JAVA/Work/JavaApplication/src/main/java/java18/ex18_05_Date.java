package java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex18_05_Date {
    
    public static void main(String[] args) {
        
        Date date = new Date();
        SimpleDateFormat tf = null;
        
        // 현재 연도만 출력
        Date now = new Date();
        System.out.println(now.getDate());
        // 2017 출력되게
        tf = new SimpleDateFormat("yyyy");
        System.out.println(tf.format(now));
        // 현재 월만 출력

        // 현재 일만 출력
        System.out.println(date.getDate());
        // 현재 시간만 출력
        System.out.println(date.getHours());
        // 현재 분만 출력
        System.out.println(date.getMinutes());
        // 현재 초만 출력
        System.out.println(date.getSeconds());
        System.out.println("----------------------------");
        //현재에 +3년,-4달,+2일 "yyyy-MM-dd" 형태로 출력하시오
       
        now.setYear(now.getYear()+3);
        now.setMonth(now.getMonth()-4);
        now.setDate(now.getDate()+2);
        //현재에 +4시간,-30분,+10초 "HH:mm:ss" 형태로 출력하시오.
        now.setHours(now.getHours()+4);
        now.setMinutes(now.getMonth()-30);
        now.setSeconds(now.getSeconds()+10);
        tf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(tf.format(now));
                
    }
}
