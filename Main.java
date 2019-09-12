public class Main {
    public static void main(String[] args) {

        //todo;ここでは、参考サイトをもとに、toStringを試す！
        int num1 = 123;
        int num2 = 456;

        //ただの足し算。
        System.out.println(num1 + num2 );

        String  str1 = Integer.toString(num1);
        String  str2 = Integer.toString(num2);
        //文字列の連続。
        System.out.println(str1 + str2);
        //で、何に使うのか…。

        //toString オーバーライドした！(Employeeは従業員でクラス名)
        Employee nagaoka = new Employee("001", "Nagaoka");
        System.out.println(nagaoka);
    }
}