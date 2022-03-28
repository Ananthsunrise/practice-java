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
        numbersOperation.printingReverseOfGivenNumber(1234);
        numbersOperation.checkingGivenNumberPalindromeOrNot(1331);
        numbersOperation.printingPowerOfThatNumberTillGivenNumber(5);
        numbersOperation.checkGivenNumberPrimeOrNot(2);
        numbersOperation.printingPrimeNumbersTillGivenNumber(20);
        numbersOperation.printingDecimalToBinary(7);
        numbersOperation.printingBinaryToDecimal(1010);
        numbersOperation.printingAdditionOfDigitsUntilItBecomesSingleDigit(98675);
        numbersOperation.checkingGivenNumerArmstrongOrNot(153);
        numbersOperation.checkingGivenNumberStrongOrNot(145);
        numbersOperation.checkingGivenNumberNeonOrNot(9);

        ArraysOperation arraysOperation = new ArraysOperation();
        arraysOperation.printingAnArray();
        arraysOperation.printingElementsOfArrayInReverseOrder();
        arraysOperation.printingArrayInReverseOrder();
        arraysOperation.countingOfParticularElementInArray();
        arraysOperation.movingAllElementsOfArrayTowardsLeft();
        arraysOperation.linearSearchOfElementInArray();
        arraysOperation.movingElementsOfArrayTowardsRight();
        arraysOperation.movingElementsOfArrayTowardsLeftTwice();
        arraysOperation.printingElementsOfArrayInAnotherArrayByReverseOrder();
        arraysOperation.printingNegativeElementsInGivenArray();
        arraysOperation.copyingNegativeElementsOfGivenArrayInAnotherArray();
        arraysOperation.copyingOddIndexedElementsOfGivenArrayInAnotherArray();
        arraysOperation.findingBiggestElementInGivenArray();
        arraysOperation.additionOfOddIndexedElementsInGivenArray();
        arraysOperation.findingSmallestElementInGivenArray();
        arraysOperation.countingNoOfDuplicateElementsInGivenArray();
        arraysOperation.countingNoOfUniqueElementsInGivenArray();
        arraysOperation.countingOfEachElementsInGivenArray();
        arraysOperation.CopyingOnlyDuplicateElementsInAnotherArray();


    }

}
