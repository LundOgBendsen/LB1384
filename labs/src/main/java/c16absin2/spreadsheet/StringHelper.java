package c16absin2.spreadsheet;

public class StringHelper {

    public static String createSpaces(int howMany) {
        String result = "";
        for (int n = 0; n < howMany; n++) {
            result += " ";
        }
        return result;
    }

    public static String createLine(int howLong) {
        String result = "";
        for (int n = 0; n < howLong; n++) {
            result += "-";
        }
        return result;
    }

    public static String setStringLength(String s, int howLong) {
        String result;
        if (s.length() > howLong) {
            result = s.substring(0, howLong - 3) + "...";
        } else if (s.length() == howLong) {
            result = s;
        } else {
            result = createSpaces(howLong - s.length());
            result += s;
        }
        return result;
    }
}
