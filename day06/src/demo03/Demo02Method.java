package demo03;

public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {1, 10, 100, 1000};
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int[] array){
        int max=array[0];
        for (int i =1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
            return (max);
    }
}

