public class sumOfDigits {
    int Sum(int n){
        if(n==0){
            return 0;
        }
        return(n%10 + Sum(n/10));
    }

    public static void main(String[] args) {
        sumOfDigits num1 = new sumOfDigits();
        System.out.println(num1.Sum((256)));
    }
}
