import java.util.Vector;
import javax.microedition.io.ConnectionNotFoundException;

public final class aj extends fs implements go {
   private Vector a;
   private fz a;
   private gq a;
   private gq b;
   private gq c;
   g a;
   private fm a;

   public aj() {
      super(true);
      this.d = c.a(24);
      this.n = new gq(0, c.a(64), this);
      this.c = "MONEY";
   }

   private void h() {
      String[] var1 = new String[]{c.a(184), c.a(25)};
      int[] var2 = new int[]{1, 1};
      gq var10002 = new gq(111, c.a(337), this);
      c.a(25);
      j.a((String[])var1, (int[])var2, var10002, 0);
   }

   private void i() {
      String[] var1 = new String[]{c.a(184), c.a(400)};
      int[] var2 = new int[]{1, 1};
      gq var10002 = new gq(121, c.a(337), this);
      c.a(400);
      j.a((String[])var1, (int[])var2, var10002, 0);
   }

   private static void j() {
      j.a(c.a(184) + ": " + au.a(br.a) + "\nNgọc: " + au.a(br.b), true);
   }

   public final void a(Vector var1) {
      g var2;
      (var2 = new g((byte)-1)).a = c.a(55) + " " + c.a(184);
      g var3;
      (var3 = new g((byte)-1)).a = c.a(51) + " " + c.a(184);
      var1.insertElementAt(var2, 0);
      var1.addElement(var3);
      (var2 = new g((byte)9)).a = c.a(184) + " > Ngọc";
      (var3 = new g((byte)8)).a = c.a(184) + " " + c.a(595);
      var1.addElement(var2);
      var1.addElement(var3);
      this.a = var1;
      if (this.a == null) {
         this.a = new fz(0, gg.l, bc.b, bc.c - (gg.l << 1));
         if (j.a != null) {
            this.a.d = new gq(c.a(419), this);
         }

         this.a.j = true;
         this.a.c = 0;
      }

      this.a.m();
      int var6 = this.a.size();
      int var7 = (v.c.a() << 1) + (gg.p << 1) + 2;

      for(int var8 = 0; var8 < var6; ++var8) {
         g var4 = (g)this.a.elementAt(var8);
         fo var5 = new fo(var4, 0, 0, bc.b, var7);
         if (var4.b != -1) {
            var5.c = v.c;
            var5.d = v.c;
            var5.b = new al(this, var5);
            this.a.a(var5, false);
         } else {
            fn var9 = new fn(var4.a);
            if (var8 == 0) {
               var9.h = true;
            }

            var9.b = new am(this);
            var9.a(gj.a, gj.a);
            var9.a(0, 0, bc.b, gj.a.a() + 5);
            var9.q = 20;
            this.a.a(var9, false);
         }
      }

      if (var6 > 0) {
         this.a.a(0).l();
      }

      this.b.a(this.a);
      this.a.c(true);
      this.a.c(1);
      this.a.l = true;
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
   }

   public final void a(Object var1) {
      gq var2;
      fs var12;
      if ((var2 = (gq)((Object[])var1)[0]) == null) {
         var12 = bc.a();
         fs.b(fs.a);
         String var9 = (String)((Object[])var1)[1];
         if (!"smsOK".equals(var9)) {
            if ("smsFail".equals(var9)) {
               j.a(c.a(439), true);
            }

            return;
         }

         j.a(c.a(440), true);
         eu.b(this.a.b + j.a.a, this.a.c);
      } else if (var2 == this.a.d) {
         try {
            this.a = (g)((fo)this.a.c).a;
            int[] var3;
            String[] var13;
            switch(this.a.b) {
            case -1:
            case 3:
               break;
            case 0:
               var2 = new gq("Có", new ak(this));
               fh.a(this.a.d, var2, (gq)null, j.b, true);
               break;
            case 1:
               this.c = new gq(c.a(337), this);
               j.a((String)this.a.a, (gq)this.c, j.b, 0);
               break;
            case 2:
               var13 = new String[]{this.a.b, this.a.c};
               var3 = new int[]{0, 0};
               this.b = new gq(c.a(337), this);
               this.a = j.a(this.a.a, var13, var3, this.b, j.b);
               break;
            case 4:
               this.a = new gq(c.a(337), this);
               fh.a(this.a.b, this.a, (gq)null, j.b);
               break;
            case 5:
            default:
               j.a(c.a(496), true);
               return;
            case 6:
               this.h();
               break;
            case 7:
               this.i();
               break;
            case 8:
               j();
               break;
            case 9:
               var13 = new String[]{c.a(184), "Ngọc"};
               var3 = new int[]{1, 1};
               gq var10002 = new gq(122, c.a(337), this);
               int var10003 = j.a;
               c.a(25);
               j.a(var13, var3, var10002, var10003);
            }
         } catch (Exception var7) {
            return;
         }
      } else {
         if (var2 == this.a) {
            try {
               bc.a.a.platformRequest("tel:" + this.a.c);
               return;
            } catch (ConnectionNotFoundException var4) {
               return;
            }
         }

         if (var2 == this.b) {
            var12 = bc.a();
            fs.b(fs.a);
            if (this.a == null) {
               return;
            }

            j.b(c.a(352));
            eu.a(this.a, this.a.a(0), this.a.a(1));
            return;
         }

         fm var10;
         if (var2 == this.c) {
            var10 = (fm)fs.a;
            j.b(c.a(352));
            eu.a((g)this.a, (String)var10.a.a(), (String)null);
            return;
         }

         Vector var14;
         if (var2 == this.l) {
            (var14 = new Vector(2)).addElement(new gq(1, c.a(51) + " " + c.a(184), this));
            var14.addElement(new gq(2, c.a(184) + " " + c.a(595), this));
            this.a(var14, 0);
            return;
         }

         int var11;
         switch(var2.a) {
         case 0:
            bc.a().a((fs)null);
            return;
         case 1:
            (var14 = new Vector(5)).addElement(new gq(11, c.a(184) + " > " + c.a(25), this));
            var14.addElement(new gq(12, c.a(184) + " > " + c.a(400), this));
            this.a(var14, 0);
            return;
         case 2:
            j();
            return;
         case 11:
            this.h();
            return;
         case 12:
            this.i();
            return;
         case 111:
            var10 = (fm)fs.a;

            try {
               var11 = Integer.parseInt(((fi)var10.a(2)).a());
               j.a(true);
               eu.a(79, (int)1, var11);
               break;
            } catch (Exception var6) {
               return;
            }
         case 121:
            var10 = (fm)fs.a;

            try {
               var11 = Integer.parseInt(((fi)var10.a(2)).a());
               j.a(true);
               eu.a(79, (int)2, var11);
               break;
            } catch (Exception var5) {
               return;
            }
         case 122:
            var10 = (fm)fs.a;

            try {
               var11 = Integer.parseInt(((fi)var10.a(2)).a());
               j.a(true);
               eu.a(81, (byte)44, var11);
               return;
            } catch (Exception var8) {
            }
         }
      }

   }

   static fz a(aj var0) {
      return var0.a;
   }
}
