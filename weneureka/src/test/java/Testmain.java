import java.io.File;

/**
 * Created by PC-007 on 2019/12/18.
 */
public class Testmain {
    public static void main(String[] args){
        File file = new File("D:/image/test/wenprenam.txt");
        System.out.println(file.getParent());
        System.out.println(file.getName().substring(file.getName().lastIndexOf(".")));

        file.renameTo(new File("D:\\image\\test\\wenprename2.txt"));
    }
}
