package java05_배열;

public class java05_배열연습1 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0;
        int[] score = { 100, 88, 100, 100, 90 };
        int a = score.length;
        for (int i = 0; i < score.length; i = i + 1) // score.length -> score의 길이!
        {
            sum += score[i]; // sum = sum + score[i] ;
        }
        average = sum / (float) score.length; // 스코어의 길이 = 과목의 수
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);
        System.out.println("배열 스코어의 길이 : " + a);
    }
}
