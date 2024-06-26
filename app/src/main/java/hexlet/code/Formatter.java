package hexlet.code;

import hexlet.code.formatters.Json;
import hexlet.code.formatters.Plain;
import hexlet.code.formatters.Stylish;

import java.util.List;
import java.util.Map;

public class Formatter {

    public static String format(List<Map<String, Object>> resultOfDiff, String format) throws Exception {
        switch (format) {
            case "stylish":
                return Stylish.format(resultOfDiff);
            case "plain":
                return Plain.format(resultOfDiff);
            case "json":
                return Json.format(resultOfDiff);
            default:
                throw new IllegalArgumentException("Invalid format: " + format);
        }
    }
}
