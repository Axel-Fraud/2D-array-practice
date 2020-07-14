class Main {
  public static void main(String[] args) {
   
  int[][] retArr = arraysInput(10);
   //Loop through the values of retArr and print them out.
//for( int i = 0; i<retArr.length; i++){
  //for( int j = 0; j < retArr[0].length; j++){
   // System.out.print(retArr[i][j] + " ");
  //}
  //System.out.println();
  
double [] x = avArray(retArr);
for(int i=0 ; i<x.length; i++){
System.out.println(x[i]);
}


}



public static int[][] arraysInput(int x){

int [][] arr = new int[x][x];
for(int i = 0; i < arr.length; i++){
  for(int j=0; j < arr[0].length; j++){
arr[i][j]= (i+1)*(j+1);
  }
}
return arr;
}

public static double [] avArray (int [][] x ){

double [] stat = new double [x.length];

for(int i = 0; i < x.length; i++){
  int total = 0;
  for(int j = 0; j < x[0].length; j++){
    total += x[i][j];    
  }
  double average = (double)(total)/x[0].length;
  stat[i] = average;
}
return stat;
}

}

/*Write a method that takes in a 2D array of integers and returns an array (one-dimensional) of the averages of the integers in each row. Make sure the averages are returned as doubles! 
*/
