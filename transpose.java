import java.util.*;
class transpose {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter row:");
        int row=sc.nextInt();
        System.out.print("enter col:");
        int col=sc.nextInt();
        int numbers[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(numbers[i][j] +" ");}
            System.out.println(" ");}
        
        int transpose[][]=new int[row][col];
        System.out.println("<------------->");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){  
               transpose[i][j]=numbers[j][i];
               System.out.print(transpose[i][j] +" ");
            }
            System.out.println(" ");
        }

        System.out.println("<------------->");

        for(int i=0; i<row; i++){
            for(int j=0; j<col/2; j++){
                int temp=transpose[i][j];
                transpose[i][j]=transpose[i][col-1-j];
                transpose[i][col-1-j]=temp;
            }
        }

        for(int[] roww:transpose){
            for(int coll: roww){
                System.out.print(coll+" ");
            }
            System.out.println();
        }

    }
}