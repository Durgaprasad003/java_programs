

package java_programs;

/**
 * armstrong
 */
public class armstrong {

    public static void main(String[] args) {
        int numb=153;
        int originumber=numb;
        int cube=0;
        while (numb!=0) {
            int remainder=numb%10;
             cube=cube+(remainder*remainder*remainder);
             numb=numb/10;
            
        }
        
        System.out.println(cube);
    }
}