package pers.geng.qing.ky;

import lombok.val;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Geng Qing on 2019-03-26
 **/
public class FormulaExtractor {


    public ArrayList<Formula> extractDerivative() throws Exception {
        val formulas = new ArrayList<Formula>();
        val list = readAllLines();
        boolean isStop = false;
        boolean isBegin = false;
        for (int i = 0; i < list.size(); i++) {
            val str = list.get(i);
            if (str == null || str.isEmpty()) {
                continue;
            }
            if (str.equals("## 导数")) {
                isStop = true;
                continue;
            }

            if (isStop) {
                if (str.startsWith("$$")) {
                    isBegin = true;
                    continue;
                }

                if (str.startsWith("&")) {
                    String[] fs = str.split("&");
                    formulas.addAll(getFormula(fs));
                }
            }

            if (isBegin) {

                if (str.startsWith("$$")) {
                    break;
                }

            }
        }

        return formulas;

    }

    public List<Formula> getFormula(String[] fs) {
        val list = new ArrayList<Formula>();
        for (int i = 0; i < fs.length; i++) {
            val str = fs[i];
            if (str.trim().isEmpty()) {
                continue;
            }
            String[] strs = str.split("=");
            Formula formula = Formula.builder()
                    .left(strs[0])
                    .right(strs[1])
                    .build();
            list.add(formula);
        }
        return list;
    }

    private List<String> readAllLines() throws URISyntaxException, IOException {
        String fileLocation = "/math02.md";
        val resource = getClass().getResource(fileLocation);
        Path path = Paths.get(resource.toURI());
        val list = Files.readAllLines(path);
        return list;
    }

}
