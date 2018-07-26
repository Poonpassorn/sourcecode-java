import javax.swing.text.StyledEditorKit.ForegroundAction;

public class WorkingWithLoop {

    public static void main(String[] args) {
 /*       for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        
        i=0;
        do {
            System.out.println(i);
            i++;
        } while (i<5);*/
        
        int result = 0;
        for(int i=0;i<11; i++) {
            result= result+i;
        }
        System.out.println(result);

    }
    
    

}
