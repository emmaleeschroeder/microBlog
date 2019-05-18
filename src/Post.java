public class Post {
    //Static variable that stores how many posts have been created
    //so the id of each post is unique
    private static int postCounter = 0;

    private User user;
    private int id;
    private String content;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    public Post(){
        postCounter++;
        this.id = postCounter;
    }

    //constructor- to create new Post object with only the user and content

    public Post(User user,String content) {
        //Updates static post counter variable by 1
        postCounter++;
        //sets post id to current post counter value
        this.user = user;
        this.id = id;
        this.content = content;
    }

    //Constructor to create new Post object with user, content and url
    public Post(User user, String content, String url){
        //Updates static post counter variable by 1
        postCounter++;
        //Sets post id to current post counter value
        this.id = postCounter;
        this.user = user;
        this.content = content;
        this.url = url;
    }

    public String getPostContent(){return content;}

    public void setPostContent(String content){
        this.content = content;
    }

    public User getUser(){return user;}

    public void setUser(User user){
        this.user = user;
    }

    //Getter to return post ID
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
       this.id = id;
    }

    //Method to override the build=in toString method
    //and display a post in a format of our choosin
    @Override
    public String toString() {
        return "Post number:" + this.id +"\n" +
                this.content + "\n" +
                "Written by: " + this.user.getUsername() + "\n" +
                "Post :" +this.content +
                //The expression below checks if the url
                //field is null. If not, it displays the url.
                //If it is, it just displays an empty string
                 "URL: " + (this.url != null ? this.url : "");
    }

}


