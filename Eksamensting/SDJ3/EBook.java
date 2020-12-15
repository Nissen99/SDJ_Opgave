public class EBook extends Book
{

  private String url;

  public EBook(String title, String isbn, String url)
  {
    super(title, isbn);
    this.url = url;
  }

  public String getUrl()
  {
    return url;
  }

  @Override public String getBookType()
  {
    return "E-book";
  }

public String toString(){
    return url + " " + super.getTitle() + " " + super.getIsbn();
}
}
