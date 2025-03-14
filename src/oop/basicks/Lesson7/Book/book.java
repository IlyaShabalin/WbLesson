package oop.basicks.Lesson7.Book;

public class book {
    String nameBook;
    String nameAuthor;
    int countPage ;
    boolean isNonFiction;

    public book(String nameBook, String nameAuthor, int countPage, boolean isNonFiction) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.countPage = countPage;
        this.isNonFiction = isNonFiction;
    }
    public void printCountRows(){
        System.out.println("Количество строк в книге: "+ this.countPage* 40);
    }
    public void printCountRows(int countRowsOnPage){
        System.out.println("Количество строк в книге: "+ this.countPage* countRowsOnPage);
    }
     public void printInfo(){
         System.out.printf("%s от %s - %s\n",this.nameBook, this.nameAuthor,
                 this.isNonFiction ? "Документальная" : "Недокументальная");
         printCountRows();

}
}

