package com.company.take3;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {

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

            //分割した項目を単語として、 1番目を意味としてwordを生成する
            Word03 word = new Word03(wordAndMeaning[0], wordAndMeaning[1]);

            //Wordに生成したWord03をセットする
            words[count] = word; //todo:ここがエラーの発生源
            count++;
        }
    }
}
