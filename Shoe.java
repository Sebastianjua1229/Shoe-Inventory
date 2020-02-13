public class Shoe { 
// declared variables for the sizes
// public access modifier
public String size1 = "6, 6.5, 8, 9.5, 10, 12"; 
public String size2 = "6, 7, 8, 8.5, 9, 10" ; 
public String size3 = "8, 9, 11.5"; 
public String size4 = "4, 5, 5.5, 7, 9, 12, 13"; 
public String size5 = "7, 7.5, 8, 9, 10"; 
public String size6 = "5, 6, 7, 8, 9, 10";
// new methods 
void Shoe1() {
System.out.println("The sizes for this shoe are " + size1);
}
void Shoe2() {
System.out.println("The sizes for this shoe are " + size2);
}
void Shoe3() { 
System.out.println("The sizes for this shoe are " + size3);
}
void Shoe4() { 
System.out.println("The sizes for this shoe are " + size4);
}
void Shoe5() { 
System.out.println("The sizes for this shoe are " + size5);
}
void Shoe6() { 
System.out.println("The sizes for this shoe are " + size6);
}
}
// second class that inherits class Shoe
class RunShoe extends Shoe { 
public static void main(String args[]) { 
// creating new objects
Shoe Nike97 = new Shoe();
Shoe Nike95 = new Shoe();
Shoe Van = new Shoe();
Shoe Yeezy = new Shoe();
Shoe Force = new Shoe();
Shoe Lebron = new Shoe();
// array holding the names of the new objects
String shoes[] = { "Nike 97's", "Nikes 95's", "Vans", "Yeezys 350", "Black Air Forces", "Lebrons 12" };
// a for loop for the array and switch statement
for(int i=0; i < 6; i++)
// actual switch statement
switch(i) { 
case 1:
System.out.println("Inventory:");
break;
case 2:
// calling the first object in the array
System.out.println(shoes[0]); 
// calling the according method void Shoe1 to object Nike97
Nike97.Shoe1();
break;
case 3:
System.out.println(shoes[1]);
Nike95.Shoe2();
break;
case 4:
System.out.println(shoes[2]);
Van.Shoe3();
break;
case 5:
System.out.println(shoes[3]);
Yeezy.Shoe4();
break;
case 6:
System.out.println(shoes[4]);
Force.Shoe5();
break;
case 7:
System.out.println(shoes[5]);
Lebron.Shoe6();
}
}
}
