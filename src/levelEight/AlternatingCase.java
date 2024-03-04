package levelEight;

public class AlternatingCase {
    public static void main(String[] args) {
        System.out.println(alternatingCase("David Meijer"));
    }

    static String alternatingCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                sb.append(str.toUpperCase().charAt(i));
            } else {
                sb.append(str.toLowerCase().charAt(i));
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

}
