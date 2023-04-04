
public class Second {
    public int number = 10;

    public String printAndReturn() {
        String result = String.format("---<%d>---", number);
        System.out.println(result);
        return result;

    }
}


