package code_1221;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ScoreSort {
    private String id;
    private int score;


    public static void main(String[] args) {
         //宣告一個ScoreSort 的物件陣列，其大小為４
         ScoreSort[] student = new ScoreSort[4];
         //第１～４筆資料藉由建構函數給初值
         student[0] = new ScoreSort("S001",87);
         student[1] = new ScoreSort("S002",90);
         student[2] = new ScoreSort("S003",52);
         student[3] = new ScoreSort("S003",95);
         //宣告一個LinkedList<ＳcoreSore> 的資料型態
         List<ScoreSort> students = new LinkedList<>();
         //將
         students.add(student[0]);
         students.add(student[1]);
         students.add(student[2]);
         students.add(student[3]);
         //呼叫list的sort 方法，並實作Ｃomparator方法
         students.sort(new Comparator<ScoreSort>() {
             @Override
             public int compare(ScoreSort o1, ScoreSort o2) {
                 return (o2.score-o1.score); //由大到小
                 //return (o1.score-o2.score); //由小到大
             }
         });

        for (ScoreSort ss: students) {
            System.out.println(ss);
        }

     }






    public ScoreSort(String id,int score) {
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ScoreSort{" +
                "id='" + id + '\'' +
                ", score=" + score +
                '}';
    }
}
