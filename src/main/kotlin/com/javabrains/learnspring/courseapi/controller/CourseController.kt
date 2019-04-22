package com.javabrains.learnspring.courseapi.controller

import com.javabrains.learnspring.courseapi.dao.Topic
import com.javabrains.learnspring.courseapi.service.TopicService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CourseController() {

    @Autowired
    private lateinit var topicService: TopicService

    @GetMapping("/topics")
    fun fetchTopics():List<Topic>{
        return topicService.returnAllTopics()
    }

    @GetMapping("/topics/{id}")
    fun fetchTopicById(@PathVariable id:String):Topic{
        return topicService.returnTopicById(id)
    }

    @PostMapping("topics")
    fun addTopic(
            @PathVariable id:String,
            @PathVariable name: String,
            @PathVariable description: String
    ){
        topicService.addTopic(id = id,name = name,description = description)
    }
}