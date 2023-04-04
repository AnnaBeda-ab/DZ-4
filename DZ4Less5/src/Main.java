public class Main {
    public static void main(String[] args) {


        Second secondA = new Second();
        String updatedStr = secondA.printAndReturn();
        updatedStr = updatedStr.replace("---","");

        System.out.println("~~~" + updatedStr + "\"~~~");
    }

}
