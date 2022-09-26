public class shodowing  {
    public static void main(String[] args){
        int k = 153;
        int n = 0;
        n = k;
        int d = 0;
        int sum=0;
        while (n > 0){
            d = n % 10;
            sum = sum + (d*d*d);
            n =  n / 10;
        }
        if (sum==k){
            System.out.println("Armstrong");
        }
    }
}
