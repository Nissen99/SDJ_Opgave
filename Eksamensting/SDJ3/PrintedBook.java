public class PrintedBook extends Book
{
  private boolean isPaperback;

  public PrintedBook(String title, String isbn, boolean isPaperback)
  {
    super(title, isbn);
    this.isPaperback = isPaperback;
  }

  public boolean isPaperback()
  {
    return isPaperback;
  }

  @Override public String getBookType()
  {
    if (isPaperback())
    {
      return "Paperback";
    }
    else
    {
      return "Hard cover";
    }
  }

  public boolean equals(Object obj)
  {

    if (!(obj instanceof PrintedBook))
    {
      return false;
    }

    PrintedBook other = (PrintedBook) obj;
    return super.equals(other) && other.isPaperback() == isPaperback();
  }

}
