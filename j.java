import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public final class j extends fs implements go, CommandListener {
   public static an a;
   public static int a;
   public static boolean a;
   private static String e;
   public static j a;
   private String f;
   private String g;
   public static int b;
   public static String a;
   public static String b;
   public static gq a;
   public static gq b;
   public static gq c;
   public static gq d;
   public static gq e;
   public static gq f;
   public static gq g;
   public static gq h;
   private static gq o;
   private static gq p;
   private static gq q;
   private static gq r;
   public static gq i;
   public static gq j;
   private static gq s;
   private static gq t;
   public static gq k;
   private static String[] c = new String[]{c.a(559), c.a(129)};
   public static String[] a;
   public static String[] b;
   public static byte[] a;
   public static byte[] b;
   private static boolean b = true;

   private static void k() {
      a.a = c.a(337);
      b.a = c.a(41);
      c.a = c.a(40);
      d.a = c.a(63);
      e.a = c.a(64);
      f.a = c.a(222);
      g.a = c.a(249);
      h.a = c.a(503);
      p.a = c.a(337);
      q.a = c.a(123);
      i.a = c.a(276);
      o.a = c.a(495);
      t.a = c.a(18);
      k.a = c.a(284);
   }

   public static String a() {
      return bc.a.a.getAppProperty("MIDlet-Name");
   }

   public static String b() {
      return bc.a.a.getAppProperty("MIDlet-Version");
   }

   public j() {
      a = new gq(0, c.a(337), this);
      b = new gq(1, c.a(41), this);
      c = new gq(3, c.a(40), this);
      d = new gq(4, c.a(63), this);
      e = new gq(5, c.a(64), this);
      f = new gq(6, c.a(222), this);
      g = new gq(7, c.a(249), this);
      h = new gq(8, c.a(503), this);
      p = new gq(10, c.a(337), this);
      fi.a = new gq(11, c.a(123), this);
      i = new gq(17, c.a(276), this);
      j = new gq(18, c.a(24), this);
      o = new gq(24, c.a(495), this);
      q = new gq(26, c.a(123), this);
      t = new gq(39, c.a(18), this);
      s = new gq(41, c.a(668), this);
      k = new gq(51, c.a(284), this);
      Integer var1;
      b = (var1 = c.a("guide")) == null ? 0 : var1;
      b = (var1 = c.a("vibrate")) == null || var1 != 0;
   }

   public static void a(MIDlet var0) {
      bc.a(var0).a();
      eu.c = Integer.parseInt(bc.a.a.getAppProperty("ProviderId"));
      av var10000 = new av(0);
      byte var1 = 0;
      var10000.a(var1, false);
   }

   public static void c_() {
      bc.a.b();
   }

   public static void c() {
      bc.a = false;
      a = null;
      if (eu.a != null) {
         eu.a.b();
      }

      if (bc.a != null) {
         bc.a.a.notifyDestroyed();
      }

      bc.a = null;
   }

   public static void d_() {
      bc.b = true;
   }

   public static void e() {
      bc.b = false;
      bc.a.b();
   }

   public static void a_(String var0) {
      a(var0, false);
   }

   public static void a(String var0, boolean var1) {
      fh.a(var0, (gq)null, a, (gq)null, var1);
   }

   public static void b(String var0) {
      b(var0, false);
   }

   public static void e_() {
      a(false);
   }

   public static void a(boolean var0) {
      b(c.a(363), var0);
   }

   public static void b(String var0, boolean var1) {
      (new fq(var0, (gq)null, b, (gq)null, 2)).a(var1);
   }

   public static void a(String var0, gq var1, gq var2) {
      fh.a(var0, (gq)null, var1, var2, true);
   }

   public static void c(String var0, boolean var1) {
      fh.b(var0, (gq)null, a, (gq)null, var1);
   }

   public static void c(String var0) {
      c(var0, true);
   }

   public static void d(String var0) {
      try {
         fs var1 = bc.a();
         fs.b(fs.a);
         bc.a.a.platformRequest("sms:?body=" + var0);
      } catch (Exception var2) {
         fr var3 = new fr(c.a(222), var0, a, Display.getDisplay(bc.a.a));
         bc.b = true;
         Display.getDisplay(bc.a.a).setCurrent(var3);
      }
   }

   public final void a(Object var1) {
      fs var2;
      gq var13;
      fm var14;
      int var15;
      Vector var16;
      int[] var21;
      String var28;
      switch((var13 = (gq)((Object[])var1)[0]).a) {
      case -1:
         e();
         return;
      case 0:
      case 1:
         var2 = bc.a();
         fs.b(fs.a);
         return;
      case 2:
         this.l();
         return;
      case 3:
         eu.a = new k(this);
         eu.b = new l(this);
         if (!eu.a()) {
            b(c.a(83), false);
            eu.a();
            return;
         }

         eu.a.a((Object)null);
         return;
      case 4:
         var28 = c.a(87);
         String var26;
         var13 = new gq(401, bc.b <= 128 ? ((var26 = var28.trim()).equals("Tiếp tục") ? "T.tục" : var26) : var28, this);
         gq var31 = new gq(402, c.a(103), this);
         a(c.a(73), var13, var31);
         return;
      case 5:
         bc.a().a((fs)null);
         return;
      case 6:
         a(false);
         (new Thread(new m(this))).start();
         return;
      case 7:
         try {
            bc.a.a.platformRequest(eu.f);
            return;
         } catch (ConnectionNotFoundException var12) {
            return;
         }
      case 8:
         eu.a = new p(this);
         if (eu.a()) {
            eu.a.a((Object)null);
            eu.a = null;
            return;
         }

         b(c.a(83), false);
         eu.a();
         return;
      case 9:
         String[] var30 = new String[]{c.a(299), c.a(376)};
         var21 = new int[]{0, 1};
         a(c.a(532), var30, var21, p, b);
         return;
      case 10:
         String var29 = (var14 = (fm)fs.a).a(0);
         var28 = var14.a(1);

         try {
            Object[] var24;
            (var24 = new Object[2])[0] = var29;
            var15 = Integer.parseInt(var28.length() == 0 ? "0" : var28);
            var24[1] = new Integer(var15);
            fh.a(c.a(299) + " " + var29 + ". " + c.a(376) + " " + var15 + ".", new gq(1001, c.a(580), this), (gq)null, b);
            return;
         } catch (Exception var11) {
            return;
         }
      case 11:
         fy var22;
         if ((var22 = bc.a().a().a(true)) instanceof fi) {
            a((fi)var22);
            return;
         }
         break;
      case 16:
         var28 = ((fm)fs.a).a.a().trim();
         if (!"".equals(var28)) {
            var2 = bc.a();
            fs.b(fs.a);
            a(false);
            eu.a(var28, w.a);
            return;
         }
         break;
      case 17:
         (new ah()).a(1, true);
         return;
      case 18:
         a(false);
         eu.d();
         return;
      case 25:
         var14 = (fm)fs.a;
         if ("".equals(var14.a.a())) {
            var2 = bc.a();
            fs.b(fs.a);
            return;
         }

         eu.b(var14.a.a());
         a(c.a(504), true);
         return;
      case 26:
         a(bc.a().a);
         return;
      case 30:
         var16 = new Vector();

         for(int var27 = 0; var27 < c.length; ++var27) {
            var16.addElement(new gq(var27 + 31, c[var27], this));
         }

         bc.a().a(var16, 2);
         return;
      case 31:
         try {
            ((ff)fs.a.a(true)).e = c[0];
            c.a("language", 0);
            k();
            m();
            return;
         } catch (Exception var10) {
            return;
         }
      case 32:
         try {
            ((ff)fs.a.a(true)).e = c[1];
            c.a("language", 1);
            k();
            m();
            return;
         } catch (Exception var9) {
            return;
         }
      case 39:
         a(false);
         eu.g();
         return;
      case 41:
         if (a == null) {
            eu.h();
            return;
         }

         if (a != null && a.length != 0) {
            fh var23 = new fh(0, bc.c, bc.b, bc.c);
            fn var25;
            (var25 = new fn("Bản đồ", gj.a)).a(0, 0, var23.t, var25.u);
            var25.x = var25.y = 0;
            var25.q = 17;
            var23.a((fy)var25);
            var23.a((fy)(new ao()));
            int var3 = 0;
            int var4 = 0;

            for(int var5 = 0; var5 < a.length; ++var5) {
               if (a[var5] != a.b) {
                  ff var6;
                  (var6 = new ff(var3 + 1 + "." + a[var5], gj.a)).a(0, 0, var23.t, var6.u);
                  var6.x = var6.y = 0;
                  var6.q = 17;
                  var6.d = new gq(42, c.a(419), a);
                  var6.d.a = new Integer[]{new Integer(a[var5]), new Integer(b[var5])};
                  var23.a((fy)var6);
                  ++var3;
                  var4 += 4 + var6.u;
               }
            }

            var23.c(1);
            var23.u = var25.u + 2 + (gg.p << 1) + var4;
            var23.w = bc.e - (var23.u >> 1);
            var23.e = b;
            var23.l = true;
            var23.a(true);
            return;
         }
         break;
      case 42:
         Integer[] var20 = (Integer[])var13.a;
         bc.a.w();
         if (var20 == null && var20.length != 2) {
            return;
         }

         eg.a(var20[0], var20[1], ed.a(var20[0]));
         a(false);
         return;
      case 43:
         var21 = (int[])var13.a;
         a(true);
         eu.b(var21[0], var21[1]);
         return;
      case 44:
         var21 = (int[])var13.a;
         a(true);
         eu.c(var21[0], var21[1]);
         return;
      case 45:
         bc.a.w();
         return;
      case 46:
         if (a(fs.a)) {
            String[] var18;
            if ((var18 = a(fs.a)) != null) {
               int[] var19;
               eu.a((var19 = (int[])var13.a)[0], var19[1], var19[2], var18);
               bc.a.w();
            }

            return;
         }

         c(c.a(473), false);
         return;
      case 47:
         try {
            ff var17;
            if ((var17 = (ff)a.a(true)) != null) {
               var17.a = !var17.a;
               b = var17.a;
            }

            return;
         } catch (Exception var8) {
            return;
         }
      case 48:
         c.a("vibrate", b ? 1 : 0);
         var2 = bc.a();
         fs.b(fs.a);
         break;
      case 51:
         (var16 = new Vector()).addElement(s);
         var16.addElement(new gq(1103, "Chuyển kênh (" + a.c + ")", ((ea)bc.a).a));
         bc.a.a(var16, 1);
         return;
      case 52:
         (var16 = new Vector()).addElement(new gq(53, c.a(670), this));
         var16.addElement(new gq(54, c.a(671), this));
         bc.a.a(var16, 1);
         return;
      case 100:
         g();
         return;
      case 101:
         c();
         return;
      case 131:
         var14 = (fm)fs.a;

         try {
            var15 = Integer.parseInt(var14.a(0));
            a(true);
            eu.a(79, (int)3, var15);
            return;
         } catch (Exception var7) {
            return;
         }
      case 401:
         c.a();
         a(c.a(390), true);
         return;
      case 402:
         var2 = bc.a();
         fs.b(fs.a);
         return;
      }

   }

   private void l() {
      eu.a(this.f, "sms://" + this.g, new q(this), new r(this));
   }

   public static void g() {
      r = new gq(101, c.a(580), a);
      fh.a(c.a(604) + (eu.a.b + eu.a.a >> 10) + c.a(140), r, (gq)null, b);
   }

   public static void e(String var0) {
      try {
         if (var0 == null) {
            bc.a.a.platformRequest("tel:" + c());
            return;
         }

         bc.a.a.platformRequest("tel:" + var0);
         String var2 = var0;
         String var1 = "Hotline";

         try {
            c.a(var1, var2.getBytes());
         } catch (Exception var3) {
         }

         e = var0;
      } catch (ConnectionNotFoundException var4) {
      }

   }

   public static String c() {
      if (e == null) {
         String var0 = "Hotline";
         byte[] var1;
         String var10000 = (var1 = c.a("Hotline", 1)) == null ? null : new String(var1);
         e = var10000;
         if (var10000 == null) {
            e = bc.a.a.getAppProperty("Hotline");
         }
      }

      return e;
   }

   public final void a(byte var1, String var2, String var3) {
      switch(var1) {
      case 1:
         if (b == null || b.length() == 0) {
            a(c.a(178), true);
            return;
         } else {
            a(c.a(435), true);
            int var4 = var2.indexOf("?");
            eu.a(var2.substring(0, var4) + b, "sms://" + var3, new s(this), new t(this));
            b = null;
         }
      default:
      }
   }

   public final void a(String var1, boolean var2, String var3, String var4) {
      this.f = var3;
      this.g = var4;
      if (!var2) {
         a(var1 + " " + c.a(167), true);
      } else {
         this.l();
      }
   }

   public static void a(String var0, String var1, String var2) {
      fs var3;
      (var3 = new fs(true)).d = var1;
      var3.c = var0;
      fx var4 = new fx();
      var3.m = e;
      var4.a(0, gg.m, bc.b, bc.c - (gg.m << 1));
      var3.b((fy)var4);
      var4.a(var2, gj.a);
      var3.a(1, true);
   }

   public static void a(Vector var0) {
      e var1;
      (var1 = new e(c.a(384))).a(var0);
      var1.a(1, true);
   }

   public static fm a(String var0, String[] var1, int[] var2, gq var3, gq var4) {
      fm var5;
      (var5 = new fm(var0, var1, var2, var3, var4)).a((fh)null);
      return var5;
   }

   public static fm a(String var0, gq var1, gq var2, int var3) {
      String var10000 = var0;
      boolean var4 = false;
      var0 = var10000;
      fm var5;
      (var5 = new fm(var0, var1, var2 == null ? b : var2, var3)).a(false);
      return var5;
   }

   public static fm a(String[] var0, int[] var1, gq var2, int var3) {
      fm var4;
      fi var5 = (fi)(var4 = a(bc.b <= 128 ? c.a(5) + " mGold: " + br.a : c.a(5) + " mGold: " + br.a, var0, var1, var2, b)).a(2);
      fi var6;
      (var6 = (fi)var4.a(4)).h = false;
      var6.a = 15;
      var5.a = new u(var5, var6, var3);
      return var4;
   }

   public static void b(Vector var0) {
      ez.b = false;
      aj var1;
      (var1 = new aj()).a(var0);
      var1.a(1, true);
   }

   public static void h() {
      if (fs.a != null && fs.a instanceof fq && ((fq)fs.a).a == 2) {
         fs.a.b_();
      }

   }

   public static void f(String var0) {
      (new fm(var0, new gq(16, c.a(337), a), b, 0)).a(false);
   }

   public static void i() {
      z var0;
      (var0 = (z)bc.a()).w();
      var0.b = false;
      (new w()).a(true);
   }

   private static void a(fi var0) {
      (new fk(var0)).a(false);
   }

   public final void commandAction(Command var1, Displayable var2) {
   }

   public static void j() {
      int var0 = bc.b < 128 ? bc.b - 4 : bc.b - 20;
      fh var1 = new fh();
      c = new String[]{c.a(559), c.a(129)};
      fn var2;
      (var2 = new fn(c.a(459))).q = 17;
      ao var3 = new ao();
      fn var4;
      (var4 = new fn(c.a(247) + ":")).a(0, 0, var1.t, var4.a.a() + 8);
      var4.h = true;
      Integer var5;
      ff var10;
      if ((var5 = c.a("language")) != null) {
         var10 = new ff(c[var5]);
      } else {
         var10 = new ff(c[0]);
      }

      var10.q = 17;
      var10.b = a;
      var1.j = true;
      var1.l = true;
      var1.c = 0;
      var1.a((fy)var2);
      var1.a((fy)var3);
      var1.a((fy)var4);
      var1.a((fy)var10);
      (var4 = new fn(c.a(611), gj.a)).a(0, 0, var1.t, var4.a.a() + 10);
      ff var6;
      (var6 = new ff(1)).a((String)c.a(558));
      var6.a(0, 0, var1.t - (var1.x + var1.y << 1), gj.a.a() + 10);
      var6.a(gj.a, new gl(gj.a.getWidth(), gj.a.getWidth()));
      Integer var7;
      b = (var7 = c.a("vibrate")) == null || var7 != 0;
      var6.a = b;
      var6.d = new gq(47, c.a(419), a);
      var1.a((fy)var4);
      var1.a((fy)var6);
      int var11 = bc.b - var0 >> 1;
      int var8 = var2.u * 3 + (var10.u << 1) + var3.u + (var1.x + var1.y << 2) + 5 + var4.u + var6.u;
      int var9 = bc.c - var8 - gg.m - 10;
      var1.a(var11, var9, var0, var8);
      var1.c(1);
      var1.e = new gq(48, c.a(41), a);
      var1.a(true);
   }

   private static void m() {
      fh var0 = new fh();
      c = new String[]{c.a(559), c.a(129)};
      fn var1;
      (var1 = new fn(c.a(459))).q = 17;
      ao var2 = new ao();
      fn var3 = new fn(c.a(247) + ":", v.a);
      Integer var4;
      ff var9;
      if ((var4 = c.a("language")) != null) {
         var9 = new ff(c[var4]);
      } else {
         var9 = new ff(c[0]);
      }

      var9.q = 17;
      int var5 = var1.u * 3 + (var9.u << 1) + var2.u + (var0.x + var0.y << 1) + 5;
      int var6 = bc.b < 128 ? bc.b - 4 : bc.b - 20;
      int var7 = bc.b - var6 >> 1;
      int var8 = bc.c - var5 >> 1;
      var0.a(var7, var8, var6, var5);
      var0.c = 0;
      var0.a((fy)var1);
      var0.a((fy)var2);
      var0.a((fy)var3);
      var0.a((fy)var9);
      var0.c(1);
      var0.e = b;
      var0.a(true);
   }

   public static fh a(int var0, String var1, int[] var2, String[] var3, byte[] var4, gq[] var5) {
      fh var6;
      (var6 = new fh()).y = gg.p;
      var6.e = b;
      var6.t = bc.b - (gg.p << 1);
      var6.a.a = var6.t - 2 * var6.y;
      fx var7;
      (var7 = new fx()).t = var6.t - (var6.y << 1);
      var7.b = 0;
      var7.y = 0;
      var7.a = 17;
      var7.a(var1, gj.a);
      var7.h = false;
      var7.a(0, 0, var6.d(), var7.a.b);
      var6.a((fy)var7);
      var6.a(new ao(), true);
      int var13 = (var6.x + var6.y << 1) + var7.a.b + 4 + var6.c;
      fz var14;
      (var14 = new fz(0, 0, var6.d(), 60, 1)).y = 0;
      var14.x = 0;
      var14.j = true;
      int var8 = 0;

      int var9;
      for(var9 = 0; var9 < var3.length; ++var9) {
         ff var10;
         if (var4[var9] == 0) {
            var10 = new ff(var3[var9], v.a);
         } else {
            var10 = new ff(var3[var9]);
            int[] var11;
            (var11 = new int[2])[0] = var0;
            var11[1] = var2[var9];
         }

         var10.d = var5[var9];
         var8 += var6.c + var10.u;
         var14.a(var10);
      }

      if ((var9 = var13 + var8) < 60) {
         var9 = 60;
      }

      int var15 = bc.c - gg.m - (gg.p << 1);
      if (var9 > var15) {
         var9 = var15;
      }

      var8 = var9 - var13;
      var14.a(0, 0, var14.t, var8);
      var6.a(gg.p, bc.c - gg.m - gg.p - var9, var6.t, var9);
      var6.a((fy)var14);
      var6.c(1);

      for(int var16 = 0; var16 < var14.b(); ++var16) {
         fy var12 = var14.a(var16);
         if (var4[var16] != 0) {
            var12.l();
            break;
         }
      }

      return var6;
   }

   public static fh a(int var0, int var1, int var2, String var3, String[] var4, byte[] var5, gq var6) {
      int var7 = (var7 = gj.b.a("n") * 45 + (gg.o << 1)) < bc.b ? var7 : bc.b;
      fh var15 = new fh(gg.o + (bc.b - var7 >> 1), gg.p, var7 - (gg.o << 1), bc.c - (gg.o << 1));
      fn var13;
      (var13 = new fn(var3)).q = 17;
      var15.a((fy)var13);
      var15.a(new ao(), true);
      var15.u = var4.length * 20 + var13.u + 2 + (gg.p << 1);
      fz var14 = new fz(0, var13.r + var13.u + gg.o, var15.t, var15.u - (gg.p + var13.u + gg.o));
      if (var15.u > bc.c) {
         var15.u = bc.c;
      }

      var14.a.a = var15.t;
      var14.a.b = var4.length * (20 + gg.p);
      int var8 = 0;

      for(int var9 = var4.length - 1; var9 >= 0; --var9) {
         if (var8 < gj.a.a(var4[var9])) {
            var8 = gj.a.a(var4[var9]);
         }
      }

      var8 += gg.p;
      int var11 = var4.length;

      for(int var12 = 0; var12 < var11; ++var12) {
         fn var10;
         (var10 = new fn(var4[var12])).a(0, var12 * 20, var8, var10.u + (gg.p << 1));
         fi var16 = new fi(var8 + gg.p, var12 * 20, var14.t - var8 - (gg.p << 2), 20);
         if (var5[var12] == 0) {
            var16.a(0);
         } else {
            var16.a(1);
         }

         var14.a(var10);
         var14.a(var16);
         if (var12 == 0) {
            var16.l();
         }
      }

      var14.c(0);
      var14.j = true;
      var15.a((fy)var14);
      var15.s = bc.c - var15.u - (gg.o << 1) - gg.n;
      var15.a(var15.r, var15.s, var15.t, var15.u);
      var15.c = b;
      if (var6 == null) {
         var15.d = new gq(46, c.a(337), new int[]{var0, var1, var2}, a);
      } else {
         var15.d = var6;
      }

      var15.c(1);
      var15.a(true);
      return var15;
   }

   public static fh a(int var0, int var1, int var2, String var3, String[] var4, byte[] var5) {
      return a(122, 7, var2, var3, var4, var5, (gq)null);
   }

   private static boolean a(fh param0) {
      // $FF: Couldn't be decompiled
   }

   public static String[] a(fh var0) {
      try {
         fz var6;
         String[] var2 = new String[(var6 = (fz)var0.a(2)).b() >> 1];
         int var3 = var6.b();

         for(int var4 = 1; var4 < var3; var4 += 2) {
            if (var6.a(var4) instanceof fi) {
               fi var1 = (fi)var6.a(var4);
               var2[var4 >> 1] = var1.a().trim();
            }
         }

         return var2;
      } catch (Exception var5) {
         return null;
      }
   }

   public static void a(int var0, String var1, String var2, byte var3) {
      gq var4 = null;
      gq var5 = null;
      gq var6 = null;
      int[] var7;
      (var7 = new int[2])[0] = var0;
      var7[1] = var3;
      String var8;
      switch(var3) {
      case 0:
         var8 = c.a(101);
         var4 = new gq(44, var8, var7, a);
         var6 = b;
         break;
      case 1:
         var8 = c.a(4);
         var4 = new gq(44, var8, var7, a);
         var6 = b;
         break;
      case 2:
         var5 = a;
         var6 = null;
      }

      a(var1, var2, var4, var5, var6, true);
   }

   public static void a(String var0, String var1, gq var2, gq var3, gq var4, boolean var5) {
      fh var9;
      (var9 = new fh()).y = gg.p;
      var9.c = var2;
      var9.d = var3;
      var9.e = var4;
      var9.t = bc.b - (gg.p << 1);
      var9.a.a = var9.t - 2 * var9.y;
      fx var8;
      (var8 = new fx()).t = var9.t - (var9.y << 1);
      var8.b = 0;
      var8.y = 0;
      var8.a = 17;
      var8.a(var0, gj.a);
      var8.h = false;
      fx var6;
      (var6 = new fx()).t = var8.t;
      var6.b = 0;
      var6.y = 0;
      var6.a(var1, v.c);
      var9.u = var8.a.b + var6.a.b + (var9.y + var9.x << 1) + 4 + (var9.c << 1);
      if (var9.u < 60) {
         var9.u = 60;
      }

      int var7 = bc.c - gg.m - (gg.p << 1);
      if (var9.u > var7) {
         var9.u = var7;
      }

      var9.a(gg.p, bc.c - gg.m - gg.p - var9.u, var9.t, var9.u);
      var8.a(0, 0, var9.d(), var8.a.b);
      var6.a(0, 0, var9.d(), var9.u - var8.u - (var9.y + var9.x << 1) - 4 - (var9.c << 1));
      var9.a((fy)var8);
      var9.a(new ao(), true);
      var9.a(var6, true);
      var9.c(1);
      var9.a(true);
   }

   public static String d() {
      try {
         String var0;
         if ((var0 = System.getProperty("lac")) == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.nokia.mid.lac");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("LocAreaCode");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("phone.lac");
         }

         return var0 == null ? "" : var0;
      } catch (Exception var1) {
         return "";
      }
   }

   public static String e() {
      try {
         String var0;
         if ((var0 = System.getProperty("mcc")) == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("phone.mcc");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.nokia.mid.mcc");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.nokia.mid.countrycode");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.lge.cmcc");
         }

         return var0 == null ? "" : var0;
      } catch (Exception var1) {
         return "";
      }
   }

   public static String f() {
      try {
         String var0;
         if ((var0 = System.getProperty("mnc")) == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("phone.mnc");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.nokia.mid.networkid");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.nokia.mid.mnc");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.lge.cmnc");
         }

         return var0 == null ? "" : var0;
      } catch (Exception var1) {
         return "";
      }
   }

   public static String g() {
      try {
         String var0;
         if ((var0 = System.getProperty("Cell-ID")) == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("CellID");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.nokia.mid.cellid");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("phone.cid");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.samsung.cellid");
         }

         if (var0 == null || var0.equals("null") || var0.equals("")) {
            var0 = System.getProperty("com.siemens.cellid");
         }

         return var0 == null ? "" : var0;
      } catch (Exception var1) {
         return "";
      }
   }

   public static String h() {
      String[] var0;
      int var1 = (var0 = new String[]{"com.nokia.mid.mnc", "IMSI", "phone.imsi", "com.nokia.mid.mobinfo.IMSI", "com.nokia.mid.imsi", "com.sonyericsson.sim.subscribernumber", "imsi", "com.sonyericsson.imsi", "com.siemens.imei", "com.samsung.imei", "com.samsung.IMEI", "com.nokia.mid.networkid", "com.siemens.mid.networkid", "com.sonyericsson.mid.networkid", "com.motorola.mid.networkid", "com.samsung.mid.networkid"}).length;
      String var2 = "";

      for(int var3 = 0; var3 < var1 && ((var2 = System.getProperty(var0[var3])) == null || var2.equals("null") || var2.equals("")); ++var3) {
      }

      return var2;
   }

   public static i a(fy[] var0) {
      i var1 = new i(0, 0, bc.d, bc.e, true);

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var0[var2].b = var1;
         if (var0[var2].d != null) {
            var0[var2].d.a = c.a(419);
         }

         if (var0[var2] instanceof ff) {
            ((ff)var0[var2]).a(gj.b, v.c);
            ((ff)var0[var2]).q = 17;
         } else if (var0[var2] instanceof fn) {
            ((fn)var0[var2]).a((fl)v.d, (fl)null);
         }
      }

      var1.a = var0;
      var1.m = true;
      var1.c(1);
      var1.e = b;
      return var1;
   }

   static String a(j var0) {
      return var0.f;
   }

   static String b(j var0) {
      return var0.g;
   }
}
