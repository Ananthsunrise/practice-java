package looping;

public class NumbersOperation {
    public void printingNumberFor5Times(int no){
        System.out.println("Printing a number for 5 Times");
        for (int number = 1; number<=5; number++) {
            System.out.println(no);
        }
    }
    public void printing1ToN(int no){
        System.out.println("Printing 1 to N numbers");
        for (int number = 1; number<=no; number++){
            System.out.println(number);
        }
    }
    public void printingOddNumbers(int no){
        System.out.println("Printing odd numbers from 1 to N numbers");
        for (int number = 1; number<=no; number++){
            System.out.println(number);
            number++;
        }
    }
    public void printingEvenNumbers(int no){
        System.out.println("Printing even numbers from 1 to N numbers");
        for (int number = 2; number<=no; number++ ){
            System.out.println(number);
            number++;
        }
    }
    public void printingAdditionOfFirstNNumbers(int no){
        System.out.println("Printing Addition Of First N Numbers");
        int total=0;
        for (int number = 1; number<=no; number++){
            total = total+number;
        }
        System.out.println(total);
    }
    public void printingMultiplesOf3And5(){
        System.out.println("Printing multiples of 3 and 5 form 1 to 20");
        for (int number = 1; number<=20; number++){
            if (number%3==0 || number%5==0){
                System.out.println(number);
            }
        }
    }
   public void printingNumberInReverseOrder(int no){
       System.out.println("Printing a given number in reverse order");
        while (no>0){
            System.out.println(no%10);
            no=no/10;
        }
   }
   public void printingNumberOfDigitsOfNumber(int no){
       System.out.println("Counting number of digits in given number");
       int count = 0;
       while (no>0){
           count++;
           no=no/10;
       }
       System.out.println(count);
   }
   public void printingAdditionOfDigitsOfNumber(int no){
       System.out.println("calculating addition of digits of a number");
       int total = 0;
       while (no>0){
           int reminder = no%10;
           total= total+reminder;
           no= no/10;
       }
       System.out.println(total);
   }
   public void printingFirst8NumbersOfFibonacciSeries(){
       System.out.println("printing first 8 numbers of fibonacci series");
       int firstNumber=0;
       int secondNumber=1;
       for (int i=0; i<8; i++){
           System.out.println(firstNumber);
           int thirdNumber=firstNumber+secondNumber;
           firstNumber=secondNumber;
           secondNumber=thirdNumber;
       }
   }
    public void printingFibonacciSeriesTillGivenNumber(int no){
        System.out.println("printing fibonacci series till given number");
        int firstNumber=0;
        int secondNumber=1;
        for (int i=0; i<8; i++){
            if (firstNumber<=no) {
                System.out.println(firstNumber);
            }
            int thirdNumber=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=thirdNumber;
        }
    }
    public void printingLCMOfGiveTwoNumbers(int no1, int no2){
        System.out.println("printing lcm of given two numbers");
        int lcm;
        int max = no1>no2 ? no1:no2;
        while (true){
            if (max%no1==0 && max%no2==0){
                 lcm = max;
                break;
            }
            max++;
        }
        System.out.println(lcm);
    }
    public void printingHCFOfGiveTwoNumbers(int no1, int no2) {
        System.out.println("printing hcf of given two numbers");
        int hcf;
        int min = no1 < no2 ? no1 : no2;
        while (true) {
            if (no1 % min == 0 && no2 % min == 0) {
                hcf = min;
                break;
            }
            min--;
        }
        System.out.println(hcf);
    }
    public void printingSquareRootOfGivenNumber(int no){
        System.out.println("printing square root of given number");
        int n=2;
        while (n<=no/2){
            if (no/n==n){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
    public void printingFactorialOfGivenNumber(int no){
        System.out.println("printing factorial of given number");
        int fact = 1;
        while (no>=1){
            fact=fact*no;
            no--;
        }
        System.out.println(fact);
    }
    public void printingReverseOfGivenNumber(int no){
        System.out.println("printing reverse of given number");
        int reminder = 0;
        while (no>0){
            reminder=(reminder*10)+(no%10);
            no=no/10;
        }
        System.out.println(reminder);
    }
    public void checkingGivenNumberPalindromeOrNot(int no){
        System.out.println("check whether the number is palindrome or not");
        int reminder=0;
        int no2=no;
        while (no>0){
            reminder=(reminder*10)+(no%10);
            no=no/10;
        }
        if (reminder==no2){
            System.out.println("given number is palindrome");
        }
        else {
            System.out.println("given number is not palindrome");
        }
    }
    public void printingPowerOfThatNumberTillGivenNumber(int no){
        System.out.println("printing power of that number till given number");
        int i=1;
        while (i<=no){
            System.out.println((int)Math.pow(i,i));
            i++;
        }
    }
    public void checkGivenNumberPrimeOrNot(int no){
        System.out.println("check given number is prime or not");
        int i=2;
        boolean prime = true;
        while (i<no){
            if (no%i==0){
                System.out.println("given number is not prime");
                prime=false;

            }
            i++;
        }
        if (prime==true){
            System.out.println("given number is prime");
        }
    }
    public void printingPrimeNumbersTillGivenNumber(int no){
        System.out.println("printing prime numbers till given number");
        System.out.println(2);

        int count=0;
        int number=3;
        while (count<no){
            int i=2;
            boolean prime = true;
            while (i<number){
                if (number%i==0){
                    prime=false;
                }
                i++;
            }
            if (prime==true){
                System.out.println(number);
                count=count+1;
            }
            number+=2;
        }
    }
    public void printingDecimalToBinary(int no){
        System.out.println("printing a given decimal number to binary number");
        int decimal = no;
        String binary = "";
        while (decimal>0){
            int rem = decimal%2;
            binary=rem+binary;
            decimal=decimal/2;
        }
        System.out.println(binary);
    }
    public void printingBinaryToDecimal(int no){
        System.out.println("printing a given binary number to decimal");
        int binary = no;
        int i=0;
        int decimal=0;
        while (binary>0){
            int rem = binary%10;
            decimal= (int) (decimal+(rem*Math.pow(2,i)));
            binary=binary/10;
            i++;
        }
        System.out.println(decimal);
    }
    public void printingAdditionOfDigitsUntilItBecomesSingleDigit(int no){
        System.out.println("addition of gits of given number until it becomes a single digit");
        int total=no;
        while (total>9){
            no=total;
            total=0;
            while (no>0){
                int rem = no%10;
                total=total+rem;
                no=no/10;
            }
        }
        System.out.println(total);
    }
    public void checkingGivenNumerArmstrongOrNot(int no){
        System.out.println("check whether the given number is armstrong or not");
        int arm=0;
        int no2=no;
        while (no>0){
            int rem = no%10;
            arm=arm+(rem*rem*rem);
            no=no/10;
        }
        if (arm==no2) {
            System.out.println("Given number is armstrong number");
        }
        else {
            System.out.println("given number is not armstrong number");
        }
    }
    public void checkingGivenNumberStrongOrNot(int no){
        System.out.println("checking whether the given number is strong number or not");
        int no2=no;
        int strong=0;
        while (no>0){
            int no3=no%10;
            int fact=1;
            while (no3>0){
                fact=fact*no3;
                no3--;
            }
            strong=strong+fact;
            no=no/10;
        }
        if (strong==no2){
            System.out.println("given number is strong number");
        }
        else{
            System.out.println("given number is not strong");
        }

    }
    public void checkingGivenNumberNeonOrNot(int no){
        System.out.println("check the given number is neon number or not");
        int sum=0;
        int squre=no*no;
        while (squre>0){
            int lastDigit = squre%10;
            sum=sum+lastDigit;
            squre=squre/10;
        }
        if (sum==no){
            System.out.println("given number is neon");
        }
        else {
            System.out.println("given number is not neon");
        }
    }
}
