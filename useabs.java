
/**
 * Learning Abstract Class
 */

//abstract class

class useabs extends abs1 {
    void add(int a, int b){
       System.out.println(a+b);
    }
    
    protected void sub(int a, int b){
       System.out.println(a-b);
    }
    //main
    public static void main(String[] args) {
    //Create object
    abs1 ob1 = new useabs();
    }
  }

abstract class abs1{
    void div(int a, int b){
        System.out.println(a/b);
    }
    abstract void add(int a, int b);
    abstract void sub(int a, int b);


}

