import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class cu extends fs {
   private int a = 0;
   private int[] a = new int[3];
   private int[] b = new int[3];
   private String[] a = new String[3];
   private String[] b = new String[3];
   private String[] c = new String[3];
   private String[] d;
   private fz a = new fz();
   private int b;
   private int c;
   private Image a;

   public cu(int var1) {
      super(true);
      this.e = true;
      this.a = v.c();
      this.n = j.e;
      this.b = var1;
      this.b.a(this.a);
      this.a.a(74, 42, bc.b - 64 - 20, 100);
      this.a.d(100, 100);
      this.a.j = true;
      this.a.c(1);
   }

   public final void a(int[] var1, int[] var2, String[] var3, String[] var4, String[] var5) {
      this.a = var1;
      this.b = var2;
      this.a = var3;
      this.b = var4;
      this.c = var5;
      this.a.m();

      for(int var6 = 0; var6 < 3; ++var6) {
         cv var7;
         (var7 = new cv(this, var6)).c(bc.b - 85 - 17, 20);
         var7.b(10, 5 + (var6 << 5));
         this.a.a(var7);
         if (this.b == 1) {
            String var8 = "";
            byte var9 = 0;
            switch(var1[var6]) {
            case -1:
               var9 = 11;
               var8 = "Mở";
               break;
            case 0:
               var9 = 12;
               var8 = "Thuê";
               break;
            case 1:
               var9 = 13;
               var8 = "Đổi";
            }

            gq var10 = new gq(var9, var8, this);
            var7.d = var10;
         }
      }

      this.a((fy)this.a.a(0));
   }

   public final void a(int var1) {
      this.a = var1;
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      br.a.a();
      v.d().a(bc.a, br.c, 17, 22, 0);
      bc.a.drawRegion(v.g, bv.a * 14, 0, 14, 14, 0, 2, 20, 0);
      v.d().a(bc.a, "(chien)" + String.valueOf(this.a), bc.f, 22, 0);
      gg.b(10, 42, 64, 100);
      gg.b(74, 42, bc.b - 20 - 64, 100);
      ds var1;
      if ((var1 = eg.a).b) {
         du.a((Vector)null, (byte)(var1.c == 0 ? 1 : 0), 45, 132, 1, false, 0, 0);
      } else {
         Image var2;
         if ((var2 = br.a.b(var1.c)) == null) {
            du.a((Vector)null, (byte)(var1.c == 0 ? 1 : 0), 45, 132, 1, false, 0, 0);
         } else {
            bc.a.drawImage(du.a, 20, 20, 17);
            byte var10001 = var1.c;
            du.a(var2, 45, 132, 1, false);
         }
      }

      gg.b(10, 142, bc.b - 20, bc.c - 142 - 5 - gg.m);
      int var3 = 150;
      if (this.d != null) {
         for(int var4 = 0; var4 < this.d.length; ++var4) {
            gj.a.a(bc.a, this.d[var4], 16, var3, 0);
            var3 += gj.a.a();
         }
      }

   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case 11:
         j.e_();
         ez var2;
         (var2 = new ez(81)).a(91);
         var2.a(25);
         eu.a.a(var2);
         var2.a();
         return;
      case 12:
         j.e_();
         bf.g(this.b[this.c]);
         return;
      case 13:
         j.a("Đổi kĩ năng khác?", new gq(14, "Có", this), j.b);
         return;
      case 14:
         j.e_();
         bf.g(this.b[this.c]);
      default:
      }
   }

   static int[] a(cu var0) {
      return var0.a;
   }

   static Image a(cu var0) {
      return var0.a;
   }

   static Image a(cu var0, Image var1) {
      return var0.a = var1;
   }

   static String[] a(cu var0) {
      return var0.a;
   }

   static String[] b(cu var0) {
      return var0.c;
   }

   static int a(cu var0, int var1) {
      return var0.c = var1;
   }

   static String[] a(cu var0, String[] var1) {
      return var0.d = var1;
   }

   static String[] c(cu var0) {
      return var0.b;
   }
}
