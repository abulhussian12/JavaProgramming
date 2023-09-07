/*You're tasked with developing a simplified social media application that tracks user interactions. 
Users can follow each other, like posts, and comment on posts. To efficiently manage these interactions,
you decide to use HashSet to store the data.

Question:

Design a Java program that simulates user interactions using HashSet. 
Create three classes: User, Post, and SocialMediaApp.

User class should have:
userId: An integer representing the user's ID.
username: A string representing the user's username.
followedUsers: A HashSet of integers to store the IDs of users that this user follows.
Implement a constructor to initialize userId and username.
Implement a method follow(User user) to allow the user to follow another user.
Implement a method unfollow(User user) to allow the user to unfollow another user.
Post class should have:
postId: An integer representing the post's ID.
content: A string representing the content of the post.
likedUsers: A HashSet of integers to store the IDs of users who liked this post.
Implement a constructor to initialize postId and content.
Implement a method like(User user) to allow a user to like the post.
SocialMediaApp class should have the main method to demonstrate the interactions:
Create several User and Post objects.
Simulate users following and unfollowing each other.
Simulate users liking posts.

Ensure that you use HashSet effectively to store the interactions and avoid duplicates.

*******************************************************************************/
import java.util.*;
class User{
    private int userId;
    private String UserName;
    HashSet<Integer>follwedUsers;
    User(int userId,String UserName)
    {
        this.userId=userId;
        this.UserName=UserName;
        this.follwedUsers=new HashSet<Integer>();
        
        
    }
    public void follow(User user)
    {
        followedUsers.add(user.userId);
    }
    public void Unfollow(User user)
    {
        followedUsers.remove(user.userId);
    }
    public int getuserId()
    {
        return userId;
    }
    public int getUserName()
    {
        return UserName;
    }
    @Override
    public String toString()
    {
       return "User["+ "UserId="+userId+ 
               "UserName="+UserName+"]";
    }
}
    class Post{
        private int postId;
        String PostContent;
        HashSet<Integer>LikedUsers;
        
        Post(int postId, String PostContent)
        {
            this.postId=postId;
            this.PostContent=PostContent;
           this.LikedUsers=new HashSet<>();
        }
        
        public void Like(User user)
        {
            LikedUsers.add(user.getuserId());
        }
          @Override
    public String toString()
    {
       return "Post["+"postId="+postId+"PostContent="+PostContent+"}";
    }
        
    }
    public class Main
    {
        public static void main(String[]args)
        {
            User u1=new User(770,"Abul");
             User u2=new User(772,"hussian");
              User u3=new User(772,"ram");
               Post p1=new Post(321,"abc");
               Post p2=new Post(321,"World");
               Post p3=new Post(321,"feel free");
            u1.follow(u2);
            u2.follow(u3);
            u2.follow(u1);
            
            u1.Unfollow(u2);
           /* u.userId(770);
            u.userId(772);
            u.UserName(Abul);
            u.UserName(hussian);*/
          
            p1.Like(u1);
            p2.Like(u2);
            p1.Like(u3);
            System.out.println(u1.getUserName()+"is following"+u2.follwedUsers);
             System.out.println(u2.getUserName()+"is following"+u3.follwedUsers);
              System.out.println(u2.getUserName()+"is following"+u1.follwedUsers);
              
               System.out.println(p1+"is liked by"+u1.LikedUsers);
               System.out.println(p2+"is liked by"+u2.LikedUsers);
               System.out.println(p1+"is liked by"+u3.LikedUsers);
            
        }
    }

