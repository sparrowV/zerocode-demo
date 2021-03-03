package ge.dvali.zerocodedemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@SuppressWarnings("unchecked")
public class Utils {


    public long getCount(Map<String,Object> params) throws JsonProcessingException {
        String title = (String)params.get("title");
        Gson gson = new Gson();
        Type listOfBookObject = new TypeToken<ArrayList<Book>>() {}.getType();
        List<Book> books = gson.fromJson((String)params.get("books"), listOfBookObject);
        return books
                .stream()
                .filter(t-> t.getTitle().equals(title))
                .count();
    }
}
