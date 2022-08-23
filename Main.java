public class Main {

    String w = " ";
    String x = "Boeing";
    String y = "B";
    String z = "-";
    int a = 17;

    public static void main(String[] args) {
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        Main myObj3 = new Main();
        Main myObj4 = new Main();
        Main myObj5 = new Main();

        System.out.print(myObj1.x);
        System.out.print(myObj5.w);
        System.out.print(myObj2.y);
        System.out.print(myObj3.z);
        System.out.print(myObj4.a);

        System.out.print(myObj5.w + myObj1.x + myObj5.w + myObj2.y + myObj3.z + myObj4.a);
        
    }
}
