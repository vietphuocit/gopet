import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class dh extends fz implements go {
   public static boolean a = false;
   private static Vector a = new Vector();
   private static boolean b;
   private int a;
   private aq a;
   private fi a;
   private int d;
   public static Image a;
   private Image b;
   private gq a;
   private gq f;
   private gq g;
   private dj a;
   private static final Object a = new Object();
   private boolean c;
   private long a;
   private Image c;
   private int e;

   public dh() {
      this.d = v.d.a();
      this.a = 0;
      this.a = new aq();
      int var1 = bc.c > 180 ? bc.e : bc.c - gg.l;
      this.a(1, bc.c - var1 - gg.m, bc.b - 2, var1);
      this.a = new fi(gg.p << 2, this.u - gg.m - gg.p - 1, this.t - (gg.p << 3), gg.m);
      fi var2 = this.a;
      this.a(var2, false);
      a = gi.a("/common.dat", 19);
      this.c = gi.a("/common.dat", 8);
      if (this.b == null) {
         int[] var5 = new int[900];
         int[] var6 = new int[3 * this.c.getWidth()];
         int var3 = ((var3 = this.c.getWidth()) << 1) + (var3 >> 1);
         this.c.getRGB(var6, 0, this.c.getWidth(), 0, 0, this.c.getWidth(), 3);

         for(int var4 = 0; var4 < var5.length; ++var4) {
            var5[var4] = var6[var3];
         }

         this.b = Image.createRGBImage(var5, 30, 30, true);
      }

      this.a = new gq(1, "Chọn", this);
      this.f = new gq(2, "Trả lời", this);
      this.g = new gq(3, "Chat", this);
      this.c = new gq(0, "Đóng", this);
      this.d = this.g;
   }

   public static void a(String var0, String var1) {
      synchronized(a) {
         int var3;
         if ((var3 = a.size()) >= 50) {
            for(int var4 = 0; var4 < var3 - 1; ++var4) {
               dj var5;
               (var5 = (dj)a.elementAt(var4 + 1)).b = var4;
               a.setElementAt(var5, var4);
            }

            a.setElementAt(new dj(var3 - 1, var0, var1), var3 - 1);
         } else {
            a.addElement(new dj(var3, var0, var1));
         }

         b = true;
      }
   }

   public final boolean a(int var1, int var2) {
      if (var1 == 0) {
         switch(var2) {
         case -4:
         case -3:
            return true;
         case -2:
            ++this.a;
            if (this.a >= a.size()) {
               this.a = 0;
            }

            this.i();
            this.d = this.a;
            return true;
         case -1:
            --this.a;
            if (this.a < 0) {
               this.a = a.size() - 1;
            }

            this.i();
            this.d = this.a;
            return true;
         }
      }

      if (!this.a.e) {
         fi var3 = this.a;
         bc.a().a((fy)var3);
      }

      if (this.d.a == this.a.a && var2 != -5 && var2 != -3 && var2 != -4 && var2 != -1 && var2 != -2) {
         this.d = this.g;
      }

      return super.a(var1, var2);
   }

   private void i() {
      if (this.a >= 0 && this.a < a.size()) {
         int var1 = 0;
         int var2 = ((dj)a.elementAt(this.a)).a;

         for(int var3 = 0; var3 <= this.a; ++var3) {
            var1 += ((dj)a.elementAt(var3)).a;
         }

         if (var1 + this.a.a <= 16) {
            var2 = -var1 + var2 + gg.p;
            this.a.a = var2;
         } else {
            if (var1 + this.a.a > this.u - gg.m - 10) {
               var2 = -var1 + (this.u - gg.l - 10);
               this.a.a = var2;
            }

         }
      }
   }

   public final void c() {
      int var1 = bc.a.getClipX();
      int var2 = bc.a.getClipY();
      int var3 = bc.a.getClipWidth();
      int var4 = bc.a.getClipHeight();
      bc.a.clipRect(1, 1, this.t - 2, this.u - 2);
      int var5 = this.t / 30 + 1;

      while(true) {
         --var5;
         int var6;
         if (var5 < 0) {
            bc.a.setClip(var1, var2, var3, var4);
            bc.a.setColor(11315353);
            au.a(0, 0, this.t, this.u, bc.a);
            bc.a.setColor(16777215);
            au.a(1, 1, this.t - 2, this.u - 2, bc.a);
            bc.a.clipRect(gg.p << 1, gg.p, bc.b - (gg.p << 2), this.u - (gg.p << 1));
            var5 = this.a.b;
            var6 = a.size();

            for(int var7 = 0; var7 < var6; ++var7) {
               dj var8 = (dj)a.elementAt(var7);
               if (var5 >= this.d && var5 < this.u) {
                  boolean var10001 = this.a == var8.b;
                  int var11 = gg.p;
                  boolean var10 = var10001;
                  dj var9 = var8;
                  bc.a.translate(var11, var5);
                  v.c().a(bc.a, var8.a, 20, gg.p, 20);
                  int var13 = v.c().a(var8.a) + gg.p;
                  gj.b.a(bc.a, var8.a[0], var13 + 20, gg.p, 20);
                  var13 = gj.b.a() + 1;

                  for(int var14 = 1; var14 < var9.a.length; ++var14) {
                     gj.b.a(bc.a, var9.a[var14], 20, var13, 20);
                     var13 += gj.b.a() + 1;
                  }

                  if (var10) {
                     bc.a.drawImage(a, gg.p << 1, 5, 0);
                  }

                  bc.a.translate(-var11, -var5);
               }

               var5 += var8.a;
            }

            bc.a.setClip(var1, var2, var3, var4);
            return;
         }

         var6 = this.u / 30 + 1;

         while(true) {
            --var6;
            if (var6 < 0) {
               break;
            }

            bc.a.drawImage(this.b, var5 * 30, var6 * 30, 0);
         }
      }
   }

   public final void a() {
      super.a();
      if (this.c) {
         long var1 = System.currentTimeMillis();
         int var3 = (int)(5L - (var1 - this.a) / 1000L);
         v.e.a(bc.a, "Xin chờ..." + var3, bc.d, this.a.s + gg.p, 17);
      }

   }

   public final void e() {
      super.e();
      this.a.a();
      if (b) {
         b = false;
         this.a = a.size() - 1;
         this.d = this.a;
         this.i();
      }

      if (this.c) {
         this.a.b("");
         if (System.currentTimeMillis() - this.a >= 5000L) {
            this.c = false;
         }
      }

   }

   public final void a(Object var1) {
      String var2;
      gq var8;
      String var14;
      switch((var8 = (gq)((Object[])var1)[0]).a) {
      case 0:
         synchronized(a) {
            a = false;
            bc.a.c((fy)this);
            a.removeAllElements();
            a.notifyAll();
            break;
         }
      case 1:
         if (this.c) {
            return;
         }

         dh var11 = this;
         int var12 = a.size();

         dj var10001;
         while(true) {
            --var12;
            if (var12 < 0) {
               var10001 = null;
               break;
            }

            if (((dj)a.elementAt(var12)).b == var11.a) {
               var10001 = (dj)a.elementAt(var12);
               break;
            }
         }

         this.a = var10001;
         if (this.a != null && !a(this.a.a).equals(j.a.b)) {
            this.d = this.f;
            String var10002 = "Gửi: " + a(this.a.a);
            byte[] var10004 = new byte[]{0};
            gq var10006 = new gq(4, gq.b.a, this);
            var1 = null;
            gq var6 = this.d;
            gq var5 = var10006;
            boolean var13 = true;
            byte[] var4 = var10004;
            var1 = null;
            var14 = var10002;
            boolean var15 = true;
            di var16;
            (var16 = new di(this, -1, var14, (String[])null, var4, var5, var6, (gq)null)).c = var16.d = true;
            var16.a(true);
            return;
         }
         break;
      case 2:
         if (this.c) {
            return;
         }

         var2 = j.a.b;
         String var10;
         if (this.a != null && var8.a != null && (var10 = ((fi)var8.a).a()).length() > 0) {
            bc.a.v();
            if (!(var14 = a(this.a.a)).equals(var2)) {
               bf.a(j.a.b + ">" + var14, var10);
            }

            this.c = true;
            this.a = System.currentTimeMillis();
         }

         this.a.b("");
         this.d = this.a;
         return;
      case 4:
         bc.a.v();
         this.d = this.g;
      case 3:
         if (this.c) {
            return;
         }

         if (this.a.a().length() > 0) {
            bf.a(j.a.b, this.a.a());
            this.a.b("");
            this.c = true;
            this.a = System.currentTimeMillis();
            return;
         }
         break;
      case 5:
         if (this.c) {
            return;
         }

         if (this.a.a().length() > 0) {
            int var10000 = this.e;
            var2 = this.a.a();
            int var9 = var10000;
            ez var3;
            (var3 = new ez(81)).a(91);
            var3.a(21);
            var3.b(var9);
            var3.a(var2);
            eu.a.a(var3);
            var3.a();
            this.a.b("");
            this.c = true;
            this.a = System.currentTimeMillis();
         }
      }

   }

   private static String a(String var0) {
      int var1;
      if ((var1 = var0.indexOf(">")) > 0) {
         var0 = var0.substring(0, var1);
      }

      return var0;
   }

   public final void j_() {
      bc.a.b((fy)this);
      fi var1 = this.a;
      bc.a().a((fy)var1);
      a = true;
   }

   public final void a(int var1) {
      this.g = new gq(5, "Chat", this);
      this.d = this.g;
      this.e = var1;
   }

   static Image a(dh var0) {
      return var0.c;
   }
}
