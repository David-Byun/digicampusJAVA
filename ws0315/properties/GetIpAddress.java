package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetIpAddress {

    public static String getIpAddress() {
        Properties props = new Properties();
        String ipAddr = "";
        String fileName = "file.txt";
        try(FileInputStream in = new FileInputStream(fileName)) {
            //app이랑 연결해서 로컬 갖고 있는 파일 가져옴
            //파일 담는다
            props.load(in);
            //load exception 발생하면 안닫기니까 아래로 내려야함
        } catch (IOException e) {
            System.out.println("문제 발생!");
        }
        //파일 안에 IP_ADDR 을 찾음
        ipAddr = props.getProperty("IP_ADDR");
        return ipAddr;

    }
}
