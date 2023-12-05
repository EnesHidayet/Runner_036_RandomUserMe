package org.enes;

import com.google.gson.*;
import org.enes.entity.User;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {

        UserRepositoryImpl repository=new UserRepositoryImpl();
//        repository.fromRandomUserMe().forEach(System.out::println);
        List<User> userList=repository.fromRandomUserMe();

        /**
         * 1-Kullanýcý listesinin içinde adýnda i geçenleri listele
         * 2-Kullanýcýlarý cinsiyetine göre gruplayýn Map<String,List<User>> þeklinde yazdýrýn.
         * 3-
         */
//        1. soru
//        userList.stream().filter(x->x.getName().getFirst().contains("i")).forEach(q-> System.out.println("Adý...:"+q.getName().getFirst()+" in emaili...:"+q.getEmail()));
//        2.soru
//        HashMap<String , List<User>> genderList=userList.stream().collect(Collectors.groupingBy(
//                User::getGender, //x.getGender(),
//                HashMap::new,
//                Collectors.toList()
//        ));
//
//        genderList.forEach((k,v)->
//                System.out.println(k+" - "+v));
//        3.soru






    }
}
