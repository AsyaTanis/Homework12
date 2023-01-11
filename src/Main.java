
public class Main {
    public static void main(String[] args) {
        Author authorTolstoy = new Author("Л. Н. ", "Толстой");
        Author authorLermontov= new Author("М. Ю. ", "Лермонтов");
        Book warAndPeace = new Book(authorTolstoy, "Война и Мир",1867);
        Book masquerade = new Book(authorLermontov, "Маскарад",1835);

        System.out.println("Автор - " + warAndPeace.getAuthor());
        System.out.println("Название -  " + warAndPeace.getBookName());
        System.out.println("Год - " + warAndPeace.getPublishingYear());
        warAndPeace.setPublishingYear(1889);
        System.out.println("Год(измененный) - " + warAndPeace.getPublishingYear());

        System.out.println();
        System.out.println("Автор - " + masquerade.getAuthor());
        System.out.println("Название -  " + masquerade.getBookName());
        System.out.println("Год - " + masquerade.getPublishingYear());
    }
}
