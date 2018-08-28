/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanResoursePart.HumanServicePart;

import HumanResoursePart.Employee;
import java.util.ArrayList;
import HumanResoursePart.HumanServicePart.DataBase;
import static HumanResoursePart.HumanServicePart.DataBase.listTest;
import Vissible.MainViewPannel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public  class EmployeeService {

    public ArrayList ShowList() {

        return listTest;
    }

    public static ArrayList AddToList(Employee e) {
        listTest.add(e);
        return listTest;

    }
    
    public static ArrayList RemoveFromList(int index){
    listTest.remove(index);
    return listTest;
    }
    


    public static ArrayList EditEmployee(int index, Employee e) {
         listTest.remove(index);
         listTest.add(index, e);
        return listTest;
    }

    public static void Showlist() {
        for (Employee employee : listTest) {
            System.out.println(employee);
            
        }

    }

    public static void NewLine(){
    System.out.println("\n");
    
    
    }
    
    
    
}
