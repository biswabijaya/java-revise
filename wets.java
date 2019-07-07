
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class wets
{
    public static void main(String Args[]){
        
        String test = encode("2019-7-1", "Bhiwani", "Gurgaon", "1", "9090374605", "2", "1562716800");
        decode (test);
    }
    
    /**
     * Code to encode data to generate string for QR Code
     */
    public static String encode(String date, String from, String to, String bno, String cno, String tc, String ts)
    {
        String str = "dt"+date+"from"+from+"to"+to+"bno"+bno+"cno"+cno+"tc"+tc+"ts"+ts+"end";
        System.out.println(str);
        return str;
    }
    
    /**
     * Code to decode data to generate string for QR Code
     */
    public static void decode(String input)
    {
        String[] getData = new String[7];
        int i = 0;
        
        Pattern p = Pattern.compile("dt(.*?)from", Pattern.DOTALL);
        Matcher m = p.matcher(input);
        
        while (m.find()) {
          getData [i] = m.group(1);
        }
        i++;
        
        p = Pattern.compile("from(.*?)to", Pattern.DOTALL);
        m = p.matcher(input);
        
        while (m.find()) {
           getData [i] = m.group(1);
        } 
        i++;
        
        p = Pattern.compile("to(.*?)bno", Pattern.DOTALL);
        m = p.matcher(input);
        
        while (m.find()) {
           getData [i] = m.group(1);
        } 
        i++;
        
        p = Pattern.compile("bno(.*?)cno", Pattern.DOTALL);
        m = p.matcher(input);
        
        while (m.find()) {
           getData [i] = m.group(1);
        } 
        i++;
        
        
        p = Pattern.compile("cno(.*?)tc", Pattern.DOTALL);
        m = p.matcher(input);
        
        while (m.find()) {
           getData [i] = m.group(1);
        } 
        i++;
        
        
        p = Pattern.compile("tc(.*?)ts", Pattern.DOTALL);
        m = p.matcher(input);
        
        while (m.find()) {
           getData [i] = m.group(1);
        } 
        i++;
        
        
        p = Pattern.compile("ts(.*?)end", Pattern.DOTALL);
        m = p.matcher(input);
        
        while (m.find()) {
           getData [i] = m.group(1);
        } 

        for(i=0;i<7;i++){
            System.out.println(getData[i]);
        }
    }
}
