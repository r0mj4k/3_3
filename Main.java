import java.util.Random;

class Main {
  public static void main(String[] args) {
    int[][] arr= new int[10][10];
    
    Random random = new Random();
    
    int[] arrw = new int[10];
    int[] arrk = new int[10]; 
    
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        arr[i][j] = random.nextInt(100) - 49;
        arrw[i]+=arr[i][j];
      }
    }



        for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        System.out.print(arr[i][j] + "\t");
        arrk[i]+=arr[j][i];
      }
          System.out.println();
    }

    


    for(int i =0;i<10;i++)
      System.out.println("Suma " + i + " wiersza = " + arrw[i]);

    System.out.println();
    
      for(int i =0;i<10;i++)
      System.out.println("Suma " + i + " kolumny = " + arrk[i]);
  }
}