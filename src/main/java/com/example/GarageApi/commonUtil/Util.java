package com.example.GarageApi.commonUtil;

import com.example.GarageApi.entity.Car;
import com.example.GarageApi.entity.Jeep;
import com.example.GarageApi.entity.Truck;
import com.example.GarageApi.entity.Vehicle;
import com.example.GarageApi.requestClasses.ParkRequestModel;

public class Util {

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }


    public static Vehicle createVehicle(ParkRequestModel parkRequestModel){
        String model = parkRequestModel.getType();

            if (model.equalsIgnoreCase("car")){
                return new Car(parkRequestModel.getColor(), parkRequestModel.getLicence());
            }
            else if(model.equalsIgnoreCase("jeep")) {
                return new Jeep(parkRequestModel.getColor(), parkRequestModel.getLicence());
            }
            else if(model.equalsIgnoreCase("truck")) {
                return new Truck(parkRequestModel.getColor(), parkRequestModel.getLicence());
            }
            else {
                throw new IllegalArgumentException();
            }
    }


}
