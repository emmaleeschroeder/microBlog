
import java.util.ArrayList;

import java.util.Scanner;


public class Menu {

    Scanner keyboard = new Scanner(System.in);

    private User currentUser;

    private ArrayList<User> userLog;

    private ArrayList<Post> blogLog;

    public Menu() {
        this.blogLog = new ArrayList();
        this.userLog = new ArrayList();
    }

    public void create() {
        welcome();

        int choice;

        do {
            System.out.println("Choose where you would like to navigate too.");
            System.out.println("1.Create new User");
            System.out.println("2.Create a post");
            System.out.println("3.Display all posts");
            System.out.println("4.Display all users");
            System.out.println("0.Exit");
            choice = keyboard.nextInt();
            keyboard.skip("\n");
            if (choice != 0) {
                processChoice(choice);
            }
        } while (choice != 0);
        System.out.print("Thank you for choosing Micro Blog.");
    }

    private void welcome() {
        System.out.print("Hi! Welcome to the main Menu.");
    }

    private void processChoice(int choice) {
        BlogGenerator blogGenerator = new BlogGenerator();
        switch (choice) {
            case 1:
                User user = blogGenerator.buildUser();
                this.userLog.add(user);
                currentUser = user;
                break;
            case 2:
                System.out.println("What is your username?");
                String username = keyboard.nextLine();
                currentUser = getUser(username);
                if (currentUser == null) {
                    System.out.println("Invalid Username");
                    break;
                }else {
                    currentUser.equals(username);
                }
                Post post = blogGenerator.generatePost(currentUser);
                this.blogLog.add(post);
                break;
            case 3:
                viewPost();
                break;
            case 4:
                viewUser();
                break;
        }
    }
    private void viewPost() {
        for (Post post : blogLog) {
            System.out.print("________________________");
            System.out.println(post.toString());
        }
        System.out.println("____________________________");
        System.out.println("");
    }

    private void viewUser() {
        System.out.println("I am groot");
        for (User user : userLog) {
            System.out.print("____________");
            System.out.println(user.getUsername());
        }
    }

    private User getUser(String username) {
        User foundUser = null;
        for (User user : userLog) {
            if (user.getUsername().equals(username)) {
                foundUser=user;
            }
        }
        return foundUser;
    }
}





