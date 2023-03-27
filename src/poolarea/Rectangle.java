package poolarea;

public class Rectangle {

    // The class needs two fields (instance variable) with name
    //width and length both of type double.

    double width;
    double length;
// The class needs to have one constructor with parameters width and length both of type double and it
//needs to initialize the fields.
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if(this.width<0){
            this.width=0;
        }
        else{
            this.width=width;
        }
        if(this.length<0){
            this.length=0;
        }
        else{
            this.length=length;
        }
    }
// Method named getWidth without any parameters, it needs to return the value of the widthfield

    public double getWidth(){
        return width;
    }
   // Method named getLength without any parameters, it needs to return the value of the length field
    public double getLength(){
        return length;
    }

    //Method named getArea without any parameters, it needs to return the calculated area
    //(width * length).


    public double getArea(){
        return width * length;
    }
}
