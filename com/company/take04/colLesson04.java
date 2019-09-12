//問題3(colLesson03)のJAVAを、ArrayListに変更
package com.company.take04;

//todo:ここだけ！もうちょっと！

import com.company.take04.Word04;
import java.util.ArrayList;
import java.util.Scanner;

public class colLesson04 {
    private static ArrayList<String>[] words;

//ArrayListの授業メモを下記に復元
//    Scanner sc = new Scanner(System.in);
//
//    String[] strings = new String(3);
//    strings (0)="aa"
//
//    ArrayList<String>list = new ArrayList<>();
//    list.add("aa");

        public static void main(String[] args) {

            System.out.println("単語登録帳です");
            System.out.println("5個の単語を登録します。半角スペースを入れてください");
            System.out.println("入力を途中でやめるには＜e＞を押します。");

            //単語を5個登録する箱を作った！
            //課題03時点 Word04[] words = new Word04[5];
            ArrayList<Word04> words = new ArrayList<Word04>();


//            Word04[] words = new Word04[5];
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            //NEW: ArrayListへの代入 words.add()
            words.add();
            //NEW: ArrayListに登録されている数の表示 words.size()
            words.size();

//    ArrayList<String>list = new ArrayList<>();
//    list.add("aa");


//        //todo:エラーを発生させるために、カウント5を、トゥルー（無限大）に変更。
            while (true) {
                //入力を受け取る
                String input = scanner.nextLine();
                //受け取った入力をスペース区切りで分割する
                String[] wordAndMeaning = input.split(" ");
                try {
                    //分割した項目を単語として、 1番目を意味としてwordを生成する
                    Word04 word = new Word04(wordAndMeaning[0], wordAndMeaning[1]); //todo:+ここもエラーの発生源だった！
                    //Wordに生成したWord03をセットする
                    words[count] = word; //todo:ここがエラーの発生源
                } catch (Exception e) {
                    break;
                }
                count++;
            }

        //NEW： AllayListへのアクセス
            for (int i = 0; i < count; i++) {
                System.out.println(words.get(i));
            }
        }
}