package day38_CustomClass;

public class Replit {

    public String name, color;
    public int amount;

    public String toString() {
        return "Replit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }
}
/*
You have two classes Main and Atts. Do not touch the Main class. Finish the Atts class to have attributes:

Strings: name, color
int: amount
Method: asString() (returns String in format shown below)
All attributes should be public

Example:

   Atts a = new Atts();
   a.name = "table";
   a.color = "brown";
   a.amount = 1;

   System.out.println(a.asString());
   Atts a = new Atts();
   a.name = "table";
   a.color = "brown";
   a.amount = 1;

   System.out.println(a.asString());
Output

name: table color: brown amount: 1
 */