
package com.lab1;

import java.util.ArrayList;
import java.util.Objects;

public class Books {
    private ArrayList<Book> books = new ArrayList<>();

    public Books() {
    }

    public void addBook(Book book) {
        if (book instanceof Book) {
            this.books.add(book);
        } else {
            System.err.println("Invalid property");
        }

    }

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public String toString() {
        int sellerIndex = 0;
        int maxIndex = 0;
        double max = 0.0D;

        for(int i = 0; i < this.books.size(); ++i) {
            double price = ((Book)this.books.get(i)).getPrice();
            String seller = ((Book)this.books.get(i)).getSeller();
            if (Objects.equals(seller.strip(), "Ivanov")) {
                if (price > max) {
                    max = ((Book) this.books.get(i)).getPrice();
                    maxIndex = i;
                }
            }
        }

        Book ivanovBook = this.books.get(maxIndex);
       // Book maxBook = this.books.get(maxIndex);
        StringBuilder answer = new StringBuilder();
        answer.append("\n[RESULT (MAX PRICE OF SELLER IVANOV)]\n");
        answer.append(String.format("\nSeller: %s", ivanovBook.getSeller()));
        answer.append(String.format("\nTitle: %s", ivanovBook.getTitle()));
        answer.append(String.format("\nQuantity: %d", ivanovBook.getQuantity()));
        answer.append(String.format("\nPrice: %.2f $", ivanovBook.getPrice()));
        answer.append(String.format("\nDate of sale: %s", ivanovBook.getDateOfSale().toString()));
        /*
        answer.append("\n\n[RESULT (MAX PRICE)]\n");
        answer.append(String.format("\nSeller: %s", maxBook.getSeller()));
        answer.append(String.format("\nTitle: %s", maxBook.getTitle()));
        answer.append(String.format("\nQuantity: %d", maxBook.getQuantity()));
        answer.append(String.format("\nPrice: %.2f $", maxBook.getPrice()));
        answer.append(String.format("\nDate of sale: %s", maxBook.getDateOfSale().toString()));
         */
        return answer.toString();

    }
}
