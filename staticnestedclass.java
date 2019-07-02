/**
 * WAP to Implement Static Nested  Class.
 *
 * @author (Biswabijaya Samal)
 * @version (02/07/2019)
 */
public class staticnestedclass{
}

class outer1{
    static class inner1{
        static void add(int a, int b){
              System.out.println(a+b);
        }
    }
    
    //main()
    public static void main(String[] args) {
        inner1 ob1 = new inner1();
        outer1 ob2 = new outer1();
    }
}
