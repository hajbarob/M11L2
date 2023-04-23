package stream.reandom;

public class RandomAlg {

    private int a, c, m;

    public RandomAlg(int a, int m) {
        this.a = a;
        this.m = m;
    }

    public RandomAlg() {
        this.a = 20;
        this.m =  56;
    }

    public RandomAlg c(int c) {
        this.c = c;
        return this;
    }

    public int next() {
        int i = a * c * m;

        a +=2;
        m +=13;

        return (i + 230) % 870;
    }
}
