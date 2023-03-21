import java.util.Vector;
public class Main {
    public static void main(String[] args) {

//        String name = "Pukar";
//        name=name+"Tiwari";
//        System.out.println(name);
//        // This will create the new instance of the string
//        String name2= new String("hello world");
//
//        // ***** string buffer *****
//        StringBuffer s=new StringBuffer("Hello ");
//        s.append("hi world");
//        System.out.println(s);
//
//
//        // *** vector ***
//        // "Arrays are like boxes of a fixed size, while vectors are like expandable boxes that can grow or shrinks as needed."
//    this is fixed length array
        int[] age={10,20,30}; // length=3;
        Vector age2=new Vector(3,10);
        //System.out.println(age.length);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(40);
        age2.add(50);
        age2.add(60);
        age2.add(70);

        age2.add(10);

        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        age2.add(10);
        //System.out.println("Data in the vector---->"+age2.capacity());
        System.out.println(age.length);
        System.out.println(age2);
        System.out.println("Data in the vector---->"+age2.capacity());

    }
}