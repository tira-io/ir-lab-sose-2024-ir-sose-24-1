import org.terrier.terms;
public class NaiveStemmer implements Stemmer{
    public String stem (String token){
        int cutLength = token.length() / 3;
        cutLength = Integer.min(cutLength, 5);
        return token.substring(0, token.length() - cutLength);
    }
}