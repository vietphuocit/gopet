import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public class ds extends dz {
   public boolean a;
   public int a;
   public String a;
   public String b;
   protected int b;
   public String c = "";
   public boolean b = true;
   public int c;
   private long b;
   private long c;
   private int g;
   private int h;
   private Vector a = new Vector();
   public byte a;
   public int d;
   public int e;
   public byte b = -1;
   private static Image a;
   private int i;
   public boolean c = false;
   private boolean j;
   public byte c;
   public eg a;
   public boolean d;
   private int j;
   public boolean e = false;
   public int f = 16777215;
   private String e;
   private byte d;
   private int k;
   private byte e;
   long a;
   as a;

   public ds(int var1, byte var2, eg var3) {
      this.a = var3;
      this.a = var1;
      this.c = var2;
      this.a = 4;
      this.a((gn)(new gn(-8, -5, 16, 5)));
      if (a == null) {
         a = gi.a("/common.dat", 10);
      }

      this.m = 0;
      this.n = 0;
      this.g = -100;
      this.h = -100;
      this.b(-1L);
      this.j = 0 - v.i.getHeight() - 74 + 5;
      Random var4 = new Random(System.currentTimeMillis());
      this.k = var4.nextInt() % 1000;
   }

   public final void a(String var1) {
      this.c = var1;
      if ("".equals(var1)) {
         this.b = true;
      } else {
         this.b = false;
      }
   }

   public void a(long var1) {
      super.a(var1);
      if (this.a != null && var1 - this.a > 5000L) {
         this.a = null;
      }

      this.j = false;
      dr var2;
      switch(this.c) {
      case 0:
         if (this.a && this.c != -1L && var1 - this.b >= this.c) {
            if ((var2 = this.a()) != null) {
               this.a(var2);
            }

            return;
         }
         break;
      case 1:
         this.j = true;
         if ((this.g != -100 || this.h != -100) && (this.m != this.g || this.n != this.h)) {
            if (au.a(this.g - this.m) > au.a(this.h - this.n)) {
               if (this.g > this.m) {
                  this.m += this.a;
               } else {
                  this.m -= this.a;
               }

               if (this.g != this.m) {
                  if (this.g > this.m) {
                     this.n += this.a * (this.h - this.n) / (this.g - this.m);
                  } else {
                     this.n += this.a * (this.n - this.h) / (this.g - this.m);
                  }
               }
            } else {
               if (this.h > this.n) {
                  this.n += this.a;
               } else {
                  this.n -= this.a;
               }

               if (this.h != this.n) {
                  if (this.h > this.n) {
                     this.m += this.a * (this.g - this.m) / (this.h - this.n);
                  } else {
                     this.m += this.a * (this.m - this.g) / (this.h - this.n);
                  }
               }
            }

            this.i = (this.i + 1) % 100;
            if (au.a(this.h - this.n) <= this.a && au.a(this.g - this.m) <= this.a) {
               this.m = this.g;
               this.n = this.h;
               this.g = -100;
               this.h = -100;
               if (this.a) {
                  if ((var2 = this.a()) != null) {
                     this.a(var2);
                  }

                  return;
               }
            }
         } else if (this.a && (var2 = this.a()) != null) {
            this.a(var2);
         }
      }

   }

   public void a(int var1, int var2) {
      if (this.f) {
         Image var3;
         int var4;
         int var5;
         if (this.e != null && !"".equals(this.e) && (var3 = br.a.a(this.e)) != null) {
            var5 = (au.a(bc.a + this.k) >> 3) % 2;
            var4 = var3.getWidth() >> 1;
            bc.a.drawRegion(var3, var4 * var5, 0, var4, var3.getHeight(), 0, this.m - var1 - var4, this.n - var2 - 74 + this.d, 0);
            bc.a.drawRegion(var3, var4 * var5, 0, var4, var3.getHeight(), 2, this.m - var1, this.n - var2 - 74 + this.d, 0);
         }

         if (this.b) {
            du.a((Vector)null, (byte)(this.c == 0 ? 1 : 0), this.m - var1, this.n - var2, this.e == 1 ? 1 : -1, this.j, this.k, 0);
         } else if ((var3 = br.a.b(this.c)) == null) {
            du.a((Vector)null, (byte)(this.c == 0 ? 1 : 0), this.m - var1, this.n - var2, this.e == 1 ? 1 : -1, this.j, this.k, 0);
         } else {
            bc.a.drawImage(du.a, this.m - var1, this.n - var2 - 74 + 68, 17);
            byte var10001 = this.c;
            du.a(var3, this.m - var1, this.n - var2, this.e, this.j);
         }

         if (au.a(this.b, 0)) {
            bc.a.drawImage(a, this.m - var1 - 10 - (this.b >> 1), this.n - 74 - var2 + 5, 0);
         }

         fl var6;
         if (au.a(this.b, 1)) {
            var6 = v.a();
         } else if (this.f == 16777215) {
            var6 = v.d();
         } else {
            var6 = v.a(this.f);
         }

         var4 = au.a(this.b, 2) ? 1 : 0;
         var5 = this.n - 74 + 3 - var2;
         var6.a(bc.a, this.b, this.m - var1 - (this.b >> 1), var5, 0, var4);
         if (this.a != null && !"".equals(this.a)) {
            var5 -= v.d().a() + 2;
            v.d().a(bc.a, this.a, this.m - var1, var5, 17, 1);
         }

         if (this.e != 0) {
            var5 -= v.d().a() + 2;
            v.d().a(bc.a, "PK " + this.e, this.m - var1, var5, 17, 1);
         }

         if (this.a != null) {
            this.d(var1, var2 + 10);
         }

      }
   }

   public final void c(int var1, int var2) {
      this.j = true;
      this.g = var1;
      this.h = var2;
      var1 -= this.m;
      var2 -= this.n;
      if (var1 > 0) {
         this.d = 3;
      } else if (var1 < 0) {
         this.d = 2;
      } else if (var2 < 0) {
         this.d = 0;
      } else {
         this.d = 1;
      }

      byte var3;
      if (this.d == 3) {
         var3 = 1;
      } else if (this.d == 2) {
         var3 = 0;
      } else {
         var3 = (byte)(this.a() ? 0 : 1);
      }

      if (this.c != 1 || this.d == 3 && this.a() || this.d == 2 && !this.a()) {
         this.e = var3;
      }

      this.c = 1;
   }

   final boolean a() {
      return this.e == 0;
   }

   public final void b(long var1) {
      this.c = var1;
      this.b = System.currentTimeMillis();
      this.c = 0;
      this.e = (byte)(this.a() ? 0 : 1);
   }

   public void b(int var1, int var2) {
      if (this.f) {
         bc.a.drawImage(v.i, this.m - var1, -var2 + this.n - this.q + this.j, 17);
      }
   }

   public final void b(String var1) {
      this.a = System.currentTimeMillis();
      if (this.a == null) {
         this.a = new as();
      }

      this.a.a(var1);
   }

   protected void d(int var1, int var2) {
      this.a.a(bc.a, this.m - var1, -var2 + this.n - 54 - 8);
   }

   private dr a() {
      synchronized(this.a) {
         if (this.a.isEmpty()) {
            return null;
         } else {
            dr var2 = (dr)this.a.firstElement();
            this.a.removeElementAt(0);
            return var2;
         }
      }
   }

   private void a(dr var1) {
      switch(var1.a) {
      case 0:
         this.b(var1.a);
         return;
      case 1:
         this.c(var1.a, var1.b);
      default:
      }
   }

   public final void a(byte var1, int[] var2) {
      synchronized(this.a) {
         int var3;
         dr var4;
         if (!this.a.isEmpty()) {
            var3 = 0;

            while(var3 < this.a.size()) {
               if ((var4 = (dr)this.a.elementAt(var3)).a == 0) {
                  this.a.removeElement(var4);
               } else {
                  ++var3;
               }
            }
         }

         for(var3 = 0; var3 < var2.length >> 1; ++var3) {
            (var4 = new dr((byte)1)).a = var2[var3 << 1];
            var4.b = var2[(var3 << 1) + 1];
            this.a.addElement(var4);
         }

         dr var6;
         (var6 = new dr((byte)0)).a = -1L;
         this.a.addElement(var6);
         if (this.c == 0 && (var4 = this.a()) != null) {
            this.a(var4);
         }

      }
   }

   public final void c(String var1) {
      this.d = var1;
      this.b = var1.toUpperCase();
      this.b = v.d().a(this.b);
   }

   public void a(ea var1) {
   }

   public final void a(String var1, byte var2) {
      this.e = var1;
      this.d = var2;
   }

   public final void a(byte var1) {
      this.e = var1;
   }
}
