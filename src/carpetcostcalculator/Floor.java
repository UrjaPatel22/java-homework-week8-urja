package carpetcostcalculator;

public class Floor {
//  two  (instance variables) with name width and length of type double
    double width;
    double length;
// one constructor with parameters width and length of type double and it needs to initialize the fields.
    // In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
        }
    }

    // Method named getArea without any parameters, it needs to return the calculated area (width * length).
        public double getArea(){
            return width*length;
        }

    }


