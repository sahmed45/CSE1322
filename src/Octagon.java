

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

int area;
int side;
int perimeter;
public Octagon(int side){
	this.side=side;

}
public double area(){
	double area = (2+4/Math.sqrt(2))*side*side;
	return area;
}
public double perimeter(){
	double perimeter= side*8;
	return perimeter;
}
public int getSide(){
	return side;
}
public Octagon clone() {
    Octagon o = new Octagon(this.getSide());
    return o;
}
public int compareTo(Octagon o){
	if(this.area()== o.area()){
	return 1;
}
	return 0;
}
}