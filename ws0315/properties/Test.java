package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        Properties props = new Properties();
        String fileName = "file.txt";
        FileInputStream in = null;
        try {
            //app이랑 연결해서 로컬 갖고 있는 파일 가져옴
            in = new FileInputStream(fileName);
            //파일 담는다
            props.load(in);
            //load exception 발생하면 안닫기니까 아래로 내려야함
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //파일 안에 IP_ADDR 을 찾는
        String ip = props.getProperty("IP_ADDR");
        System.out.println(ip);
    }
}
