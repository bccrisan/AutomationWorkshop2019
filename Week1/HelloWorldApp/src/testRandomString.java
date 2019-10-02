public class testRandomString {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String randomAlphaNumeric(int count){
        StringBuilder builder = new StringBuilder();
        while(count-- != 0){
            int charachter = (int) (Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(charachter));
        }
        return builder.toString();
    }
}
