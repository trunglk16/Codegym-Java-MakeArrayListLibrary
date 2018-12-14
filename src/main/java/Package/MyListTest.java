package Package;



public class MyListTest {
    public static void main(String[] args) {
        MyList al2 = new MyList();
        MyList al = new MyList(5);
        al.add(3, 4);
        al.add(2, 2);
        al.ensureCapa(10);
        al2.add(1, 1);
        al2.add(2,3);
        al2.addLast(1);
        al2.printList();
        System.out.println( al2.get(2));


    }
}
