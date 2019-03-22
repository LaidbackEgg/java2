package Lab5;

/**
 * Created by:
 * Created on:
 * Testing Parameter Passing
 */
public class TestParameters {
    public static void main(String[] args) {
        Parameters tester = new Parameters();	int[] list1 = {11, 22, 33, 44, 55};	int[] list2 = {99, 99, 99, 99, 99};
        System.out.println("Original array:");
        tester.printList(list1);
        tester.passElement(list1[0]);
        System.out.println("After passing one element:");
        tester.printList(list1);
        tester.changeElement(list1);
        System.out.println("After changing two elements:");
        tester.printList(list1);
        tester.changeReference(list1, list2);
        System.out.println("After attempting to change a reference:");
        tester.printList(list1);
        tester.copyArray(list1, list2);
        System.out.println("After copying each array element:");
        tester.printList(list1);
        list1 = tester.returnReference(list2);
        System.out.println("After returning a reference:");
        tester.printList(list1);
    }//main
}//class
