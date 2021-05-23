package com.ossapp.lymar.ossappserver;


import com.ossapp.lymar.ossappserver.entity.Style;
import com.ossapp.lymar.ossappserver.entity.User;
import com.ossapp.lymar.ossappserver.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.ArrayList;
import java.util.Arrays;


@SpringBootApplication
public class OssAppServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OssAppServerApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(UserRepository repository) {
        return args -> {
            User user = new User( 41, "Москва", "bfvhfbvfjk",
                    "Нина", "222", 2, null,
                    new ArrayList<>(Arrays.asList(new Style(6, 4),
                            new Style(1, 2))), 2);
            repository.save(user);
////          User user = repository.findById(1L).orElseThrow(NoSuchElementException::new);
////            System.out.println(user.getList().get(0).getLevel().getName());
//          Long id =  repository.save(user).getId();
//          setStyle(user.getList(), id, styleUserRepository);
        };
    }

//    public void setStyle(List<UserStyle> list, long userId, StyleUserRepository repository) {
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).setUser_id(userId);
//            repository.save(list.get(i));
//        }
//    }
}
