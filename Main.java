import java.util.Random;

class Main {
  public static void main(String[] args) {
    int[][] arr= new int[10][10];
    
    Random random = new Random();
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++)
        arr[i][j] = random.nextInt(100) - 49;
    }

        for(int i=0;i<10;i++){
      for(int j=0;j<10;j++)
        System.out.print(arr[i][j] + "\t");
          System.out.println();
    }
    
  }
}