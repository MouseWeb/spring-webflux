package br.com.mouseweb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import reactor.blockhound.BlockHound;

@SpringBootApplication
public class SpringWebfluxApplication {
//    static {
//        BlockHound.install();
//    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringWebfluxApplication.class).run(args);
    }

}
