public class Advertisement {
    public static void main(String[] args) {

                String title = "IzaanSchool";
                String Description = "Java class";
                int targetAudience = 1000;

        System.out.println("title :" + title);
        System.out.println("Description :" + Description);
        System.out.println("target Audience :" + targetAudience);

        boolean isSponsored = false;
        boolean isFeatured = true;

        System.out.println(
                "IzaanSchool is sponsored : " + isSponsored +
                "\nIzaanSchool is featured : " + isFeatured
        );
    }
}
