package cylinder;

public class Circle {
    // (instance variable) with name radius of type double.
    double radius;
// one constructor with parameter radius of type double and it needs to initialize the fields.
//In case the radius parameter is less than 0 it needs to set the radius field value to 0.
    public Circle(double radius) {
        this.radius = radius;
        if(radius<0){
            this.radius=0;
        }
    }
    //Method named getRadius without any parameters, it needs to return the value of the radius field.
    public double getRadius(){
        return this.radius;
    }
    //Method named getArea without any parameters, it needs to return the calculated area
    //(radius * radius * PI). For PI use Math.PI constant.
       public double getArea(){
        return radius * radius * Math.PI;
       }
}
