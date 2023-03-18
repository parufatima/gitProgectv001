package assignment1;

public class Actions {                 //class

  int age;              //Instance variable
  static String phone= "iPhone";       // static variable
    public  Actions(){                //constructor
     age =18;     // Set the initial value for the class attribute age
    }
    public void use(){                  //method
        System.out.println("People should use smart phone above age 18 years");
    }
    public void addition(){             //method
         int number1 = 51;              // local variable
         int number2 = 13;              // local variable
         int result = number1+number2;   // local variable

        System.out.println(result);
    }

    public static void main(String[] args) {
        Actions actions = new Actions();     //object
        actions.use();
        actions.addition();
        System.out.println("Age minimum age of smart phone user is :"+ actions.age);
        System.out.println(phone);
    }
}
