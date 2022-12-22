package Laba_2;

public class Book {
        private String name;
        private String author;
        private String date;

        public Book(String name,String author,String date){
            this.name=name;
            this.author=author;
            this.date=date;
        }
        public String getName(){
            return name;
        }
        public String getAuthor() {
            return author;
        }
        public String getDate(){
            return date;
        }
        public void setAuthor(String author){
            this.author=author;
        }
        public void setName(String name) {
            this.name = name;
        }
         public void setDate(String date) {
            this.date = date;
        }
        public String toString(){
            return "Book Name: "+name+"; Author: "+author+"; Date: "+ date;
        }
}
