public class multi {
    int mul(){
        int a=7;
        int b=2;
        int c=a*b;
        return c;
    }
    public static void main(String[] args) {
        multi m= new multi();
        int p = m.mul();
        System.out.println(p);
    }
}
