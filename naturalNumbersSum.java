class naturalNumbersSum{
    int Sum(int n){
        if(n==0){
            return 0;
        }
        return n + Sum(n-1);
    }

    public static void main(String args[]){
        naturalNumbersSum num1 = new naturalNumbersSum();
        System.out.println(num1.Sum(100));
    }

}

