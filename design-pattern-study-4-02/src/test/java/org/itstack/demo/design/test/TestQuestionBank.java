package org.itstack.demo.design.test;

import org.itstack.demo.design.QuestionBankController;
import org.junit.Test;

public class TestQuestionBank {

    @Test
    public void test_QuestionBank() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("胡歌","110010101"));
        System.out.println(questionBankController.createPaper("吴磊","110010102"));
        System.out.println(questionBankController.createPaper("靳东","110010104"));
    }
}
