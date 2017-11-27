package z최진영;

public class Oper {
    private int firstNum;
    private int seconNum;
    
    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSeconNum() {
        return seconNum;
    }

    public void setSeconNum(int seconNum) {
        this.seconNum = seconNum;
    }

    @Override
    public String toString() {
        return "Oper [firstNum=" + firstNum + ", seconNum=" + seconNum + "]";
    }

    public Oper() {
        super();
    }

    public Oper(int firstNum, int seconNum) {
        super();
        this.firstNum = firstNum;
        this.seconNum = seconNum;
    }

    public double Div() {
        double result = (double)this.firstNum / this.seconNum;
        return result;
    }

    public int Mul() {
        return this.firstNum * this.seconNum;
    }

    public int Minus() {
        return this.firstNum - this.seconNum;
    }

    public int Add() {
        return this.firstNum + this.seconNum;
    }
    
}
