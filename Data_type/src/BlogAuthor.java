// BlogAuthor - A class representing a blog author with properties like name, bio, and articles.
// Declare the Class Name: BlogAuthor
// Declare Main Method
// Declare variables with appropriate data type for each property mentioned above and also initilize them
// Print all variables declared above
// Declare  boolean variables hasPublished, isCoAuthor and initializing it with a value
// print the boolean variable
// Using a String concatenation to print the boolean variable

public class BlogAuthor {
    public static void main(String[] args) {
        String name = "Bubbly Butterfly";
        String bio = "Sky is limit";
        String article = "See through my Eyes";

        boolean hasPublished = true;
        boolean isCoAuthor = false;

        System.out.println(
                "Name :  "  + name +
                "\nBio :  " + bio +
                "\nArticle name :  " + article +

                        "\nBlog already published.  " + hasPublished +
                        "\nHas a Co-Author.  " + isCoAuthor

        );
    }
}
