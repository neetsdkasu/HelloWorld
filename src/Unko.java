
public class Unko
{
  private final String name;
  private final int value;
  
  public Unko(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() { return name; }
  public int getValue() { return value; }
  
  @Override
  public int hashCode() {
    int hash = 0;
    hash ^= (name == null ? 0 : name.hashCode());
    hash ^= value;
    return hash ^ super.hashCode();
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (this.getClass() != obj.getClase())  return false;
    Unko other = (Unko)obj;
    if (name == null) {
      if (other.name != null) return false;
    } else if (!name.equals(other.name)) return false;
    if (value != other.value) return false;
    return true;
  }
  
  @Override
  public String toString() {
    return name + " : " + value;
  }

}
