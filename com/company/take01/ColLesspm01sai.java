package com.company.take01;
//提出！
//完了"e"で毎回脱出できるようにする！

import java.util.Scanner;
import com.company.Word;

public class ColLesspm01sai {

        public static void main(String[] args) {

            System.out.println("単語登録帳です");
            System.out.println("10個の単語を登録します。半角スペースを入れてください");
            System.out.println("入力を途中でやめるには＜e＞を押します。");

            //todo;どれも見ずらいよね！

            //apple りんご
            //String[] words1 = new String[10];

            // {"apple" "grape"}
            // {"りんご" "ぶどう"}
            //String[] words2 = new String[10];
            //String[] meanings = new String[10];

            //二次元配列
            //{{"apple" , "りんご"},{"grape","ぶどう"}}
            //    String[][] words3 = new String[10][2];
            //    words3[0][0] = "apple";
            //    words3[0][1] = "りんご";
            //
            //    String X1 = "aaa";
            //    String X2 = new String ("bbb");


            //別途 Word.java で 定義すると、スッキリ見やすくなる。
            //{words(word="apple",meaning="りんご"),...}
            //        Word[] words4 = new Word[10]; //
            //        words4[0] = new word(); //⇔この行がないと、Wordの中身が空になってしまう。
            //        words4[0].word = "apple";
            //        words4[0].meaning = "りんご";

            //        int y = 10; //プリミティブ型
            //        String z = "aaa"; //参照型

//    Scanner scanner = new Scanner(System.in);
//    String input = scanner.nextLine(); //"apple りんご"
//    String[] wordAndMeaning = input.split(" ");//スペース区切り{"apple","りんご"}
//    Word word = new Word(wordAndMeaning[0],wordAndMeaning[1]);//Wordのインスタンス化： word ="apple",meaningu="りんご"

//        System.out.println(word);//なにがでる？Vol1
//        System.out.println(wordAndMeaning);//なにがでる？Vol2

//        String s = "あああ";
////        S toStoring(); ⇔が実装されている
//        System.out.println(s);Vol3
            //上に授業解説メモがある。

//メモ　　　型名　変数名 ＝ 要素数 10！
            Word[] words = new Word[10];
            // スキャナー。入力受付
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
                Word word = new Word(wordAndMeaning[0],wordAndMeaning[1]);
                //Wordに生成したWordをセットする
                words[count] = word;
                count++;
            }

            //出力 forループ
            for(int i =0; i <count; i++){
                System.out.println("登録した単語は、"+ words[i].word +"意味は"+ words[i].meaning);
            }
//    System.out.println(word.word);
//    System.out.println(word.meaning);

//eで終了文。参考書籍より。
//完了"e"で毎回脱出できるようにする！
//            System.out.println("eを押して終了します");
//            String str;
//            while (!"e".equals(str = scanner.nextLine())) {
//            }
            System.out.println("入力終了です。");
        }
    }
