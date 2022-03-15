import looping.ArraysOperation;
import looping.NumbersOperation;

public class JavaPrograms {
    public static void main(String[] args){
        System.out.println("WELCOME TO NUMBERS OPERATION USING LOOPS");

        NumbersOperation numbersOperation = new NumbersOperation();
        numbersOperation.printingNumberFor5Times(8);
        numbersOperation.printing1ToN(5);
        numbersOperation.printingOddNumbers(10);
        numbersOperation.printingEvenNumbers(10);
        numbersOperation.printingAdditionOfFirstNNumbers(4);
        numbersOperation.printingMultiplesOf3And5();
        numbersOperation.printingNumberInReverseOrder(5678);
        numbersOperation.printingNumberOfDigitsOfNumber(1234568998);
        numbersOperation.printingAdditionOfDigitsOfNumber(1234);
        numbersOperation.printingFirst8NumbersOfFibonacciSeries();
        numbersOperation.printingFibonacciSeriesTillGivenNumber(5);
        numbersOperation.printingLCMOfGiveTwoNumbers(3,5);
        numbersOperation.printingHCFOfGiveTwoNumbers(12,30);
        numbersOperation.printingSquareRootOfGivenNumber(36);
        numbersOperation.printingFactorialOfGivenNumber(6);

        ArraysOperation arraysOperation = new ArraysOperation();
        arraysOperation.printingAnArray();

    }

}
