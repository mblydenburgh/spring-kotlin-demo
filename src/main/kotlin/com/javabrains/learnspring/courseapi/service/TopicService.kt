package com.javabrains.learnspring.courseapi.service

import com.javabrains.learnspring.courseapi.dao.Topic
import org.springframework.stereotype.Service

@Service
class TopicService {

    private var topics =   mutableListOf(
            Topic(id = "00", name = "Kotlin", description = "Kotlin Topic"),
            Topic(id = "01", name = "Javascript", description = "Javascript Topic"),
            Topic(id = "02", name = "AWS", description = "AWS Topic"))

    fun returnAllTopics():List<Topic>{
        return topics
    }

    fun returnTopicById(id:String):Topic{
        return topics.filter{topic -> topic.id == id}[0]
    }

    fun addTopic(id: String, name: String, description: String){
        topics.add(element = Topic(id = id, name = name, description = description))
    }
}