package assignment9;

public class assertion {
    public static void main(String[] args) {
        int age = 35;
        assert age <= 18 : "Cannot Vote";
        System.out.println("The voter's age is " + age);
    }
}
