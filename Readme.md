# API EndPoints

- Add User

   POST - /v1/user/add_user
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

	body - 
	{
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"username" : "&lt;username&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"email" : "&lt;email&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"profile_pic" : "&lt;profile_pic&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"base_pic" : "&lt;base_pic&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"country" : "&lt;country&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"state" : "&lt;state&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"pin_code" : "&lt;pin_code&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"address" : "&lt;address&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"mobile" : "&lt;mobile&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"first_name" : "&lt;first_name&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"middle_name" : "&lt;middle_name&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"last_name" : "&lt;last_name&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"gender" : "&lt;gender&gt;"
	}

<hr/>

- Update User

   POST - /v1/user/update_user
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"username" : "&lt;username&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"email" : "&lt;email&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"profile_pic" : "&lt;profile_pic&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"base_pic" : "&lt;base_pic&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"country" : "&lt;country&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"state" : "&lt;state&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"pin_code" : "&lt;pin_code&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"address" : "&lt;address&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"mobile" : "&lt;mobile&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"first_name" : "&lt;first_name&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"middle_name" : "&lt;middle_name&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"last_name" : "&lt;last_name&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"gender" : "&lt;gender&gt;",
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"creation_time" : "&lt;gender&gt;"
	}

<hr/>

- Get User

   POST - /v1/user/get_user/{user_id}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Search User By Username

   POST - /v1/user/search_user_by_username/{search_name}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Follow User

   POST - /v1/user/follow_user
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"follower_id" : "&lt;follower_id&gt;"
	}

<hr/>

- Unfollow User

   POST - /v1/user/unfollow_user/{id}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Block User

   POST - /v1/user/block_user/{user_id}/{block_id}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Unblock User

   POST - /v1/user/unblock_user/{id}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Get User Followers

   POST - /v1/user/get_user_followers/{user_id}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Get User Followings

   POST - /v1/user/get_user_followings/{follower_id}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Add User Favorite

   POST - /v1/user/add_fav
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fav_key" : "&lt;fav_key&gt;",
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fav_value" : "&lt;fav_value&gt;"
	}

<hr/>

- Remove User Favorite

   POST - /v1/user/rem_fav
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fav_key" : "&lt;fav_key&gt;",
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fav_value" : "&lt;fav_value&gt;"
	}

<hr/>

- Get User Favorites

   POST - /v1/user/get_user_favs/{user_id}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Get User Favorites

   POST - /v1/user/add_user_message
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"messager_id" : "&lt;messager_id&gt;",
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"message" : "&lt;message&gt;",
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"referred_message" : "&lt;referred_message&gt;"
	}

<hr/>

- Add Post

   POST - /v1/post/add_post
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"owner_id" : "&lt;owner_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"content" : "&lt;content&gt;"
	}

<hr/>

- Add Tag To Post

   POST - /v1/post/tag/add
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tag" : "&lt;tag&gt;"
	}

<hr/>

- Remove Tag To Post

   POST - /v1/post/tag/remove
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tag" : "&lt;tag&gt;"
	}

<hr/>

- Add Tagged User To Post

   POST - /v1/post/tagged_user/add
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tagged_user" : "&lt;tagged_user&gt;"
	}

<hr/>

- Remove Tagged User To Post

   POST - /v1/post/tagged_user/remove
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tagged_user" : "&lt;tagged_user&gt;"
	}

<hr/>

- Add Comment Or Emoji Post

   POST - /v1/post/comment_emoji
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"comment_content" : "&lt;comment_content&gt;",
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"comment_type" : "&lt;comment_type&gt;",
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"referred_comment" : "&lt;referred_comment&gt;"
	}

<hr/>

- Get Recommendations for user

   POST - /v1/post/get_recommendations
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;"
	}

<hr/>

- Get all posts of user

   POST - /v1/post/get_user_posts
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"owner" : "&lt;owner&gt;"
	}
<hr/>

- Block Post

   POST - /v1/post/block_post
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"owner_id" : "&lt;owner_id&gt;",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"content" : "&lt;content&gt;"
	}

<hr/>

- Unblock Post

   POST - /v1/post/unblock_post
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
    body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"owner_id" : "&lt;owner_id&gt;",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"content" : "&lt;content&gt;"
	}

<hr/>

- Get Blocked Posts

   POST - /v1/post/get_blocked_post/{user_id}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Report Post

   POST - /v1/post/add_post_report
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"reporter" : "&lt;reporter&gt;",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"report_text" : "&lt;report_text&gt;"
	}

<hr/>

- Remove Post Report

   POST - /v1/post/rem_post_report
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id" : "&lt;id&gt;"
	}

<hr/>

- Get Post Reports

   POST - /v1/post/get_post_reports/{post_id}
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }

<hr/>

- Search Post By Tag

   POST - /v1/post/post_search_by_tag
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tag" : "&lt;tag&gt;"
	}

<hr/>

- Search Post By Tagged User

   POST - /v1/post/post_search_by_tagged_user
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tagged_user" : "&lt;tagged_user&gt;"
	}

<hr/>

- Search Post By Text

   POST - /v1/post/post_search_by_text
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"searched_text" : "&lt;searched_text&gt;"
	}

<hr/>

- Add Post Subscription

   POST - /v1/post/post_add_subscription
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;"
	}

<hr/>

- Remove Post Subscription

   POST - /v1/post/post_rem_subscription
   
   header - 
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    }
body - 
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;"
	}





































