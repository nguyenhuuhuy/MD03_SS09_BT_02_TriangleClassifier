package demo.bt2;

public class Triangle {
    public static String triangle(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
            if ((a == b) && (b == c)) {
              return  "Tam giác đều";
            } else if ((a == b) || (a == c) || (b == c)) {
                return "Tam giác cân";
            } else if (((a * a == b * b + c * c) && (a == b)) || ((a * a + c * c == b * b) && (a == c)) || ((b * b + c * c == a * a) && (b == c))) {
               return  "Tam giác vuông cân";
            } else {
               return "tam giác thường";
            }
        } else {
            return "Không phải là tam giác";
        }

    }
}
