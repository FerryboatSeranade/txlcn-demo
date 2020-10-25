package shu.shen; /**
 * zz
 *
 * @title: zz
 * @Author shu.shen
 * @Date: 2020/10/25 14:22
 * @Version 1.0
 */
import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class TMApplication {

    public static void main(String[] args) {
        SpringApplication.run(TMApplication.class, args);
    }
}
