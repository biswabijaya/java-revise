 /**
  * WAP to Implement interface.
  *
  * @author (Biswabijaya Samal)
  * @version (02/07/2019)
  * in interface all methods are public abstract by default
  */

class interfacepractice implements inter1,inter2
{
    public void add(int a, int  b){
        System.out.println(a+b);
    }

    public void sub(int a, int  b){
        System.out.println(a-b);
    }

    //main
    public static void main(String[] args) {
       //Create object
       inter1 ob1=new interfacepractice();
       inter2 ob2=new interfacepractice();
       ob1.add(5,3);
       ob2.sub(5,3);

    }
}

interface inter1{
    void add(int a, int  b);
}

interface inter2{
    void sub(int a, int  b);
}
