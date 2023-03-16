package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test1 {
    public static void main(String[] args) {
        Properties props = new Properties();
        String fileName = "file2.txt";
        try(FileInputStream in = new FileInputStream(fileName)) {
            //app이랑 연결해서 로컬 갖고 있는 파일 가져옴
            //파일 담는다
            props.load(in);
            //load exception 발생하면 안닫기니까 아래로 내려야함
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        //파일 안에 IP_ADDR 을 찾음
        String ip = props.getProperty("IP_ADDR");
        int port = Integer.parseInt(props.getProperty("PORT"));
        System.out.printf("%s 서버로 %d 포트로 접속..", ip, port);
    }
}
