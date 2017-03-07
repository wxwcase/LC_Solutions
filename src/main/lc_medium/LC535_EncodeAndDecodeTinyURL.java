package main.lc_medium;

import java.util.ArrayList;

/**
 * Created by wxwcase on 3/6/17.
 */
public class LC535_EncodeAndDecodeTinyURL {

    class Codec {

        ArrayList<String> list = new ArrayList<>();

        public String encode(String longUrl) {
            list.add(longUrl);
            return list.size() - 1 + "";
        }

        public String decode(String shortUrl) {
            return list.get(Integer.valueOf(shortUrl));
        }
    }
}
