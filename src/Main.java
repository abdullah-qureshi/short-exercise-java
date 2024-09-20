//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        // Create an array of 100 worker
        Worker[] myWorkers = new Worker[100];
        for (int i = 0; i < myWorkers.length; i++) {
            myWorkers[i] = new Worker();
            myWorkers[i].getDetails();
        }
        myWorkers[0] = new Worker("Abdullah", 40000,5000);
        int salary = Worker.getTotalCompanySalary();
        System.out.println("Total workers salary = " + salary);
    }
}

// Is your design ready to easily accept changes in how to calculate the total salary? for example for calculating the total salary taking into account taxes.
/*
To easily adapt the design for changes in salary calculation (like considering taxes) I have
created a method in the Worker class for salary calculation. This method can be modified later on
or extended without affecting the functionality of the rest of the code.

*/
//How to implement the case where I don't use all of the 100 "spaces" for workers? I.e my company only have 20.
/*
We can reduce the number of elements in an array to 20 if we have only 20 workers
This can be done by creating a new array with desired size and copy the elements from first array
 */