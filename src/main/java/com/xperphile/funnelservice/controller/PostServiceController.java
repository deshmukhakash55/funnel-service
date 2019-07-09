package com.xperphile.funnelservice.controller;

import com.xperphile.funnelservice.constants.FunnelConstants;
import com.xperphile.funnelservice.dao.Post;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
@RestController
@RequestMapping(FunnelConstants.FUNNEL_VERSION + FunnelConstants.POST_FUNNEL)
public class PostServiceController {

    @Autowired
    private Environment environment;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(FunnelConstants.POST_ADD)
    public ResponseEntity addPost(@RequestBody Post post){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_ADD_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", post);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_ADD_TAG)
    public ResponseEntity addTagToPost(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_ADD_TAG_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_REM_TAG)
    public ResponseEntity removeTagFromPost(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_REM_TAG_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_ADD_TAGGED_USER)
    public ResponseEntity addTaggedUserToPost(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_ADD_TAGGED_USER_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_REM_TAGGED_USER)
    public ResponseEntity removeTaggedUserFromPost(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_REM_TAGGED_USER_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_UPDATE)
    public ResponseEntity updatePost(@RequestBody Map<String, String> postMap, @PathVariable("post_id") String post_id){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_UPDATE_MESSAGE);
            map.put("method", "POST");
            map.put("pathVariables", "/" + post_id);
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_ADD_COMMENT_OR_EMOJI)
    public ResponseEntity addCommentOrEmoji(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_ADD_COMMENT_OR_EMOJI_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_REM_RECOMMENDATION)
    public ResponseEntity removeRecommendation(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_REM_RECOMMENDATION_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_GET_RECOMMENDATION)
    public ResponseEntity getRecommendedPosts(@RequestBody Map<String, String> postMap){
        try{
            final String uri = "http://localhost:" + environment.getProperty("postservice.port") + "/post/recommendation/get";
            HttpEntity<Object> entity = new HttpEntity<>(postMap);

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, entity, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_GET_USER_POSTS)
    public ResponseEntity getUserPosts(@RequestBody Map<String, String> postMap){
        try{
            final String uri = "http://localhost:" + environment.getProperty("postservice.port") + "/post/get";
            HttpEntity<Object> entity = new HttpEntity<>(postMap);

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, entity, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_BLOCK)
    public ResponseEntity block(@RequestBody Post post){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_BLOCK_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", post);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_UNBLOCK)
    public ResponseEntity unblock(@RequestBody Post post){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_UNBLOCK_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", post);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_GET_BLOCKED_POST)
    public ResponseEntity getBlockedPosts(@PathVariable("user_id") String user_id){
        try{
            final String uri = "http://localhost:" + environment.getProperty("postservice.port") + "/block/get/" + user_id;

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_ADD_REPORT)
    public ResponseEntity addPostReport(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_ADD_REPORT_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_REM_REPORT)
    public ResponseEntity removePostReport(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_REM_REPORT_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_GET_REPORTS)
    public ResponseEntity getPostReports(@PathVariable("post_id") String post_id){
        try{
            final String uri = "http://localhost:" + environment.getProperty("postservice.port") + "/report/get/{post_id}";

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_SEARCH_BY_TAG)
    public ResponseEntity searchPostsByTag(@RequestBody Map<String, String> map){
        try{
            final String uri = "http://localhost:" + environment.getProperty("postservice.port") + "/search/tag";

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_SEARCH_BY_TAGGED_USER)
    public ResponseEntity searchPostsByTaggedUser(@RequestBody Map<String, String> map){
        try{
            final String uri = "http://localhost:" + environment.getProperty("postservice.port") + "/search/tagged_user";

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_SEARCH_BY_TEXT)
    public ResponseEntity searchPostsByText(@RequestBody Map<String, String> map){
        try{
            final String uri = "http://localhost:" + environment.getProperty("postservice.port") + "/search/text";

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_ADD_SUBSCRIPTION)
    public ResponseEntity addSubscription(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_ADD_SUBSCRIPTION_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.POST_REM_SUBSCRIPTION)
    public ResponseEntity removeSubscription(@RequestBody Map<String, String> postMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.POST_REM_SUBSCRIPTION_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", postMap);
            amqpTemplate.convertAndSend(FunnelConstants.POST_EXCHANGE, FunnelConstants.POST_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

}
