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
}
