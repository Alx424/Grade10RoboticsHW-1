import java.util.*;
import Q6.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("### Running solution to Problem 1 for ProjectEuler:");
    System.out.println();
    problemOne();
    
    System.out.println();
    System.out.println("### Running solution to Problem 2 for ProjectEuler:");
    System.out.println();
    problemTwo();
    
    System.out.println();
    System.out.println("### Running solution to Question 3 for homework:");
    System.out.println();
    List<Double> testList = new ArrayList<Double>();
    testList.add(1.);
    testList.add(2.);
    testList.add(3.);
    testList.add(4.);
    testList.add(5.);
    testList.add(6.);
    testList.add(7.);
    testList.add(8.);
    testList.add(9.);
    testList.add(10.);
    printAllInRange(testList, 2, 8);
    
    System.out.println();
    System.out.println("### Running solution to Question 4 for homework:");
    System.out.println();
    List<String> strList = new ArrayList<String>();
    strList.add("Happy");
    strList.add("Birthday");
    strList.add("Tahmid!!!");
    printListNTimes(strList, 3);
    
    System.out.println();
    System.out.println("### Running solution to Question 5 for homework:");
    System.out.println();
    List<String> list0 = new ArrayList<String>();
    list0.add("list 0 item 1");
    list0.add("list 0 item 2");
    list0.add("list 0 item 3");
    List<String> list1 = new ArrayList<String>();
    list1.add("list 1 item 1");
    list1.add("list 1 item 2");
    list1.add("list 1 item 3");
    List<String> list2 = new ArrayList<String>();
    list2.add("list 2 item 1");
    list2.add("list 2 item 2");
    list2.add("list 2 item 3");
    System.out.println(zipperMergeThreeLists(list0, list1, list2));

    System.out.println();
    System.out.println("### Running solution to Question 6 for homework:");
    System.out.println();
    Square square = new Square(5);
    System.out.println("Square's area: " + square.getArea());
    Circle circle = new Circle(2);
    System.out.println("Circle's perimeter: " + circle.getPerimeter());
    // feel free to add more classes from the 'Q6' folder and test them out

    System.out.println();
    System.out.println("### Running solution to Question 7 for homework:");
    System.out.println();
    jokeBot();
  }
  static void problemOne() {
    int sum = 0;
    for(int i = 3; i < 1000; i++) {
      if((i%3 == 0) || (i%5 == 0)) {
        sum+=i;
      }
    }
    System.out.println(sum);
    return;
  }
  static void problemTwo() {
    int sum = 0;
    int prevNum = 1;
    int secPrevNum = 1;
    while(prevNum<4000000) {
      int temp = prevNum+secPrevNum;
      secPrevNum = prevNum;
      if(temp%2 == 0) sum += temp;
      prevNum = temp;
    }
    System.out.println(sum);
  }
  static List<Double> filterAllInRange(List<Double> nums, int min, int max) {
    // returns a new list containing all x in nums such that min <= x <= max
    List<Double> ans = new ArrayList<Double>(); 
    for(double d : nums) {
      if(min < d && d < max) {
        ans.add(d);
      }
    }
    
    return ans;
  }
  static void printAllInRange(List<Double> nums, int min, int max) {
    // prints every value x in nums such that min <= x <= max
    System.out.println(filterAllInRange(nums, min, max));
    return;
  }
  static void printListNTimes(List<String> list, int n) {
    for(int i = 0; i < n; i++) {
      System.out.println(list);
    }
  }
  static List<String> zipperMergeThreeLists(List<String> list0, List<String> list1, List<String> list2) {
    List<String> ans = new ArrayList<String>();
    for(int i = 0; i < list0.size(); i++){
      ans.add(list0.get(i));
      ans.add(list1.get(i));
      ans.add(list2.get(i));
    }
    
    return ans;
  }

  public static boolean _START = false;
  public static Scanner input = new Scanner(System.in);
  public static int temp;
  
  public static void jokeBot() {
    intro();
    while(!_START) {
      beg();
    }
    while(_START) {
      System.out.println("YAYY! Okay, here it goes!");
      joke();
      System.out.println();
      System.out.println("How was that?");
      System.out.println();
      System.out.println("Want another?");
      System.out.println("1) Okay, fine   2) No");
      temp = input.nextInt();
      if(temp == 1) {
        _START = true;
      } else {
        _START = false;
        System.out.println("Okay, bye!");
      }
    }
  }
  static void intro() {
    System.out.println("Hello! Want to hear some jokes?");
    temp = 0;
    System.out.println("1) Yes          2) No");
    temp = input.nextInt();
    if(temp == 1) {
      _START = true;
    }
  }
  static void beg() {
    System.out.println("You suuuure? I really want to tell you some jokes :(");
    System.out.println("1) Okay, fine   2) No");
    if(input.nextInt() == 1) {
      _START = true;
    }
  }
  static void joke() {
    switch((int)(Math.round(Math.random()*7))) {
      case 1:
        System.out.println("Dark humor is like food, not everyone gets it.");
        System.out.println("///////////////////////////");
        System.out.println();
        break;
      case 2:
        System.out.println("What are bits?");
        while(input.nextLine() == "") {}
        System.out.println("Tiny things left when you drop your computer down the stairs.");
        break;
      case 3:
        System.out.println("What kind of car did Whitney Houston drive?");
        while(input.nextLine() == "") {}
        System.out.println("A Hyundaiiiiiiiiiiii");
        break;
      case 4:
        System.out.println("How many programmers does it take to screw in a light bulb?");
        while(input.nextLine() == "") {}
        System.out.println("None. It's a hardware problem.");
        break;
      case 5:
        System.out.println("What's the difference between a baby and a watermelon?");
        while(input.nextLine() == "") {}
        System.out.println("One's satisfying to hit with a sledgehammer. The other's a watermelon.");
        break;
      case 6:
        System.out.println("Why shouldn't you visit an expensive wig shop?");
        while(input.nextLine() == "") {}
        System.out.println("It's too high a price \"toupee.\"");
        break;
      default:
        System.out.println("What's Santa's favourite type of music?");
        while(input.nextLine() == "") {}
        System.out.println("Wrap!");
        break;
    }
    
  }
}