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
}
