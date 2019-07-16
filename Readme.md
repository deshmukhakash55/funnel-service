# API EndPoints

- Add User

   POST - <br/>/v1/user/add_user
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

	body - <br/>
	{
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"username" : "&lt;username&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"email" : "&lt;email&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"profile_pic" : "&lt;profile_pic&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"base_pic" : "&lt;base_pic&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"country" : "&lt;country&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"state" : "&lt;state&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"pin_code" : "&lt;pin_code&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"address" : "&lt;address&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"mobile" : "&lt;mobile&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"first_name" : "&lt;first_name&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"middle_name" : "&lt;middle_name&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"last_name" : "&lt;last_name&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"gender" : "&lt;gender&gt;"
	<br/>}

<hr/>

- Update User

   POST - <br/>/v1/user/update_user
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"username" : "&lt;username&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"email" : "&lt;email&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"profile_pic" : "&lt;profile_pic&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"base_pic" : "&lt;base_pic&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"country" : "&lt;country&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"state" : "&lt;state&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"pin_code" : "&lt;pin_code&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"address" : "&lt;address&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"mobile" : "&lt;mobile&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"first_name" : "&lt;first_name&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"middle_name" : "&lt;middle_name&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"last_name" : "&lt;last_name&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"gender" : "&lt;gender&gt;",<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"creation_time" : "&lt;gender&gt;"
	<br/>}

<hr/>

- Get User

   POST - <br/>/v1/user/get_user/{user_id}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Search User By Username

   POST - <br/>/v1/user/search_user_by_username/{search_name}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Follow User

   POST - <br/>/v1/user/follow_user
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"follower_id" : "&lt;follower_id&gt;"
	<br/>}

<hr/>

- Unfollow User

   POST - <br/>/v1/user/unfollow_user/{id}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Block User

   POST - <br/>/v1/user/block_user/{user_id}<br/>/{block_id}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Unblock User

   POST - <br/>/v1/user/unblock_user/{id}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Get User Followers

   POST - <br/>/v1/user/get_user_followers/{user_id}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Get User Followings

   POST - <br/>/v1/user/get_user_followings/{follower_id}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Add User Favorite

   POST - <br/>/v1/user/add_fav
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fav_key" : "&lt;fav_key&gt;",<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fav_value" : "&lt;fav_value&gt;"
	<br/>}

<hr/>

- Remove User Favorite

   POST - <br/>/v1/user/rem_fav
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fav_key" : "&lt;fav_key&gt;",<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"fav_value" : "&lt;fav_value&gt;"
	<br/>}

<hr/>

- Get User Favorites

   POST - <br/>/v1/user/get_user_favs/{user_id}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Get User Favorites

   POST - <br/>/v1/user/add_user_message
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"messager_id" : "&lt;messager_id&gt;",<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"message" : "&lt;message&gt;",<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"referred_message" : "&lt;referred_message&gt;"
	<br/>}

<hr/>

- Add Post

   POST - <br/>/v1/post/add_post
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"owner_id" : "&lt;owner_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"content" : "&lt;content&gt;"
	<br/>}

<hr/>

- Add Tag To Post

   POST - <br/>/v1/post/tag/add
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tag" : "&lt;tag&gt;"
	<br/>}

<hr/>

- Remove Tag To Post

   POST - <br/>/v1/post/tag/remove
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tag" : "&lt;tag&gt;"
	<br/>}

<hr/>

- Add Tagged User To Post

   POST - <br/>/v1/post/tagged_user/add
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tagged_user" : "&lt;tagged_user&gt;"
	<br/>}

<hr/>

- Remove Tagged User To Post

   POST - <br/>/v1/post/tagged_user/remove
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tagged_user" : "&lt;tagged_user&gt;"
	<br/>}

<hr/>

- Add Comment Or Emoji Post

   POST - <br/>/v1/post/comment_emoji
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",<br/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;",<br/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"comment_content" : "&lt;comment_content&gt;",<br/>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"comment_type" : "&lt;comment_type&gt;",<br/>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"referred_comment" : "&lt;referred_comment&gt;"
	<br/>}

<hr/>

- Get Recommendations for user

   POST - <br/>/v1/post/get_recommendations
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;"
	<br/>}

<hr/>

- Get all posts of user

   POST - <br/>/v1/post/get_user_posts
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"owner" : "&lt;owner&gt;"
	<br/>}
<hr/>

- Block Post

   POST - <br/>/v1/post/block_post
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"owner_id" : "&lt;owner_id&gt;",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"content" : "&lt;content&gt;"
	<br/>}

<hr/>

- Unblock Post

   POST - <br/>/v1/post/unblock_post
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
    body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"owner_id" : "&lt;owner_id&gt;",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"content" : "&lt;content&gt;"
	<br/>}

<hr/>

- Get Blocked Posts

   POST - <br/>/v1/post/get_blocked_post/{user_id}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Report Post

   POST - <br/>/v1/post/add_post_report
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"reporter" : "&lt;reporter&gt;",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"report_text" : "&lt;report_text&gt;"
	<br/>}

<hr/>

- Remove Post Report

   POST - <br/>/v1/post/rem_post_report
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"id" : "&lt;id&gt;"
	<br/>}

<hr/>

- Get Post Reports

   POST - <br/>/v1/post/get_post_reports/{post_id}<br/>
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>

<hr/>

- Search Post By Tag

   POST - <br/>/v1/post/post_search_by_tag
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tag" : "&lt;tag&gt;"
	<br/>}

<hr/>

- Search Post By Tagged User

   POST - <br/>/v1/post/post_search_by_tagged_user
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"tagged_user" : "&lt;tagged_user&gt;"
	<br/>}

<hr/>

- Search Post By Text

   POST - <br/>/v1/post/post_search_by_text
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"searched_text" : "&lt;searched_text&gt;"
	<br/>}

<hr/>

- Add Post Subscription

   POST - <br/>/v1/post/post_add_subscription
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;"
	<br/>}

<hr/>

- Remove Post Subscription

   POST - <br/>/v1/post/post_rem_subscription
   
   header - <br/>
   {
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Content-Type" : "application/json",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"Authorization" : "bearer &lt;access-token&gt;"
    <br/>}<br/>
body - <br/>
	{
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"post_id" : "&lt;post_id&gt;",<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"user_id" : "&lt;user_id&gt;"
	<br/>}





































