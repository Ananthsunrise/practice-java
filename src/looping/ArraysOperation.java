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

}
