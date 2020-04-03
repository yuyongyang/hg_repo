package FileUtil;


import java.io.File;
import java.io.FileInputStream;

public class ParseFileToByte {


    public static void main(String[] args) {

    }

    /**
     * 获取文件流
     * @param filePath 文件的绝对地址
     * @return 文件流
     * @throws Exception 文件是否存在
     */
    private  static FileInputStream getFileInputStream(String filePath)throws Exception{
        File file=new File(filePath);
        if (!file.exists()){
            throw new Exception("文件不存在");
        }
        return new FileInputStream(file);
    }

    /**
     * fun 文件流转换成二进制
     * @param inputStream 文件流
     */
    private static void parseFileToByte(FileInputStream inputStream){
        Byte[] bytes=new Byte[1024*10];

    }
}
