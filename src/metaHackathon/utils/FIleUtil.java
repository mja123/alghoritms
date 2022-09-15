package metaHackathon.utils;

import java.io.FileWriter;
import java.io.IOException;

public class FIleUtil {
    public static void createAnswerFile(int result, String path) {

        //Crating a file with the problem's answer.
        try (FileWriter answer = new FileWriter(path)) {
            answer.append(String.valueOf(result));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
