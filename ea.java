import java.util.Vector;
import javax.microedition.lcdui.Image;

public class ea extends fs implements go {
   public ed a;
   public dt a = new dt();
   protected Vector b = new Vector();
   private Vector a = new Vector();
   private Vector c = new Vector();
   public ds a = null;
   public dz a = null;
   private int a;
   private int b;
   public aq a = new aq();
   public aq b = new aq();
   public int c;
   private boolean[] a = new boolean[4];
   private boolean f = false;
   private int d;
   private Vector f = new Vector();
   private boolean g = false;
   private gq b;
   public gq a;
   private gq c;
   public boolean a;
   private int e = 27;
   private fz a;
   public boolean b = true;
   private static String a = "";
   private static String b = "";
   public eg a;
   private boolean h = true;
   public go a;
   protected boolean c = true;
   private int f = -1000;
   private int g = -1000;
   private int h = 50;
   private int i = 0;
   private long a;

   public ea(eg var1) {
      super(true);
      this.a = var1;
      this.e = true;
      this.a = v.c();
      this.a = new fz(0, 0, bc.b, bc.c);
      this.a.l = true;
      this.a.i = true;
      this.a = bc.b;
      this.b = bc.c;
      this.b = new gq(1, c.a(419), this);
      boolean var2 = true;
      super.a = new fi(0, bc.c - 2 * gg.m, bc.b, gg.m);
      super.a.d = new gq(-2, gk.a(1), this);
      super.a.c = new gq(-3, gk.a(16), this);
      super.a.g = false;
      super.a.a = this;
      this.l = new gq(100, c.a(275), this);
      this.a = new gq(201, c.a(58), this);
      this.n = new gq(200, c.a(3), this);
      this.n.a = c.a(3);
      this.c = new gq(2, "", this);
      new gn(0, 0, bc.b, bc.c);
   }

   protected final void o() {
      if (bc.a != null && bc.a.hasPointerEvents()) {
         bc.a.setColor(10264217);
         int var1 = this.f - (this.h >> 1);
         int var2 = this.g - (this.h >> 1);
         int var3 = this.h >> 1;
         bc.a.drawArc(var1, var2, this.h, this.h, 0, 360);
         bc.a.setColor(0);
         bc.a.drawLine(var1 + var3 - 2, var2 + var3, var1 + var3 + 2, var2 + var3);
         bc.a.drawLine(var1 + var3, var2 + var3 - 2, var1 + var3, var2 + var3 + 2);
         Image var4 = v.b[2];
         if (!this.f) {
            bc.a.drawImage(var4, this.f - (var4.getWidth() >> 1), this.g - (var4.getHeight() >> 1), 0);
            return;
         }

         if (eg.a.d == 0) {
            bc.a.drawImage(var4, this.f - (var4.getWidth() >> 1), this.g - (var4.getHeight() >> 1) - var3, 0);
            return;
         }

         if (eg.a.d == 1) {
            bc.a.drawImage(var4, this.f - (var4.getWidth() >> 1), this.g - (var4.getHeight() >> 1) + var3, 0);
            return;
         }

         if (eg.a.d == 2) {
            bc.a.drawImage(var4, this.f - (var4.getWidth() >> 1) - var3, this.g - (var4.getHeight() >> 1), 0);
            return;
         }

         bc.a.drawImage(var4, this.f - (var4.getWidth() >> 1) + var3, this.g - (var4.getHeight() >> 1), 0);
      }

   }

   protected void n() {
   }

