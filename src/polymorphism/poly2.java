package polymorphism;

public class poly2 {

	  public static void main(String[] args) {
		  poly2 c=new Circle();
		  poly2 t=new Triangle();
		  poly2 s=new Square();
	    c.draw();
	    c.erase();
	    t.draw();
	    t.erase();
	    s.draw();
	    s.erase();
	    
	  }
	void draw()
	{
	  System.out.println("Drawing Shape");
	}
	void erase()
	{
	  System.out.println("Erasing Shape");
	}

	}

	class Circle extends poly2{
	  void draw()
	  {
	    System.out.println("Drawing circle");
	  }
	  void erase()
	  {
	    System.out.println("Erasing Cirle");
	  }
	}

	class Triangle extends poly2{
	  void draw()
	  {
	    System.out.println("Drawing Triangle");
	  }
	  void erase()
	  {
	    System.out.println("Erasing Triangle");
	  }
	}

	class Square extends poly2{
	  void draw()
	  {
	    System.out.println("Drawing Square");
	  }
	  void erase()
	  {
	    System.out.println("Erasing Square");
	  }
	}