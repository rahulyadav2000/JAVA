class Scope {
public static void main(String args[]) {
int x; // known to all code within main
x = 20;
if(x == 20) { // start new scope
int y = 40; // known only to this block
// x and y both known here.
System.out.println("x and y: " + x + " " + y);
x = y * 2;
}
System.out.println("x is " + x);
}
}
