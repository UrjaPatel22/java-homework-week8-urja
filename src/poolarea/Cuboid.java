package poolarea;

public class Cuboid extends Rectangle {
    // (instance variable) with name height of type double
 double height;
// one constructor with three parameters width, length, and height all of type
//double. It needs to call the parent constructor and initialize a height field.
//In case the height parameter is less than 0 it needs to set the height field value to 0.one constructor with three parameters width, length, and height all of type
//double. It needs to call the parent constructor and initialize a height field.
//In case the height parameter is less than 0 it needs to set the height field value to 0.
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
        if(height<0){
             this.height=0;
        }
    }
// Method named getHeight without any parameters, it needs to return the value of height
//field.

    public double getHeight(){
        return height;
    }
    // Method named getVolume without any parameters, it needs to return the calculated volume.
    //To calculate volume, multiply the area with height.

    public double getVolume(){
        return  getArea()*getHeight();
    }

}
