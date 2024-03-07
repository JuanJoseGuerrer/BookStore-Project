
package javaapp;



public class Books{
     
    String title;
    String author;
    String genre;
    String datePub;
    boolean available;
    int quantity;
    int loanTime;
    String user;
    int loanDate;
    int returnDate;

    public Books(String title, String author, String genre, String datePub, boolean available, int quantity, int loanTime, String user, int loanDate, int returnDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.datePub = datePub;
        this.available = available;
        this.quantity = quantity;
        this.loanTime = loanTime;
        this.user = user;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
    
    
    
    
    public void lendBook(){
        System.out.println(".");
    }
    
    public void returnBook(){
        System.out.println(".");
    
    }

    public String toString(){
        return "titulo" + this.title + "Autor" + this.author + this.genre;
    
    }
        
}

    


