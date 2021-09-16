package Practice;

public class CalculatorOOP {

    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CalculatorOOP{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public CalculatorOOP(String firstName, String lastName, int age) {
       firstName = "undefined";
       lastName = "undefined";
       age = -1;
    }
}

    /*
    private String names;
    private int x, y, result;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    public void plus(){
        result=x+y;
    }

    public void minus(){
        result=x-y;
    }

    // - void plus() - adds x and y (x+y) values and assigns to result
    //   - void minus() - subtracts x and y(x-y) values and assigns to result

}
/*

> Attributes

  - String: names
  - int: x, y, result

**Attributes should be encapsulated**

>Instance Methods:

   - getResult() - getter method for private `result`
   - setY(int y) - setter method for private `y`
   - setX(int x) - setter method for private `x`
   - void plus() - adds x and y (x+y) values and assigns to result
   - void minus() - subtracts x and y(x-y) values and assigns to result

Example:

```
  Calc a = new Calc();
  a.setX(10);
  a.setY(5);
  a.minus();

  System.out.println(a.getResult());
  prints: 5

  a.plus();
  System.out.println(a.getResult());
  prints: 15
```


 */