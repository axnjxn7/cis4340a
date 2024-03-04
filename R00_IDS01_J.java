import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class R00_IDS01_J {
    public static void main(String[] args) {
        // String s may be user controllable
        // \uFE64 is normalized to < and \uFE65 is normalized to > using the NFKC normalization form
        String s = "\uFE64" + "script" + "\uFE65";
         
        // Validate
        Pattern pattern = Pattern.compile("[<>]"); // Check for angle brackets
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()) {
          // Found black listed tag
          throw new IllegalStateException();
        } else {
          // ...
        }
         
        // Normalize
        s = Normalizer.normalize(s, Form.NFKC);
    }
}
