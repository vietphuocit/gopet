import java.util.Stack;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class fs implements go {
   public boolean d;
   public Stack a;
   public String c;
   public gq l;
   public gq m;
   public gq n;
   private fy b;
   private fy c;
   private fy d;
   public static Image b;
   public fi a;
   public fp a;
   protected fz b;
   public boolean e;
   public fl a;
   public fy a;
   public static fh a;
   public static Vector d = new Vector();
   public static fn a;
   public static Vector e = new Vector();
   private boolean a;
   public String d;

   public fs() {
      this(false);
   }

   public fs(boolean var1) {
      this.d = false;
      this.a = new Stack();
      this.e = false;
      this.a = false;
      if (var1) {
         this.b = new fz(0, 0, bc.b, bc.c);
         this.a = true;
         h();
         this.b = new fy();
         this.b.a(0, bc.c - gg.m, bc.b / 3, gg.m);
         this.c = new fy();
         this.c.a(bc.b / 3, bc.c - gg.m, bc.b / 3, gg.m);
         this.d = new fy();
         this.d.a((bc.b << 1) / 3, bc.c - gg.m, bc.b / 3, gg.m);
         this.b.d = new gq(0, "", this);
         this.c.d = new gq(1, "", this);
         this.d.d = new gq(2, "", this);
         this.b.h = false;
         this.c.h = false;
         this.d.h = false;
      }

      this.a = gj.a;
   }

   public final void t() {
      int var1;
      for(var1 = 0; var1 < d.size(); ++var1) {
         fh var2;
         (var2 = (fh)d.elementAt(var1)).e();
         if (var2.b) {
            d.removeElement(var2);
            if (d.isEmpty()) {
               a = null;
               if (this.b != null) {
                  this.b.a().l();
               }
            } else {
               (a = (fh)d.lastElement()).a().l();
            }
         }
      }

      if (a != null) {
         a.e();
      }

      var1 = 0;

      while(var1 < e.size()) {
         gh var3;
         if ((var3 = (gh)e.elementAt(var1)) != null && var3.a) {
            var3.a(System.currentTimeMillis());
         }

         if (var3.a) {
            ++var1;
         } else {
            e.removeElement(var3);
         }
      }

   }

   public void f_() {
      if (this.b != null) {
         this.b.t = bc.b;
         this.b.u = bc.c;
         if (this.a) {
            this.b.t = this.c.t = this.d.t = bc.f;
            this.b.u = this.c.u = this.d.u = bc.f;
            this.c.r = bc.f;
            this.d.r = bc.g;
            this.b.s = this.c.s = this.d.s = bc.c - gg.m;
         }
      }

      b = null;
      h();
   }

   public final void d(int var1) {
      this.a(var1, false);
   }

   public void a(int var1, boolean var2) {
      if (bc.a() != this) {
         switch(var1) {
         case -1:
            if (this.b != null) {
               this.b.r = -bc.b;
            }
            break;
         case 1:
            this.b.r = bc.b;
         }

         if (var2 && (this.a.empty() || this.a.peek() != bc.a() || ((fs)this.a.peek()).c.equals(bc.a().c))) {
            if (bc.a().a != null) {
               bc.a().u();
            }

            this.a.push(bc.a());
         }
      }

      gf.a();
      bc.a(this);
      if (!d.isEmpty()) {
         var1 = d.size();

         while(true) {
            --var1;
            if (var1 < 0) {
               break;
            }

            if (!((fh)d.elementAt(var1)).c) {
               b((fh)d.elementAt(var1));
               ((fh)d.elementAt(var1)).b = true;
            }
         }
      }

   }

   public final void a(fs var1) {
      if (!this.a.empty()) {
         fs var10000 = (fs)this.a.pop();
         byte var2 = -1;
         var10000.a(var2, false);
      }

   }

   private static void h() {
      if (b == null) {
         Graphics var0 = (b = Image.createImage(bc.b, gg.n)).getGraphics();
         gf.a = false;
         gf.a(var0, gg.b, gg.a, 0, 0, bc.b, gg.n, 0, -10, bc.b, 10 + gg.n);
         gf.a = true;
         var0.setColor(0);
         var0.drawLine(0, 0, bc.b, 0);
         var0.setColor(gg.c);
         var0.drawLine(0, 1, bc.b, 1);
      }

   }

   public void g_() {
      bc.a.translate(-bc.a.getTranslateX(), -bc.a.getTranslateY());
      bc.a.setClip(0, 0, bc.b, bc.c);
      this.a();
      this.d();
      if (this.d != null) {
         gg.a(this.d);
      }

      if (a != null) {
         a.f();
      }

      if (this.a) {
         gg.a(this);
      }

      for(int var1 = 0; var1 < e.size(); ++var1) {
         gh var2;
         if ((var2 = (gh)e.elementAt(var1)) != null && var2.a) {
            if (var2.b) {
               bc.a.setClip(0, 0, bc.b, bc.c);
            } else {
               bc.a.setClip(0, 0, bc.b, bc.c - gg.m);
            }

            var2.b();
         }
      }

      bc.a.setClip(0, 0, bc.b, bc.c);
   }

   public void d() {
      if (this.b != null) {
         this.b.f();
      }

      if (!d.isEmpty()) {
         int var1 = d.size();

         for(int var2 = 0; var2 < var1; ++var2) {
            if (var2 < d.size()) {
               ((fh)d.elementAt(var2)).f();
            }
         }
      }

      if (this.a != null) {
         this.a.f();
      }

   }

   public void h_() {
      if (this.b != null) {
         this.b.e();
      }

   }

   public boolean a(int var1, int var2) {
      if (a != null && a.d != null && var2 == (Integer)a.d.a) {
         if (var1 == 1) {
            a.d.a(new gq[]{a.d});
         }

         return true;
      } else if (var1 == 1 && var2 == -5 && this.a == null) {
         this.b(this.a());
         return true;
      } else if (var2 == -6) {
         if (var1 == 0) {
            this.a(this.a());
         }

         return true;
      } else if (var2 == -7) {
         if (var1 == 0) {
            this.c(this.a());
         }

         return true;
      } else {
         fz var3;
         return (var3 = this.a()) != null ? var3.a(var1, var2) : false;
      }
   }

   public void a() {
      bc.a.setColor(gg.a);
      bc.a.fillRect(0, 0, bc.b, bc.c);
   }

   public final void g(String var1) {
      this.d = var1;
   }

   public void a(int var1, int var2) {
      if (this.b != null && this.b.e(var1, var2)) {
         this.b.k = true;
      } else if (this.c != null && this.c.e(var1, var2)) {
         this.c.k = true;
      } else if (this.d != null && this.d.e(var1, var2)) {
         this.d.k = true;
      } else {
         fz var3;
         if ((var3 = this.a()) != null) {
            var3.b(var1, var2);
            if (this.a != null && !this.a.e(var1, var2)) {
               fp var10000 = this.a;
               fp.k_();
            }
         }

      }
   }

   public void a_(int var1, int var2) {
      if (this.a == null) {
         fy var3 = null;
         if (a != null) {
            var3 = a.a(true);
         } else if (this.a != null) {
            var3 = this.a.a(true);
         } else if (this.b != null) {
            var3 = this.b.a(true);
         }

         if (var3 != null) {
            var3.d(var1, var2);
         }

      } else {
         this.a.d(var1, var2);
      }
   }

   public void c(int var1, int var2) {
      if (this.b != null && this.b.k && this.b.e(var1, var2)) {
         this.b.k = false;
         this.a(this.a());
      } else if (this.c != null && this.c.k && this.c.e(var1, var2)) {
         this.b(this.a());
      } else if (this.d != null && this.d.k && this.d.e(var1, var2)) {
         this.d.k = false;
         this.c(this.a());
      } else if (this.a != null) {
         this.a.c(var1, var2);
         this.a = null;
      } else {
         this.a().a(true).c(var1, var2);
      }
   }

   private void a(fz var1) {
      if (var1 != null) {
         fy var2;
         if ((var2 = var1.a(true)) != null) {
            var2.k = false;
            gq var3;
            if ((var3 = var2.a()) != null) {
               var3.a(new Object[]{var3, var2});
               return;
            }
         } else if (var1.c != null) {
            var1.c.a(new Object[]{var1.c, var1});
            return;
         }
      }

      if (a == null && this.a == null && this.l != null) {
         this.l.a(new Object[]{this.l, this.b});
      }

   }

   private void b(fz var1) {
      if (var1 != null) {
         fy var2;
         if ((var2 = var1.a(true)) != null) {
            var2.k = false;
            gq var3;
            if ((var3 = var2.c()) != null) {
               if (this.a != null) {
                  System.out.println(this.toString() + "Hide menu khi focus");
                  this.u();
               }

               var3.a(new Object[]{var3, var2});
               return;
            }
         } else if (var1.d != null) {
            if (this.a != null) {
               this.u();
            }

            var1.d.a(new Object[]{var1.d, var1});
            return;
         }
      }

      if (a == null && this.m != null) {
         this.m.a(new Object[]{this.m, this.c});
      }

   }

   private void c(fz var1) {
      if (var1 != null) {
         fy var2;
         if ((var2 = var1.a(true)) != null) {
            var2.k = false;
            gq var3;
            if ((var3 = var2.b()) != null) {
               var3.a(new Object[]{var3, var2});
               return;
            }
         } else if (var1.e != null) {
            var1.e.a(new Object[]{var1.e, var1});
            return;
         }
      }

      if (a == null && this.n != null) {
         this.n.a(new Object[]{this.n, this.d});
      }

   }

   public final void a(Vector var1, int var2) {
      if (var1 != null && !var1.isEmpty()) {
         if (this.a == null) {
            this.a = new fp();
            this.a.a = this.b.a(true);
            this.a.a(var1, var2);
            this.b.a(this.a);
            this.a.l();
         } else {
            this.a.a(var1, var2);
            this.a.a = true;
         }
      }
   }

   public final void u() {
      this.b.b(this.a);
      if (this.a != null && this.a.a != null && this.a.a.g && a == null) {
         this.a.a.l();
      }

      this.a = null;
   }

   private void e(fy var1) {
      label20:
      while(true) {
         for(fy var2 = var1.b; var2 != null; var2 = var2.b) {
            if (var2.c()) {
               if (var2 instanceof fz) {
                  ((fz)var2).d(var1);
               }

               var1 = var2;
               this = this;
               continue label20;
            }

            var1 = var2;
         }

         return;
      }
   }

   public final void a(fy var1) {
      if (var1 != null) {
         Object var10000 = a == null ? this.b : a;
         Object var2 = var10000;
         if (var10000 != null) {
            fy var3;
            if ((var3 = ((fz)var2).a(true)) != var2) {
               var3.c(false);
            }

            if (var1 != null) {
               var1.c(true);
               fy var4 = var1;

               for(fy var5 = var1.b; var5 != null; var5 = var5.b) {
                  if (var5 instanceof fz) {
                     ((fz)var5).c = var4;
                  }
               }

               if (var3 != null) {
                  var3.g();
               }

               if (var1 != null) {
                  this.e(var1);
                  var1.a_();
               }
            }
         }

      }
   }

   public final void a(fh var1, boolean var2) {
      var1.b = false;
      var1.a = var2;
      if (var2) {
         var1.r = -var1.t;
         var1.v = bc.b - var1.t >> 1;
      }

      var1.a = this.b.a(true);
      if (var1.a != this.b) {
         var1.a.c(false);
      }

      d.addElement(var1);
      a = var1;
      if (var1.c != null) {
         var1.c.l();
      } else if (var1.a.length > 0) {
         var1.a[0].l();
      } else {
         var1.l();
      }
   }

   public void a(fh var1) {
      this.a(var1, true);
   }

   public final void v() {
      b(a);
   }

   public static void b(fh var0) {
      if (var0 != null && !d.isEmpty()) {
         var0.k();
      }
   }

   public final void w() {
      if (this.b != null && !d.isEmpty()) {
         for(int var1 = 0; var1 < d.size(); ++var1) {
            ((fh)d.elementAt(var1)).k();
         }

         d.removeAllElements();
         a = null;
         this.b.a().l();
      }
   }

   public void f() {
   }

   public final boolean a(int var1) {
      fy var2;
      if (a != null) {
         if ((var2 = a.a(true)) instanceof fi) {
            return var2.a(0, var1);
         }
      } else if (this.b != null) {
         if ((var2 = this.b.a(true)) instanceof fi) {
            return var2.a(0, var1);
         }

         if (this.a != null && a == null && this.a == null && var1 > 0) {
            return this.a.a(0, var1);
         }
      }

      return false;
   }

   public static boolean a() {
      return false;
   }

   public void b() {
      if (a != null) {
         a.e = false;
         a.l();
      }

   }

   public final void b(fy var1) {
      if (this.b != null) {
         this.b.a(var1);
      }

   }

   public final void c(fy var1) {
      if (this.b != null) {
         this.b.b(var1);
      }

   }

   public final void d(fy var1) {
      this.b.c(var1);
   }

   public static void h(String var0) {
      if (gg.a == 0) {
         a = new fn(var0);
      } else {
         a = new fn(var0, gj.a);
      }

      a.y = gg.p;
      a.e = 1;
      a.C = 1;
      a.a(0, 0, bc.b, gg.l);
      a.s = -a.u;
      a.a(1000L);
   }

   public void a(String var1) {
   }

   public void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case -6:
         if (this.a.a().length() == 0 && this.b.a(this.a)) {
            this.a.g = false;
            this.c((fy)this.a);
            return;
         } else if (this.a.a().length() > 0 && !this.b.a(this.a)) {
            this.a.g = true;
            this.b((fy)this.a);
            this.a.l();
            if ("*".equals(this.a.a)) {
               (new fk(this.a)).a(false);
               this.a.h();
            }
         }
      case -1:
      default:
         return;
      case -5:
         (new fk(this.a)).a(false);
         return;
      case -3:
         Vector var3;
         (var3 = new Vector(2)).addElement(new gq(-5, gk.a(17), this));
         var3.addElement(new gq(-4, gk.a(2), this));
         this.a(var3, 0);
         return;
      case -2:
         String var2;
         if ((var2 = this.a.a().trim()).length() > 0) {
            this.a(var2);
         }
      case -4:
         this.c((fy)this.a);
         this.a.b("");
         this.a.g = false;
         return;
      case 0:
         this.a(1, -6);
         return;
      case 1:
         this.a(1, -5);
         return;
      case 2:
         this.a(1, -7);
      }
   }

   public final fz a() {
      Object var1 = null;
      if (this.a != null) {
         var1 = this.a;
      } else if (a != null) {
         var1 = a;
      } else if (this.b != null) {
         var1 = this.b;
      }

      return (fz)var1;
   }

   public final fy a(boolean var1) {
      return this.b.a(true);
   }

   public static void e(int var0) {
      for(var0 = 0; var0 < e.size(); ++var0) {
         gh var1;
         if ((var1 = (gh)e.elementAt(var0)).a == 1) {
            e.removeElement(var1);
            return;
         }
      }

   }
}
