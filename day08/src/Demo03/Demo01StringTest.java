package Demo03;

public class Demo01StringTest {
    public static void main(String[] args) {
        int[] array={1,2,3};
        String str=printArray(array);
        System.out.println(str);
    }
    public static String printArray(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i== array.length-1){
                str+="word"+array[i]+"]";
            }else {
                str+="word"+array[i]+"#";
            }
        }
        return str;
    }
}
