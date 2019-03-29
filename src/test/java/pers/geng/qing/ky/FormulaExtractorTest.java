package pers.geng.qing.ky;

import lombok.val;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FormulaExtractorTest {


    private FormulaExtractor instance = FormulaExtractor.getInstance();

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

        List<String> alignedBlockNames = instance.getAlignedBlockNames();
        int i = alignedBlockNames.size();
        assertTrue(i > 0);
        System.out.println(i);
        alignedBlockNames.forEach(System.out::println);

        val jf = instance.getBlockMap().get("## 积分");
        assertNotNull(jf);


    }

    @Test
    public void countChar() {
        String s = "=123=abc";
        int c = instance.countChar(s, "=");
        assertTrue(c == 2);

    }
}