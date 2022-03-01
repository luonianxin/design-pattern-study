package org.itstack.demo.design.util;

import java.util.*;

public class TopicRandomUtil {

    /**
     * 乱序Map元素，并记录对应答案key
     *  整体实现思路：<p>
     *   1.获取map元素的keySet <p>
     *   2、调用集合类的乱序方法打乱排序<p>
     *   3、遍历打乱后的集合元素key，使用该key获取对应的value值组装成新的Option映射map
     * @param option 题目
     * @param key    答案
     * @return Topic 乱序后 {A=c., B=d., C=a., D=b.}
     */
    public static Topic random(Map<String,String> option, String key){
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        int idx = 0;
        String newKey = null;
        Map<String,String> newOption = new HashMap<>();
        // 遍历乱序后的key集合
        for(String next : keySet){
            String randomKey = keyList.get(idx++);
            if(key.equals(next)){
                // 记录新key
                newKey = randomKey;
            }
            // 答案只与选项value有关，当遍历到key时，option.get获取到的value值
            // 就是正确答案，此时的randomKey就是选项乱序后新的正确答案
            newOption.put(randomKey,option.get(next));
        }
        return new Topic(newOption,newKey);
    }
}
