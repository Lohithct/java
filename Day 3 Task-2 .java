//TASK-2
class book
{
    String title;
    String author;
    public book()
    {
       this.title="c++ programing"; 
       this.author="bala guru samy";
    }
    public book(String title,String author)
    {
        this.title = title;
        this.author = author;

    }
    public void display()
    {
        System.out.println("title:"+title);
        System.out.println("author:"+author);
    }
     public static void main(String[] args) {
     book b1=new book();
     b1.display();
     book b2=new book("Retrived Reformation","O.Henry");
     b2.display();
     }
}
