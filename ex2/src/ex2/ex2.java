package ex2;
import java.util.Scanner;
import java.util.Random;
public class ex2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//建立掃描器
        //sop("請輸入幾顆骰子\n");//輸出請輸入幾顆骰子，換行
        //dice(sc.nextInt());//將掃描器的值傳入method dice中
        //sop("請輸入要幾張牌\n");//輸出請輸入要幾張牌，換行
        //poker(sc.nextInt());//將掃描器的值傳入method poker中
        sc.close();//關閉掃描器
        majong();
    }
    static void sop(String s){//method sop 傳入值(字串s)
        System.out.print(s);//輸出傳入的 字串s
    }
   
    //麻將
    static void majong(){//method majong
        Random ra = new Random();//設ra為新隨機
        String majiang[] ={
            //萬子
            "一萬","二萬","三萬","四萬","五萬","六萬","七萬","八萬","九萬",
            "一萬","二萬","三萬","四萬","五萬","六萬","七萬","八萬","九萬",
            "一萬","二萬","三萬","四萬","五萬","六萬","七萬","八萬","九萬",
            "一萬","二萬","三萬","四萬","五萬","六萬","七萬","八萬","九萬",
            //筒子
            "一筒","二筒","三筒","四筒","五筒","六筒","七筒","八筒","九筒",
            "一筒","二筒","三筒","四筒","五筒","六筒","七筒","八筒","九筒",
            "一筒","二筒","三筒","四筒","五筒","六筒","七筒","八筒","九筒",
            "一筒","二筒","三筒","四筒","五筒","六筒","七筒","八筒","九筒",
            //條子
            "一條","二條","三條","四條","五條","六條","七條","八條","九條",
            "一條","二條","三條","四條","五條","六條","七條","八條","九條",
            "一條","二條","三條","四條","五條","六條","七條","八條","九條",
            "一條","二條","三條","四條","五條","六條","七條","八條","九條",
            //風牌
            "東","南","西","北","東","南","西","北",
            "東","南","西","北","東","南","西","北",
            //三元
            "中","發","白","中","發","白","中","發","白","中","發","白",
            //花牌
            "梅","蘭","竹","菊","春","夏","秋","冬"
        };
        int used[]=new int[16];//設立整數陣列used
        for(int i = 0 ;i<used.length;i++){//for迴圈，0~陣列used的長度-1，每次+1
            int card1 =ra.nextInt(114);//card1為隨機整數0~113
            used[i] = card1;//used[i]為card1
            for (int j = 0 ; j < i ; j++){//for迴圈，0~i-1，每次+1
                if (used[j]==used[i]){//如果used[j]==used[i]
                    card1 = ra.nextInt(114);//card1為隨機整數0~113
                    j=0;//j歸0
                    used[i]=card1;//將used[i]改為新的card1
                }
            }
        }
        for(int i = 0 ;i<used.length;i++){//for迴圈，0~陣列used的長度-1，每次+1
            sop(used[i]+majiang[used[i]]+",");//輸出對應數字的牌
        }
    }
}