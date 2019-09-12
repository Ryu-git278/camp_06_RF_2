package com.company.memo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.application.Application;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Memo7 {

    public static void main(String[] args) {
//        /**
//     * 計算機UIクラス.
//     */
//
//        private JTextField	textField	= new JTextField("");	// 計算結果を表示するテキストフィールドクラス
//        private Memo7_1	calc		= new Memo7_1();	// 計算処理クラス
//        private String key = "";	// 入力れたキーの値を保持
//        private int result = 0;		// 計算結果を保持
//
//        /**
//         * 計算機画面を作成して表示します.
//         */
//        public void createUI() {
//
//            JFrame frame = new JFrame();	// UIの本体クラス
//            JPanel panel = new JPanel();	// UIの各パーツの配置先となるパネルクラス
//            JPanel keyPanel = new JPanel();	// パネルの上に配置するボタン用のパネル
//
//            // ボタンの設定
//            // レイアウト（4×4マス）
//            keyPanel.setLayout(new GridLayout(4, 4));
//            // 0〜9ボタン、各演算ボタン、OFFボタンの設置
//            keyPanel.add(new NumberButton("7"), 0);
//            keyPanel.add(new NumberButton("8"), 1);
//            keyPanel.add(new NumberButton("9"), 2);
//            keyPanel.add(new CalcButton("÷"), 3);
//            keyPanel.add(new NumberButton("4"), 4);
//            keyPanel.add(new NumberButton("5"), 5);
//            keyPanel.add(new NumberButton("6"), 6);
//            keyPanel.add(new CalcButton("×"), 7);
//            keyPanel.add(new NumberButton("1"), 8);
//            keyPanel.add(new NumberButton("2"), 9);
//            keyPanel.add(new NumberButton("3"), 10);
//            keyPanel.add(new CalcButton("－"), 11);
//            keyPanel.add(new OffButton(), 12);
//            keyPanel.add(new NumberButton("0"), 13);
//            keyPanel.add(new CalcButton("＝"), 14);
//            keyPanel.add(new CalcButton("＋"), 15);
//
//            // パネルの設定
//            // レイアウト
//            panel.setLayout(new BorderLayout());
//            // ボタン用パネル
//            panel.add(keyPanel, BorderLayout.CENTER);
//            // 計算結果表示エリア
//            panel.add(textField, BorderLayout.NORTH);
//            // クリアボタン
//            panel.add(new ClearButton(), BorderLayout.SOUTH);
//
//            // フレームの設定
//            // サイズ
//            frame.setSize(new Dimension(250, 300));
//            // タイトル
//            frame.setTitle("計算機");
//            // パネル
//            frame.setContentPane(panel);
//            // 閉じるボタンがクリックされた場合の挙動（プログラムを終了）
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            // 画面を表示する
//            frame.setVisible(true);
//        }
//
//        /**
//         * OFFボタンクラス.
//         */
//        class OffButton extends JButton implements ActionListener {
//
//            private static final long serialVersionUID = 1L;
//
//            // コンストラクタ
//            public OffButton() {
//                // 親クラスにボタン名を渡す（渡した名称がボタンに表示されます）
//                super("OFF");
//                // アクションリスナー（ボタンがクリックされたときに処理を起動する）に登録
//                this.addActionListener(this);
//            }
//
//            /**
//             * OFFボタンがクリックされた場合の処理.<br>
//             * システムを終了します.
//             */
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        }
//
//        /**
//         * クリアボタンクラス.
//         */
//        class ClearButton extends JButton implements ActionListener {
//
//            private static final long serialVersionUID = 1L;
//
//            // コンストラクタ
//            public ClearButton() {
//                // 親クラスにボタン名を渡す（渡した名称がボタンに表示されます）
//                super("C");
//                // アクションリスナー（ボタンがクリックされたときに処理を起動する）に登録
//                this.addActionListener(this);
//            }
//
//            /**
//             * クリアボタンがクリックされた場合の処理.<br>
//             * 計算結果を初期化します.
//             */
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField.setText("");
//                result	= 0;
//                key		= "";
//            }
//        }
//
//        /**
//         * 数値ボタンクラス.
//         */
//        public class NumberButton extends JButton implements ActionListener {
//
//            private static final long serialVersionUID = 1L;
//
//            // コンストラクタ
//            public NumberButton(String keyTop) {
//                // 親クラスにボタン名を渡す（渡した名称がボタンに表示されます）
//                super(keyTop);
//                // アクションリスナー（ボタンがクリックされたときに処理を起動する）に登録
//                this.addActionListener(this);
//            }
//
//            /**
//             * 数値ボタンがクリックされた場合の処理.<br>
//             */
//            @Override
//            public void actionPerformed(ActionEvent evt) {
//
//                // ボタンの名称を取得
//                String keyNumber = this.getText();
//                textField.setText(keyNumber);
//                calculator(keyNumber);
//            }
//        }
//
//        /**
//         * 演算ボタンクラス.
//         */
//        public class CalcButton extends JButton implements ActionListener {
//
//            private static final long serialVersionUID = 1L;
//
//            // コンストラクタ
//            public CalcButton(String keyTop) {
//                // 親クラスにボタン名を渡す（渡した名称がボタンに表示されます）
//                super(keyTop);
//                // アクションリスナー（ボタンがクリックされたときに処理を起動する）に登録
//                this.addActionListener(this);
//            }
//
//            /**
//             * 演算がクリックされた場合の処理.<br>
//             */
//            @Override
//            public void actionPerformed(ActionEvent evt) {
//
//                // ボタンの名称を取得
//                String keyNumber = this.getText();
//
//                // クリックされたキーが「=」以外であればキーの情報を画面に表示
//                if(!"＝".equals(keyNumber)) {
//                    textField.setText(keyNumber);
//                }
//
//                // 計算処理を実行
//                calculator(keyNumber);
//            }
//        }
//
//        /**
//         * 計算処理メソッド.<br>
//         * クリックされたキーによって処理を分岐します.
//         */
//        public void calculator(String in) {
//
//            System.out.println(in);
//            // キーが演算キーの場合は変数に代入
//            switch (in) {
//                case "＋":
//                case "－":
//                case "×":
//                case "÷":
//                    key = in;
//                    break;
//
//                // キーが「＝」の場合は計算結果を出力
//                case "＝":
//                    textField.setText(Integer.toString(result));
//                    break;
//
//                // キーが数値キーの場合は計算処理
//                default:
//                    // 演算キーに応じた計算を実行
//                    if(!"".equals(key)) {
//
//                        switch (key) {
//                            // 足し算
//                            case "＋":
//                                result = calc.tashizan(result, Integer.parseInt(in));
//                                break;
//                            // 引き算
//                            case "－":
//                                result = calc.hikizan(result, Integer.parseInt(in));
//                                break;
//                            // 掛け算
//                            case "×":
//                                result = calc.kakezan(result, Integer.parseInt(in));
//                                break;
//                            // 割り算
//                            case "÷":
//                                result = calc.warizan(result, Integer.parseInt(in));
//                                break;
//
//                            case "＝":
//                                // 計算結果を出力
//                                textField.setText(Integer.toString(result));
//                        }
//
//                        key = "";
//
//                    } else {
//
//                        // 演算キーが押される前の値を代入
//                        result = Integer.parseInt(in);
//                        textField.setText(Integer.toString(result));
//                    }
//            }
//        }

    }
}
