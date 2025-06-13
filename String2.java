public class String2 {
    public static void main(String[] args) {
        String str="hello";
        char arr[]=str.toCharArray();
        int a=arr.length-1;
        for(int i=0;i<arr.length/2;i++,a--){
            char temp=arr[i];
            arr[i]=arr[a];
            arr[a]=temp;


        }
        System.out.println(arr);

    }
}
