package com.company.take02;

//special Thanks 木村先生 ＆ 小林先生 ＆ 荒木さん

//完了："e"で毎回脱出できるようにする！
//完了：問題1(colLesson01)のjavaをWordクラスにtoString()メソッドを実装する
//完了：toString()とは？？"数値を文字列へ変換する" ここでは、どこに入れればいいのだ！？

import java.util.Scanner;

public class ColLesspm02sai {

    public static void main(String[] args) {

        System.out.println("単語登録帳です");
        System.out.println("10個の単語を登録します。半角スペースを入れてください");
        System.out.println("入力を途中でやめるには＜e＞を押します。");

        //単語を10個登録する箱を作った！
        Word02[] words = new Word02[10];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(count < 10){
            //入力を受け取る
            String input = scanner.nextLine();
            if (input.equals("e")) {
                break;
            }
            //受け取った入力をスペース区切りで分割する
            String[] wordAndMeaning = input.split(" ");
            //分割した項目を単語として、 1番目を意味としてwordを生成する
            Word02 word = new Word02(wordAndMeaning[0],wordAndMeaning[1]);
            //Wordに生成したWordをセットする
            words[count] = word;
            count++;
        }

        //出力している。toString()は省略もできる。
        for(int i =0; i <count; i++){
            System.out.println(words[i]);
        }

//完了：これをif文に合体させたい…！！
//        String str;
//        while (!"e".equals(str = scanner.nextLine())) {
//        }
//        System.out.println("入力終了です。");
    }
}
