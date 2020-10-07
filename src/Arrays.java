public class Arrays {
    public static void main(String[] args) {
        int[] arr1 = new int[10];

        for(int x=0; x<arr1.length; x++){
            arr1[x] = 2 * (x+1); //stores the multiples of 2 inside the array
            System.out.println(arr1[x]); //prints the elements of the array which is the multiples of 2
        }
    }
}
