package Day11;

public class Box {

    double width, height, depth;

    Box() {
        width=0;
        height=0;
        depth=0;
    }

    Box(double w,double h,double z) {
        width=w;
        height=h;
        depth=z;
    }


    Box(double len) {
        width=height=depth=len;
    }

    double volume() {
        return width*height*depth;
    }
}

