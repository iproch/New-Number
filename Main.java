import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Please enter a number:");
    int userNum = userInput.nextInt();
    int y = 0;
    int x;

    while(userNum > 0){
      x = userNum % 10;
      x++;
      y = y * 10 + x;
      userNum = userNum / 10;
    }
    
    userNum = y;
    y = 0;
    
    while(userNum > 0){
      x = userNum % 10;
      y = y * 10 + x;
      userNum = userNum / 10;
    }

    System.out.println("Result:"+y);
  }
}