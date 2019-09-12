package com.company.take04;

public class Word04 {

//    問題1(colLesson01)のjavaをWordクラスにtoString()メソッドを実装する

    //    フィールド = オブジェクトの持つデータ
    public String word;
    public String meaning;

    //    コンストラクタ = オブジェクトの実態化のさせ方
    public Word04(){}
    public Word04(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    //toString?
    @Override
    public String toString(){
        return "英語" + this.word + "日本語" + this.meaning + "を登録しました。";
    }
}