package pers.geng.qing.ky;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.val;

import java.util.List;

@Data
@Builder
public class MathBlock {

    private String title;

    private int startLineNo;
    private int endLineNo;

    private Type type;

    @Singular("add")
    public List<String> contents;


    public Type type() {

        if (type == null) {
            for (val str : this.getContents()) {
                if (str.contains("aligned")) {
                    type = Type.ALIGNED;
                    return type;
                }
            }

        }

        type = Type.NORMAL;
        return type;
    }

}
