
public class WorkingWithStringLoop {

    public static void main(String[] args) {
        String name = "Somkiat2018";

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));

        }

        /*
         * while(name.length() > 0) { System.out.println(name.substring(0, 1)); name=
         * name.substring(1); }
         */
        String s = "";
        for (int i = 0; i < name.length(); i++) {
            name = name.substring(1);
            System.out.println(name.substring(0, 1));
            s = s + name;
            System.out.println();
        }

        System.out.println(s);
    }

}
