package Package;

public class MyListTest {
    public static void main(String[] args) {
        MyList listTestSecond = new MyList();
        MyList linkTest = new MyList(5);
        linkTest.add(3, 4);
        linkTest.add(2, 2);
        linkTest.ensureCapa(10);
        listTestSecond.add(1, 1);
        listTestSecond.add(2,3);
        listTestSecond.addLast(1);
        listTestSecond.printList();
        System.out.println(listTestSecond.get(2));
    }
}
