package one;

public class Money{
    int i = 0;
    String s = "hello";
    
Money(int i){
    System.out.println("you have "+i+" dollar.");}

Money(String ss){
    System.out.println(ss+" ,nice to meet you.");
    s = ss;}

Money(String s,int i){
    this(i);
    this.s=s;
    System.out.println("go Money(String s,int i)");}

Money(){
    this("hi" , 10);
    System.out.println("go Money( )");}

public static void main(String[] args){
    @SuppressWarnings("unused")
	Money m = new Money();} 

}