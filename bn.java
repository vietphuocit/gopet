import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class bn extends dz {
   public bq a;
   private Image a;
   private String a;
   private int d;
   private long a;
   public int a;
   public int b;
   public int c;
   private int e;
   private int f;
   private Vector a = new Vector();
   boolean a;
   private int g;

   public bn(bq var1, int var2, String var3) {
      this.a(new gn(-10, -30, 20, 30));
      this.a = var1;
      this.b = var2;
      this.a = var3;
      this.m = var1.m - 10;
      this.n = var1.n;
   }

   public final void a(int var1, int var2) {
      bc.a.translate(-var1, -var2);
      bc.a.drawImage(v.k, this.m - 11, this.n - 6, 0);
      long var3;
      if (this.a == null) {
         this.a = br.a.a(this.a);
         if (this.a != null) {
            this.e = this.a.getWidth() >> 1;
            this.f = this.a.getHeight();
         }
      } else {
         bc.a.drawRegion(this.a, this.d * this.e, 0, this.e, this.f, this.a, this.m, this.n - this.a.getHeight(), 17);
         if ((var3 = System.currentTimeMillis()) - this.a >= 200L) {
            this.a = var3;
            this.d = (this.d + 1) % 2;
         }

         if (this.a) {
            ++this.g;
            if (this.g > 10) {
               this.g = 0;
            }

            bc.a.drawImage(bx.a, this.m, this.n - this.g - this.a.getHeight(), 3);
         }
      }

      var3 = System.currentTimeMillis();
      int var5 = 0;

      while(true) {
         while(var5 < this.a.size()) {
            bo var6;
            if ((var6 = (bo)this.a.elementAt(var5)).a <= var3 && var6.a + 1000L > var3) {
               switch(var6.a) {
               case 0:
                  v.e.a(bc.a, var6.a, this.m, this.n - var6.b - 30, 17);
                  break;
               case 1:
                  v.d.a(bc.a, var6.a, this.m, this.n - var6.b - 30, 17);
                  break;
               case 2:
                  gj.b.a(bc.a, var6.a, this.m, this.n - var6.b - 30, 17);
                  break;
               case 3:
                  v.d().a(bc.a, var6.a, this.m, this.n - var6.b - 30, 17);
               }

               ++var6.b;
            } else if (var6.a + 1000L <= var3) {
               this.a.removeElement(var6);
               continue;
            }

            ++var5;
         }

         bc.a.translate(var1, var2);
         return;
      }
   }

   public final void a(long var1) {
      super.a(var1);
   }

   final void a(String var1, int var2, long var3) {
      bo var5;
      (var5 = new bo(this, (byte)0)).a = var3;
      var5.b = 0;
      var5.a = var1;
      var5.a = var2;
      this.a.addElement(var5);
   }

   public final void a() {
      this.a = false;
   }
}
