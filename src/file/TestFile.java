package file;
import java.io.File;
public class TestFile {
    public static void main(String[] args){
        File f1 = new File("./test.text");
        System.out.println("f1的相对路径："+ f1.getAbsolutePath());
    }
}
