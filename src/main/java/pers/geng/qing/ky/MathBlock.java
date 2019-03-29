package pers.geng.qing.ky;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.val;

import java.util.Arrays;
import java.util.List;

@Data
@Builder
public class MathBlock {

    public static List<String> EQAULITY_BLOCK = Arrays.asList
            ("## 泰勒公式", "## 高阶导数");

    private String title;

    private int startLineNo;
    private int endLineNo;

    private Type type;

    @Singular("add")
    public List<String> contents;


    public Type type() {

        if (type != null) {
            return type;
        }

        if (EQAULITY_BLOCK.contains(title)) {
            return Type.EQAULITY;
        }

        for (val str : this.getContents()) {
            if (str.contains("aligned")) {
                type = Type.ALIGNED;
                return type;
            }
        }

        return Type.NORMAL;
    }

}
