public class Comments {
    public static void main(String[] args) {
        // This is a single-line comment
        System.out.println("//Hello, this line is after a single-line comment!");

        /* 
         This is a multi-line comment.
         You can write across multiple lines
         without needing to use // at the start of each line.
        */
        System.out.println("/*This line comes after a multi-line comment!*/");

        /**
         * This is a documentation comment (Javadoc).
         * It’s used to describe classes, methods, and variables.
         * Tools like Javadoc can extract these into HTML documentation.
         */
        System.out.println("/**This line comes after a documentation comment!*/");
    }
}