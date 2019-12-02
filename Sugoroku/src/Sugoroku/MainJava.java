package Sugoroku;

import java.util.Random;
import java.util.Scanner;

/**
	 * すごろくチャレンジ
	 * @author 3d156
	 *
	 */
public class MainJava{
	/**
	 * すごろくインスタンス 乱数発生装置
	 */
	private Random rand = new Random();
	
	/**
	 * すごろくの入力装置
	 * 
	 */
	private  Scanner input = new Scanner(System.in);
	/*
	 * すごろくの升目
	 */
	
	
	private Coma player;
	
	private void run() {
		startGame();
		Masu[] path;
		//ターンの繰り替え
		do {
			showPath();
			System.out.println("ダイスを振ってね（エンターキー入力）");
			input.nextLine(); //	入力待ち
			//ダイスがある
			int daice=rand.nextInt(4)+1;
			System.out.println(daice+"がでたよ！！");
			//プレイヤーとコンピュータがダイスを振る

			//コマを出目分進める
			player.proceed(daice);
			
			int pos = player.getPosition();
			
			if(pos < path.length) {
				Coma now = path[pos];
				//どんなマスに来たのか情報を出す
				System.out.println(path[pos].getCaption());
				//マスに割り振られたイベントが発動する
				now.doEvent(player);
				player.showProfile();
			}
			

			
			//もしゴールだったらゲーム終了
			boolean goal = path.length -1 < player.getPosition();
			if(goal) {
				System.out.println("ゴールしました");
				break;
			}
			
		}while(true);
		endGame();

	}
	/**
	 * 現状のすごろく状態を表示する
	 */
	private void showPath() {
		//コマ目番号を表示
		for (int i = 0; i < path.length; i++) {
			if(i<10) {
				System.out.print(" ");
			}
			System.out.print(i+" ");
			
		}
		System.out.println();//改行
		
		//プレイヤー位置を表示
		for (int i = 0; i < path.length; i++) {
			//プレイヤーのいる場所の時は*を書く
			
			if(i != player.getPosition()) {
				System.out.print(" ");
			}else {
				System.out.print(" * ");
			}
			
		}
		System.out.println();//改行
	}
	/*
	 * ゲーム終了時の動作
	 */
	private void endGame() {
		
	}
	/**
	 * ゲーム開始時の動作
	 */
	private void startGame() {
		// TODO: マスを準備 
		path = new Masu[20];
		for (int i = 0; i < path.length; i++) {
			//とりあえず通常マスでつくっておこうかな？
			path[i] = new NormalCell();
			
		}
		player = new Coma("(^^)/");
		// TODO: プレイヤーを準備
		
	}


	/**
	 * すごろくのメインプログラム
	 * 起動時引数
	 * @param args
	 */
	public static void main(String[] args) {

		
		//升目がある
		//ふりだし・あがり・その他の色々なマスがあるはず
		//プレイヤーが存在する
		//	どの位置にいるかを記録しておく必要がある
		//お金の概念は入れる
		
//		MainJava m = new MainJava();
//		m.run();
		new MainJava().run();
		
	}



}
