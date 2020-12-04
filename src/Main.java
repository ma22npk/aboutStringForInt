
// scannerのインポート
import java.util.Scanner;
//Stream APIのインポート
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // scannerのインスタンス化
        Scanner sc = new Scanner(System.in);

        // 空白区切りに文字型で要素ごとに配列に分割
        String[] stringArray = sc.nextLine().split(" ");
        // String型配列 を int型配列 に変換
        int[] intArray = Stream.of(stringArray).mapToInt(Integer::parseInt).toArray();

//【START】配列の中身を全部出力する ==============
//        for (int i = 0; i < intArray.length; i++) {
//            int j = intArray[i];
//            System.out.println(j);
//        }
//【 END 】配列の中身を全部出力する ==============

// 【START】配列内の値をすべて足す =============
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
            System.out.println(sum);
        }
// 【 END 】配列内の値をすべて足す ==============

    }
}