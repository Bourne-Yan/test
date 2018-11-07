import java.io.*;

/**
 * @author Bourne
 * @version V1.0
 * @ClassName: test
 * @Description: TODO ADD REASON(可选).
 * @date: 2018年11月06日 11:34
 * @since JDK 1.8
 */
public class Test {
    private int select ;
    private int pack;
    private int programme;

    private BufferedReader student;
    private BufferedReader answer;
    /**
    *@Classname read 读文件
    *@Param [path]   文件的路径
    *@return java.io.BufferedReader
    *
    **/


    public BufferedReader read(String path){
        String pathname = path; 
        File filename = new File(pathname); 
        InputStreamReader reader = null; 
        try {
            reader = new InputStreamReader(
                    new FileInputStream(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(reader);
        return br;
    }
    /**
    *@Classname write    写文件
    *@Param [content]   文件的内容
    *@return void
    *
    **/


    public void write(String content) throws IOException {
        File writename = new File("");
        try {
            writename.createNewFile(); // 创建新文件
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(writename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.write(content);
        out.flush();
        out.close();
    }
    /**
    *@Classname judge   判断正确答案和学生答案是否一致
    *@Param [time]   题目的数量
    *@return int    返回对了几道
    *
    **/


    public int judge(int time) throws IOException {
          int correct = 0 ;
          for(int i =0 ;i<time;++i){
              if(student.readLine().equals(answer.readLine())){
                  ++correct;
              }
          }
          return correct;
    }
    /**
    *@Classname nextLine  移动到下一行
    *@Param []
    *@return void
    *
    **/
    
    
    public void nextLine() throws IOException {
        student.readLine();
        student.readLine();
    }


    /**
    *@Classname start   程序入口
    *@Param [path_student  学生答案文件的路径, path_Answer   正确答案文件路径]
    *@return void
    *
    **/


    public void start(String path_student,String path_Answer) throws IOException {
        String line_student ;
        String line_answer;
        student = read(path_student);
         answer = read(path_Answer);
        nextLine();
        select = judge(20);
        nextLine();
        pack = judge(2);
        nextLine();
        programme = judge(3);
    }
}
