package levelEight;

import java.util.ArrayList;
import java.util.List;

//https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9

public class LineNumbering {
    public static void main(String[] args) {
        System.out.println(lineNumbering(List.of("a", "b", "c")));
        System.out.println(lineNumbering(List.of("", "", "", "", "")));
    }

    static List<String> lineNumbering(List<String> lines) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        for (String str : lines
        ) {
            arrayList.add(++i + ": " + str);
        }
        return arrayList;
    }
}