package java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex18_05_Date {
    
    public static void main(String[] args) {
        
        SimpleDateFormat tf = null; 

        // 현재 날짜와 시간 출력
        Date now = new Date();
        System.out.println(now.getDate() ); // 117
        // 2017으로 출력되게.
        tf = new SimpleDateFormat("yyyy");
        System.out.println( tf.format(now) ); // 2017

        // 현재 연도만 출력
        System.out.println( printDate( now, "yyyy") );

        // 현재 월만 출력
        System.out.println( printDate( now, "MM") );

        // 현재 일만 출력
        // 현재 시간만 출력
        // 현재 분만 출력
        // 현재 초만 출력

        // 현재에 +3년 출력
        now.setYear( now.getYear() + 3 );
        System.out.println( printDate( now, "" ) ) ;

        // 현재에 -4월 출력
        now.setMonth( now.getMonth() -4 );
        System.out.println( printDate( now, null ) ) ;

        // 현재에 +2일 출력
        now.setDate( now.getDate() -4 );
        System.out.println( printDate( now, null ) ) ;

        // 현재에 +4시간 출력
        now.setHours( now.getHours() + 4);
        System.out.println( printDate(now, null) );

        // 현재에 -30분 출력
        now.setMinutes( now.getMinutes() -30 );
        System.out.println( printDate(now, null) );

        // 현재에 + 10초 출력
        now.setSeconds( now.getSeconds() +10 );
        System.out.println( printDate(now, null) );

        // 날짜만 "yyyy-MM-dd" 형태로 출력하시오
        System.out.println( printDate(now, "yyyy-MM-dd") );

        // 시간만 "HH:mm:ss" 형태로 출력하시오
        System.out.println( printDate(now, "HH:mm:ss") );
    }

    public static String printDate( Date i, String format ) {

        // format 이 빈문자열이거나 null 이면 yyyy-MM-dd HH:mm:ss 을 적용
        // if( format==null || format == "" || format.equals("") ) {
        //     format = "yyyy-MM-dd HH:mm:ss";
        // }

        if(format==null || format.isEmpty()){
            format = "yyyy-MM-dd HH:mm:ss";
        }

        // 날짜 출력 포맷 지정 하기: SimpleDateFormat 클래스 사용
        Date from = new Date();
        SimpleDateFormat tf = new SimpleDateFormat( format );
        return tf.format(from);
    }

}
