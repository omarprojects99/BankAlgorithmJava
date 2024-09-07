package java;

public class Date {
    private int j ;
    private int m;
    private int a;

    public void affiche() {
    System.out.println(j+"/"+m+"/"+a);
    }
    public String toString() {
    return j + "//" + m + "//" + a; }

    public Date() {
        j=22;
        m=3;
        a=2023;
    }
    public Date(int j ,int m, int a) {
        this.j=j;
        this.m=m;
        this.a=a;
    }
    public void setA(int a ) {
        this.a=a;
    }
    public int getA() {
        return a;
    }
    public void setM(int m) {
        this.m=m;
    }
    public int getM() {
        return m;
    }
    
    public boolean bussexille() {
    
            return (a %2 ==0);
    
    }
    
    
    public boolean compare(Date d) {
        boolean b;
    
        if (this.a > d.a) {
            b = true;
        } else if (this.a < d.a) {
            b = false;
        } else {
            if (this.m > d.m) {
                b = true;
            } else if (this.m < d.m) {
                b = false;
            } else {
                if (this.j > d.j) {
                    b = true;
                } else {
                    b = false;
                }
            }
        }
    
        return b;
    }
}   



