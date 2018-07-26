
public class WorkingWithString {

    public static void main(String[] args) {
        String name = "Poonpassorn";
        int age = 27;
        String result = name +" "+ age; //1
        String result2 = String.format("%s %d", name, age);
        
        StringBuffer buffer = new StringBuffer();//2
        buffer.append(name).append(" ").append(age);
        
        StringBuilder builder = new StringBuilder();//3
        builder.append(name).append(" ").append(age);
        
        
        System.out.println(result);
        System.out.println(result2);
        System.out.println(buffer.toString());
        System.out.println(builder.toString());

    }

}
