package validators;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evegeny on 08/12/2016.
 */
public class Validator888 {
    public List<String> findErrorsPerLine(String line) {
        ArrayList<String> errors = new ArrayList<>();
        if (line.isEmpty()) {
            errors.add("line is empty");
        }
        if (line.contains("*") || line.contains("#")) {
            errors.add("forbidden sign found");
        }

        return errors;

    }
}
