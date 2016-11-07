package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Google has URL shortner facility. In Amazon, interview I was asked to do the same to shorten the passed the URL. 
 * For example,
 * http://stackoverflow.com/questions/1143084/code-complexity-analysis-tools-beyond-cyclomatic-complexity
 * becomes goo.gl/url/1266fh
*/
public class UrlShortner{

    /**
     * The alloweded characters
     */
    public static char[] characterArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd'};

    /**
     * The maximum length of the shorten url
     */
    public static final Integer MAX_URL_SIZE = 6;

    /**
     * The map to hold the short urls
     */
    public static Map<String, String> longToShortUrlMap = new HashMap<>();

    /**
     * The map to hold the long urls
     */
    public static Map<String, String> shortToLongUrlMap = new HashMap<>();
    

    /**
     * Get long url, based on passed short url. 
     * 
     * @param shortUrl The short url in request
     * @return 
     */
    public static String getLongUrl(String shortUrl) {
        if (null != shortUrl) {
            if (shortToLongUrlMap.get(shortUrl) != null) {
                return shortToLongUrlMap.get(shortUrl);
            }
        }
        return null;
    }

    public static String getShortUrl(String longUrl) {
        if (null != longUrl) {
            if (longToShortUrlMap.get(longUrl) == null) {
                generateUrl(longUrl);
            }
            return longToShortUrlMap.get(longUrl);
        }
        return null;
    }

    private static void generateUrl(String longUrl) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i <= MAX_URL_SIZE; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(characterArray.length);
            stringBuffer.append(getCharacter(randomNumber));
        }
        String shortUrl = "goo.gl/" + stringBuffer.toString();
        longToShortUrlMap.put(longUrl, shortUrl);
        shortToLongUrlMap.put(shortUrl, longUrl);
    }

    private static char getCharacter(int randomNumber) {
        return characterArray[randomNumber];
    }
}
