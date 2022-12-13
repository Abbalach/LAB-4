/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */

class House
{   
    private int id = 0;
    private int apartmentNumber = 0;
    private int area = 0;
    private int level = 0;
    private int numberOfRooms = 0;
    private String street = "";
    private String houseType = "";
    private int operatingTime = 0;
    
    
    private boolean helper = false;
    
    public boolean getHelper()
    {
        return helper;
    }
    
    public void setId(int id)
    {
        if (id < 100000000 || id > 99999999)
        {
            helper = false;
        }
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    public void setApartmentNumber(int number)
    {
        if (level > 400 || level < 1)
        {
            helper = false;
        }
        apartmentNumber = number;
    }
    public int getApartmentNumber()
    {
        return apartmentNumber;
    }
    public void setArea(int area)
    {
        this.area = area;
    }
    public int getArea()
    {
        return area;
    }
    public void setLevel(int level)
    {
        if (level > 20 || level < 1)
        {
            helper = false;
        }
        else
        {
             this.level = level;
        }       
    }
    public int getLevel()
    {
        return level;
    }
    public void setNumberOfRooms(int numberOfRooms)
    {
        if (numberOfRooms > 10 || numberOfRooms < 1)
        {
            helper = false;
        }
        this.numberOfRooms = numberOfRooms;
    }
    public int getNumberOfRooms()
    {
        return numberOfRooms;
    }
    public void setStreet(String street)
    {
        ArrayList<String> streetList = new ArrayList<String>();
        Collections.addAll(streetList, 
                "11th St",
                "136 Ct",
                "13th Ct",
                "14th Pl",
                "163rd Ave",
                "177th Dr",
                "178th Ave",
                "197th Ave",
                "1st St",
                "204th Ave - Everglades National Park",
                "205th Ave - Everglades National Park",
                "208th Ave - Everglades National Park",
                "21st St - Miami International Airport (mia)",
                "22nd St - Miami International Airport (mia)"
                );
        if (!streetList.contains(street)) 
        {
            helper = false;
        }
        this.street = street;
    }
    public String getStreet()
    {
        return street;
    }
    public void setHouseType(String houseType)
    {
        switch (houseType) {
            case "brick house":
            case "panel house":
            case "aerated concrete house":
            case "wooden house":
                helper = true;
                break;
            default:
                helper = false;
                break;
        }
        if (!helper)
        {
             this.houseType = "unlisted type " + houseType;
        }
        else
        {
            this.houseType = houseType;
        }    
    }
    public String getHouseType()
    {
        return houseType;
    }
    public void setOperatingTime(int operatingTime)
    {
        if (operatingTime > 150 || operatingTime < 1)
        {
            helper = false;
        }
        this.operatingTime = operatingTime;
    }
    public int getOperatingTime()
    {
        return operatingTime;
    }
    
    
}
/**
 * private int id = 0;
    private int appartmentNumber = 0;
    private int area = 0;
    private int level = 0;
    private int numberOfRooms = 0;
    private String street = "";
    private String houseType = "";
    private int operatingTime = 0;
 * 
 * @author user
 */
class Apartments
{
     public House[] apartments;
     
     private int Index = 0;
     
     public Apartments(int numberOfApartments)
     {
         apartments = new House[numberOfApartments];
         
         for (int i = 0; i < numberOfApartments; i++) 
         {
             apartments[i] = new House();
         }
     }
     
     public void AddNextElement(int id, int appartmentNumber, int area, int level, int numberofRooms, String street, String houseType, int operatingTime)
     {
         if (Index < apartments.length)
         {
             apartments[Index].setId(id); 
             apartments[Index].setApartmentNumber(appartmentNumber); 
             apartments[Index].setArea(area); 
             apartments[Index].setLevel(level); 
             apartments[Index].setNumberOfRooms(numberofRooms); 
             apartments[Index].setStreet(street); 
             apartments[Index].setHouseType(houseType); 
             apartments[Index].setOperatingTime(operatingTime); 
                     
             Index++;
         }
         else
         {
             System.out.println("All element are added");
         }
     }
     
     public void ShowElements()
     {
         for (int i = 0; i < apartments.length; i++) 
         {
              System.out.println("Apartment by number " + apartments[i].getApartmentNumber());
              System.out.println("Apartment id " + apartments[i].getId());
              System.out.println("Apartment area " + apartments[i].getArea());
              System.out.println("Apartment level " + apartments[i].getApartmentNumber());
              System.out.println("Street " + apartments[i].getStreet());
              System.out.println("HouseType " + apartments[i].getHouseType());
              System.out.println("OperatingTime " + apartments[i].getOperatingTime());

              if (!apartments[i].getHelper())
              {
                 System.out.println("Questionable");
              }
              System.out.println();
              System.out.println();
         }
    
     }
}

public class Lab4 {

    public static void main(String[] args)
    {
        Apartments apartments = new Apartments(3);
        
        apartments.AddNextElement(15468645, 2, 60, 2, 3, "1st St", "panel house", 50);
        apartments.AddNextElement(75537544, 23, 75, 4, 5, "136 Ct", "brick house", 70);
        apartments.AddNextElement(45, -1, 0, 15, 1, "Mayacovskogo", "house", 200);
        
        apartments.ShowElements();
    }
}
