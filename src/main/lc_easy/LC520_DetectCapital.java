package main.lc_easy;

/**
 * Created by wxwcase on 3/3/17.
 */
public class LC520_DetectCapital {

    public boolean detectCapitalUse(String word) {

        if (word == null || word.equals(""))
            return true;

        char fc = word.charAt(0);
        if (fc >= 'A' && fc <= 'Z') {
            if (word.substring(1).toLowerCase().equals(word.substring(1))
                    || word.substring(1).toUpperCase().equals(word.substring(1))) {
                return true;
            } else {
                return false;
            }
        } else {
            if (!word.substring(1).toLowerCase().equals(word.substring(1)))
                return false;
            else
                return true;
        }

    }
}
