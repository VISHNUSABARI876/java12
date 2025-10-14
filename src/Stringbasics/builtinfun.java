package Stringbasics;

public class builtinfun {                         //in java string is immutable.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String st1="abCd";
        String st2="abcd";
        System.out.println(st1.compareToIgnoreCase(st2));
        System.out.println(st1.compareTo(st2));   //returns integer.

	}

}
