package java22.junit;

public class Student {
    
    private int    score;
    private String name = "";
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public Student(int score) {
        super();
        this.score = score;
    }
    
    @Override
    public String toString() {
        return "Student [score=" + score + ", name=" + name + "]";
    }
    
    String getgrade(int score) {
        return 리턴(score);
        
    }
    
    public String 리턴(int score) {
        String result = "";
        if (score >= 90) {
            result = "A";
        } else if (score >= 80 && score < 90) {
            result = "B";
        } else if (score >= 70 && score < 80) {
            result = "C";
        } else if (score >= 60 && score < 70) {
            result = "D";
        } else {
            result = "F";
        }
        return result;
    }
}
