package com.company.memo;

import java.util.Scanner;


//小林チューターのメモ

public class Memo6 {
    public static void main(String[] args) {
        // 参照について
        // 前提

//        foo0.java

//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();

//       でコンソールの1行の入力がinputに入る

        // [BAD]単純に参照を上書くパターン
//         foo1.java

//        String input;
//        Scanner scanner = new Scanner(System.in);
//        input = scanner.nextLine(); // "apple りんご"
//        input = scanner.nextLine(); // "orange オレンジ"
//        ★
//      とすると★の位置では、inputs は `"orange オレンジ"` を指すため、 `"apple りんご"` へアクセスする方法がなくなる。

//        ## [BAD]ループ内で定義しているのでスコープがなくなるパターン
//                ```foo2.java
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//          String input = scanner.nextLine(); // 1回目"apple りんご"、2回目"orange オレンジ"
//        }

//                とすると、★の場所では、while内で定義されたinputsはwhileの外で使えない

//        ## [BAD]ループ毎に参照を上書いてしまい、最後の参照以外なくなるパターン
//        ```foo3.java
//        Scanner scanner = new Scanner(System.in);
//        String input; // ループの外で定義した
//        while(true){
//          input = scanner.nextLine(); // 1回目"apple りんご"、2回目"orange オレンジ"
//        }
//        ★
//        ```
//                とすると、★の場所では、input は `"orange オレンジ"` を指すため、 `"apple りんご"` へアクセスする方法がなくなる。

//        ## [BAD]各結果を別の変数に置くパターン（冗長）
//                ```foo4.java

//        Scanner scanner = new Scanner(System.in);
//        String input1, input2, input3;
//        input1 = scanner.nextLine();
//        input2 = scanner.nextLine();
//        input3 = scanner.nextLine();
//        ★
//        ```
//                各変数名が異なるのでループが使えない！
//                10回入力するのに10個変数を用意しないといけない！つらい。

//        ## [GOOD!]各結果を配列に格納する
//                ```foo5.java
//        Scanner scanner = new Scanner(System.in);
//        String[] input = new String[10];
//        int i = 0;
//        while(i < 10) {
//            input[i] = scanner.nextLine();
//            i++;
//        }
//        ★
//        ```
//                input[0]に1回目の入力、input[1]に2回目の入力が保持されるようになった。

//       ## [BAD]入力値への参照を保持せず消費しちゃうパターン
//                ```foo6.java
//        Scanner scanner = new Scanner(System.in);
//        if("END".equals(scanner.nextLine())) {
//          // 処理
//        }
//       ★
//        ```
//                入力した結果への参照を変数に保持せずに、Stringのequalsに直接渡してしまい、入力値への参照が無くなる

//        ## [GOOD!]入力値への参照を変数に保持できた
//                ```foo7.java
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        if("END".equals(input)) {
//          // 処理
//        }
//        ★
//        ```
//        入力値への参照がinputに残っている！
    }
}
