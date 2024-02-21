import java.util.Vector;

public final class ah extends fs implements go {
   public static Vector a = new Vector();
   public static Vector b = new Vector();
   public static Vector c = new Vector();
   private fz a;
   private fz c;
   private fz d;
   private gq a;
   private gq b;
   public ft a;
   private int a = -1;
   private int b = -1;
   private int c = -1;
   private gq c;

   public ah() {
      super(true);
      this.c = "MESSAGE";
      this.n = j.e;
      this.c = new gq(100, c.a(275), this);
      this.l = this.c;
   }

   public final void a(int var1, boolean var2) {
      super.a(var1, var2);
      ah var8 = this;
      int var9 = a.size();
      int var3 = b.size();
      int var4 = c.size();
      byte var5 = -1;
      this.a = new ft(0, 0, this.b.t, bc.c - gg.m);
      this.a.a.m = true;
      this.b.a(this.a, false);
      if (this.a == null) {
         this.a = new fz(0, gg.l, this.b.t, bc.c - 2 * gg.l);
         this.a.j = true;
      }

      fn var6;
      if (a.isEmpty()) {
         (var6 = new fn(c.a(307))).q = 17;
         this.a.a(var6);
      } else {
         var5 = 0;
      }

      ej var7;
      int var10;
      fo var11;
      for(var10 = 0; var10 < var9; ++var10) {
         var7 = (ej)a.elementAt(var10);
         (var11 = new fo(var7, 0, 0, bc.b, gg.k)).d = new gq(3, c.a(560), var8);
         var11.c = v.c;
         var11.d = v.c;
         var11.v = var11.r;
         var8.a.a(var11, false);
      }

      if (var8.c == null) {
         var8.c = new fz(0, gg.l, var8.b.t, bc.c - 2 * gg.l);
         var8.c.j = true;
      }

      if (b.isEmpty()) {
         (var6 = new fn(c.a(307))).q = 17;
         var8.c.a(var6);
      } else if (var5 == -1) {
         var5 = 1;
      }

      for(var10 = 0; var10 < var3; ++var10) {
         var7 = (ej)b.elementAt(var10);
         (var11 = new fo(var7, 0, 0, bc.b, gg.k)).d = new gq(5, c.a(560), var8);
         var11.c = v.c;
         var11.d = v.c;
         var11.v = var11.r;
         var8.c.a(var11, false);
      }

      if (var8.d == null) {
         var8.d = new fz(0, gg.l, var8.b.t, bc.c - 2 * gg.l);
         var8.d.j = true;
      }

      if (c.isEmpty()) {
         (var6 = new fn(c.a(307))).q = 17;
         var8.d.a(var6);
      } else if (var5 == -1) {
         var5 = 2;
      }

      for(var10 = 0; var10 < var4; ++var10) {
         var7 = (ej)c.elementAt(var10);
         (var11 = new fo(var7, 0, 0, bc.b, gg.k)).d = new gq(8, c.a(560), var8);
         var11.c = v.c;
         var11.d = v.c;
         var11.v = var11.r;
         var8.d.a(var11, false);
      }

      var8.a.y = gg.p;
      var8.a.c(1);
      var8.c.y = gg.p;
      var8.c.c(1);
      var8.d.y = gg.p;
      var8.d.c(1);
      var8.a.a(c.a(159), var8.a);
      var8.a.a("Admin", var8.c);
      var8.a.a(c.a(391), var8.d);
      var8.a.a = new ai(var8);
      if (var5 != -1) {
         var8.a.b(var5);
      } else {
         var8.a.a(0);
      }
   }

   private void h() {
      ej var1;
      if (this.a.c() != -1 && this.a.c() < a.size()) {
         this.a = this.a.c();
         (var1 = (ej)a.elementAt(this.a.c())).a = true;
      } else if (this.c.c() != -1 && this.c.c() < b.size()) {
         this.b = this.c.c();
         (var1 = (ej)b.elementAt(this.c.c())).a = true;
      } else {
         if (this.d.c() == -1 || this.d.c() >= c.size()) {
            return;
         }

         this.c = this.d.c();
         (var1 = (ej)c.elementAt(this.d.c())).a = true;
         switch(var1.a) {
         case 1:
            fh.a(var1.b, (gq)null, (gq)null, j.b);
            return;
         case 5:
            fh.a(c.a(9) + " " + var1.a + " " + c.a(221), new gq(101, c.a(580), new Integer(var1.a), this), (gq)null, j.b);
            return;
         }
      }

      fh.a(var1.b, (gq)null, (gq)null, j.b);
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 0:
         switch(this.a.a()) {
         case 0:
            if (this.a >= 0 && this.a < a.size()) {
               a.removeElementAt(this.a);
               this.a.b(this.a.a(this.a));
               return;
            }
            break;
         case 1:
            if (this.b >= 0 && this.b < b.size()) {
               b.removeElementAt(this.b);
               this.c.b(this.c.a(this.b));
               return;
            }
            break;
         case 2:
            if (this.c >= 0 && this.c < c.size()) {
               c.removeElementAt(this.c);
               this.d.b(this.d.a(this.c));
            }
         }

         return;
      case 1:
         switch(this.a.a()) {
         case 0:
            a.removeAllElements();
            this.a.m();
            return;
         case 1:
            b.removeAllElements();
            this.c.m();
            return;
         case 2:
            c.removeAllElements();
            this.d.m();
         default:
            return;
         }
      case 3:
         this.h();
         return;
      case 5:
         this.h();
         return;
      case 8:
         this.h();
         return;
      case 100:
         this.a = this.a.c();
         this.b = this.c.c();
         this.c = this.d.c();
         Vector var2 = new Vector();
         this.a = new gq(0, c.a(95), this);
         this.b = new gq(1, c.a(94), this);
         var2.addElement(this.a);
         var2.addElement(this.b);
         this.a(var2, 0);
      }

   }
}
