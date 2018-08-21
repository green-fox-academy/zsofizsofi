public class MainBlogPost {
    public static void main(String[] args) {
        BlogPost blogPost1 = new BlogPost();
        blogPost1.authorName = "John Doe";
        blogPost1.title = "Lorem Ipsum";
        blogPost1.text = "Lorem ipsum dolor sit amet.";
        blogPost1.publicationDate = "2000.05.04.";

        BlogPost blogPost2 = new BlogPost();
        blogPost2.authorName = "Tim Urban";
        blogPost2.title = "Wait but why";
        blogPost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        blogPost2.publicationDate = "2010.10.10.";

        BlogPost blogPost3 = new BlogPost();
        blogPost3.authorName = "William Turton";
        blogPost3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blogPost3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        blogPost3.publicationDate = "2017.03.28.";

        blogPost1.blogPostMethod();
        blogPost2.blogPostMethod();
        blogPost3.blogPostMethod();


    }
}


//        Create a few blog post objects:
//        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
//        Lorem ipsum dolor sit amet.
//        "Wait but why" titled by Tim Urban posted at "2010.10.10."
//        A popular long-form, stick-figure-illustrated blog about almost everything.
//        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
//        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.