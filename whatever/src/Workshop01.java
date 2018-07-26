
public class Workshop01 {

    public static void main(String[] args) {
        int a,b,c= 0;
        a = c++;//0
        
        System.out.println(a);
        b = ++a;//1
        
        System.out.println(b);
        c++;//2
        
        System.out.println(c);
        b = ++c + a++;//3+1=4
        
        System.out.println(b);
        
        a = --b + c++;//2+4=6
        System.out.println(c);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       
    }

}
