// implementing overridding

import java.io.*;

class overridemaster{

  public static void main(String[] args) {
    //Create object
    overridemaster m1 = new overridemaster();
    overridechild c1 = new overridechild ();
    overridemaster m2 = new overridechild();
    m1.override();
    c1.override();
    m2.override();
    
  }

  static void override() {
    System.out.println("Overridemaster Instance Created");
  }
}



class overridechild extends overridemaster {

  //Child Class
  static void override() {
    System.out.println("Overridechild Instance Created");
  }
  
}
