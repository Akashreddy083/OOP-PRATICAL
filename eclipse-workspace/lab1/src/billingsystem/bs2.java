package billingsystem;

public class bs2 {

    public static void main(String[] args) {
        int tomBag = 3;
        int jerryBag = 5;

        System.out.println("Before Swapping:");
        System.out.println("Tom's bag: " + tomBag + " apples");
        System.out.println("Jerry's bag: " + jerryBag + " apples");

        int temp = tomBag;
        tomBag = jerryBag;
        jerryBag = temp;

        System.out.println("After Swapping:");
        System.out.println("Tom's bag: " + tomBag + " apples");
        System.out.println("Jerry's bag: " + jerryBag + " apples");
    }
}
