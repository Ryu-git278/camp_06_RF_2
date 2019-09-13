package com.company.take04;
    //問題3(colLesson03)のJAVAを、ArrayListに変更

import com.company.take04.Word04;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Arrays;不要
//import java.util.List;不要


    public class colLesson04 {

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

            Scanner scanner = new Scanner(System.in);

            //課題03時点 //単語を5個登録する箱を作った！ Word04[] words = new Word04[5];
            //wordクラスのインスタンス配列 ArrayListにする。
            //ArrayLisは要素数を指定しなくても使える。
            ArrayList<Word04> words = new ArrayList<>();
            //NEW: ArrayListへの代入 words.add()
            //単語をカウント
            int count = 0;

//完了：配列について、質問投げる。コントラストについて復習。
//( or {expected がありません。⇔[]を追加
//完了：書き方 間違い。
// エラー：array initializer expected
//           （配列初期化子？）とは、、
//            「型[] 変数名 = { 初期値, 初期値 };」]
//            もしくは「型[] 変数名 = new 型[]{ 初期値, 初期値 };」という形式


//        //問3にて:エラーを発生させるために、カウント5を、トゥルー（無限大）に変更。
//            課題4では変更なし。⇔todo:ここが違う。
            //スキャナーを読み取るのはここ。前回の理解が間違い。
            while (true) {
                //入力を受け取る
                String input = scanner.nextLine();
                //受け取った入力をスペース区切りで分割する
                String[] wordAndMeaning = input.split(" ");
                //ここだ！！
                //if文で更に条件分岐。(カウントが５になったら以下を表示してループを抜けて、終了。)
                if (count == 5) {
                    break;
                } else {
                    //wordクラスに作った配列の中に入力した単語と意味をここで格納words.add！！公式の理解が違う！
                    words.add(new Word04(wordAndMeaning[0], wordAndMeaning[1]));
                    //次の入力を促すメッセージ
                    System.out.println("単語と意味を入力してください。\"e\"で終了します。");
                }
                try {
                } catch (Exception e) {
                    break;
                }
                count++;
            }

//NEW： AllayListへのアクセス
//NEW: ArrayListに登録されている数の表示 words.size()
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i).toString());
        }
        System.out.println(words.size() + "件、登録しました。お疲れさまでした。");
    }
}