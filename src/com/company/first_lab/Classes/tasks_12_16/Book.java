package com.company.first_lab.Classes.tasks_12_16;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public int hashCode() {
        return (17 * title.hashCode() + 23 * author.hashCode() + Integer.valueOf(price).hashCode() * 131 + 20367);
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = true;
        if (!(obj instanceof Book)) {
            res=false;
        }
        if ((res)&&(obj.hashCode() != hashCode())) {
            res=false;
        }
        if(res){
            Book book = (Book) obj;
            res =  this.title.equals(book.title) && this.author.equals(book.author) && this.price == book.price;

        }
        return res;
    }

    @Override
    public String toString() {
        String book_info = "Book info:\ntitle:"+title+"\nauthor:"+author+"\nprice:"+price+"\nedition:"+edition+"\n";
        return book_info;
    }

}
