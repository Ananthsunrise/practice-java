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
        for (int number = 1; number<=10; number++){
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
}
