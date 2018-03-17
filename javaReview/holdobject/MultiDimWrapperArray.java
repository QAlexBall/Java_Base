import java.util.Arrays;

public class MultiDimWrapperArray {
public static void main(String[] args) {
int[][] a1 = {
{1, 2, 3},
{4, 5, 6},
};
Integer[][] a2 = {     //Autoboxing
{1, 2, 3,},
{4, 5, 6,},
};
String[][] a3 = {
{"The", "Quick", "Sly", "Fox"},
{"Jumped", "Over" },
{"The", "Lazy", "Brown", "Dog", "and", "friend"},
};
System.out.println("a1: " + Arrays.deepToString(a1));
System.out.println("a2: " + Arrays.deepToString(a2));
System.out.println("a3: " + Arrays.deepToString(a3));
	}
}
