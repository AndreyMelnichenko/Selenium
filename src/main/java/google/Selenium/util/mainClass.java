package google.Selenium.util;

public class mainClass {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.name").toLowerCase());
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double x1,x2;

        double d = (b*b)-(4*a*c);
        if (d!=0){
        x1 = (((-1*b)+(Math.sqrt(d)))/(2*a));
        x2 = (((-1*b)-(Math.sqrt(d)))/(2*a));
        System.out.println(x1);
        System.out.println(x2);}
        if (d==0){
            x1=((-1*b)/(2*a));
            x2=x1;
            System.out.println(x1);
            System.out.println(x2);
        }

    }
}
