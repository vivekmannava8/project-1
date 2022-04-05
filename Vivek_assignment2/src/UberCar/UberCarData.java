/*
 * 
o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UberCar;

import java.util.ArrayList;
import java.util.List;
;
 /*
 * @author revanthkumar
 */
public class UberCarData {
    
   // private static CarInformationList carLists;
    private ArrayList<UberCars> carList;
    private ArrayList<UberCars> mfgList;

    public ArrayList<UberCars> getMfgList() {
        return mfgList;
    }

    public void setMfgList(ArrayList<UberCars> mfgList) {
        this.mfgList = mfgList;
    }
    public UberCarData(){
        this.carList = new ArrayList<>();
         
    }
    
    public ArrayList<UberCars> getCarList() {
        return carList;
    }

    
    public void setCarList(ArrayList<UberCars> carList) {
        this.carList = carList;
    }
    

 public UberCars addCar(){
     UberCars car = new UberCars();
     carList.add(car);
     return car;
 }
  
 
 public void deleteCar(UberCars car){
     carList.remove(car);
 }
 
 
 public ArrayList<UberCars> getMfgList(int manufactured_year){
      ArrayList<UberCars> mfglist = new ArrayList<>();
     for(UberCars car : carList){
            if(car.getManufactured_year()== manufactured_year){
                mfglist.add(car);
 }
     }return mfglist;
 }


 
 
  public ArrayList<UberCars> getSerialList(int serial_num){
      ArrayList<UberCars> mfglist = new ArrayList<>();
     for(UberCars car : carList){
            if(car.getSerial_num()== serial_num){
                mfglist.add(car);
 }
     }return mfglist;
 }
 
     public ArrayList<UberCars> getBrandList(String brand){
      ArrayList<UberCars> brandlist = new ArrayList<>();
     for(UberCars car : carList){
            if(car.getBrand().equals(brand)){
                brandlist.add(car);
 }
     }return brandlist;
 }

     
     public ArrayList<UberCars> getModelList(String model_number){
      ArrayList<UberCars> modellist = new ArrayList<>();
     for(UberCars car : carList){
            if(car.getModel_num().equals(model_number)){
                modellist.add(car);
 }
     }return modellist;
 }
     
     public ArrayList<UberCars> getMaintainanceCertificate(){
         
         ArrayList<UberCars> maintainanceList = new ArrayList<>();
         for(UberCars car: carList){
             if(car.isMaintenance_certificate() == false)
                 maintainanceList.add(car);
         }return maintainanceList;
     }
     
    
    
   public ArrayList<UberCars> getAvailableCarsbyCity(String availble_city){
       ArrayList<UberCars> availablecity = new ArrayList<>();
       for(UberCars car: carList){
           if(car.getAvailble_city().equals(availble_city) && car.isAvailable()==true)
               availablecity.add(car);
           
       }return availablecity;
   }
    
       public ArrayList<UberCars> getTotalAvailable(){
               ArrayList<UberCars> totalavailable = new ArrayList<>();
              
               for(UberCars car: carList){
                   if(car.isAvailable()==true)
                       totalavailable.add(car);
                   
                  
                   
               }return totalavailable;
              
       
}
       
       
        public ArrayList<UberCars> getTotalUnAvailable(){
               ArrayList<UberCars> totalUnavailable = new ArrayList<>();
              
               for(UberCars car: carList){
                   if(car.isAvailable()==false)
                       totalUnavailable.add(car);
                   
                  
                   
               }return totalUnavailable;
       
       
}

        public ArrayList<UberCars> getFirstAvailable(){
        ArrayList<UberCars> fisrtAvailable=new ArrayList<>();
        
        for(UberCars car: carList){
            if(car.isAvailable()==true)
                fisrtAvailable.add(car);
                break;
        }return fisrtAvailable;
        }
        
        
        
        public ArrayList<UberCars> getMaxMinList(int max_seats, int min_seats){
            ArrayList<UberCars> maxminList = new ArrayList<>();
            for(UberCars car : carList){
                if(car.getMax_seats()<=max_seats && car.getMin_seats()>=min_seats){
                maxminList.add(car);
            }
            }  return maxminList;
        }

       
       public ArrayList<String> getAllBrands(){
           ArrayList<String> allbrands = new ArrayList<>();
           for(UberCars car: carList){
               
               if(car.getBrand()!="")
               allbrands.add(car.getBrand());
           }
           return allbrands;
       }
       


}