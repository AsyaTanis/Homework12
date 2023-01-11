public class Author {
    private final String authorFirstName;
    private final String authorSecondName;

    public Author (String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    public String getAuthorSecondName() {
        return this.authorSecondName;
    }
}
