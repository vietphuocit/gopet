import java.util.Hashtable;
import java.util.Vector;

public final class dt {
   private Vector a = new Vector();
   private Hashtable a = new Hashtable();

   public final void a(ds var1) {
      this.a.addElement(var1);
      this.a.put(new Integer(var1.a), var1);
   }

   public final ds a(int var1) {
      return (ds)this.a.get(new Integer(var1));
   }

   public final ds b(int var1) {
      return (ds)this.a.elementAt(var1);
   }

   public final int a() {
      return this.a.size();
   }

   public final void b(ds var1) {
      this.a.removeElement(var1);
      this.a.remove(new Integer(var1.a));
   }
}
