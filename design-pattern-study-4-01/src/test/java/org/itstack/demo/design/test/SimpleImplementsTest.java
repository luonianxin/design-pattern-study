package org.itstack.demo.design.test;

import org.itstack.demo.design.QuestionBankController;
import org.junit.Test;

public class SimpleImplementsTest {

    @Test
    public void test_QuestionBankController(){
        QuestionBankController controller = new QuestionBankController();
        System.out.println(controller.createPaper("胡歌","100000101"));
        System.out.println(controller.createPaper("靳东","100000201"));
        System.out.println(controller.createPaper("吴磊","100000401"));
        System.out.println(controller.createPaper("彭于晏","100000301"));
    }
}
