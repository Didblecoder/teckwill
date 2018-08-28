/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HumanResoursePart;

/**
 *
 * @author Asus
 */
public class Specialitate {
    
    private String name;

    public Specialitate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    @Override
  public String toString() {
    return name;
  }
    
}
