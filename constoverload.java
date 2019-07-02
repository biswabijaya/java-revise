import java.io.*;
class constoverload{
  int mark;
  String subname;

  //Constructor 1
  conoverload(String sname) {
    this.subname=sname;
    System.ot.println("Constructor 1 called");
    System.out.println("Subject entered is "+this.subname);
  }

  //Constructor 2
  conoverload(int smark) {
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
