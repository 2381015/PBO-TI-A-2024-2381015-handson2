package expressionvsstatement;

public class ExpressionVsStatement {
    public static void main(String[] args) {
        //expression adalah operasi yang menghasilkan value
        //statement adalah kumpulan dari 1 atau lebih expression
        int x = 10;
        if (x > 15){
            System.out.println("x lebih besar dari 15");
        }

        int y = x + 5;
    }
}
