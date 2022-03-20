package IO;

import java.io.*;

public class IOforLook {
    public static void main(String[] args) {
        try {
            DataInputStream dataInputStream=new DataInputStream(new FileInputStream("D:\\Project\\项目\\Reback\\test.txt"));
            InputStreamReader inputStreamReader=new InputStreamReader(dataInputStream);
            char [] r=new char[4];
            inputStreamReader.read(r,0,4);
            System.out.println(String.copyValueOf(r));
        } catch (IOException x) {
            x.printStackTrace();
//            ByteArrayInputStream
//                    StringBufferInputStream

        }
    }
}
