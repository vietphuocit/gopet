import javax.microedition.lcdui.Image;

public class dz {
   public boolean f = true;
   public String d;
   public gq a;
   public int m;
   public int n;
   public int o;
   public int p;
   public gn a = new gn(0, 0, 0, 0);
   public boolean g = false;
   public int q = 1;
   private int a = 1;
   private long a = System.currentTimeMillis();
   public boolean h = true;
   public Image b;
   public boolean i;

   public final void a(gn var1) {
      this.o = var1.a;
      this.p = var1.b;
      this.a.a.a = var1.a.a;
      this.a.a.b = var1.a.b;
   }

   public void a(int var1, int var2) {
   }

   public void a(long var1) {
      this.a.a = this.o + this.m;
      this.a.b = this.p + this.n;
      if (var1 - this.a > 50L) {
         this.a = var1;
         this.q += this.a;
         if (this.q < 0 || this.q > 1) {
            this.a = -this.a;
         }
      }

   }

   public void b(int var1, int var2) {
      bc.a.drawImage(v.i, this.m - var1, -var2 + this.n - v.i.getHeight() - this.q, 17);
   }

   public gn a() {
      return this.a;
   }
}
