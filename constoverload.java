/**
 * WAP to Implement Constructor Overloading.
 *
 * @author (Biswabijaya Samal)
 * @version (02/07/2019)
 */

class constoverload {
  int mark=10;
  String subname="MM";

  //Constructor 1
  constoverload(String sname) {
    this.subname=sname;
    System.out.println("Constructor 1 called");
    System.out.println("Subject entered is "+this.subname);
  }

  //Constructor 2
  constoverload(int smark) {
    this.mark=smark;
    System.out.println("Constructor 2 called");
    System.out.println("Mark entered is "+this.mark);
  }

  //main
  public static void main(String[] args) {
    //Create object
    constoverload ob1 = new constoverload("Maths");
    constoverload ob2 = new constoverload(100);
  }
}
