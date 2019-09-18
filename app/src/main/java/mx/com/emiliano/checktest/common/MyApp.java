package mx.com.emiliano.checktest.common;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyApp extends Application {
    private static MyApp instance = null;

    public static MyApp getInstance(){
        return instance;
    }

    public static Context getContext(){
        return instance;
    }

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }

    public static List<String> splitCamelCaseString(String s){
        List<String> result = new ArrayList<>();
        for (String w : s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
            result.add(w);
        }
        return result;
    }

    public static String concatName(List<String> names){
        Iterator iterator = names.iterator();
        String result = "";
        while(iterator.hasNext()) {
            result += iterator.next() + " ";
        }

        return result.trim();
    }
}
