package pers.geng.qing.ky;

import lombok.val;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Geng Qing on 2019-03-26
 **/
public class FormulaExtractor {


    private static FormulaExtractor formulaExtractor;

    public static FormulaExtractor getInstance() {
        if (formulaExtractor == null) {
            try {
                formulaExtractor = new FormulaExtractor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return formulaExtractor;
    }

    public Map<String, MathBlock> getBlockMap() {
        return blockMap;
    }

    private Map<String, MathBlock> blockMap;

    private FormulaExtractor() throws Exception {
        val blocks = this.splitMathBlock();
        blockMap = new HashMap<>();
        blocks.forEach(mathBlock -> blockMap.put(mathBlock.getTitle(), mathBlock));
    }

    public ArrayList<Formula> extractDerivativeByTitle(String title) {
        val block = blockMap.get(title);
        val formulas = new ArrayList<Formula>();
        for (val str : block.contents) {
            if (!str.startsWith("&")) {
                continue;
            }
            String[] fs = str.split("&");
            formulas.addAll(getFormula(fs));
        }

        return formulas;
    }


    public ArrayList<Formula> extractDerivative(String title) throws Exception {
        val formulas = new ArrayList<Formula>();
        val list = readAllLines();
        boolean isStop = false;
        boolean isBegin = false;
        for (int i = 0; i < list.size(); i++) {
            val str = list.get(i);
            if (str == null || str.isEmpty()) {
                continue;
            }
            if (str.equals(title)) {
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

    protected ArrayList<MathBlock> splitMathBlock() throws Exception {

        val allBlocks = new ArrayList<MathBlock>();

        val lines = readAllLines();
        boolean started = false;

        MathBlock.MathBlockBuilder blockBuilder = null;

        for (int i = 0; i < lines.size(); i++) {
            val line = lines.get(i);
            if (!started && isMathBlockCharaters(line)) {
                started = true;
                blockBuilder = MathBlock.builder();
                blockBuilder.startLineNo(i);
                setTitle(blockBuilder, lines, i);
                continue;
            }

            if (started && isNotNull(line)) {
                blockBuilder.add(line);
            }

            if (started && isMathBlockCharaters(line)) {
                blockBuilder.endLineNo(i);
                MathBlock block = blockBuilder.build();
                allBlocks.add(block);
                started = false;
            }
        }

        return allBlocks;
    }


    private void setTitle(MathBlock.MathBlockBuilder blockBuilder, List<String> lines, int startLineNo) {
        for (int j = startLineNo - 1; startLineNo >= 0; j--) {
            String title = lines.get(j);
            if (isNotNull(title)) {
                blockBuilder.title(title);
                break;
            }
        }
    }

    private boolean isNotNull(String title) {
        return !Objects.isNull(title) && !title.trim().isEmpty();
    }

    private boolean isMathBlockCharaters(String line) {
        return line.trim().contains("$$");
    }

    public List<String> getAlignedBlockNames() {
        val list = new ArrayList<String>();
        getBlockMap().values().forEach(mathBlock -> {
            if (mathBlock.type().equals(Type.ALIGNED)) {
                list.add(mathBlock.getTitle());
            }
        });
        return list;

    }
}
