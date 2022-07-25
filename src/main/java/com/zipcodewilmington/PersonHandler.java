package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int count = 0;
        // while `counter` is less than length of array

            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
        while (count < personArray.length) {
            result += "\nMy first name is "+ personArray[count].getFirstName()
                    +"\nMy last name is " + personArray[count].getLastName();
            count++;
        }
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (int i = 0; i < personArray.length; i++) {
                result+="\nMy first name is " + personArray[i].getFirstName()
                        +"\nMy last name is " + personArray[i].getLastName();

            }

        return result;

    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (Person p : personArray) {
            result+="\nMy first name is " + p.getFirstName()
                    +"\nMy last name is " + p.getLastName();

        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
