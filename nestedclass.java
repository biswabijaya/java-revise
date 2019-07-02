
/**
 * WAP to Implement Nested  Class.
 *
 * @author (Biswabijaya Samal)
 * @version (02/07/2019)
 */
public class nestedclass{}

class outer{
        int x; int y;
        void callinginner(){
            inner i1=new inner();
            i1.add(10, 20);
            
        }
        
        public class inner {
            void add(int a, int b){
              System.out.println(a+b);
            }
        }
        
        //main()
          public static void main(String[] args) {
              outer ob1 = new outer();
              ob1.callinginner();
          }
    }