   public final void p() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = false;
      }

      this.i = 0;
   }

   public final void a(String var1) {
      eu.a(var1);
      eg.a.b(var1);
      this.s();
   }

   public final boolean a(int var1, int var2) {
      if (super.a(var1, var2)) {
         return true;
      } else {
         switch(var2) {
         case -4:
            this.a[3] = var1 == 0;
            return true;
         case -3:
            this.a[2] = var1 == 0;
            return true;
         case -2:
            this.a[1] = var1 == 0;
            return true;
         case -1:
            this.a[0] = var1 == 0;
            return true;
         default:
            return super.a(var1, var2);
         }
      }
   }

   public final void a(ds var1) {
      synchronized(this.c) {
         this.a.b(var1);
         this.c.removeElement(var1);
      }
   }

   protected void i() {
   }

   protected void j() {
   }

   public static void q() {
      if (j.a != null) {
         for(int var0 = 0; var0 < j.a.length; ++var0) {
            if (j.a.b == j.a[var0]) {
               a = j.b[var0];
               break;
            }
         }
      }

      b = String.valueOf(j.a.c);
   }

   public static void r() {
      int var0 = bc.b - 28;
      bc.a.drawImage(v.j, var0, 1, 0);
      v.c().a(bc.a, b, var0 + 12, 1, 17);
      v.d().a(bc.a, a, var0 - 5, 4, 24);
   }

   public final void a() {
      int var1 = this.a.b;
      int var2 = this.b.b;
      int var3 = this.a.a.length;
      this.a.a(var1, var2, false);
      ea var4 = this;
      int var6;
      synchronized(this.c) {
         var6 = 0;

         while(true) {
            if (var6 >= var4.c.size() - 1) {
               break;
            }

            for(int var7 = var6 + 1; var7 < var4.c.size(); ++var7) {
               dz var8 = (dz)var4.c.elementAt(var6);
               dz var9 = (dz)var4.c.elementAt(var7);
               if (var8.n > var9.n) {
                  var4.c.setElementAt(var9, var6);
                  var4.c.setElementAt(var8, var7);
               }
            }

            ++var6;
         }
      }

      int var5 = 0;
      var6 = 0;
      this.c.elementAt(0);

      gn var11;
      dz var12;
      while(var5 < var3 && var6 < this.c.size()) {
         var12 = (dz)this.c.elementAt(var6);
         if (this.a.b[var5] < var12.n) {
            dx var14;
            var11 = (var14 = this.a.a[this.a.a[var5]]).a();
            short var13 = this.a.a[var5];
            var11.a += var13;
            int var17 = this.a.b[var5] - this.a.c[var5];
            var11.b += var17;
            if (var14.f && var11.a(var1, var2, this.a, this.b)) {
               var14.a = this.a.b[var5];
               var14.c(var13 - var1, var17 - var2);
            }

            ++var5;
         } else {
            var11 = var12.a();
            if (var12.f && var11.a(var1, var2, this.a, this.b)) {
               var12.a(var1, var2);
            }

            ++var6;
         }
      }

      int var16;
      for(var16 = var5; var16 < var3; ++var16) {
         dx var15;
         var11 = (var15 = this.a.a[this.a.a[var16]]).a();
         short var18 = this.a.a[var16];
         var11.a += var18;
         var5 = this.a.b[var16] - this.a.c[var16];
         var11.b += var5;
         if (var15.f && var11.a(var1, var2, this.a, this.b)) {
            var15.a = this.a.b[var16];
            var15.c(var18 - var1, var5 - var2);
         }
      }

      for(var16 = var6; var16 < this.c.size(); ++var16) {
         var11 = (var12 = (dz)this.c.elementAt(var16)).a();
         if (var12.f && var11.a(var1, var2, this.a, this.b)) {
            var12.a(var1, var2);
         }
      }

      if (this.a != null) {
         this.a.b(var1, var2);
      }

      if (this.a != null) {
         this.a.b(var1, var2);
      }

      var16 = this.a.a.length;

      while(true) {
         --var16;
         if (var16 < 0) {
            this.j();
            return;
         }

         this.a.a[var16].a(var1, var2);
      }
   }

   public final void a(int var1, int var2) {
      if (a == null && this.a == null && !this.a) {
         super.a(var1, var2);
         this.f = var1;
         this.g = var2;
      } else {
         super.a(var1, var2);
         this.f = false;
      }
   }

   public final void a_(int var1, int var2) {
      if (a == null && this.a == null && !this.a) {
         super.a_(var1, var2);
         this.i = 0;
         int var3 = this.h >> 1;
         byte var4 = eg.a.a;
         if (var1 != this.f || var2 != this.g) {
            int var5 = (var5 = Math.abs(var1 - this.f)) > var3 ? var3 : var5;
            int var6 = (var6 = Math.abs(var2 - this.g)) > var3 ? var3 : var6;
            var5 = Math.max(var5, var6);
            this.i = var4 - var5 * var4 / var3;
            int var8 = this.g;
            var3 = this.f;
            var1 -= var3;
            var2 -= var8;
            byte var7;
            if (Math.abs(var1) > Math.abs(var2)) {
               if (var1 < 0) {
                  var7 = 2;
               } else {
                  var7 = 3;
               }
            } else if (var2 < 0) {
               var7 = 0;
            } else {
               var7 = 1;
            }

            this.d = var7;
            this.f = true;
            if (var5 < 10) {
               this.f = false;
            }
         }

      } else {
         super.a_(var1, var2);
         this.f = false;
      }
   }

   public final void c(int var1, int var2) {
      if (a == null && this.a == null && !this.a) {
         super.c(var1, var2);
         this.p();
         this.f = -1000;
         this.g = -1000;
         this.f = false;
      } else {
         super.c(var1, var2);
      }
   }

   public void h_() {
      int var1 = eg.a.a.c;
      this.a = var1 < bc.b ? var1 : bc.b;
      var1 = eg.a.a.d;
      this.b = var1 < bc.c ? var1 : bc.c;
      ds var16;
      int var2 = (var16 = eg.a).c;
      long var5 = System.currentTimeMillis();
      long var12 = var5;
      ea var3 = this;

      int var15;
      for(var15 = 0; var15 < var3.a.a(); ++var15) {
         ds var14;
         if ((var14 = var3.a.b(var15)) != eg.a) {
            var14.a(var12);
         }
      }

      for(int var7 = 0; var7 < var3.a.size(); ++var7) {
         ((dz)var3.a.elementAt(var7)).a(var12);
      }

      int var19 = this.d;
      if (!this.f) {
         var19 = -1;
      }

      boolean var4 = false;
      if ((this.a[0] || var19 == 0) && this.b) {
         this.a(0);
         var4 = true;
         if (eg.a.a()) {
            this.b(0);
         } else {
            this.b(1);
         }
      } else if ((this.a[1] || var19 == 1) && this.b) {
         this.a(1);
         var4 = true;
         if (eg.a.a()) {
            this.b(0);
         } else {
            this.b(1);
         }
      } else if ((this.a[2] || var19 == 2) && this.b) {
         this.a(2);
         var4 = true;
         this.b(0);
      } else if ((this.a[3] || var19 == 3) && this.b) {
         this.a(3);
         var4 = true;
         this.b(1);
      }

      var3 = this;
      this.a = null;
      int var24 = 1000000000;
      int var13 = eg.a.a() ? eg.a.m - 5 : eg.a.m + 5;
      int var26 = -1;

      for(int var8 = 0; var8 < var3.a.a(); ++var8) {
         ds var20;
         if ((var20 = var3.a.b(var8)) != eg.a && var20.h) {
            if (var20.e) {
               if (eg.a.a.a(var20.a)) {
                  var3.a = var20;
               }
            } else if ((var15 = (var20.m - var13) * (var20.m - var13) + (var20.n - eg.a.n) * (var20.n - eg.a.n)) < var24) {
               var24 = var15;
               var26 = var8;
            }
         }
      }

      if (var24 <= 1225 && var26 >= 0 && var26 < var3.a.a()) {
         var3.a = var3.a.b(var26);
      } else {
         var3.a = null;
      }

      if (var3.a == null) {
         for(int var9 = 0; var9 < var3.a.size(); ++var9) {
            dz var21;
            if ((var21 = (dz)var3.a.elementAt(var9)).h && var21.a != null && eg.a.a.a(var21.a)) {
               var3.a = var21;
               break;
            }
         }
      }

      if (var3.a != null && var3.a != null) {
         var3.m = var3.b;
      } else if (var3.a != null) {
         var3.m = var3.a.a;
      } else if (var3.a != null) {
         var3.m = var3.a.a;
      } else {
         var3.m = var3.c;
      }

      if (var4) {
         var3 = this;

         for(var13 = 0; var13 < var3.a.size(); ++var13) {
            dz var25 = (dz)var3.a.elementAt(var13);
            if (eg.a.a.a(var25.a)) {
               if (var25.g && !var25.i) {
                  gq[] var27;
                  (var27 = new gq[1])[0] = var25.a;
                  var3.p();
                  var25.a.a.a(var27);
                  var25.i = true;
                  break;
               }
            } else if (var25.g) {
               var25.i = false;
            }
         }

         if (var16.d) {
            var16.d = false;
            bf.a(false);
            ((bq)var16).a.a();
         }
      } else {
         var16.b(-1L);
         if (var16.a()) {
            this.b(0);
         } else {
            this.b(1);
         }
      }

      if (var4) {
         if (var2 == 0 && !this.g) {
            this.h();
         } else if (this.g) {
            if (var5 - this.a >= 2000L) {
               this.m();
               this.h();
            } else {
               gm var22 = new gm(eg.a.m, eg.a.n, 0);
               if (this.f.size() >= 2) {
                  gm var23 = (gm)this.f.elementAt(this.f.size() - 2);
                  gm var17 = (gm)this.f.elementAt(this.f.size() - 1);
                  if (au.a(var23, var17, var22)) {
                     this.f.removeElement(var17);
                  }
               }

               this.f.addElement(var22);
            }
         }
      } else if (this.g && var5 - this.a > 2000L) {
         this.m();
      }

      var16.a(var5);
      this.a.a();
      this.b.a();

      for(var1 = 0; var1 < this.b.size(); ++var1) {
         eb var18;
         if ((var18 = (eb)this.b.elementAt(var1)).a) {
            this.b.removeElement(var18);
         } else {
            var18.a();
         }
      }

      super.h_();
   }

   private void h() {
      this.a = System.currentTimeMillis();
      this.g = true;
      this.f.removeAllElements();
   }

   private void m() {
      this.g = false;
      this.f.addElement(new gm(eg.a.m, eg.a.n, 0));
      if (!this.f.isEmpty()) {
         int[] var1 = new int[this.f.size() << 1];

         for(int var2 = 0; var2 < this.f.size(); ++var2) {
            gm var3 = (gm)this.f.elementAt(var2);
            var1[var2 << 1] = var3.a;
            var1[(var2 << 1) + 1] = var3.b;
         }

         byte var4 = (byte)(eg.a.a() ? 0 : 1);
         eu.a(this.c, eg.a.a, var4, var1);
      }
   }

   public final void a(ed var1) {
      this.a = var1;
      this.a.removeAllElements();

      int var2;
      for(var2 = 0; var2 < this.c.size(); ++var2) {
         if (this.c.elementAt(var2) instanceof at) {
            this.c.removeElementAt(var2);
            --var2;
         }
      }

      if (var1.a != null) {
         for(var2 = 0; var2 < var1.a.length; ++var2) {
            this.a((dz)var1.a[var2]);
         }
      }

   }

   public final void a(dz var1) {
      this.a.addElement(var1);
   }

   public final void b(dz var1) {
      this.a.removeElement(var1);
      synchronized(this.c) {
         this.c.removeElement(var1);
      }
   }

   public final void a(ds var1, int var2, int var3, boolean var4) {
      this.a.a(var1);
      if (var4) {
         this.b(1);
      } else {
         var1.a = true;
      }

      var1.m = var2;
      var1.n = var3;
      this.c(var1);
      var1.f = true;
   }

   public final void c(dz var1) {
      this.c.addElement(var1);
   }

   private int a(int var1, boolean var2) {
      int var3 = var1;
      if (var2) {
         if (var1 < 0) {
            var3 = 0;
         } else if (var1 > this.a.c - this.a) {
            var3 = this.a.c - this.a;
         }
      } else if (var1 < 0) {
         var3 = 0;
      } else if (var1 > this.a.d - this.b) {
         var3 = this.a.d - this.b;
      }

      return var3;
   }

   protected final void b(int var1) {
      int var2 = 0;
      int var3 = 0;
      switch(var1) {
      case 0:
         var2 = eg.a.m - (this.a / 3 << 1);
         var3 = eg.a.n - (this.b / 3 << 1);
         break;
      case 1:
         var2 = eg.a.m - this.a / 3;
         var3 = eg.a.n - (this.b / 3 << 1);
      }

      var2 = this.a(var2, true);
      var3 = this.a(var3, false);
      this.a.a = var2;
      this.b.a = var3;
   }

   public void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 0:
         eu.e();
         return;
      case 1:
         ff[] var3;
         (var3 = new ff[2])[0] = new ff(c.a(419) + " " + this.a.d);
         var3[0].d = new gq(101, c.a(419), this);
         var3[1] = new ff(c.a(419) + " " + this.a.d);
         var3[1].d = new gq(102, c.a(419), this);
         eg var10000 = this.a;
         eg.a(eg.a, var3);
         return;
      case 2:
         if (!this.a) {
            this.k();
            this.a = true;
            return;
         }
         break;
      case 15:
         j.j();
         return;
      case 23:
         return;
      case 51:
         j.e_();
         eu.g();
         return;
      case 66:
         this.s();
         return;
      case 85:
         return;
      case 100:
         this.i();
         return;
      case 101:
         if (this.a != null && this.a.a != null) {
            this.a.a.a(new Object[]{this.a.a, this.a});
            return;
         }
         break;
      case 102:
         this.a.a.a(new Object[]{this.a.a, this.a});
         return;
      case 200:
         this.n();
         return;
      case 201:
         if (this.a != null && a == null && this.a == null) {
            this.b(this.a);
            this.a.l();
            this.a.g = true;
         }

         return;
      case 202:
         (new ah()).a(1, true);
         return;
      case 10000:
         j.c();
         return;
      default:
         super.a(var1);
      }

   }

   public final void s() {
      if (this.a) {
         if (bc.a.hasPointerEvents()) {
            this.n = new gq(200, c.a(3), this);
         } else {
            this.n = new gq(200, c.a(3), this);
            this.n.a = c.a(3);
         }

         this.b.b(this.a);
         this.a.m();
      }

      this.a = false;
   }

   protected final void a(ec[] var1) {
      if (this.h) {
         this.n = new gq(66, c.a(64), this);
         int var2 = var1.length * 28 + (var1.length + 1) * 3;
         int var3 = 3;
         int var4 = 3;

         int var5;
         for(var5 = 0; var5 < var1.length; ++var5) {
            if (var2 >= bc.b - 10 && var5 < var1.length / 2) {
               var3 += 31;
            } else {
               var4 += 31;
            }
         }

         var5 = eg.a.m - this.a.b;
         var2 = eg.a.n - this.b.b;
         int var6 = bc.b - var3 >> 1;
         var4 = bc.b - var4 >> 1;
         int var7;
         int var8 = (var7 = bc.c - gg.m - this.e - 5 - 28 - 3) + 28 + 3;

         for(int var9 = 0; var9 < var1.length; ++var9) {
            var1[var9].r = var5;
            var1[var9].s = var2;
            if (var3 > 3 && var9 < var1.length / 2) {
               var1[var9].v = var6;
               var6 += 31;
               var1[var9].w = var7;
            } else {
               var1[var9].v = var4;
               var4 += 31;
               var1[var9].w = var8;
            }

            var1[var9].b(var9 == 0);
            this.a.a(var1[var9]);
         }

         this.a.b(true);
         this.b.a(this.a);
         this.a = true;
      }
   }

   private void a(int var1) {
      ds var2 = eg.a;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      switch(var1) {
      case 0:
         var3 = var2.m;
         var4 = var2.n - var2.a + this.i;
         var5 = 0;
         break;
      case 1:
         var3 = var2.m;
         var4 = var2.n + var2.a - this.i;
         var5 = 0;
         break;
      case 2:
         var3 = var2.m - var2.a + this.i;
         var4 = var2.n;
         var5 = var2.o;
         break;
      case 3:
         var3 = var2.m + var2.a - this.i;
         var4 = var2.n;
         var5 = var2.o + var2.a.a.a;
      }

      if (this.a.a(var3 + var5, var4 + var2.p)) {
         var2.c(var3, var4);
      }

   }

   public final void a(fh var1) {
      super.a(var1);
      this.p();
   }

   public final void f() {
      super.f();
      this.p();
   }

   public void k() {
   }

   public void l() {
   }

   public final void a(boolean var1) {
      this.c = false;
   }

   public final void b(boolean var1) {
      this.h = false;
   }
}
