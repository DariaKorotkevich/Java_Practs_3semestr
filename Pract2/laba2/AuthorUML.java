package laba2;

public class AuthorUML {
    private String name;
    private String email;
    private char gender;

    public AuthorUML(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return "Author: "+name+", Email: "+email+", Gender: "+ gender;
    }

    public static class TestAuthorUML {
        public static void main(String[] arg){
            AuthorUML a1=new AuthorUML("Author","email",'M');

            System.out.println(a1);
            a1.setEmail("@");
            System.out.println(a1);
        }
    }
}
