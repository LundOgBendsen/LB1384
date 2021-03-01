package dk.logb.javase.inheritanceandcomposition.ex02;

public class Point
{
  private int x, y;

  public Point()
  {
    this(0, 0);
  }

  public Point(final int x, final int y)
  {
    this.x = x;
    this.y = y;
  }

  public int getX()
  {
    return x;
  }

  public void setX(final int x)
  {
    this.x = x;
  }

  public int getY()
  {
    return y;
  }

  public void setY(final int y)
  {
    this.y = y;
  }

  @Override
  public String toString()
  {
    return "Point[x=" + x + ", y=" + y + "]";
  }
}
