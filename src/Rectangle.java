
public class Rectangle implements ResizeableGO, MoveableGO {

    private int color;
    private boolean shown;
    private float sizeX;
    private float sizeY;
    private float posX;
    private float posY;
    
    public int getColor() {
        return color;
    }

    public boolean isShown() {
        return shown;
    }

    public float getSizeX() {
        return sizeX;
    }

    public float getSizeY() {
        return sizeY;
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

    public Rectangle(float posX,float posY,float sizeX, float sizeY)
    {
	this.sizeX=sizeX;
	this.sizeY=sizeY;
	this.posX=posX;
	this.posY=posY;
    }
    
    public void setColor(int x) {
	color=x;
    }

    public void show() {
	shown=true;
    }

    public void hide() {
	shown=false;
    }

    public void move(float xOffset, float yOffset) {
	posX+=xOffset;
	posY+=yOffset;
    }

    public void resize(float scale) {
	sizeX*=scale;
	sizeY*=scale;
    }

    public String toString()
    {
	return "Rectangle: Pos( "+posX+", "+posY+") Size( "+sizeX+", "+sizeY+") Color: "+color+" Visible: "+shown+";";
    }
    
    public static void resizeAll(float r, ResizeableGO rgo[]) 
    {
	for (ResizeableGO g : rgo) 
	    g.resize(r);
    }
    
    public static void moveAll(float dx, float dy, MoveableGO mgo[]) 
    {
	for (MoveableGO m : mgo) 
	    m.move(dx, dy);
    }
    
    public static void main(String args[]) {
	java.util.Random rand = new java.util.Random();
	int rectangles=rand.nextInt(10)+5;
	Rectangle[] rectVec=new Rectangle[rectangles];
	for(int i=0;i<rectangles;i++)
	{
	    Rectangle r=new Rectangle(rand.nextFloat()*1000,
		    rand.nextFloat()*1000,
		    rand.nextFloat()*1000,
		    rand.nextFloat()*1000);
	    r.setColor(rand.nextInt(256));
	    System.out.println(r);
	    rectVec[i]=r;
	}
	
	float dx=rand.nextFloat()-0.5f;
	float dy=rand.nextFloat()-0.5f;
	System.out.println("\nMoving dx: "+dx+" dy: "+dy);
	Rectangle.moveAll(dx, dy, rectVec);
	for(Rectangle r : rectVec)
	    System.out.println(r);
	float scale=rand.nextFloat()+0.5f;
	System.out.println("\nResizing scale: "+scale);
	Rectangle.resizeAll(scale, rectVec);
	for(Rectangle r : rectVec)
	    System.out.println(r);
    }
}
