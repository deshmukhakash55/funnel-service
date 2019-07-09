package com.xperphile.funnelservice.controller;

import com.xperphile.funnelservice.constants.FunnelConstants;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.env.Environment;
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
@RequestMapping(FunnelConstants.FUNNEL_VERSION + FunnelConstants.USER_FUNNEL)
public class UserServiceController {

    @Autowired
    private Environment environment;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(FunnelConstants.USER_ADD)
    public ResponseEntity addUser(@RequestBody Map<String, String> userMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_ADD_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", userMap);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_UPDATE)
    public ResponseEntity updateUser(@RequestBody Map<String, String> userMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_UPDATE_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", userMap);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_REMOVE)
    public ResponseEntity removeUser(@RequestBody Map<String, String> userMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_REMOVE_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", userMap);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_GET)
    public ResponseEntity getUser(@PathVariable("user_id") String user_id){
        try{
            final String uri = "http://localhost:" + environment.getProperty("userservice.port") + "/user/get/" + user_id;

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_SEARCH_BY_USERNAME)
    public ResponseEntity searchUsersByUsername(@PathVariable("search_name") String search_name){
        try{
            final String uri = "http://localhost:" + environment.getProperty("userservice.port") + "/user/search/" + search_name;

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_FOLLOW)
    public ResponseEntity follow(@RequestBody Map<String, String> userMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_FOLLOW_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", userMap);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_UNFOLLOW)
    public ResponseEntity unfollow(@PathVariable("id") String id){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_UNFOLLOW_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", null);
            map.put("pathVariables", "/" + id);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_BLOCK)
    public ResponseEntity block(@PathVariable("user_id") String user_id, @PathVariable("block_id") String blocked_id){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_BLOCK_MESSAGE);
            map.put("method", "POST");
            map.put("pathVariables", "/" + user_id + "/" + blocked_id);
            map.put("requestEntity", null);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_UNBLOCK)
    public ResponseEntity unblock(@PathVariable("id") String id){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_UNBLOCK_MESSAGE);
            map.put("method", "POST");
            map.put("pathVariables", "/" + id);
            map.put("requestEntity", null);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_GET_FOLLOWERS)
    public ResponseEntity getFollowers(@PathVariable("user_id") String user_id){
        try{
            final String uri = "http://localhost:" + environment.getProperty("userservice.port") + "/user/mgmt/followers/" + user_id;

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_GET_FOLLOWINGS)
    public ResponseEntity getFollowings(@PathVariable("follower_id") String follower_id){
        try{
            final String uri = "http://localhost:" + environment.getProperty("userservice.port") + "/user/mgmt/followings/" + follower_id;

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_GET_BLOCKED)
    public ResponseEntity getBlockedUser(@PathVariable("user_id") String user_id){
        try{
            final String uri = "http://localhost:" + environment.getProperty("userservice.port") + "/user/mgmt/get/blocked_users/" + user_id;

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_ADD_FAV)
    public ResponseEntity addFav(@RequestBody Map<String, String> userMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_ADD_FAV_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", userMap);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_REM_FAV)
    public ResponseEntity remFav(@RequestBody Map<String, String> userMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_REM_FAV_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", userMap);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_GET_FAV)
    public ResponseEntity getUserFavs(@PathVariable("user_id") String user_id){
        try{
            final String uri = "http://localhost:" + environment.getProperty("userservice.port") + "/user/mgmt/get/favs/" + user_id;

            ResponseEntity<Object> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, null, new ParameterizedTypeReference<Object>() {
            });
            return responseEntity;
        }
        catch (Exception exception){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(FunnelConstants.USER_ADD_NEW_MESSAGE)
    public ResponseEntity addMessage(@RequestBody Map<String, String> userMap){
        try{
            Map<String, Object> map = new HashMap<>();
            map.put("message", FunnelConstants.USER_ADD_MESSAGE_MESSAGE);
            map.put("method", "POST");
            map.put("requestEntity", userMap);
            amqpTemplate.convertAndSend(FunnelConstants.USER_EXCHANGE, FunnelConstants.USER_ROUTING_KEY, map);
            return new ResponseEntity(HttpStatus.OK);
        }
        catch (Exception exception){
            return new ResponseEntity(exception.toString(), HttpStatus.BAD_REQUEST);
        }
    }

}
