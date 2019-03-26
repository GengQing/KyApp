package pers.geng.qing.ky;

import lombok.val;
import org.junit.Test;

import static org.junit.Assert.*;

public class FormulaExtractorTest {

    @Test
    public void extractDerivative() throws Exception {
        FormulaExtractor extractor = new FormulaExtractor();
        val ls =extractor.extractDerivative();
        ls.forEach(System.out::println);

    }
}