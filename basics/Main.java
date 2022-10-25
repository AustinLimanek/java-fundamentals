package basics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args){
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    int n = 3;
    System.out.println(flipNHeads(n));

    clock();

  }

  public static String pluralize(String string, int num){
    String result;
    if (num == 1 ){
      result = string;
    }
    else{
      result = string + "s";
    }
    
    return result;
  } 

  public static String flipNHeads(int num){
    String message;
    int count = 0;
    int total = 0;
    while (count < num){
      double coinFlip = Math.random();
      if (coinFlip < 0.5){
        count = 0;
        total += 1;
        System.out.println("tails");
      }
      else {
        count = count + 1;
        total += 1;
        System.out.println("heads");
      }
    }

    message = "It took " + total + pluralize(" flip", total) + " to flip " + count + pluralize(" head", count) + " in a row.";
    
    return message;
  }

    //with help from Joe Rutkin on the use of the .equals method.
  public static void clock(){
    double count = 0;
    String check = "";
    while (true){
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      if( !time.equals(check) ){
        System.out.println(time + " " + count/1000000 + " MHz");
        LocalDateTime upDate = LocalDateTime.now();
        check = upDate.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        count = 0;
      }
      else{
        count++;
      }
    }
  }
}