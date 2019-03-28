package pers.geng.qing.ky;

import lombok.val;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FormulaExtractorTest {

    @Test
    public void extractDerivative() throws Exception {
        FormulaExtractor extractor = FormulaExtractor.getInstance();
        val ls = extractor.extractDerivative("## 导数");
        ls.forEach(System.out::println);
    }

    @Test
    public void splitMathBlock() throws Exception {

        FormulaExtractor extractor = FormulaExtractor.getInstance();
        ArrayList<MathBlock> mathBlocks = extractor.splitMathBlock();
        assertTrue(!mathBlocks.isEmpty());
        mathBlocks.forEach(mathBlock -> {
            System.out.println("the title is " + mathBlock.getTitle());
            System.out.println("the content is below " + mathBlock.getContents().size());
            String contents = Arrays.toString(mathBlock.getContents().toArray());
            System.out.println(contents);
        });

    }

    @Test
    public void getAlignedBlockNames() {
        int i = FormulaExtractor.getInstance().getAlignedBlockNames().size();
        assertTrue(i>0);
    }
}