package c17absin3.arithmetic.expressions;

public class ExpressionTester01 {

    public static void main(String[] args) {
        /* An Expression reference can refer to a Number object, since Number is a sub class of Expression.*/
        Expression e1 = new Number(12);
        Expression e2 = new Number(13);

        /* The Sum class accepts two Expression objects as parameters - or sub classes of Expression */
        Sum s1 = new Sum(e1, e2);

        System.out.println("Expression : " + s1);
        System.out.println("Calculated as : " + s1.calculate());
        System.out.println();

        /* Since Sum is also a sub class of Expression, we can pass a sum object to another Sum */ 
        Sum s2 = new Sum(new Number(4), new Number(3));
        Sum s3 = new Sum(s2, new Number(8));
        System.out.println("Expression : " + s3);
        System.out.println("Calculated as : " + s3.calculate());
        System.out.println();

        /* And since the Sum object s3 references also is an expression, we can give it to a new Sum */
        Sum s4 = new Sum(new Number(2), s3);
        System.out.println("Udtrykket : " + s4);
        System.out.println("Beregner Java til: " + s4.calculate());
    }
}
