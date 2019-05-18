import java.util.Scanner;

public class BlogGenerator {

    private Scanner keyboard;

    public BlogGenerator(){
        this.keyboard = new Scanner(System.in);
    }
        public Post generatePost(User user){
            String confirm;
            Post newPost;
        do {
            newPost = createPost(user);
            System.out.println("\n" + newPost.toString() + "\n");
            System.out.println("Is this the correct information? (Enter \"y\" for yes)");
            confirm = keyboard.nextLine();
        }while(!confirm.toLowerCase().equals("y"));
        return newPost;
    }

    public User buildUser(){

        User user = new User();
        System.out.println("Enter your first name");
        user.setFirstName(keyboard.nextLine());
        System.out.println("Enter your last name");
        user.setLastName(keyboard.nextLine());
        System.out.println("Create your Username");
        user.setUsername(keyboard.nextLine());
        System.out.println("What is your email address?");
        user.setEmail(keyboard.nextLine());
        return user;
    }


    private Post createPost(User user){
        Post post = new Post();
        post.setUser(user);
        System.out.println("Type in your next post..");
        post.setPostContent(keyboard.nextLine());
        System.out.println("What is the Url address?");
        post.setUrl(keyboard.nextLine());
        return post;
    }


}

