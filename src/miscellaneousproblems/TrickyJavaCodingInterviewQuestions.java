package miscellaneousproblems;

public class TrickyJavaCodingInterviewQuestions {
    static int a = 1111;
    static{ a = a-- - --a;}
    {a = a++ + ++a;}
    public static void main(String[] args) {
        //Q1
        //\u000d System.out.println("comment executed");

        //Q2
        System.out.println("==============");
        String s = "ONE" + 1 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
        System.out.println(s);

        //Q3
        System.out.println("==============");
        int i = 10 + +11 - -12 + +13 - -14 + +15;
        System.out.println(i);

        //Q4
        System.out.println("==============");
        String one = "Random";
        String two = "RAndom";
        if (one == two) {
            System.out.println("one == two");
        } else {
            System.out.println("one != two");
        }
        //Q5
        System.out.println("==============");
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);

        //Q6
        System.out.println("==============");
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

        //Q7
        System.out.println("==============");
        long longWithL = 1000*60*60*24*365L;
        long longWithoutL = 1000*60*60*24*365;
        System.out.println(longWithL);
        System.out.println(longWithoutL);

        //Q8
        System.out.println("==============");
        System.out.println(a);
    }
}
