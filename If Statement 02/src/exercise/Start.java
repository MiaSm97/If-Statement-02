package exercise;

public class Start {
    public static void main(String[] args) {
        String mySurname = "Smaldone";
        String result = mySurname.contains("ni") ? "My surname contains the letters 'ni'"
                                                 : "My surname doesn't contain the letters 'ni'";
        System.out.println(result);
    }
}

    /*define a variable called mySurname and assign your surname to it
        using the ternary operator, determine if your surname contains the sequence of letters ni
        print the result in this way: Your surname [contains|doesn't contain] the sequence of letters 'ni'*/
