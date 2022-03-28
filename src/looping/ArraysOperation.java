package looping;

public class ArraysOperation {
    public void printingAnArray(){
        int array[] = {10,20,30,40,50};
        System.out.println("Printing elements in given array");
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public void printingElementsOfArrayInReverseOrder(){
        int array[] = {10,20,30,40,50};
        System.out.println("printing elements of array in reverse order");
        int i= array.length-1;
        while (i>=0){
            System.out.println(array[i]);
            i--;
        }
    }
    public void printingArrayInReverseOrder(){
        int[] array={10,20,30,40,50,60};
        System.out.println("printing array after reversing");
        int i=0;
        int j= array.length-1;
        while (i<=j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        for (int k=0; k<array.length; k++){
            System.out.print(array[k]+" ");
        }
    }
    public void countingOfParticularElementInArray(){
        System.out.println("counting particular element in array");
        int[] array = {10,20,20,30,40,20};
        int i=0;
        int count = 0;
        int key = 20;
        while (i<array.length){
            if (key==array[i]){
                count=count+1;
            }
            i++;
        }
        System.out.println("counting of no is :"+ count);
    }
    public void movingAllElementsOfArrayTowardsLeft(){
        System.out.println("moving all elements in array towards left");
        int [] array = {10,20,30,40,50};
        int temp = array[0];
        int i=0;
        while (i<array.length-1){
            array[i] = array[i+1];
            i++;
        }
        array[i] = temp;
        for (int j=0; j<array.length; j++){
            System.out.print(array[j]+" ");
        }
    }
    public void linearSearchOfElementInArray(){
        System.out.println();
        System.out.println("linear search program");
        int array [] = {10,20,30,40,50};
        int key = 70;
        int i=0;
        while (i<array.length){
            if (key == array[i]){
                System.out.println("element is present in given array");
                break;
            }
            i++;
        }
        if (i == array.length){
            System.out.println("element is not present in given array");
        }
    }
    public void movingElementsOfArrayTowardsRight(){
        System.out.println("moving elements of array towards right");
        int array [] = {10,20,30,40,50};
        int temp = array[array.length-1];
        int i = array.length-1;
        while (i>0){
            array[i] = array[i-1];
            i--;
        }
        array[i] = temp;
        for (int j=0; j<array.length; j++){
            System.out.print(array[j]+ " ");
        }
    }
    public void movingElementsOfArrayTowardsLeftTwice(){
        System.out.println();
        System.out.println("moving elements of array towards left twice");
        int array [] = {10,20,30,40,50};
        int temp1 = array[0];
        int temp2 = array[1];
        int i =0;
        while (i<array.length-2){
            array[i] = array[i+2];
            i++;
        }
        array[i] = temp1;
        array[i+1] = temp2;
        for (int j=0; j<array.length; j++){
            System.out.print(array[j] +" ");
        }
    }
    public void printingElementsOfArrayInAnotherArrayByReverseOrder(){
        System.out.println();
        System.out.println("printing elements of array in another array by reverse order");
        int [] a = {10,20,30,40,50};
        int [] b = new int [a.length];
        int i=0,j=a.length-1;
        while (i<a.length){
            b[i] = a[j];
            i++;
            j--;
        }
        for (int k=0; k<b.length; k++){
            System.out.print(b[k]+" ");
        }
    }
    public void printingNegativeElementsInGivenArray(){
        System.out.println();
        System.out.println("printing only negative numbers in given array");
        int array [] = {10,-20,30,-40,50};
        int i = 0;
        while (i<array.length){
            if (array[i]<0){
                System.out.print(array[i]+ " ");
            }
            i++;
        }
    }
    public void copyingNegativeElementsOfGivenArrayInAnotherArray(){
        System.out.println();
        System.out.println("copying only negative numbers from given array to another array");
        int array1 [] = {-5,8,-3,-2,10};
        int count = 0;
        for (int i=0; i<array1.length; i++){
            if (array1[i] < 0){
                count++;
            }
        }
        int array2 [] = new int[count];
        int j=0;
        for (int i=0; i<array1.length; i++){
            if (array1[i] < 0){
                array2[j] = array1[i];
                if (j == count)
                    break;

                j++;
            }

        }
        for (int k=0; k<array2.length; k++){
            System.out.print(array2[k]+" ");
        }
    }
    public void copyingOddIndexedElementsOfGivenArrayInAnotherArray(){
        System.out.println();
        System.out.println("copying only odd indexed elements of given array in another array");
        int array1 [] = {10,20,30,40,50,60,70,80,90};
        int array2 [] = new int[array1.length/2];
        int i=0;
        int j=1;
        while (j<array1.length){
            array2[i] = array1[j];
            i++;
            j+=2;
        }
        for (int k=0; k<array2.length; k++){
            System.out.print(array2[k]+" ");
        }
    }
    public void findingBiggestElementInGivenArray(){
        System.out.println();
        System.out.println("finding the biggest element in given array");
        int array [] = {10,20,50,40,90};
        int biggest = Integer.MIN_VALUE;
        for (int i=0; i<array.length; i++){
            if (array[i]>biggest){
                biggest = array[i];
            }
        }
        System.out.println(biggest);
    }
    public void additionOfOddIndexedElementsInGivenArray(){
        System.out.println("printing addition of odd indexed elements in given array");
        int array [] = {10,20,30,40,50};
        int total = 0;
        for (int i=1; i<array.length; i+=2){
            total = total + array[i];
        }
        System.out.println(total);
    }
    public void findingSmallestElementInGivenArray(){
        System.out.println("finding smallest element in given array");
        int array [] = {10,20,5,50,2};
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i]<small){
                small = array[i];
            }
        }
        System.out.println(small);
    }
    public void countingNoOfDuplicateElementsInGivenArray(){
        int array[]= {10,20,30,10,20,30,40,50,10};
        int freq [] = new int[array.length];
        for (int i = 0; i<array.length; i++){
            int no = array[i];
            int count = 1;
            for (int j=i+1; j<array.length; j++){
                if (no == array[j]){
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1){
                freq[i] = count;
            }
        }
        int countOfDuplicates = 0;
        for (int i=0; i<freq.length; i++){
            if (freq[i] > 1){
                countOfDuplicates++;
            }
        }
        System.out.println("counting number of duplicate elements in given array : "+ countOfDuplicates);
   }
   public void countingNoOfUniqueElementsInGivenArray(){
       int array[]= {10,20,30,10,20,30,40,50,10};
       int freq [] = new int[array.length];
       for (int i = 0; i<array.length; i++){
           int no = array[i];
           int count = 1;
           for (int j=i+1; j<array.length; j++){
               if (no == array[j]){
                   count++;
                   freq[j] = -1;
               }
           }
           if (freq[i] != -1){
               freq[i] = count;
           }
       }
       int countOfUniqueElements = 0;
       for (int i=0; i<freq.length; i++){
           if (freq[i] == 1){
               countOfUniqueElements++;
           }
       }
       System.out.println("counting number of unique elements in given array : "+ countOfUniqueElements);
   }
   public void countingOfEachElementsInGivenArray(){
       System.out.println("Counting of each element in given array");
       int array[]= {10,20,30,10,20,30,40,50,10};
       int freq [] = new int[array.length];
       for (int i = 0; i<array.length; i++){
           int no = array[i];
           int count = 1;
           for (int j=i+1; j<array.length; j++){
               if (no == array[j]){
                   count++;
                   freq[j] = -1;
               }
           }
           if (freq[i] != -1){
               freq[i] = count;
           }
       }
       for (int i=0; i<freq.length; i++){
           if (freq[i] != -1){
               System.out.println(array[i] + " appeared " + freq[i] + " times");
           }
       }
    }
    public void CopyingOnlyDuplicateElementsInAnotherArray(){
        System.out.println("copying only duplicate elements in another array");
        int array[]= {10,20,30,10,20,30,40,50,10};
        int array2 [] = new int[array.length];
        int freq [] = new int[array.length];
        for (int i = 0; i<array.length; i++){
            int no = array[i];
            int count = 1;
            for (int j=i+1; j<array.length; j++){
                if (no == array[j]){
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1){
                freq[i] = count;
            }
        }
        int j = 0;
        for (int i=0; i<freq.length; i++){
            if (freq[i] > 1){
                array2[j] = array[i];
                j++;
            }
        }
        for (int i =0; i<array2.length; i++){
            if (array2[i] > 1){
                System.out.print(array2[i]+ " ");
            }
        }
    }

}
