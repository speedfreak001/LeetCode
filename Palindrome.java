public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Check whether a number is palindrome or not");
        int r,sum=0,temp;
        int n=101; //to check

        temp=n;
        while(n>0){
            r=n%10; //remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    }
}
