package pack4;
class Box{
	int width,height,depth;
	Box(int w,int h,int d){
		this.width=w;
		this.height=h;
		this.depth=d;
	}
	int volume() {
		return height*width*depth;
	}
}
public class ClassesObjects {
	public static void main(String args[]) {
	Box obj=new Box(10,20,30);
	int v=obj.volume();
	System.out.println("Volume is : "+ v);
}
}
