package com.jdbc;
//Step 1

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.onlineportal.controller.UserController;
import com.onlineportal.vo.UserVO;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter value
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter 0 - insert, 1- delete and press any for seeing rows");
		 int num = scan.nextInt();
    	 switch(num) {
    	 case 0:{  // insertion
    		 System.out.println("Enter id:");
    		 int id = scan.nextInt();
    		 System.out.println("Enter LastName:");
    		 String lastName = scan.next();
    		 System.out.println("Enter FirstName:");
    		 String firstName = scan.next();
    		 UserVO vo = new UserVO(id, firstName, lastName);
    		 UserController controller = new UserController();
    		 int rows=controller.addNewUser(vo);
    		 System.out.println("Number of Rows affected:"+rows);		 
    		 break;}
    	 case 1: {
    		 System.out.println("Enter id number to delete:");
    		 int id = scan.nextInt();
    		 UserController controller = new UserController();
    		 int rows=controller.deleteUser(id);
    		 System.out.println("Number of Rows affected:"+rows);		 
    		 break;}
    	 default:
    	 {
    		 
         UserController controller = new UserController();
         List<UserVO> ls = controller.getAllUserDetails();
 		Iterator<UserVO> it = ls.iterator();
 		while(it.hasNext()) {
 			UserVO vo = it.next();		
 			System.out.println(vo.getId()+" "+vo.getFirstName()+" "+vo.getLastName());
 		}  		
    	 }
    	 }

     }
}
