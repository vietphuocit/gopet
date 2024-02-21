import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class ee extends ds implements go {
   private int i;
   private String[] a;
   private int j;
   public int g = 128;
   private Vector a = new Vector();
   private Vector b = new Vector();
   private fh a;
   private boolean k = false;
   public int h = 1;
   public String e;
   private as b;
   public boolean j;
   private long b;
   private long c;
   private long d;
   private boolean l;
   private boolean m;
   private boolean n;

   public ee(int var1, eg var2) {
      super(var1, (byte)0, var2);
      this.a = true;
      this.d = "NPC";
      this.a = new gq(0, c.a(419), this);
      this.a = new fq(c.a(363), (gq)null, new gq(1, c.a(41), this), (gq)null, 2);
      this.d = 3;
      var1 = au.b(5);
      this.d = (long)(var1 * 1000 + 3000);
   }

   public final void a(String var1, y var2) {
      this.a.addElement(var1);
      this.b.addElement(var2);
      var2.d = new gq(3, c.a(337), this);
   }

   public final void a(String[] var1, int var2) {
      this.i = var2;
      this.a = var1;
      this.a = System.currentTimeMillis();
      if (this.b == null) {
         this.b = new as();
      }

      this.a = this.b;
      this.j = 0;
      this.a.a(var1[this.j]);
   }

   public final void a(int var1, int var2) {
      if (this.b != null) {
         bc.a.drawImage(v.k, this.m - 13 - var1, this.n - 6 - var2, 0);
         int var6 = this.d == 2 ? 2 : 0;
         if (this.l) {
            int var7 = this.b.getHeight() - (this.b.getHeight() >> 2);
            bc.a.drawRegion(this.b, 0, 0, this.b.getWidth(), var7, var6, this.m - var1, this.n - this.g - var2 + 1, 17);
            bc.a.drawRegion(this.b, 0, var7, this.b.getWidth(), this.b.getHeight() - var7, var6, this.m - var1, this.n - this.g - var2 + var7, 17);
         } else if (var6 == 0) {
            bc.a.drawImage(this.b, this.m - var1, this.n - this.g - var2, 17);
         } else {
            bc.a.drawRegion(this.b, 0, 0, this.b.getWidth(), this.b.getHeight(), 2, this.m - var1, this.n - this.g - var2, 17);
         }

         if (this.j) {
            v.d().a(bc.a, this.b, this.m - var1 - (this.b >> 1), this.n - this.g - var2 - 8, 0);
         }

         this.d(var1, var2);
      } else {
         if (this.e != null) {
            this.b = v.a(this.e, (byte)2);
            if (this.b != null) {
               Image var4 = this.b;
               this.b = var4;
               var4.getWidth();
               int var10000 = this.h;
               this.g = var4.getHeight();
            }
         }

      }
   }

   public final void b(int var1, int var2) {
      if (this.b == null) {
         var2 -= 3;
      } else {
         var2 = var2 + this.g - 3;
      }

      bc.a.drawImage(v.i, this.m - var1, -var2 + this.n - v.i.getHeight() - this.q, 17);
   }

   protected final void d(int var1, int var2) {
      if (this.a != null) {
         this.a.a(bc.a, this.m - var1, -var2 + this.n - this.g - 9);
      }

   }

   public final void a(Object var1) {
      gq var2;
      if ((var2 = (gq)((Object[])var1)[0]).a >= 100) {
         this.a.a(true);
         eu.a(this.a, var2.a - 100);
      } else {
         switch(var2.a) {
         case 0:
            this.a.a(true);
            eu.d(this.a);
            return;
         case 1:
            this.a.b_();
            return;
         case 3:
            this.a();
            return;
         case 4:
            ((y)var2.a).a(true);
         case 2:
         default:
         }
      }
   }

   public final void a(String[] var1, int[] var2) {
      bc.a.w();
      ff[] var3 = new ff[var1.length];

      for(int var4 = 0; var4 < var1.length; ++var4) {
         ff var5 = new ff(new gq(var2[var4] + 100, var1[var4], this));
         var3[var4] = var5;
      }

      eg var10000 = this.a;
      eg.a(this, var3);
   }

   public final void a() {
      bc.a.w();
      if (!this.b.isEmpty()) {
         ff[] var1 = new ff[this.b.size()];

         for(int var2 = 0; var2 < this.b.size(); ++var2) {
            y var3 = (y)this.b.elementAt(var2);
            String var4 = (String)this.a.elementAt(var2);
            ff var5 = new ff(new gq(4, var4, var3, this));
            var1[var2] = var5;
         }

         eg var10000 = this.a;
         eg.a(this, var1);
      }
   }

   public final void b() {
      this.b.removeAllElements();
      this.a.removeAllElements();
   }

   public final void a(long var1) {
      super.a(var1);
      if (this.j) {
         if (this.a != null) {
            if (this.a != null) {
               if (var1 - this.a > 5000L) {
                  this.a = null;
                  this.a = var1;
               }
            } else if (var1 - this.a > (long)(this.i * 1000)) {
               this.j = (this.j + 1) % this.a.length;
               this.a = this.b;
               this.a.a(this.a[this.j]);
               this.a = var1;
            }
         }

         if (this.m && var1 - this.b > 400L) {
            this.b = var1;
            this.l = !this.l;
         }

         if (this.n && var1 - this.c > this.d) {
            this.c = var1;
            if (this.d == 2) {
               this.d = 3;
            } else {
               this.d = 2;
            }

            int var8 = au.b(5);
            this.d = (long)(var8 * 1000 + 3000);
         }
      }

   }

   public final void b(byte var1) {
      switch(var1) {
      case 0:
         this.n = false;
         this.m = false;
         break;
      case 1:
         this.n = false;
         this.m = true;
         break;
      case 2:
         this.n = true;
         this.m = false;
         break;
      case 3:
         this.n = true;
         this.m = true;
      }

      this.j = var1 != 0;
   }
}
