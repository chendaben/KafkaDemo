package com.cyq.service;

import kafka.utils.ZkUtils;
import org.apache.kafka.common.security.JaasUtils;
import scala.collection.JavaConversions;

import java.util.List;

/**
 * @author cyq
 * @date 2019/02/15
 * @description
 **/

public class KafkaMangeServiceImpl {

    private static ZkUtils zkUtils = null;

    public static void main(String[] args) {
        getTopicList();
    }

    /**
     * 获取所有的TopicList
     * @return
     */
    public  static List<String> getTopicList() {
        zkUtils = ZkUtils.apply("172.16.50.21:2181", 30000, 30000, JaasUtils.isZkSecurityEnabled());
        List<String> allTopicList = JavaConversions.seqAsJavaList(zkUtils.getAllTopics());
        for (String s:allTopicList){
            System.out.print(s+",");
        }
        return allTopicList;
    }
}
