/**
 * WAP to Implement Overloading.
 *
 * @author (Biswabijaya Samal)
 * @version (02/07/2019)
 */

class overloading{

  //Function 1 - type 1 - no parameter
  static void overload() {
    System.out.println("Instance Created");
  }

  //Function 2 - type 2 - one parameter
  static void overload(int x) {
    System.out.println(x+" is a Integer");
  }

  //Function 3 - type 3 - one parameter - different data type
  static void overload(double y) {
    System.out.println(y+" is a Float Variable");
  }

  //Function 4 - type 4 - two parameter - different parameter
  static void overload(int x, int y) {
    System.out.println((x+y)+" is sum of "+x+ "and"+y);
  }

  //main()
  public static void main(String[] args) {

    overload();
    overload(10);
    overload(100.00);
    overload(10,20);
  }

}
