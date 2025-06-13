import java.util.Scanner;

public class Array {
    public static void reverse(int arr[]){
        int a= arr.length-1;
        for(int i=a;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
    public static void insertion_sort(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            for(int j=1+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println( "enter the row size:");
        int a=sc.nextInt();
        System.out.println( "enter the column size:");
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }

        }

        //int arr[] = {1, 3, 4, 0, 2};


        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(" left daigonal element:");
        for(int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                if (i==j){
                    System.out.print(arr[i][j]);
                }
                else{

                    System.out.print(arr[i][j]=0);
                }


            }
            System.out.println();

        }
        System.out.println("row sum:");
        for(int i=0;i<a;i++){
            int rowsum=0;

            for(int j=0;j<b;j++){
                rowsum =rowsum+arr[i][j];
            }
            System.out.println(rowsum);
        }
        System.out.println("column sum:");
        for(int i=0;i<b;i++){
            int csum=0;

            for(int j=0;j<a;j++){
                csum =csum+arr[j][i];
            }
            System.out.println(csum);
        }

       //reverse(arr);


    }
}