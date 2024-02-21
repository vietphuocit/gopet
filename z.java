import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class z extends fs implements go {
   private String e;
   private String f = j.b() + "beta";
   private String g = "Một ứng dụng của";
   private String h = "MXH mGo.";
   public static boolean a = true;
   public static String a;
   public static String b;
   private fi b;
   private fi c;
   private fi d;
   private ff a;
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private byte a = 0;
   private gq a;
   private gq b;
   private gq c;
   private gq d;
   private gq e;
   private gq f;
   private gq g;
   private gq h;
   private fn b;
   private int f = 0;
   private int g = 0;
   private final ed a;
   public long a;
   public boolean b = true;
   private fh b;
   private Image a;
   private Image c;
   private int h;
   private int i = 2;

   public final void b() {
      super.b();
      this.j();
      eu.c = eu.b;
      eu.b = eu.a;
   }

   public z() {
      super(true);
      this.e = true;
      this.a = v.c();
      this.c = "LOGIN";
      this.h = gg.o;
      this.b = new fi(this.a, bc.e - gg.m - gg.p, this.b, gg.m);
      this.c = new fi(this.a, bc.e, this.b, gg.m);
      this.d = new fi(this.a, bc.e + gg.m + gg.p, this.b, gg.m);
      this.a = new ff(1);
      this.b = new fn(c.a(331), gj.a);
      gi.a("/lg.dat");
      this.c = gi.a(0);
      this.a(0);
      this.a = new ed(11, new eg(), 0, 0);
      av.h();
   }

   private void a(int var1) {
      String var2 = bc.b > 240 ? c.a(331) : c.a(330) + " " + c.a(362);
      fn var3 = new fn("000000");
      int var10000 = gg.p;

      int var4;
      do {
         if ((var4 = var3.a.a(var2 + var3.e) + (gg.p << 1)) >= bc.b) {
            var4 = bc.b - (gg.p << 1);
            break;
         }

         var3.e = var3.e.substring(0, var3.e.length() - 1);
      } while(var4 > bc.b - (gg.p << 1) && var3.e.length() > 0);

      this.b = var4 - (this.h << 1);
      this.a = (bc.b - var4 >> 1) + this.h;
      if (var1 == 0) {
         this.c = (gg.p << 2) + (gg.m << 1) + this.b.u + this.a.u;
      } else if (var1 == 1) {
         this.c = gg.p * 6 + gg.m * 3;
      }

      if (bc.c >= 176) {
         this.e = gg.m + (gg.o << 1);
      } else {
         this.e = gg.m + gg.p;
      }

      var1 = bc.c - gg.m - this.c;
      int var5;
      if (bc.b > 240 && bc.c > 240) {
         if (var1 - gg.m - gg.p > this.c.getHeight() + this.e) {
            var5 = var1 - gg.m - gg.p - this.c.getHeight() - this.e >> 1;
            var1 -= var5;
         }
      } else if (var1 - gg.m - gg.p > this.c.getHeight() + this.e - 20) {
         var5 = var1 - gg.m - gg.p - this.c.getHeight() - this.e + 20 >> 1;
         var1 -= var5;
      }

      if (var1 - gg.m - gg.p * 3 < 0) {
         var1 = gg.m + gg.p * 3;
      }

      this.b.a(this.a, var1 - gg.m - gg.p, this.b, gg.m);
      this.b.a(c.a(298));
      this.b.a(3);
      this.c.a(this.a, var1, this.b, gg.m);
      this.d.a(this.a, var1 + gg.m + gg.p, this.b, gg.m);
      this.c.a(2);
      this.d.a(2);
      this.a.a((String)c.a(488));
      this.a.a(gj.a, gj.a);
      this.a.a((bc.b >> 1) - (this.a.t >> 1) - gg.p, var1 + gg.m + gg.p, this.a.t + gj.a.getWidth() + gg.o, this.a.u);
      this.a.a(gj.a, new gl(gj.a.getWidth(), gj.a.getWidth()));
      if (bc.b >= 240) {
         this.b.a(c.a(331));
         this.b.a(c.a(298));
         this.c.a(c.a(375));
         this.d.a(c.a(397));
         var5 = gj.a.a(c.a(397)) + gg.p * 5;
      } else {
         this.b.a(c.a(330) + " " + c.a(362));
         this.b.a(c.a(298));
         this.c.a(c.a(348));
         this.d.a(c.a(482));
         var5 = gj.a.a(c.a(482)) + gg.p * 5;
      }

      this.b.b(var5);
      this.c.b(var5);
      this.d.b(var5);
      this.b.a(0, this.a.s + this.a.u, bc.b, this.b.u);
      this.b.q = 17;
      this.b.a(this.b);
      this.b = new gq(1, c.a(385), this);
      String var6 = c.a(266);
      this.m = this.a = new gq(2, bc.b <= 128 ? ((var6 = var6.trim()).equals(c.a(266)) ? "Đ.nhập" : (var6.equals(c.a(385)) ? "Đ.ký" : var6)) : var6, this);
      this.l = new gq(3, c.a(275), this);
      this.c = new gq(4, c.a(154), this);
      this.d = new gq(5, c.a(337), this);
      this.e = new gq(6, c.a(580), this);
      this.f = new gq(7, c.a(300), this);
      this.g = new gq(8, c.a(220), this);
      this.h = new gq(9, c.a(139), this);
      this.b = new fz(0, 0, bc.b, bc.c);
      this.j();
      this.b.l = true;
      this.b.b(c.a("nick"));
      this.c.b(c.a("pass"));
      this.a.a = this.b.a().length() > 0;
      this.a.e = this.a;
      this.d(this.d);
      this.e = c.a(205) + ": " + j.c();
      this.b.l();
      this.b(this.b);
      this.b(this.c);
      this.b(this.d);
      this.b(this.a);
      this.b(this.b);
      this.b = new fh(bc.b - var4 >> 1, 0, var4, 120);
      this.b.c = new gq(151, c.a(548), this);
      this.b.e = new gq(17, c.a(41), this);
      this.b.s = -100;
   }

   private void h() {
      this.a(1);
      this.m = this.b;
      this.a = 1;
      this.b.g = true;
      this.c.g = true;
      this.d.g = true;
      this.a.g = false;
      this.b.g = false;
      this.j();
   }

   private void i() {
      this.a = 0;
      this.a(0);
      this.b.c(this.d);
      this.a.g = true;
      this.b.g = true;
      this.b.g = true;
      this.c.g = true;
      this.m = this.a;
      this.j();
   }

   public final void h_() {
      super.h_();
      if (this.e != this.d) {
         this.d += this.e - this.d >> 1;
      }

      this.f += this.i;
      if (this.f < 0 || this.f >= this.a.b * 24 - bc.b) {
         this.i = -this.i;
      }

   }

   public final void a() {
      this.a.a(this.f, 0, true);
   }

   public final void d() {
      if (bc.b >= 240) {
         if (bc.c > 240) {
            this.a(bc.a, bc.d, this.d, 17);
         } else {
            this.a(bc.a, bc.d, this.d - 20, 17);
         }
      } else {
         this.a(bc.a, bc.d, this.d - 20, 17);
      }

      if (this.f != null) {
         int var1 = bc.c - gg.m - v.c().a() - 1;
         if (bc.c >= 240) {
            v.c().a(bc.a, this.g, 1, bc.c - gg.m - 2 * v.c().a() - 1, 20);
            v.c().a(bc.a, this.h, 1, bc.c - gg.m - v.c().a() - 1, 20);
         } else {
            v.c().a(bc.a, this.g, 1, bc.c - gg.m - 2 * v.c().a() + 5, 20);
            v.c().a(bc.a, this.h, 1, bc.c - gg.m - v.c().a() + 1, 20);
         }

         v.c().a(bc.a, this.f, bc.b - 1, var1, 24);
      }

      if (this.e != null) {
         v.c().a(bc.a, this.e, bc.b - 2, 1, 24);
      }

      super.d();
   }

   private void a(Graphics var1, int var2, int var3, int var4) {
      var1.drawImage(this.c, var2, var3, 17);
      if (this.b) {
         var2 = bc.b - this.b - (this.h << 1) >> 1;
         var3 = this.b.s - 5;
         var4 = this.b + (this.h << 1);
         int var5 = this.c;
         bc.a.translate(var2, var3);
         bc.a.setColor(gg.b);
         bc.a.fillRect(3, 3, var4 - 6, var5 - 6);
         gg.a(0, 0, var4, var5);
         bc.a.translate(-var2, -var3);
      }

   }

   private void j() {
      this.b.r = -this.a;
      this.c.r = bc.b + this.a;
      this.d.r = -this.a;
      this.a.r = -this.a;
      this.d = -this.c.getHeight();
   }

   public final void f_() {
      super.f_();
      if (this.b.g) {
         this.a(0);
         this.i();
      } else {
         this.a(1);
         this.h();
      }
   }

   public static void i_() {
      try {
         ByteArrayOutputStream var0 = new ByteArrayOutputStream();
         DataOutputStream var1 = new DataOutputStream(var0);
         int var2 = eu.a.size();
         var1.writeInt(var2);

         for(int var3 = 0; var3 < var2; ++var3) {
            ap var4 = (ap)eu.a.elementAt(var3);
            var1.writeUTF(var4.a);
            var1.writeUTF(var4.b);
            var1.writeInt(var4.a);
         }

         var1.close();
         c.a("server_list");
         c.a("server_list", var0.toByteArray());
         ByteArrayOutputStream var8 = new ByteArrayOutputStream();
         DataOutputStream var9 = new DataOutputStream(var8);

         for(int var6 = 0; var6 < var2; ++var6) {
            ap var7 = (ap)eu.a.elementAt(var6);
            var9.writeBoolean(var7.a);
            var9.writeBoolean(var7.b);
         }

         var9.close();
         c.a("server_list_log_reg");
         c.a("server_list_log_reg", var8.toByteArray());
      } catch (Exception var5) {
      }
   }

   private static boolean b() {
      eu.a.removeAllElements();
      byte[] var0;
      ap var10;
      if ((var0 = c.a("server_list", 1)) != null) {
         try {
            DataInputStream var5;
            int var1 = (var5 = new DataInputStream(new ByteArrayInputStream(var0))).readInt();

            for(int var2 = 0; var2 < var1; ++var2) {
               ap var3 = new ap(var5.readUTF(), var5.readUTF(), var5.readInt(), 0, 0);
               eu.a.addElement(var3);
            }

            var5.close();
            byte[] var9;
            if ((var9 = c.a("server_list_log_reg", 1)) != null) {
               DataInputStream var11 = new DataInputStream(new ByteArrayInputStream(var9));

               for(int var6 = 0; var6 < var1; ++var6) {
                  (var10 = (ap)eu.a.elementAt(var6)).a = var11.readBoolean();
                  var10.b = var11.readBoolean();
               }

               var11.close();
            }

            return true;
         } catch (IOException var4) {
         }
      } else {
         ap var7;
         (var7 = new ap("Pet City", eu.b, eu.a, 3500, 0)).b = false;
         ap var8;
         (var8 = new ap("Đại thời đại", "123.30.135.108", 19180, 3500, 0)).b = false;
         var10 = new ap("Hỏa kì lân", "203.162.79.55", 19180, 3500, 0);
         eu.a.addElement(var7);
         eu.a.addElement(var10);
         eu.a.addElement(var8);
      }

      return false;
   }

   public final void g() {
      b();
      if (this.a == null) {
         this.a = gi.a("/common.dat", 20);
      }

      this.b.m();
      fn var1;
      (var1 = new fn(c.a(428), gj.a)).a(0, 0, this.b.t, var1.u);
      var1.q = 17;
      ao var2;
      (var2 = new ao()).a(0, var1.u, this.b.t, var2.u);
      int var3 = var1.u + var2.u;
      fz var4;
      (var4 = new fz(0, 0, this.b.t, var3)).a(var1);
      var4.a(var2);
      fz var8 = new fz(0, var1.u + 2, this.b.t, this.b.u - var3 - 2);
      int var9 = eu.a.size();
      int var5 = 0;

      int var6;
      for(var6 = 0; var6 < var9; ++var6) {
         ap var7 = (ap)eu.a.elementAt(var6);
         boolean var10 = false;
         switch(this.a) {
         case 0:
            var10 = var7.a;
            break;
         case 1:
            var10 = var7.b;
         }

         if (var10) {
            ff var11;
            (var11 = new ff()).a((Image)this.a);
            var11.a(gj.a, gj.a);
            var11.e = var7.a;
            var11.d = new gq(16, c.a(337), this);
            var11.a(0, var5 * gg.m + 2, this.b.t - (this.b.x << 1), gg.m);
            var8.a(var11);
            ++var5;
         }
      }

      if ((var6 = 30 + 21 * var8.b()) < 93) {
         var6 = 93;
      }

      this.b.a(bc.b - this.b.t >> 1, bc.c - var6 >> 1, this.b.t, this.b.u);
      this.b.u = var6;
      this.b.a((fy)var4);
      this.b.a((fy)var8);
      var8.c(0);
      this.b.c(0);
      var8.j = true;
      this.b.a(true);
      if (var8.b() > 0) {
         var8.a(0).c(true);
      }

   }

   public final void a(Object var1) {
      String var2;
      Vector var4;
      switch(((gq)((Object[])var1)[0]).a) {
      case 0:
      case 10:
         fs.b(fs.a);
         return;
      case 1:
         if (this.a != 1) {
            this.h();
            return;
         }

         a = this.b.a().toLowerCase().trim();
         b = this.c.a();
         var2 = this.d.a();
         if (a.equals("")) {
            this.b.l();
            j.a_(c.a(132));
            return;
         }

         if (b.equals("")) {
            this.c.l();
            j.a_(c.a(133));
            return;
         }

         if (!b.equals(var2)) {
            this.d.l();
            j.a_(c.a(322));
            return;
         }

         this.g();
         break;
      case 2:
         if (this.a != 0) {
            this.i();
            return;
         }

         a = this.b.a().toLowerCase().trim();
         b = this.c.a();
         if (a.equals("")) {
            this.b.l();
            j.a_(c.a(393));
         } else if (b.equals("")) {
            this.c.l();
            j.a_(c.a(394));
         } else {
            this.g();
         }
         break;
      case 3:
         (var4 = new Vector()).addElement(this.a == 0 ? this.b : this.a);
         var4.addElement(j.h);
         var4.addElement(this.c);
         var4.addElement(new gq(18, "Chức năng khác..", this));
         var4.addElement(this.h);
         this.a(var4, 0);
         return;
      case 4:
         this.a(new fm(c.a(519) + ":", this.d, j.b, 0));
         return;
      case 5:
         if ((j.b = ((fm)fs.a).a.a()) != null && j.b.length() != 0) {
            fh.a(c.a(356), this.e, (gq)null, this.f, true);
            return;
         }

         j.a(c.a(178), true);
         return;
      case 6:
         j.a(true);
         eu.a = new ad(this);
         if (eu.a()) {
            eu.a.a((Object)null);
            return;
         }

         j.b(c.a(83), true);
         eu.a();
         return;
      case 7:
         j.a(c.a(174), true);
         return;
      case 8:
         j.a_("\n" + c.a(371) + ": " + j.a() + '\n' + c.a(557) + ": " + j.b() + c.a(353) + "\n\n");
         return;
      case 9:
         j.c();
         return;
      case 16:
         fz var5 = (fz)this.b.a(1);
         ap var6;
         eu.b = eu.c = (var6 = (ap)eu.a.elementAt(var5.c())).b;
         eu.a = eu.b = var6.a;
         eu.b();
         if (this.a == 0) {
            boolean var3 = this.a.a;
            var2 = b;
            String var7 = a;
            j.a = var3;
            a = var7;
            b = var2;
            eu.a = new ab();
            if (!eu.a()) {
               j.b(c.a(83), true);
               eu.a();
               return;
            }

            eu.a.a((Object)null);
         } else if (this.a == 1) {
            eu.a = new aa(this);
            if (!eu.a()) {
               j.b(c.a(83), true);
               eu.a();
               return;
            }

            eu.a.a((Object)null);
         }
         break;
      case 17:
         this.b.b_();
         return;
      case 18:
         (var4 = new Vector()).addElement(j.c);
         var4.addElement(j.d);
         var4.addElement(j.f);
         var4.addElement(j.g);
         var4.addElement(this.g);
         this.a(var4, 0);
         return;
      case 19:
         return;
      case 151:
         eu.a = new ac(this);
         if (eu.a()) {
            eu.a.a((Object)null);
            return;
         }

         j.b(c.a(83), true);
         eu.a();
         return;
      case 152:
         eu.a((go)(new ae(this)), (go)null);
         return;
      default:
         super.a(var1);
      }

   }
}
