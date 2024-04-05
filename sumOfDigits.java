public class sumOfDigits {
    int Sum(int n){
        if(n<10){
            return n;
        }
        return(n%10 + Sum(n/10));
    }

    public static void main(String[] args) {
        sumOfDigits num1 = new sumOfDigits();
        System.out.println(num1.Sum((256)));
    }
}
