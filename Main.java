package ArrayFunctions;

public class Main {
    public static void main(String[] args) {
        ArrayFunctions obj = new ArrayFunctions();

        //obj.Distribute();
        int index = obj.Difference();
        System.out.println("Index of the pair with minimum difference: " + index);

        obj.Distribute();
    }
    
}
