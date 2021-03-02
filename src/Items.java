public class Items {
    private int ISBN;
    private int authNo;
    private String title;
    private String edition;
    private String category;
    private float price;

    public Items(int ISBN, int authNo, String title, String edition, String category, float price)
    {
        this.ISBN = ISBN;
        this.authNo = authNo;
        this.title = title;
        this.edition = edition;
        this.category = category;
        this.price = price;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getAuthNo() {
        return authNo;
    }

    public String getTitle() {
        return title;
    }

    public String getEdition() {
        return edition;
    }

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }
}
