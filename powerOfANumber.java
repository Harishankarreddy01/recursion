class powerOfANumber{
    public static void main(String[] args) {
        int base = 12;
        int exponent = reverse(base);
        System.out.println("power of" + base + "to the raise" + exponent + "is: " + power(base,exponent));
    }

    static long power(int base, int exponent){
        int mod = 1000000007;
        if(exponent==0)
            return 1;
        
        long halfpower = power(base,exponent/2);
        long halfpowersquared = (halfpower * halfpower)%mod;

        if(exponent%2 == 0){
            return halfpowersquared;
        }
        else
            return (base * halfpowersquared)%mod;

    }

    static int reverse(int Number){
        int reverse = 0;

        while(Number != 0){
            int digit = Number % 10;
            reverse = reverse * 10 + digit;
            Number = Number/10;
        }
        return reverse;
    }
}