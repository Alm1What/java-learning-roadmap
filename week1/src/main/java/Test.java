public class Test {

    private int x = 2;
    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.x);
        test.print();
        int y;
        //System.out.println(y);

    }


    public Test() {

    }

    private void print() {
        System.out.println(this.x);
    }
}
