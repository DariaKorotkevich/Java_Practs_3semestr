package Laba3;

public class MovableRectangle implements  Movable{
    MovablePoint topleft;
    MovablePoint bottomRight;

    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed){
        this.topleft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        this.bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public String toString(){
        return "MovableRectangle{ x1= "+topleft.x+", y1= "+topleft.y+"x2= "+bottomRight.x+", y2= "+bottomRight.y+"}";
    }
    public void setSpeed(int xSpeed, int ySpeed){
        //method with mistake for checking work of isEquSpeed
        topleft.ySpeed = ySpeed;
        topleft.xSpeed = xSpeed;
    }
    private boolean provSpeed(){
        return topleft.xSpeed == bottomRight.xSpeed && topleft.ySpeed == bottomRight.ySpeed;
    }
    public void moveUp(){
        if(!provSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topleft.xSpeed + "\n\tySpeed = " + topleft.ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);

        topleft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown(){
        if(!provSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topleft.xSpeed + "\n\tySpeed = " + topleft.ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);

        topleft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft(){
        if(!provSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topleft.xSpeed + "\n\tySpeed = " + topleft.ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);

        topleft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight(){
       if(!provSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topleft.xSpeed + "\n\tySpeed = " + topleft.ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topleft.moveRight();
        bottomRight.moveRight();
    }

}
