package org.enes;

import com.google.gson.*;
import org.enes.entity.User;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRepositoryImpl {
    private static final String URL="https://randomuser.me/api/?results=5";
    public List<User> fromRandomUserMe(){
        Scanner sc=null;
        List<User> userList=new ArrayList<>();
        try {
            sc=new Scanner(new URL(URL).openStream(), StandardCharsets.UTF_8);
            StringBuilder sb=new StringBuilder();
            while (sc.hasNext()){
                sb.append(sc.nextLine());
            }
            Gson gson=new Gson();
            JsonElement jsonElement = JsonParser.parseString(sb.toString()); // 1. ad�m string to jsonElement
            JsonObject jsonObject= jsonElement.getAsJsonObject(); // 2. ad�m jsonElement i jsonObjecte d�n��t�r�yoruz.
            JsonArray jsonArray=jsonObject.get("results").getAsJsonArray();
            int size=jsonArray.size();
            for (int i=0;i<size;i++){
                JsonObject userObject=jsonArray.get(i).getAsJsonObject();
                User user=gson.fromJson(userObject,User.class);
                userList.add(user);
            }
        } catch (Exception exception) {
            System.out.println("Beklenmeyen hata....:"+exception.toString());
        }
        return userList;
    }
}
