package mirea.laba1;

public class Comics {
    private String name;
    private int dateOut;
    private String author;

    public Comics(String n,int d,String a){
        name=n;
        dateOut=d;
        author = a;
    }
    public Comics(){
        name="me";
        dateOut=2020;
        author = "NoMe";
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDateOut(int dateOut)
    {
        this.dateOut=dateOut;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getDate(){
        return dateOut;
    }
    public String toString() {
        return "Имя: "+this.name + ", дата выхода =  "+ this.dateOut+", автор = "+ this.author;
    }
    public void Life(){
        System.out.println(name+ ", life: "+ dateOut + " - "+" 2022");
    }
}
