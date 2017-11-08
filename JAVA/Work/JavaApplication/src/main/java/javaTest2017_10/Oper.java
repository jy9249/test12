package javaTest2017_10;

public class Oper {
    
    private int F = 0;
    private int S = 0;
    
    // �޼���
    public double Div() {
        double result = (double) this.F / this.S;
        return result;
    }
    
    public int Min() {
        int result = this.F - this.S;
        return result;
    }
    
    public int Mul() {
        int result = this.F * this.S;
        return result;
    }
    
    public int add() {
        int result = this.F +this.S;
        return result;
        
    }
    
    public Oper() {
        super();
    }
    
    public Oper(int f, int s) {
        super();
        F = f;
        S = s;
    }
    
    public int getF() {
        return F;
    }
    
    public void setF(int f) {
        F = f;
    }
    
    public int getS() {
        return S;
    }
    
    public void setS(int s) {
        S = s;
    }
    
    public int Minus(int a, int b) {
        int Minus = 0;
        Minus = a + b;
        return Minus;
    }
    
    public int Mul(int a, int b) {
        int Mul = 0;
        Mul = a * b;
        return Mul;
    }
    
    public int Div(int a, int b) {
        int Div = 0;
        Div = a / b;
        return Div;
    }
    
}
