package com.xperphile.funnelservice.constants;

public class FunnelConstants {

    public static final String FUNNEL_VERSION = "/v1";

    public static final String POST_FUNNEL = "/post";
    public static final String USER_FUNNEL = "/user";

    public static final String POST_EXCHANGE = "postmessage.exchange";
    public static final String POST_ROUTING_KEY = "postmessage.routingkey";

    public static final String USER_EXCHANGE = "usermessage.exchange";
    public static final String USER_ROUTING_KEY = "usermessage.routingkey";

    public static final String POST_ADD = "/add_post";
    public static final String POST_ADD_TAG = "/add_tag_to_post";
    public static final String POST_REM_TAG = "/remove_tag_from_post";
    public static final String POST_REM_TAGGED_USER = "/remove_tagged_user_from_post";
    public static final String POST_ADD_TAGGED_USER = "/add_tagged_user_to_post";
    public static final String POST_UPDATE = "/update_post/{post_id}";
    public static final String POST_ADD_COMMENT_OR_EMOJI = "/add_comment_or_emoji_post";
    public static final String POST_ADD_RECOMMENDATION = "/add_recommendation";
    public static final String POST_REM_RECOMMENDATION = "/remove_recommendation";
    public static final String POST_GET_RECOMMENDATION = "/get_recommendations";
    public static final String POST_GET_USER_POSTS = "/get_user_posts";

    public static final String POST_BLOCK = "/block_post";
    public static final String POST_UNBLOCK = "/unblock_post";
    public static final String POST_GET_BLOCKED_POST = "/get_blocked_post/{user_id}";

    public static final String POST_ADD_REPORT = "/add_post_report";
    public static final String POST_REM_REPORT = "/rem_post_report";
    public static final String POST_GET_REPORTS = "/get_post_reports/{post_id}";

    public static final String POST_SEARCH_BY_TAG = "/post_search_by_tag";
    public static final String POST_SEARCH_BY_TAGGED_USER = "/post_search_by_tagged_user";
    public static final String POST_SEARCH_BY_TEXT = "/post_search_by_text";

    public static final String POST_ADD_SUBSCRIPTION = "/post_add_subscription";
    public static final String POST_REM_SUBSCRIPTION = "/post_rem_subscription";

    public static final String POST_ADD_MESSAGE = "add_post";
    public static final String POST_ADD_TAG_MESSAGE = "add_tag_to_post";
    public static final String POST_REM_TAG_MESSAGE = "remove_tag_from_post";
    public static final String POST_REM_TAGGED_USER_MESSAGE = "remove_tagged_user_from_post";
    public static final String POST_ADD_TAGGED_USER_MESSAGE = "add_tagged_user_from_post";
    public static final String POST_UPDATE_MESSAGE = "update_post";
    public static final String POST_ADD_COMMENT_OR_EMOJI_MESSAGE = "add_comment_or_emoji_post";
    public static final String POST_ADD_RECOMMENDATION_MESSAGE = "add_recommendation";
    public static final String POST_REM_RECOMMENDATION_MESSAGE = "remove_recommendation";
    public static final String POST_GET_RECOMMENDATION_MESSAGE = "get_recommendations";
    public static final String POST_GET_USER_POSTS_MESSAGE = "get_user_posts";

    public static final String POST_BLOCK_MESSAGE = "block_post";
    public static final String POST_UNBLOCK_MESSAGE = "unblock_post";
    public static final String POST_GET_BLOCKED_POST_MESSAGE = "get_blocked_post";

    public static final String POST_ADD_REPORT_MESSAGE = "add_post_report";
    public static final String POST_REM_REPORT_MESSAGE = "rem_post_report";
    public static final String POST_GET_REPORTS_MESSAGE = "get_post_reports";

    public static final String POST_SEARCH_BY_TAG_MESSAGE = "post_search_by_tag";
    public static final String POST_SEARCH_BY_TAGGED_USER_MESSAGE = "post_search_by_tagged_user";
    public static final String POST_SEARCH_BY_TEXT_MESSAGE = "post_search_by_text";

    public static final String POST_ADD_SUBSCRIPTION_MESSAGE = "post_add_subscription";
    public static final String POST_REM_SUBSCRIPTION_MESSAGE = "post_rem_subscription";

    public static final String USER_ADD = "/add_user";
    public static final String USER_UPDATE = "/update_user";
    public static final String USER_GET = "/get_user/{user_id}";
    public static final String USER_SEARCH_BY_USERNAME = "/search_user_by_username/{search_name}";
    public static final String USER_REMOVE = "/remove_user";
    public static final String USER_FOLLOW = "/follow_user";
    public static final String USER_UNFOLLOW = "/unfollow_user/{id}";
    public static final String USER_GET_FOLLOWERS = "/get_user_followers/{user_id}";
    public static final String USER_GET_FOLLOWINGS = "/get_user_followings/{follower_id}";
    public static final String USER_BLOCK = "/block_user/{user_id}/{block_id}";
    public static final String USER_UNBLOCK = "/unblock_user/{id}";
    public static final String USER_GET_BLOCKED = "/get_blocked_users/{user_id}";
    public static final String USER_ADD_FAV = "/add_fav";
    public static final String USER_REM_FAV = "/rem_fav";
    public static final String USER_GET_FAV = "/get_user_favs/{user_id}";
    public static final String USER_ADD_NEW_MESSAGE = "/add_user_message";

    public static final String USER_ADD_MESSAGE = "add_user";
    public static final String USER_UPDATE_MESSAGE = "update_user";
    public static final String USER_SEARCH_BY_USERNAME_MESSAGE = "search_user_by_username";
    public static final String USER_REMOVE_MESSAGE = "remove_user";
    public static final String USER_FOLLOW_MESSAGE = "follow_user";
    public static final String USER_UNFOLLOW_MESSAGE = "unfollow_user";
    public static final String USER_BLOCK_MESSAGE = "block_user";
    public static final String USER_UNBLOCK_MESSAGE = "unblock_user";
    public static final String USER_ADD_FAV_MESSAGE = "add_fav";
    public static final String USER_REM_FAV_MESSAGE = "rem_fav";
    public static final String USER_ADD_MESSAGE_MESSAGE = "add_user_message";

}
