public abstract class Predator implements HuntAble{
 private int mass;

 public Predator(int mass) {
  this.mass = mass;
 }

 public int getMass() {
  return mass;
 }

 public void setMass(int mass) {
  this.mass = mass;
 }

 @Override
 public String toString() {
  return "\n Predator" +
          "\n  meat mass " + mass;
 }

 abstract void eat();
abstract void run();
}
