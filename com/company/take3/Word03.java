package com.company.take3;

public class Word03 {

//    問題1(colLesson01)のjavaをWordクラスにtoString()メソッドを実装する

        //    フィールド = オブジェクトの持つデータ
        public String word;
        public String meaning;

        //    コンストラクタ = オブジェクトの実態化のさせ方
        public Word03(){}
        public Word03(String word, String meaning) {
            this.word = word;
            this.meaning = meaning;
        }

        //toString?
        @Override
        public String toString(){
            return "英語" + this.word + "日本語" + this.meaning + "を登録しました。";
        }
    }