
public class Calculator {

    char mas[] = {'+', '-', '*', '/', '%'};

    public void calculate(int num1, int num2) {
        for (int i = 0; i <= 4; i++) {

            if (mas[i] == '+') {
                int res = num1 + num2;
                System.out.println(res);
            } else if (mas[i] == '-') {
                int res = num1 - num2;
                System.out.println(res);
            } else if (mas[i] == '*') {
                int res = num1 * num2;
                System.out.println(res);
            } else if (mas[i] == '/') {
                int res = num1 / num2;
                System.out.println(res);
            } else if (mas[i] == '%'){
                int res = num1 % num2;
                System.out.println(res);
            }

        }

    }
}
