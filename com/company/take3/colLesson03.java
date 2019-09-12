package com.company.take3;

//special Thanks 木村先生 ＆ 小林先生

//    多分 try catch 文を組み入れるイメージ。01ができない！

//問題2(colLesson02)の JAVA10組で
// "登録制限を超えました。登録済みデータは以下になります。"と表示

//続けて登録データ一覧を表示して終了

//【条件】if文ではなく例外処理を用いて終了する


import java.util.Scanner;
import com.company.take3.Word03;

public class colLesson03 {

    public static void main(String[] args) {

        System.out.println("単語登録帳です");
        System.out.println("5個の単語を登録します。半角スペースを入れてください");
        System.out.println("入力を途中でやめるには＜e＞を押します。");

        //単語を5個登録する箱を作った！
        Word03[] words = new Word03[5];
        Scanner scanner = new Scanner(System.in);
        int count = 0;

//        //todo:エラーを発生させるために、カウント5を、トゥルー（無限大）に変更。
        while (true) {
            //入力を受け取る
            String input = scanner.nextLine();
            //受け取った入力をスペース区切りで分割する
            String[] wordAndMeaning = input.split(" ");
            try {
            //分割した項目を単語として、 1番目を意味としてwordを生成する
            Word03 word = new Word03(wordAndMeaning[0], wordAndMeaning[1]); //todo:+ここもエラーの発生源だった！
            //Wordに生成したWord03をセットする
                words[count] = word; //todo:ここがエラーの発生源
            } catch (Exception e) {
                break;
            }
            count++;
        }
// 構文再確認 try {
//            // えらーが起きそうな処理
//        } catch(Exception e) {
//            // エラーが起きた場合の処理
//        }

        for (int i = 0; i < count; i++) {
                System.out.println(words[i]);
            }

//以下 ボツ try構文
//            try {
//                System.out.println(words[i].toString()); //このiのエラーは問題でない模様。
//                // SomeException例外が発生するコードを含む処理
//            } catch (Exception e) {
//                // SomeException例外を捕捉した場合の処理
//            } finally {
//                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
//                // try...catchブロックを終了する際に必ず実行すべき処理
//            }
//        }

//        String str=null;
//        try {
//            System.out.println(str.length());
//        } catch (Exception e) {
//            System.out.println("例外：" + e);


//            カウント
//        for (int i =0; i <count; i++) {
// try   例外が発生しているかどうか調べる文1;
//            try {
//                 System.out.println(str.length());
//                    System.out.println(words[i].toString());
// catch 例外クラス1の例外が発生した時に行う文;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                すべてを表示
//                } catch (Exception e) {
//                    System.out.println("例外：" + e);
//                    System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
//                }
//                System.out.println("終了しました");
//            }


//            for (int i = 0; i < 4; i++){
//                System.out.println(n[i]);
//            }

//            String str;
//            while (!"e".equals(str = scanner.nextLine())) {
//            }
//            System.out.println("入力終了です。");
    }
}
