import java.util.Scanner;
public class Matrixmul {
    public static void main(String[] args) {
        Scanner danu=new Scanner(System.in);
        System.out.print("Enter the size of the matrix:");
        int num=danu.nextInt();
            int A[][]= new int[num][num];
            int B[][]= new int[num][num];
            int C[][]= new int[num][num];
            //matrix A elements oda code
            System.out.println("Enter the elements of matrix A");
            for(int i = 0;i<num;i++){
                for(int j =0;j<num;j++){
                    A[i][j]=danu.nextInt();
                }
            }
            //matrix B elements oda code
            System.out.println("Enter the elements of matrix B");
            for(int i =0;i<num;i++){
                for(int j =0;j<num;j++){
                    B[i][j]=danu.nextInt();
                }
            }
            // matrix multiply panrathuku code
            for(int i =0;i<num;i++){
                for(int j=0;j<num;j++){
                    C[i][j]=0;
                    for(int k=0;k<num;k++){
                        C[i][j]+= A[i][k]*B[k][j];
                    }
                }
            }
          // result matrix oda code
          System.out.println("Resultant Matrix(A x B):");
          for(int i =0;i<num;i++){
            for(int j =0;j<num;j++){
               System.out.print(C[i][j] + " ");
            }
            System.out.println();
          }
        }
    }

/*Enter the size of the matrix:3
Enter the elements of matrix A
1 2 3
4 3 2
2 4 5
Enter the elements of matrix B
6 4 2
3 2 1
4 2 6
Resultant Matrix(A x B):
24 14 22 
41 26 23
44 26 38 */