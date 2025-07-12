public class Hell {

    public static void printName(int count) {
        if (count == 0)
            return;
        System.out.println("printName(count)");
        printName(count -1 );
    }
    public static void main(String[] args){

        printName(5);

    }
}
