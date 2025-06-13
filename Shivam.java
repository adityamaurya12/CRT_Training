public class Shivam {
    public static void main(String[] args) {
        String st="hellloC";
        String ab="Aditya";
        //System.out.println(a+" "+ab);
        String Aditya="";
        String city2;
        city2="shivam";
        String str=city2;
        System.out.println(str);
        StringBuilder one=new StringBuilder("hello"+" ");
        String two="aditya";
        one.append(two);
        System.out.println(one.toString());
        String s="HelloJava";
        for(char so :s.toCharArray()){
            System.out.print(so+" ");
        }
        System.out.println("");
        System.out.println("lowercase :");
        for(char so :s.toLowerCase().toCharArray()){
            System.out.print(so+" ");
        }
        System.out.println(" ");
        System.out.println("upercase :");
        for(char so :s.toUpperCase().toCharArray()){
            System.out.print(so+" ");
        }
        System.out.println(" ");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));

        }


    }
}
