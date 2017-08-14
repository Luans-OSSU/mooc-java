
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i = 1; i <= amount; i++) {
            System.out.print("*");
        }

        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        for (int i = 1; i <= amount; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        int size = (height * 2) - 1;
        int stars;

        for (int i = 1; i <= height; i++) {
            stars = i * 2;
            if(i == 1) {
                printWhitespaces(height - i);
                printStars(i);
            } else {
                printWhitespaces(height - i);
                printStars(stars -1);
            }
        }

        for (int i = 1; i <= 2; i++) {
            printWhitespaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printWhitespaces(1);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
