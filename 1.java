public class Programa {

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 6};
        System.out.println("O segundo maior número do array é: "+getSecondLargest(array,array.length));
        
    }

    public static int getSecondLargest(int[] a, int total){
        int i;
        for (i = total - 2; i >= 0; i--) {
            if (a[i] != a[total - 1]) {
                return a[i];
            }
        }
        return a[i];
}

}