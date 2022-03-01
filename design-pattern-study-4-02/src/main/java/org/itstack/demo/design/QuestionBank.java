package org.itstack.demo.design;

import org.itstack.demo.design.util.Topic;
import org.itstack.demo.design.util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 *  核心的题库类QuestionBank，题库中主要负责将各个的题目进行组装最终输出试卷
 *  <p>
 *
 *  两个append()，对各项题目的添加，有点像我们在建造者模式中使用的方式，添加装修物料。
 * clone()，这里的核心操作就是对对象的复制，这里的复制不只是包括了本身，同时对两个集合也做了复制。只有这样的拷贝才能确保在操作克隆对象的时候不影响原对象。
 * 乱序操作，在list集合中有一个方法，Collections.shuffle，可以将原有集合的顺序打乱，输出一个新的顺序。在这里我们使用此方法对题目进行乱序操作。
 *
 */
public class QuestionBank implements Cloneable {

        private String candidate; // 考生
        private String number;    // 考号

        private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<ChoiceQuestion>();
        private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<AnswerQuestion>();

        public QuestionBank append(ChoiceQuestion choiceQuestion) {
            choiceQuestionList.add(choiceQuestion);
            return this;
        }

        public QuestionBank append(AnswerQuestion answerQuestion) {
            answerQuestionList.add(answerQuestion);
            return this;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            QuestionBank questionBank = (QuestionBank) super.clone();
            questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
            questionBank.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();

            // 题目乱序
            Collections.shuffle(questionBank.choiceQuestionList);
            Collections.shuffle(questionBank.answerQuestionList);
            // 答案乱序
            ArrayList<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
            for (ChoiceQuestion   question : choiceQuestionList) {
                Topic random = TopicRandomUtil.random(question.getOption(), question.getKey());
                question.setOption(random.getOption());
                question.setKey(random.getKey());
            }
            return questionBank;
        }

        public void setCandidate(String candidate) {
            this.candidate = candidate;
        }

        public void setNumber(String number) {
            this.number = number;
        }

    @Override
    public String toString() {

        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n");

        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");;
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n\n");

        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestionList.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        return detail.toString();
    }
}
