import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Lab76 {
	 public static void main(String[] args){
Scanner nodecount = new Scanner(System.in);
Scanner dependencynum = new Scanner(System.in);
Scanner row = new Scanner(System.in);
Scanner col = new Scanner(System.in);

System.out.println("Enter the number of nodes\n");
int nodes = nodecount.nextInt();
int[][] nodemap = new int[nodes][nodes];
System.out.println("How many dependencies are there?\n");
	int dependency=dependencynum.nextInt();
	int Row[]=new int[dependency];
	int Col[]=new int[dependency];

		for(int i=0;i<dependency;i++) {
			System.out.println("Enter the row of the" +" "+(i+1)+" "+ "dependency");
			String x=row.nextLine();
				if(x.equals("A")) {
					Row[i]=0;
				}else if (x.equals("B")) {
					Row[i]=1;
				} else if (x.equals("C")) {
					Row[i]=2;
				} else if (x.equals("D")) {
					Row[i]=3;
				} else if (x.equals("J")) {
					Row[i]=4;
				} else if (x.equals("K")) {
					Row[i]=5;
				} else if (x.equals("L")) {
					Row[i]=6;
				} else {
				System.out.println("Invalid");
				System.exit(0);
			}
 			System.out.println("Enter the collumn of the" +" "+(i+1)+" "+ "dependency");
 			String y=row.nextLine();
				if(y.equals("A")) {
					Col[i]=0;
				}else if (y.equals("B")) {
					Col[i]=1;
			    } else if (y.equals("C")) {
					Col[i]=2;
				} else if (y.equals("D")) {
					Col[i]=3;
				} else if (y.equals("J")) {
					Col[i]=4;
				} else if (y.equals("K")) {
					Col[i]=5;
				} else if (y.equals("L")) {
					Col[i]=6;
				} else {
					System.out.println("Invalid");
				    System.exit(0);
				}
	}
int wmap[][]=Warshall(nodemap,Col,Row,nodes,dependency);
for (int i = 0; i < dependency; i++) {
	System.out.print("Dependency at");
	System.out.print(Row[i]);
	System.out.print(Col[i]+"\n");
}




System.out.printf("%-4s", "");
for (int i = 0; i <4; i++) {
    System.out.printf(((char)('A'+i))+"\t");
}
for(int i=0;i<3;i++) {
	System.out.printf(((char)('J'+i))+"\t");
}
System.out.println();
char array[]={'A','B','C','D','J','K','L'};
for (int i = 0; i < 7; i++) {
    System.out.print(array[i]);
    for (int j = 0; j < 7; j++) {
        System.out.printf("%-4c", nodemap[i][j]);
    }
    System.out.println();
}


 for(int i = 0; i < nodes; i++)
   {
      for(int j = 0; j <nodes ; j++)
      {

        System.out.printf("%5d",wmap[i][j]);


}

      System.out.println();
   }



}

public static int[][] Warshall(int[][] n1, int[] n2, int[] n3, int n, int d) {
	for(int i = 0; i < n; i++)
	   {
	      for(int j = 0; j <n ; j++)
	      {
			  n1[i][j]=0;
		  }

  }


	for(int i=0;i<d;i++) {

	int m=n2[i];
	int o=n3[i];

			n1[o][m]=1;



}


	return n1;




}
}